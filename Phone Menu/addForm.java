import java.io.IOException;
import javax.microedition.lcdui.*;
public class addForm implements CommandListener{
    
    public static String[] NAT;
    public static String[] DSC;
    
    public static Form frm;
    
    public static TextField edn;
    public static TextField edd;
    
    public addForm() {
    }
    
    public void displayAddForm(){
        NAT = new String[Menu.ALT.NAT.length+1];
        DSC = new String[Menu.ALT.DSC.length+1];
        System.arraycopy(Menu.ALT.NAT,0,NAT,0,Menu.ALT.NAT.length);
        System.arraycopy(Menu.ALT.DSC,0,DSC,0,Menu.ALT.DSC.length);
        
        edn = new TextField("Команда:",null,30,TextField.ANY);
        edd = new TextField("Описание:",null,50,TextField.ANY);
        
        Item[] itm = {edn,edd};
        
        frm = new Form("Добавить",itm);
        frm.addCommand(new Command("Сохр.",Command.OK,2));
        frm.addCommand(new Command("Отмена",Command.OK,3));
        frm.setCommandListener(this);
        Menu.disp.setCurrent(frm);
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch(command.getPriority()){
            case 2:
                NAT[NAT.length-1] = edn.getString();
                DSC[DSC.length-1] = edd.getString();
                if ((edn.getString().length()!=0)&(edd.getString().length()!=0))
                    try {
                        Menu.RMS.addCommArray(NAT,DSC,-1);
                        Menu.ALT.reinit();
                        NAT = null;
                        DSC = null;
                        System.gc();
                        Menu.disp.setCurrent(Menu.ALT);
                    } catch (IOException ex) {
                        System.out.println("ERROR!");
                    } else {
                    NAT = null;
                    DSC = null;
                    System.gc();
                    Menu.disp.setCurrent(Menu.ED.lst);
                    }
                break;
            case 3:
                NAT = null;
                DSC = null;
                System.gc();
                Menu.disp.setCurrent(Menu.ED.lst);
                break;
        }
    }
}