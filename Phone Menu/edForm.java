import java.io.IOException;
import javax.microedition.lcdui.*;

public class edForm implements CommandListener{
    public static String[] NAT;
    public static String[] DSC;
    
    public static Form frm;
    
    public static TextField edn;
    public static TextField edd;
    
    public static int idx;
    
    public edForm() {
    }
    
    public void displayEditForm(int index){
        idx = index;
        
        NAT  = new String[Menu.ALT.NAT.length];
        DSC  = new String[NAT.length];
        
        System.arraycopy(Menu.ALT.NAT,0,NAT,0,NAT.length);
        System.arraycopy(Menu.ALT.DSC,0,DSC,0,DSC.length);
        
        edn = new TextField("Команда:",NAT[idx],30,TextField.ANY);
        edd = new TextField("Описание:",DSC[idx],50,TextField.ANY);
        
        Item[] itm = {edn,edd};
        
        frm = new Form("Изменить",itm);
        frm.addCommand(new Command("Сохр.",Command.OK,0));
        frm.addCommand(new Command("Отмена",Command.OK,1));
        frm.setCommandListener(this);
        Menu.disp.setCurrent(frm);
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch(command.getPriority()){
            case 0:{
                NAT[idx] = edn.getString();
                DSC[idx] = edd.getString();
                if ((edn.getString().length()!=0)&(edd.getString().length()!=0))
                    try {
                        Menu.RMS.addCommArray(NAT,DSC,-1);
                        Menu.ALT.reinit();
                        NAT = null;
                        DSC = null;
                        frm = null;
                        edn = null;
                        edd = null;
                        System.gc();
                        Menu.disp.setCurrent(Menu.ALT);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    } else {
                    NAT = null;
                    DSC = null;
                    frm = null;
                    edn = null;
                    edd = null;
                    System.gc();
                    Menu.disp.setCurrent(Menu.ED.lst);
                    }
            }
            break;
            case 1:
                NAT = null;
                DSC = null;
                frm = null;
                edn = null;
                edd = null;
                System.gc();
                Menu.disp.setCurrent(Menu.ED.lst);
                break;
        }
    }
}
