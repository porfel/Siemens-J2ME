import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class Result implements CommandListener{
    
    public static Form results;
    public MIDlet main;
    
    public Result(MIDlet m) {
        main = m;
        results = new Form("����������");
        results.setCommandListener(this);
    }
    
    public void ShowResults(){
        results = new Form("����������");
        results.deleteAll();
        results.setCommandListener(this);
        String ot = Util.decodeOther(CCMon.input.other.getString());
        String se = Util.decodeSettings(CCMon.input.settings.getString());
        String ne = Util.decodeNetwork(CCMon.input.network.getString());
        String ba = Util.decodeBattary(CCMon.input.battary.getString());
        String di = Util.decodeDiagnostic(CCMon.input.diagnostic.getString());
        String pr = Util.decodeProvider(CCMon.input.provider.getString());
        
        StringItem other = new StringItem("�����:",ot);
        StringItem settings = new StringItem("���������:",se);
        StringItem network = new StringItem("����:",ne);
        StringItem battary = new StringItem("�����������:",ba);
        StringItem diagnostic = new StringItem("�����������:",di);
        StringItem provider = new StringItem("��������:",pr);
        
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
        
        results.addCommand(new Command("�����",Command.OK,0));
        results.addCommand(new Command("�������",Command.SCREEN,1));
        results.addCommand(new Command("� ���������",Command.SCREEN,2));
        results.addCommand(new Command("�����",Command.EXIT,3));
        
        
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
