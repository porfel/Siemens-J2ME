import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class Result implements CommandListener{
    
    public static Form results;
    public MIDlet main;
    
    public Result(MIDlet m) {
        main = m;
        results = new Form("Результаты");
        results.setCommandListener(this);
    }
    
    public void ShowResults(){
        results = new Form("Результаты");
        results.deleteAll();
        results.setCommandListener(this);
        String ot = Util.decodeOther(CCMon.input.other.getString());
        String se = Util.decodeSettings(CCMon.input.settings.getString());
        String ne = Util.decodeNetwork(CCMon.input.network.getString());
        String ba = Util.decodeBattary(CCMon.input.battary.getString());
        String di = Util.decodeDiagnostic(CCMon.input.diagnostic.getString());
        String pr = Util.decodeProvider(CCMon.input.provider.getString());
        
        StringItem other = new StringItem("Общее:",ot);
        StringItem settings = new StringItem("Настройки:",se);
        StringItem network = new StringItem("Сеть:",ne);
        StringItem battary = new StringItem("Аккумулятор:",ba);
        StringItem diagnostic = new StringItem("Диагностика:",di);
        StringItem provider = new StringItem("Оператор:",pr);
        
        Font fnt = Font.getFont(Font.FACE_SYSTEM,Font.STYLE_BOLD,Font.SIZE_SMALL);
        
        other.setFont(fnt);
        settings.setFont(fnt);
        network.setFont(fnt);
        battary.setFont(fnt);
        diagnostic.setFont(fnt);
        provider.setFont(fnt);
        
        results.append(other);
        results.append(settings);
        results.append(network);
        results.append(battary);
        results.append(diagnostic);
        results.append(provider);
        
        results.addCommand(new Command("Назад",Command.OK,0));
        results.addCommand(new Command("Справка",Command.SCREEN,1));
        results.addCommand(new Command("О программе",Command.SCREEN,2));
        results.addCommand(new Command("Выход",Command.EXIT,3));
        
        
        CCMon.disp.setCurrent(results);
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch (command.getPriority()){
            case 0:
                CCMon.disp.setCurrent(CCMon.input.IF);
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
