import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.*;
public class Call implements CommandListener{
    
    public Form FRM;
    TextField call;
    public Call(){
    }

    public void displayCallForm(){
        call = new TextField("�����:",null,30,TextField.PHONENUMBER);
        FRM = new Form("���������");
        FRM.append(call);
        FRM.addCommand(new Command("�������",Command.OK,0));
        FRM.addCommand(new Command("�����",Command.OK,1));
        FRM.addCommand(new Command("���. �����",Command.OK,2));
        FRM.setCommandListener(this);
        Menu.disp.setCurrent(FRM);
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch(command.getPriority()){
            case 0: 
                try {Menu.MM.MEN.platformRequest("tel://"+call.getString());
                } catch (ConnectionNotFoundException ex) {
                    ex.printStackTrace();
                }
                Menu.disp.setCurrent(Menu.MM);
                break;
            case 1: Menu.disp.setCurrent(Menu.MM);
            break;
            case 2: 
                try {
                    Menu.MM.MEN.platformRequest("tel://NAT_CONTACTS_LIST");
                    Menu.MM.MEN.platformRequest("native:NAT_CONTACTS_LIST");
                } catch (ConnectionNotFoundException ex) {
                    ex.printStackTrace();
                }
                Menu.disp.setCurrent(Menu.MM);
            break;
        }
    }
}
