import javax.microedition.lcdui.*;

public class Misc implements CommandListener{
    
    public Form misc;
    public Misc() {
        misc = new Form(null);
        misc.setCommandListener(this);
    }
    
    public void displayHelp(){
        misc = new Form("�������");
        misc.setCommandListener(this);
        StringItem help = new StringItem(null,"� ������ �������� �������� \"*#06#\" � ��������� �� 3-� �������.\n���������� �������� ��������������� ����� � ������� �� � ���������. \n����� ������� ������ \"������������\" ��������� �������� ����������� ��������������� �����.\n");
        misc.append(help);
        misc.addCommand(new Command("��",Command.OK,0));
        CCMon.disp.setCurrent(misc);
    }
    
    public void displayAbout(){
        misc = new Form("� ���������");
        misc.setCommandListener(this);
        StringItem help = new StringItem(null,"CC-Monitor x85\n\n��������� ��� ����������� CC-Monitor'a ��� NEWSgold ���������.\n\n(c) 2007 by Porfel\n\nhttp://forum.s-c.ru");
        misc.append(help);
        misc.addCommand(new Command("��",Command.OK,0));
        CCMon.disp.setCurrent(misc);
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch (command.getPriority()){
            case 0: CCMon.disp.setCurrent(CCMon.input.IF);
        }
    }
}
