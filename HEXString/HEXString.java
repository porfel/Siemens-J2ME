import java.io.UnsupportedEncodingException;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class HEXString extends MIDlet implements CommandListener{
    
    public static Display disp;
    public Form HEXForm;
    public TextField input;
    public TextField output;
    public static TextField count;
    public MIDlet t = this;
    
    public HEXString(){
        disp = Display.getDisplay(this);
        HEXForm = new Form("HEXString 1.0");
        input = new TextField("Введите текст:",null,512,TextField.ANY);
        output = new TextField("HEX-Строка:",null,1546,TextField.ANY);
        count = new TextField("Длина:","0 байт(а)",512,TextField.UNEDITABLE);
        HEXForm.append(input);
        HEXForm.append(count);
        HEXForm.append(output);
        HEXForm.addCommand(new Command("ОК",Command.OK,0));
        HEXForm.addCommand(new Command("Выход",Command.EXIT,1));
        HEXForm.setCommandListener(this);
    }
    
    public void startApp() {
        disp.setCurrent(HEXForm);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch (command.getPriority()){
            case 0:{
                String inp = input.getString();
                String out = "";
                byte[] b = null;
                try {
                    b = new byte[inp.getBytes("UTF-8").length];
                    b = inp.getBytes("UTF-8");
                } catch (UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                }
                for (int i = 0; i<b.length; i++){
                    int Z = (int)b[i] & 0xFF;
                    out += Integer.toHexString(Z).toUpperCase()+" ";
                }
                int size = b.length;
                output.setString(out.substring(0,out.length()-1));
                count.setString(size+" байт(а)");
            }
            break;
            case 1: this.notifyDestroyed();
            break;
        }
    }
}
