import java.io.IOException;
import javax.microedition.lcdui.*;
public class NotAlert implements CommandListener{
    
    public static String[] NAT;
    public static String[] DSC;
    public static Alert al;
    public static int idx;
    
    public NotAlert(){
        al = new Alert("Внимание!","",null,AlertType.ALARM);
        al.addCommand(new Command("Нет",Command.CANCEL,0));
        al.addCommand(new Command("Да",Command.OK,1));
        al.setCommandListener(this);
    }
    
    public void displayAlert(int index){
        NAT = new String[Menu.ALT.NAT.length];
        DSC = new String[NAT.length];
        System.arraycopy(Menu.ALT.NAT,0,NAT,0,NAT.length);
        System.arraycopy(Menu.ALT.DSC,0,DSC,0,DSC.length);
        idx = index;
        al.setString("Вы действительно хотите удалить пункт \""+DSC[idx]+"\"?");
        Menu.disp.setCurrent(al,Menu.ALT);
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch(command.getPriority()){
            case 0:{
                NAT = null;
                DSC = null;
                System.gc();
                Menu.disp.setCurrent(Menu.ED.lst);
            }
            break;
            case 1:
                try {
                    if (NAT.length>1)
                        Menu.RMS.addCommArray(NAT,DSC,idx);
                    if (idx>0)Menu.ALT.POS=idx-1;
                    NAT = null;
                    DSC = null;
                    System.gc();
                    Menu.ALT.reinit();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Menu.disp.setCurrent(Menu.ALT);
        }
    }
}
