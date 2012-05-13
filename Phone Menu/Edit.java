import java.io.IOException;
import javax.microedition.lcdui.*;
public class Edit implements CommandListener{
    public static List lst;
    public static Form addForm;
    public static Form edForm;
    public static TextField natin;
    public static TextField desin;
    
    public Edit() {
        lst = new List("������", List.IMPLICIT);
        lst.append("��������",null);
        lst.append("��������",null);
        lst.append("�������",null);
        lst.addCommand(new Command("�����",Command.BACK,1));
        lst.addCommand(new Command("��",Command.OK,0));
        lst.setCommandListener(this); 
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch(command.getPriority()){
            case 0:
                switch(lst.getSelectedIndex()){
                    case 0: Menu.EF.displayEditForm(Menu.ALT.POS);
                    break;
                    case 1: Menu.AD.displayAddForm();
                    break;
                    case 2: Menu.NA.displayAlert(Menu.ALT.POS);
                    break;
                }
                break;
            case 1:Menu.disp.setCurrent(Menu.ALT);
            break;
        }
    }
}
