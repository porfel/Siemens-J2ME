/* Класс - Форма ввода */

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class InputForm implements CommandListener{ // Класс реализует интерфейс CommandListener
    
    public MIDlet main;
    public Form IF;
    public static TextField other;
    public static TextField settings;
    public static TextField network;
    public static TextField battary;
    public static TextField diagnostic;
    public static TextField provider;
    
    
    public InputForm(MIDlet m) {
        main = m;
        other = new TextField("Общее:","",6,TextField.ANY);
        settings = new TextField("Настройки:","",6,TextField.ANY);
        network = new TextField("Сеть:","",6,TextField.ANY);
        battary = new TextField("Аккумулятор:","",6,TextField.ANY);
        diagnostic = new TextField("Диагностика:","",6,TextField.ANY);
        provider = new TextField("Провайдер:","",6,TextField.ANY);
        Item[] items = new Item[]{other,settings,network,battary,diagnostic,provider};
        IF = new Form("Значения",items);
        IF.addCommand(new Command("Расшифровать",Command.OK,0));
        IF.addCommand(new Command("Справка",Command.SCREEN,1));
        IF.addCommand(new Command("О программе",Command.SCREEN,2));
        IF.addCommand(new Command("Выход",Command.EXIT,3));
        IF.setCommandListener(this);
    }
    
    public void commandAction(Command command, Displayable displayable) { // Управление
        switch (command.getPriority()){
            case 0:
                CCMon.res.ShowResults();
                break;
            case 1:
                CCMon.misc.displayHelp();
                break;
            case 2:
                CCMon.misc.displayAbout();
                break;
            case 3: main.notifyDestroyed();
            break;
        }
    }
}
