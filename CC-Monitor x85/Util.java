public class Util {
    
    private static String getBitValue(String in){
        String s = in.toUpperCase();
        System.out.println(s);
        if (s.length()<6)return null;
        for(int i = 0; i < 6; i++){
            if("0123456789ABCDEF".indexOf(s.charAt(i)) == -1)
                return null;
        }
        String OUT = "";
        
        for (int i=0; i<6; i++){
            if (s.charAt(i)=='0')OUT += "0000";
            if (s.charAt(i)=='1')OUT += "0001";
            if (s.charAt(i)=='2')OUT += "0010";
            if (s.charAt(i)=='3')OUT += "0011";
            if (s.charAt(i)=='4')OUT += "0100";
            if (s.charAt(i)=='5')OUT += "0101";
            if (s.charAt(i)=='6')OUT += "0110";
            if (s.charAt(i)=='7')OUT += "0111";
            if (s.charAt(i)=='8')OUT += "1000";
            if (s.charAt(i)=='9')OUT += "1001";
            if (s.charAt(i)=='A')OUT += "1010";
            if (s.charAt(i)=='B')OUT += "1011";
            if (s.charAt(i)=='C')OUT += "1100";
            if (s.charAt(i)=='D')OUT += "1101";
            if (s.charAt(i)=='E')OUT += "1110";
            if (s.charAt(i)=='F')OUT += "1111";
        }
        System.out.println("OUT: "+OUT);
        return OUT;
    }
    
    public static String decodeOther(String in){
        String process = getBitValue(in);
        if (process == null)return "������� ������� ��������";
        
        String OUT = "";
        
        String connected = process.substring(6,9);
        if (connected.compareTo("000")==0)OUT += "���������:\n<�� ���������>\n";
        if (connected.compareTo("001")==0)OUT += "���������:\nDATA-������\n";
        if (connected.compareTo("010")==0)OUT += "���������:\nBluetooth-���������\n";
        if (connected.compareTo("011")==0)OUT += "���������:\n�������� ����������\n";
        if (connected.compareTo("100")==0)OUT += "���������:\n��������\n";
        if (connected.compareTo("101")==0)OUT += "���������:\nKFZ\n";
        if (connected.compareTo("110")==0)OUT += "���������:\n�������� �������\n";
        if (connected.compareTo("111")==0)OUT += "���������:\n<�� ������������>\n";
        
        String simcard = process.substring(9,11);
        System.out.println("SIM-CARD: "+simcard);
        if (simcard.compareTo("00")==0)OUT += "SIM-�����:\n<���>\n";
        if (simcard.compareTo("01")==0)OUT += "SIM-�����:\n3V SIM\n";
        if (simcard.compareTo("10")==0)OUT += "SIM-�����:\n5V SIM\n";
        if (simcard.compareTo("11")==0)OUT += "SIM-�����:\n<����������>\n";
        
        String flashcard = process.substring(11,14);
        if (flashcard.compareTo("000")==0)OUT += "MMC-�����:\n<���>\n";
        if (flashcard.compareTo("001")==0)OUT += "MMC-�����:\n32MB\n";
        if (flashcard.compareTo("010")==0)OUT += "MMC-�����:\n64MB\n";
        if (flashcard.compareTo("011")==0)OUT += "MMC-�����:\n128MB\n";
        if (flashcard.compareTo("100")==0)OUT += "MMC-�����:\n256MB\n";
        if (flashcard.compareTo("101")==0)OUT += "MMC-�����:\n512MB\n";
        if (flashcard.compareTo("110")==0)OUT += "MMC-�����:\n1GB\n";
        if (flashcard.compareTo("111")==0)OUT += "MMC-�����:\n2GB\n";
        
        String rach = process.substring(14,15);
        if (rach.compareTo("0")==0)OUT += "RACH:\n��\n";
        if (rach.compareTo("1")==0)OUT += "RACH:\n���\n";
        
        String camera = process.substring(15,16);
        if (camera.compareTo("0")==0)OUT += "������:\n���\n";
        if (camera.compareTo("1")==0)OUT += "������:\n����\n";
        
        String emodev = process.substring(16,17);
        if (emodev.compareTo("0")==0)OUT += "EMO-Device:\n���\n";
        if (emodev.compareTo("1")==0)OUT += "EMO-Device:\n��\n";
        
        String emoapl = process.substring(17,18);
        if (emoapl.compareTo("0")==0)OUT += "EMO-Application:\n���\n";
        if (emoapl.compareTo("1")==0)OUT += "EMO-Application:\n��\n";
        
        return OUT;
    }
    
    public static String decodeSettings(String in){
        String process = getBitValue(in);
        if (process == null)return "������� ������� ��������";
        String OUT = "";
        
        String irda = process.substring(5,6);
        if (irda.compareTo("0")==0)OUT += "�� ����:\n����\n";
        if (irda.compareTo("1")==0)OUT += "�� ����:\n���\n";
        
        String save = process.substring(6,7);
        if (save.compareTo("0")==0)OUT += "�������� ������:\n����\n";
        if (save.compareTo("1")==0)OUT += "�������� ������:\n���\n";
        
        String ring = process.substring(7,8);
        if (ring.compareTo("0")==0)OUT += "����:\n����\n";
        if (ring.compareTo("1")==0)OUT += "����:\n���\n";
        
        String light = process.substring(8,12);
        if (light.compareTo("0000")==0)OUT += "���������:\n����\n";
        if (light.compareTo("0001")==0)OUT += "���������:\n10%\n";
        if (light.compareTo("0010")==0)OUT += "���������:\n20%\n";
        if (light.compareTo("0011")==0)OUT += "���������:\n30%\n";
        if (light.compareTo("0100")==0)OUT += "���������:\n40%\n";
        if (light.compareTo("0101")==0)OUT += "���������:\n50%\n";
        if (light.compareTo("0110")==0)OUT += "���������:\n60%\n";
        if (light.compareTo("0111")==0)OUT += "���������:\n70%\n";
        if (light.compareTo("1000")==0)OUT += "���������:\n80%\n";
        if (light.compareTo("1001")==0)OUT += "���������:\n90%\n";
        if (light.compareTo("1010")==0)OUT += "���������:\n100%\n";
        
        String vibra = process.substring(12,13);
        if (vibra.compareTo("0")==0)OUT += "��������:\n����\n";
        if (vibra.compareTo("1")==0)OUT += "��������:\n���\n";
        
        String off = process.substring(13,14);
        if (off.compareTo("0")==0)OUT += "��������������:\n����\n";
        if (off.compareTo("1")==0)OUT += "��������������:\n���\n";
        
        String filter = process.substring(14,15);
        if (filter.compareTo("0")==0)OUT += "������:\n����\n";
        if (filter.compareTo("1")==0)OUT += "������:\n���\n";
        
        String gprs = process.substring(15,16);
        if (gprs.compareTo("0")==0)OUT += "GPRS:\n����\n";
        if (gprs.compareTo("1")==0)OUT += "GPRS:\n���\n";
        
        String bluetooth = process.substring(16,17);
        if (bluetooth.compareTo("0")==0)OUT += "Bluetooth:\n����\n";
        if (bluetooth.compareTo("1")==0)OUT += "Bluetooth:\n���\n";
        
        String net = process.substring(17,18);
        if (net.compareTo("0")==0)OUT += "��������� ����:\n����\n";
        if (net.compareTo("1")==0)OUT += "��������� ����:\n���\n";
        
        String dlight = process.substring(18,19);
        if (dlight.compareTo("0")==0)OUT += "���. ����:\n����\n";
        if (dlight.compareTo("1")==0)OUT += "���. ����:\n���\n";
        
        String screensaver = process.substring(19,20);
        if (screensaver.compareTo("0")==0)OUT += "��������:\n����\n";
        if (screensaver.compareTo("1")==0)OUT += "��������:\n���\n";
        
        String blackberry = process.substring(20,21);
        if (blackberry.compareTo("0")==0)OUT += "Blackberry:\n��� ����������\n";
        if (blackberry.compareTo("1")==0)OUT += "Blackberry:\n���������\n";
        
        return OUT;
    }
    
    public static String decodeNetwork(String in){
        String process = getBitValue(in);
        if (process == null)return "������� ������� ��������";
        String OUT = "";
        
        String status = process.substring(6,8);
        if (status.compareTo("00")==0)OUT += "������:\n��� ����\n";
        if (status.compareTo("01")==0)OUT += "������:\n����� ���������\n";
        if (status.compareTo("10")==0)OUT += "������:\n����� ����\n";
        if (status.compareTo("11")==0)OUT += "������:\n<����������>\n";
        
        String perloc = process.substring(8,9);
        if (perloc.compareTo("0")==0)OUT += "PerLocUpdate:\n����\n";
        if (perloc.compareTo("1")==0)OUT += "PerLocUpdate:\n���\n";
        
        String bs = process.substring(9,13);
        if (bs.compareTo("0000")==0)OUT += "����:\n0\n";
        if (bs.compareTo("0001")==0)OUT += "����:\n1\n";
        if (bs.compareTo("0010")==0)OUT += "����:\n2\n";
        if (bs.compareTo("0011")==0)OUT += "����:\n3\n";
        if (bs.compareTo("0100")==0)OUT += "����:\n4\n";
        if (bs.compareTo("0101")==0)OUT += "����:\n5\n";
        if (bs.compareTo("0110")==0)OUT += "����:\n6\n";
        if (bs.compareTo("0111")==0)OUT += "����:\n7\n";
        if (bs.compareTo("1000")==0)OUT += "����:\n8\n";
        if (bs.compareTo("1001")==0)OUT += "����:\n9\n";
        if (bs.compareTo("1010")==0)OUT += "����:\n10\n";
        if (bs.compareTo("1011")==0)OUT += "����:\n11\n";
        if (bs.compareTo("1100")==0)OUT += "����:\n12\n";
        if (bs.compareTo("1101")==0)OUT += "����:\n13\n";
        if (bs.compareTo("1110")==0)OUT += "����:\n14\n";
        if (bs.compareTo("1111")==0)OUT += "����:\n15\n";
        
        String signal = process.substring(13,14);
        if (signal.compareTo("0")==0)OUT += "������� �������:\n�������\n";
        if (signal.compareTo("1")==0)OUT += "������� �������:\n������\n";
        
        String mf = process.substring(14,17);
        if (mf.compareTo("000")==0)OUT += "Multiframe:\n2\n";
        if (mf.compareTo("001")==0)OUT += "Multiframe:\n3\n";
        if (mf.compareTo("010")==0)OUT += "Multiframe:\n4\n";
        if (mf.compareTo("011")==0)OUT += "Multiframe:\n5\n";
        if (mf.compareTo("100")==0)OUT += "Multiframe:\n6\n";
        if (mf.compareTo("101")==0)OUT += "Multiframe:\n7\n";
        if (mf.compareTo("110")==0)OUT += "Multiframe:\n8\n";
        if (mf.compareTo("111")==0)OUT += "Multiframe:\n9\n";
        
        String pbcch = process.substring(17,18);
        if (pbcch.compareTo("0")==0)OUT += "PBCCH:\n����\n";
        if (pbcch.compareTo("1")==0)OUT += "PBCCH:\n���\n";
        
        return OUT;
    }
    
    public static String decodeBattary(String in){
        String process = getBitValue(in);
        if (process == null)return "������� ������� ��������";
        String OUT = "";
        
        String battary = process.substring(5,8);
        if (battary.compareTo("000")==0)OUT += "�������:\n<15%\n";
        if (battary.compareTo("001")==0)OUT += "�������:\n~15%\n";
        if (battary.compareTo("010")==0)OUT += "�������:\n~30%\n";
        if (battary.compareTo("011")==0)OUT += "�������:\n~45%\n";
        if (battary.compareTo("100")==0)OUT += "�������:\n~60%\n";
        if (battary.compareTo("101")==0)OUT += "�������:\n~80%\n";
        if (battary.compareTo("110")==0)OUT += "�������:\n~100%\n";
        if (battary.compareTo("111")==0)OUT += "�������:\n����������\n";
        
        String count = process.substring(8,12);
        if (count.compareTo("0000")==0)OUT += "������� ���������:\n~0 ���\n";
        if (count.compareTo("0001")==0)OUT += "������� ���������:\n~2 ����\n";
        if (count.compareTo("0010")==0)OUT += "������� ���������:\n~4 ����\n";
        if (count.compareTo("0011")==0)OUT += "������� ���������:\n~8 ���\n";
        if (count.compareTo("0100")==0)OUT += "������� ���������:\n~16 ���\n";
        if (count.compareTo("0101")==0)OUT += "������� ���������:\n~32 ����\n";
        if (count.compareTo("0110")==0)OUT += "������� ���������:\n~64 ����\n";
        if (count.compareTo("0111")==0)OUT += "������� ���������:\n~128 ���\n";
        if (count.compareTo("1000")==0)OUT += "������� ���������:\n~256 ���\n";
        if (count.compareTo("1001")==0)OUT += "������� ���������:\n~512 ���\n";
        if (count.compareTo("1010")==0)OUT += "������� ���������:\n~1024 ����\n";
        if (count.compareTo("1011")==0)OUT += "������� ���������:\n~2048 ���\n";
        if (count.compareTo("1100")==0)OUT += "������� ���������:\n~4096 ���\n";
        if (count.compareTo("1101")==0)OUT += "������� ���������:\n~8192 ����\n";
        if (count.compareTo("1110")==0)OUT += "������� ���������:\n~16384 ����\n";
        if (count.compareTo("1111")==0)OUT += "������� ���������:\n~32768 ���\n";
        
        String broken = process.substring(12,15);
        if (broken.compareTo("000")==0)OUT += "�������� �������:\n0%\n";
        if (broken.compareTo("001")==0)OUT += "�������� �������:\n14%\n";
        if (broken.compareTo("010")==0)OUT += "�������� �������:\n29%\n";
        if (broken.compareTo("011")==0)OUT += "�������� �������:\n43%\n";
        if (broken.compareTo("100")==0)OUT += "�������� �������:\n57%\n";
        if (broken.compareTo("101")==0)OUT += "�������� �������:\n71%\n";
        if (broken.compareTo("110")==0)OUT += "�������� �������:\n86%\n";
        if (broken.compareTo("111")==0)OUT += "�������� �������:\n100%\n";
        
        String usb = process.substring(15,18);
        if (usb.compareTo("000")==0)OUT += "������� �� USB:\n0%\n";
        if (usb.compareTo("001")==0)OUT += "������� �� USB:\n14%\n";
        if (usb.compareTo("010")==0)OUT += "������� �� USB:\n29%\n";
        if (usb.compareTo("011")==0)OUT += "������� �� USB:\n43%\n";
        if (usb.compareTo("100")==0)OUT += "������� �� USB:\n57%\n";
        if (usb.compareTo("101")==0)OUT += "������� �� USB:\n71%\n";
        if (usb.compareTo("110")==0)OUT += "������� �� USB:\n86%\n";
        if (usb.compareTo("111")==0)OUT += "������� �� USB:\n100%\n";
        
        String last = process.substring(18,21);
        if (last.compareTo("000")==0)OUT += "������ ��� �������:\n<5 �.\n";
        if (last.compareTo("001")==0)OUT += "������ ��� �������:\n5 �. - 1 �.\n";
        if (last.compareTo("010")==0)OUT += "������ ��� �������:\n1 - 2 �.\n";
        if (last.compareTo("011")==0)OUT += "������ ��� �������:\n2 - 4 �.\n";
        if (last.compareTo("100")==0)OUT += "������ ��� �������:\n4 - 6 �.\n";
        if (last.compareTo("101")==0)OUT += "������ ��� �������:\n6 - 8 �.\n";
        if (last.compareTo("110")==0)OUT += "������ ��� �������:\n8 - 10 �.\n";
        if (last.compareTo("111")==0)OUT += "������ ��� �������:\n>10 �.\n";
        
        String time = process.substring(21);
        if (time.compareTo("000")==0)OUT += "����� �������:\n<5 ���.\n";
        if (time.compareTo("001")==0)OUT += "����� �������:\n6 - 15 ���.\n";
        if (time.compareTo("010")==0)OUT += "����� �������:\n16 - 30 ���.\n";
        if (time.compareTo("011")==0)OUT += "����� �������:\n31 - 60 ���.\n";
        if (time.compareTo("100")==0)OUT += "����� �������:\n61 - 90 ���.\n";
        if (time.compareTo("101")==0)OUT += "����� �������:\n91 - 120 ���.\n";
        if (time.compareTo("110")==0)OUT += "����� �������:\n120 - 150 ���.\n";
        if (time.compareTo("111")==0)OUT += "����� �������:\n> 150 ���.\n";
        
        return OUT;
    }
    
    public static String decodeDiagnostic(String in){
        String process = getBitValue(in);
        if (process == null)return "������� ������� ��������";
        String OUT = "";
        
        String off = process.substring(5,8);
        if (off.compareTo("000")==0)OUT += "����������:\n0\n";
        if (off.compareTo("001")==0)OUT += "����������:\n1 - 2\n";
        if (off.compareTo("010")==0)OUT += "����������:\n3 - 5\n";
        if (off.compareTo("011")==0)OUT += "����������:\n6 - 9\n";
        if (off.compareTo("100")==0)OUT += "����������:\n10 - 14\n";
        if (off.compareTo("101")==0)OUT += "����������:\n15 - 21\n";
        if (off.compareTo("110")==0)OUT += "����������:\n22 - 29\n";
        if (off.compareTo("111")==0)OUT += "����������:\n>30\n";
        
        String exit = process.substring(8,11);
        if (exit.compareTo("000")==0)OUT += "(S)EXIT:\n0\n";
        if (exit.compareTo("001")==0)OUT += "(S)EXIT:\n1 - 2\n";
        if (exit.compareTo("010")==0)OUT += "(S)EXIT:\n3 - 5\n";
        if (exit.compareTo("011")==0)OUT += "(S)EXIT:\n6 - 9\n";
        if (exit.compareTo("100")==0)OUT += "(S)EXIT:\n10 - 14\n";
        if (exit.compareTo("101")==0)OUT += "(S)EXIT:\n15 - 21\n";
        if (exit.compareTo("110")==0)OUT += "(S)EXIT:\n22 - 29\n";
        if (exit.compareTo("111")==0)OUT += "(S)EXIT:\n>30\n";
        
        String refresh = process.substring(11,14);
        if (refresh.compareTo("000")==0)OUT += "�������:\n0\n";
        if (refresh.compareTo("001")==0)OUT += "�������:\n1 - 2\n";
        if (refresh.compareTo("010")==0)OUT += "�������:\n3 - 5\n";
        if (refresh.compareTo("011")==0)OUT += "�������:\n6 - 9\n";
        if (refresh.compareTo("100")==0)OUT += "�������:\n10 - 14\n";
        if (refresh.compareTo("101")==0)OUT += "�������:\n15 - 21\n";
        if (refresh.compareTo("110")==0)OUT += "�������:\n22 - 29\n";
        if (refresh.compareTo("111")==0)OUT += "�������:\n>30\n";
        
        String work = process.substring(14,17);
        if (work.compareTo("000")==0)OUT += "������� ���������:\n<1 �.\n";
        if (work.compareTo("001")==0)OUT += "������� ���������:\n1 - 2 �.\n";
        if (work.compareTo("010")==0)OUT += "������� ���������:\n3 - 6 �.\n";
        if (work.compareTo("011")==0)OUT += "������� ���������:\n7 - 12 �.\n";
        if (work.compareTo("100")==0)OUT += "������� ���������:\n13 - 20 �.\n";
        if (work.compareTo("101")==0)OUT += "������� ���������:\n21 - 30 �.\n";
        if (work.compareTo("110")==0)OUT += "������� ���������:\n31 - 42 �.\n";
        if (work.compareTo("111")==0)OUT += "������� ���������:\n>43 �.\n";
        
        String talk = process.substring(17,20);
        if (talk.compareTo("000")==0)OUT += "� ������ ���������:\n<1 �.\n";
        if (talk.compareTo("001")==0)OUT += "� ������ ���������:\n1 - 3 �.\n";
        if (talk.compareTo("010")==0)OUT += "� ������ ���������:\n4 - 7 �.\n";
        if (talk.compareTo("011")==0)OUT += "� ������ ���������:\n8 - 12 �.\n";
        if (talk.compareTo("100")==0)OUT += "� ������ ���������:\n13 - 18 �.\n";
        if (talk.compareTo("101")==0)OUT += "� ������ ���������:\n19 - 25 �.\n";
        if (talk.compareTo("110")==0)OUT += "� ������ ���������:\n26 - 33 �.\n";
        if (talk.compareTo("111")==0)OUT += "� ������ ���������:\n>34 �.\n";
        
        return OUT;
    }
    
    public static String decodeProvider(String in){
        String process = getBitValue(in);
        if (process == null)return "������� ������� ��������";
        String OUT = "";
        String MCCS1 = in.substring(0,4).toUpperCase();
        String MNCS1 = in.substring(4).toUpperCase();
        
        int MCC = 0;
        int MNC = 0;
        
        String MCCS = "";
        String MNCS = "";
        
        for (int i = MCCS1.length(); i>0; i--){
            MCCS += MCCS1.charAt(i-1);
        }
        
        for (int i = MNCS1.length(); i>0; i--){
            MNCS += MNCS1.charAt(i-1);
        }
        
        for (int i=0; i<MCCS.length(); i++){
            if (MCCS.charAt(i)=='0')MCC += 0*(16^i);
            if (MCCS.charAt(i)=='1')MCC += 1*(16^i);
            if (MCCS.charAt(i)=='2')MCC += 2*(16^i);
            if (MCCS.charAt(i)=='3')MCC += 3*(16^i);
            if (MCCS.charAt(i)=='4')MCC += 4*(16^i);
            if (MCCS.charAt(i)=='5')MCC += 5*(16^i);
            if (MCCS.charAt(i)=='6')MCC += 6*(16^i);
            if (MCCS.charAt(i)=='7')MCC += 7*(16^i);
            if (MCCS.charAt(i)=='8')MCC += 8*(16^i);
            if (MCCS.charAt(i)=='9')MCC += 9*(16^i);
            if (MCCS.charAt(i)=='A')MCC += 10*(16^i);
            if (MCCS.charAt(i)=='B')MCC += 11*(16^i);
            if (MCCS.charAt(i)=='C')MCC += 12*(16^i);
            if (MCCS.charAt(i)=='D')MCC += 13*(16^i);
            if (MCCS.charAt(i)=='E')MCC += 14*(16^i);
            if (MCCS.charAt(i)=='F')MCC += 15*(16^i);
        }
        
        MCC = MCC/2;
        
        for (int i=0; i<MNCS.length(); i++){
            if (MNCS.charAt(i)=='0')MNC += 0*(16^i);
            if (MNCS.charAt(i)=='1')MNC += 1*(16^i);
            if (MNCS.charAt(i)=='2')MNC += 2*(16^i);
            if (MNCS.charAt(i)=='3')MNC += 3*(16^i);
            if (MNCS.charAt(i)=='4')MNC += 4*(16^i);
            if (MNCS.charAt(i)=='5')MNC += 5*(16^i);
            if (MNCS.charAt(i)=='6')MNC += 6*(16^i);
            if (MNCS.charAt(i)=='7')MNC += 7*(16^i);
            if (MNCS.charAt(i)=='8')MNC += 8*(16^i);
            if (MNCS.charAt(i)=='9')MNC += 9*(16^i);
            if (MNCS.charAt(i)=='A')MNC += 10*(16^i);
            if (MNCS.charAt(i)=='B')MNC += 11*(16^i);
            if (MNCS.charAt(i)=='C')MNC += 12*(16^i);
            if (MNCS.charAt(i)=='D')MNC += 13*(16^i);
            if (MNCS.charAt(i)=='E')MNC += 14*(16^i);
            if (MNCS.charAt(i)=='F')MNC += 15*(16^i);
        }
        
        OUT = "MCC: "+MCC+" NC: "+MNC;
        
        return OUT;
    }
}
