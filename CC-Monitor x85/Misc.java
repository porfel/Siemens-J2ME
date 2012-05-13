import javax.microedition.lcdui.*;

public class Misc implements CommandListener{
    
    public Form misc;
    public Misc() {
        misc = new Form(null);
        misc.setCommandListener(this);
    }
    
    public void displayHelp(){
        misc = new Form("Справка");
        misc.setCommandListener(this);
        StringItem help = new StringItem(null,"В режиме ожидания наберите \"*#06#\" и перейдите на 3-ю вкладку.\nПерепишите значения соответствующих полей и введите их в программе. \nПосле нажатия кнопки \"Расшифровать\" программа выполнит расшифровку соответствующих полей.\n");
        misc.append(help);
        misc.addCommand(new Command("ОК",Command.OK,0));
        CCMon.disp.setCurrent(misc);
    }
    
    public void displayAbout(){
        misc = new Form("О программе");
        misc.setCommandListener(this);
        StringItem help = new StringItem(null,"CC-Monitor x85\n\nПрограмма для расшифровки CC-Monitor'a для NEWSgold телефонов.\n\n(c) 2007 by Porfel\n\nhttp://forum.s-c.ru");
        misc.append(help);
        misc.addCommand(new Command("ОК",Command.OK,0));
        CCMon.disp.setCurrent(misc);
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch (command.getPriority()){
            case 0: CCMon.disp.setCurrent(CCMon.input.IF);
        }
    }
}
