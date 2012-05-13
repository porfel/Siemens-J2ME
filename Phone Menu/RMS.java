import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.rms.*;
public class RMS {
    
    public static RecordStore rs;
    
    public static final byte BOOL_BYTE    = 0x01;
    public static final byte COMMAND_BYTE = 0x02;
    
    public RMS() throws RecordStoreException{
        rs = RecordStore.openRecordStore("DATA-PHONE-MENU",true);
        if (rs.getNumRecords()==0)setDefaultRecords();
    }
    
    private void setDefaultRecords(){
        try {
            setAlt(false);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String[] NAT = new String[10];
        String[] DSC = new String[10];
        if (Menu.NSG){
        NAT = new String[]{"NAT_CONTACTS_LIST","NAT_MSG_CREATE_SMS","NAT_INT_BROWSER","NAT_ORG_CALENDAR",
        "NAT_ALARM_CLOCK","NAT_CAM_TAKE_PICT","NAT_MEDIA_PLAYER","NAT_EX_GAMES","NAT_TONES_ON_OFF","NAT_MY_STUFF"};
        DSC = new String[]{"Адресная книга","Создать новое SMS","Интернет","Календарь",
        "Будильник","Камера","Плеер","Игры","Вкл./Выкл. звуки","Мои файлы"};
        }
        else{
        NAT = new String[]{"CNCT_ADDRESSBOK","CNCT_PHONE_BOOK","INTR_STRTBROWSR","ORGZ_CALENDERMV",
        "ELSE_ALARMCLOCK","MESG_WRT_NEWEMS","MESG_MESSGEMENU","RECD_MISSEDCALL","RECD_RECVEDCALL","FLSH_FLEXPLORER"};
        DSC = new String[]{"Адресная книга","Тел. справочник","Интернет","Календарь",
        "Будильник","Новое SMS","Сообщения","Неотв. вызовы","Прин. вызовы","Card-Explorer"};
        }
        try {
            addCommArray(NAT,DSC,-1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setAlt(boolean alt) throws IOException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeBoolean(alt);
        setRecord(BOOL_BYTE,baos.toByteArray());
        dos = null;
        baos = null;
        System.gc();
    }
    
    public boolean getAlt() throws IOException{
        byte[] altb = getRecord(BOOL_BYTE);
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(altb));
        boolean out = dis.readBoolean();
        dis = null;
        System.gc();
        return out;
    }
    
    public void addCommArray(String[] commands, String[] descr, int del) throws IOException{
        if (del==-1){
            int LEN = commands.length;
            String[] data = new String[LEN*2];
            System.arraycopy(commands,0,data,0,LEN);
            System.arraycopy(descr,0,data,LEN,LEN);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeInt(LEN);
            for (int i=0; i<data.length; i++){
                dos.writeUTF(data[i]);
            }
            dos.close();
            baos.close();
            setRecord(COMMAND_BYTE, baos.toByteArray());
            dos = null;
            baos = null;
            System.gc();
        } else{
            int LEN = commands.length-1;
            String[] data = new String[LEN*2];
            String[] NC = new String[LEN];
            String[] ND = new String[LEN];
            boolean off = false;
            for (int i = 0; i<LEN; i++){
                if (i==del)off = true;
                if (!off){
                    NC[i]=commands[i];
                    ND[i]=descr[i];
                } else{
                    NC[i]=commands[i+1];
                    ND[i]=descr[i+1];
                }
            }
            System.arraycopy(NC,0,data,0,LEN);
            System.arraycopy(ND,0,data,LEN,LEN);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeInt(LEN);
            for (int i=0; i<data.length; i++){
                dos.writeUTF(data[i]);
            }
            dos.close();
            baos.close();
            setRecord(COMMAND_BYTE, baos.toByteArray());
            dos = null;
            baos = null;
            System.gc();
        }
    }
    
    public String[] getCommandArray(boolean com) throws IOException{
        byte data[] = getRecord(COMMAND_BYTE);
        System.out.println("DATA LENGHT IN ARRAY: "+data.length);
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        DataInputStream dis = new DataInputStream(bais);
        int LEN = dis.readInt();
        String[] BAR = new String[LEN*2];
        for (int i=0; i<LEN*2; i++){
            BAR[i] = dis.readUTF();
        }
        dis.close();
        dis = null;
        bais.close();
        bais = null;
        System.gc();
        String[] OUT = new String[LEN];
        if (com) System.arraycopy(BAR,0,OUT,0,LEN);
        else System.arraycopy(BAR,LEN,OUT,0,LEN);
        return OUT;
    }
    
    private static class FirstByteFilter implements RecordFilter {
        private byte criteria;
        public FirstByteFilter(byte criteria) {
            this.criteria = criteria;
        }
        public boolean matches(byte[] candidate) {
            return (candidate[0] == criteria);
        }
    }
    private static byte[] getRecord(byte criteria) {
        byte[] out = null;
        try {
            RecordEnumeration re = rs.enumerateRecords(
                    new FirstByteFilter(criteria), null, false);
            if (re.numRecords() > 0) {
                byte[] data = re.nextRecord();
                out = new byte[data.length-1];
                System.arraycopy(data,1,out,0,data.length-1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
    private static void setRecord(byte criteria, byte[] value) {
        try {
            RecordEnumeration re = rs.enumerateRecords(
                    new FirstByteFilter(criteria), null, false);
            byte[] tmp = value;
            byte[] data = new byte[tmp.length + 1];
            data[0] = criteria;
            System.arraycopy(tmp, 0, data, 1, tmp.length);
            if (re.numRecords() > 0) {
                int id = re.nextRecordId();
                rs.setRecord(id, data, 0, data.length);
            } else {
                rs.addRecord(data, 0, data.length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
