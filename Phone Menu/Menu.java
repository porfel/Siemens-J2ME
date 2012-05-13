import java.io.IOException;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.rms.RecordStoreException;

public class Menu extends MIDlet {
    
    public static Display disp;
    public static MainMenu MM;
    public static About AB;
    public static AltMenu ALT;
    public static RMS RMS;
    public static Options OPT;
    public static Edit ED;
    public static edForm EF;
    public static addForm AD;
    public static NotAlert NA;
    public static boolean NSG = false;
    public static Call CL;
    
    public  Menu() throws RecordStoreException, IOException{
        disp = Display.getDisplay(this);
        if (MainMenu.getPlatform()==2)NSG = true;
        if (!NSG){
            RMS = new RMS();
            MM = new MainMenu(this);
            AB = new About();
            ALT = new AltMenu();
            ED = new Edit();
            AD = new addForm();
            EF = new edForm();
            NA = new NotAlert();
            OPT = new Options();
        }else{
            RMS = new RMS();
            MM = new MainMenu(this);
            AB = new About();
            ALT = new AltMenu();
            ED = new Edit();
            AD = new addForm();
            EF = new edForm();
            NA = new NotAlert();
            CL = new Call();
        };
    }
    
    public void startApp() {
            disp.setCurrent(MM);
    }
    
    public void pauseApp() {
        System.gc();
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
