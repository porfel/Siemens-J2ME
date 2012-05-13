import java.io.IOException;
import javax.microedition.lcdui.*;

public class AltMenu extends Canvas{
    
    public String[] NAT = null;
    public String[] DSC = null;
    
    Font FNT = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_PLAIN,Font.SIZE_SMALL);
    Font FNT2 = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_BOLD,Font.SIZE_SMALL);
    
    public int POS = 0;
    
    public AltMenu(){
        setFullScreenMode(true);
        try {
            NAT = Menu.RMS.getCommandArray(true);
            DSC = Menu.RMS.getCommandArray(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.gc();
    }
    
    public void reinit() throws IOException{
        NAT = Menu.RMS.getCommandArray(true);
        DSC = Menu.RMS.getCommandArray(false);
    }
    
    protected void paint(Graphics g) {
        g.setFont(FNT);
        g.drawImage(Menu.MM.BACK,0,0,0);
        drawCommands(g);
        drawHF(g);
    }
    private void drawHF(Graphics g){
        g.setFont(FNT);
        Image Header = Image.createImage(Menu.MM.BACK,0,0,Menu.MM.BACK.getWidth(),15,0);
        g.drawImage(Header,0,0,0);
        Image Foother = Image.createImage(Menu.MM.BACK,0,Menu.MM.BACK.getHeight()-15,132,15,0);
        g.drawImage(Foother,0,getHeight()-15,0);
        g.setColor(0x000000);
        g.drawString("Моё меню",10,2,0);
        g.drawString("Правка",2,getHeight()-15+2,0);
        g.drawString("Назад",getWidth()-(g.getFont().stringWidth("Назад")+15),getHeight()-15+2,0);
    }
    
    private void drawCommands(Graphics g){
        g.setColor(0xffffff);
        int offset = 0;
        if ((17+POS*FNT.getHeight()>getHeight()/2)&&(17+DSC.length*FNT.getHeight()>getHeight()-14)){
            if ((17+DSC.length*FNT.getHeight())-(POS*FNT.getHeight())>getHeight()/2)
                offset=(17+POS*FNT.getHeight())-(getHeight()/2);
            else offset=(DSC.length*FNT.getHeight())-(getHeight()-35);
        } else offset=0;
        for (int i = 0; i<NAT.length; i++){
            if (POS == i){
                g.setFont(FNT2);
                g.drawString(DSC[i],2,(17+(i*FNT2.getHeight()))-offset,0);
            } else{
                g.setFont(FNT);
                g.drawString(DSC[i],2,(17+(i*FNT.getHeight()))-offset,0);
            }
        }
    }
    protected void keyPressed(int i){
        
        try{
            switch(i){
                case -59: POS--;
                break;
                case -60: POS++;
                break;
                case 42: Menu.MM.MEN.notifyPaused();
                break;
                case -26: Menu.MM.MEN.platformRequest("native:"+NAT[POS]);
                break;
                case -4:  Menu.disp.setCurrent(Menu.MM);
                break;
                case -12: Menu.disp.setCurrent(Menu.MM);
                break;
                case -1: {
                    Menu.disp.setCurrent(Menu.ED.lst);
                }
            }
        }catch(Exception e){}
        if (POS<0)POS=DSC.length-1;
        if (POS>DSC.length-1)POS=0;
        System.gc();
        repaint();
    }
    
    protected void keyRepeated(int i){
        switch(i){
            case -59: POS--;
            break;
            case -60: POS++;
            break;
        }
        if (POS<0)POS=DSC.length-1;
        if (POS>DSC.length-1)POS=0;
        System.gc();
        repaint();
    }
}
