import java.io.IOException;
import javax.microedition.lcdui.*;
import javax.microedition.rms.RecordStoreException;

public class Options extends Canvas implements CommandListener{
    
    public String[] OPT = {"Альт. меню: ","Сброс","О программе","Выход"};
    
    public String STAT = "";
    
    Font FNT = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_PLAIN,Font.SIZE_SMALL);
    Font FNT2 = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_BOLD,Font.SIZE_SMALL);
    
    
    int POS = 0;
    
    public Options() {
        setFullScreenMode(true);
    }
    
    private String AL(){
        String out = "";
        try {
            if (Menu.RMS.getAlt())out = "ON";
            else out = "OFF";
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return out;
    }
    
    protected void paint(Graphics g){
        STAT = AL();
        g.drawImage(Menu.MM.BACK,0,0,0);
        g.setColor(0xffffff);
        g.setFont(FNT2);
        g.drawString(AL(),2+FNT2.stringWidth(OPT[0]),17,0);
        g.setColor(0x000000);
        g.setFont(FNT);
        g.drawString("Опции",10,2,0);
        Image Foother = Image.createImage(Menu.MM.BACK,0,Menu.MM.BACK.getHeight()-15,Menu.MM.BACK.getWidth(),15,0);
        g.drawImage(Foother,0,getHeight()-15,0);
        drawMenu(g);
        g.setColor(0x000000);
        g.setFont(FNT);
        g.drawString("Назад",getWidth()-(FNT.stringWidth("Назад")+15),getHeight()-(FNT.getHeight()+1),0);
    }
    
    private void drawMenu(Graphics g){
        g.setColor(0xffffff);
        for (int i=0; i<OPT.length; i++){
            if (POS == i){
                g.setFont(FNT2);
                g.drawString(OPT[i],2,(17+(i*FNT2.getHeight())),0);
            } else{
                g.setFont(FNT);
                g.drawString(OPT[i],2,(17+(i*FNT.getHeight())),0);
            }
        }
    }
    protected void keyPressed(int i){
        System.out.println("KEY: "+i);
        switch(i){
            case 42: Menu.MM.MEN.notifyPaused();
            break;
            case -4: Menu.disp.setCurrent(Menu.MM);
            break;
            case -12: Menu.disp.setCurrent(Menu.MM);
            break;
            case -59: POS--;
            break;
            case -60: POS++;
            break;
            case -26:{
                switch(POS){
                    case 0:{
                        try {
                            Menu.RMS.setAlt(!Menu.RMS.getAlt());
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    break;
                    case 1:{
                        Alert AL = new Alert("Внимание!","Эта операция удалит ВСЕ настройки программы, включая настройки альт. меню!",null,AlertType.ALARM);
                        AL.addCommand(new Command("Нет",Command.CANCEL,1));
                        AL.addCommand(new Command("Да",Command.OK,2));
                        AL.setCommandListener(this);
                        Menu.disp.setCurrent(AL,Menu.OPT);
                    }
                    break;
                    case 2: Menu.disp.setCurrent(Menu.AB);
                    break;
                    case 3: Menu.MM.MEN.notifyDestroyed();
                }
            }
        }
        if (POS<0)POS=OPT.length-1;
        if (POS>OPT.length-1)POS=0;
        System.gc();
        repaint();
    }
    
    public void commandAction(Command command, Displayable displayable) {
        switch(command.getPriority()){
            case 1: Menu.disp.setCurrent(Menu.OPT);
            break;
            case 2:{
                try {
                    Menu.RMS.rs.closeRecordStore();
                    Menu.RMS.rs.deleteRecordStore("DATA-PHONE-MENU");
                } catch (RecordStoreException ex) {
                    ex.printStackTrace();
                }
                Menu.MM.MEN.notifyDestroyed();
            }
            break;
        }
    }
}
