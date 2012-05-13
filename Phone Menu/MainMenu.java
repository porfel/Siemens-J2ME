import java.io.IOException;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class MainMenu extends Canvas implements Lib{
    
    public MIDlet MEN;
    
    public Image BACK;
    public Image BIG1;
    public Image SMALL1;
    
    public Image[] BIG = new Image[9];
    public Image[] SMALL = new Image[9];
    
    public int[] YP = YPST;
    
    public int POS = 4;
    public int CT = 1|2;
    
    public String SEL;
    
    Font FNT3 = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_BOLD,Font.SIZE_LARGE);
    
    public MainMenu(MIDlet MN) {
        MEN = MN;
        setFullScreenMode(true);
        init();
        try {
            BACK =  Image.createImage("/img/back2.png");
        }catch(IOException ex){
            ex.printStackTrace();
        }
        if (getHeight()<176) YP = YPSM;
    }
    
    private void init(){
        if (Menu.NSG)POS=1;
        try{
            
            for (int i=0; i<9; i++){
                BIG[i] = Image.createImage("/img/"+(i+1)+"b.png");
                SMALL[i] = Image.createImage("/img/"+(i+1)+"s.png");
                 if (Menu.NSG){
                    BIG[6] = Image.createImage("/img/1b.png");
                    BIG[8] = Image.createImage("/img/2b.png");
                    BIG[1] = Image.createImage("/img/3b.png");
                    SMALL[6] = Image.createImage("/img/1s.png");
                    SMALL[8] = Image.createImage("/img/2s.png");
                    SMALL[1] = Image.createImage("/img/3s.png");
            }
            }
            System.out.println("Images init: OK");
        } catch (Exception e){
            try {
                BIG1 = Image.createImage("/img/big.png");
                SMALL1 = Image.createImage("/img/small.png");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            for (int i=0; i<9; i++){
                BIG[i] = getImage(i,true);
                SMALL[i] = getImage(i,false);
            }
        }
        BIG1 = null;
        SMALL1 = null;
        System.gc();
    }
    
    protected void paint(Graphics g) {
        g.drawImage(BACK,0,0,0);
        Image Foother = Image.createImage(Menu.MM.BACK,0,BACK.getHeight()-15,Menu.MM.BACK.getWidth(),15,0);
        g.drawImage(Foother,0,getHeight()-15,0);
        drawMenu(g);
        Font FNT = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_PLAIN,Font.SIZE_SMALL);
        g.setFont(FNT);
        g.setColor(0xffffff);
        if (!Menu.NSG)
        g.drawString("Ìî¸ ìåíþ",2,getHeight()-(FNT.getHeight()+1),0);
        if (!Menu.NSG)
        SEL = MDESC[POS];
        else SEL = MDNS[POS];
        g.drawString(SEL,10,2,0);
        g.drawString(POS+1+"",getWidth()-10,2,0);
        if (!Menu.NSG)g.drawString("Îïöèè",getWidth()-(FNT.stringWidth("Îïöèè")+15),getHeight()-(FNT.getHeight()+1),0);
        else g.drawString("About",getWidth()-(FNT.stringWidth("About")+15),getHeight()-(FNT.getHeight()+1),0);
        if (Menu.NSG){
            g.setFont(FNT3);
            g.setColor(0xccccff);
            g.drawString("NEWSgold mode",(getWidth()-FNT3.stringWidth("NEWSgold mode"))/2,getHeight()-40,0);
        }
    }
    
    private void drawMenu(Graphics g){
        if (!Menu.NSG)
        for (int i=0; i<9; i++){
            if (POS==i){
                g.drawImage(BIG[i],XP[i],YP[i],CT);
            } else{
                g.drawImage(SMALL[i],XP[i],YP[i],CT);
            }
        }
        else{
            if (POS==0)
            g.drawImage(BIG[6],XP[0],YP[0],CT);
            else g.drawImage(SMALL[6],XP[0],YP[0],CT);
            if (POS==1)
            g.drawImage(BIG[8],XP[1],YP[1],CT);
            else g.drawImage(SMALL[8],XP[1],YP[1],CT);
            if (POS==2)
            g.drawImage(BIG[1],XP[2],YP[2],CT);
            else g.drawImage(SMALL[1],XP[2],YP[2],CT);
        }
    }
    
    private Image getImage(int pos, boolean big){
        Image OUT = null;
        if (big){
            OUT = Image.createImage(BIG1,(pos%3)*52,(pos/3)*38,52,38,0);
        } else{
            OUT = Image.createImage(SMALL1,(pos%3)*40,(pos/3)*30,40,30,0);
        }
        System.gc();
        return OUT;
    }
    
    protected void keyPressed(int i){
        try{
            if (!Menu.NSG)
            switch(i){
                
                case -61: POS--;
                break;
                case 42: MEN.notifyPaused();
                break;
                case -62: POS++;
                break;
                case -59: POS -=3;
                break;
                case -60: POS +=3;
                break;
                
                case 49: POS = 0;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 50: POS = 1;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 51: POS = 2;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 52: POS = 3;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 53: POS = 4;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 54: POS = 5;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 55: POS = 6;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 56: POS = 7;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case 57: POS = 8;
                MEN.platformRequest("native:"+NAT65[POS]);
                break;
                case -26: MEN.platformRequest("native:"+NAT65[POS]);
                break;
                
                case -1: {
                    if (Menu.RMS.getAlt())Menu.disp.setCurrent(Menu.ALT);
                    else MEN.platformRequest("native:ELSE_STR_MYMENU");
                }
                break;
                
                case -12: MEN.notifyDestroyed();
                break;
                
                case -4: Menu.disp.setCurrent(Menu.OPT);
                break;
            }
            else{
                switch(i){
                    case -61: POS--;
                    break;
                    case -62: POS++;
                    break;
                    case -26: 
                        switch(POS){
                    case 0: Menu.disp.setCurrent(Menu.ALT);
                    break;
                    case 1: MEN.platformRequest("native:NAT_MAIN_MENU");
                    break;
                    case 2: Menu.CL.displayCallForm();
                    break;
                    }
                    break;
                    case 49: Menu.disp.setCurrent(Menu.ALT);
                    break;
                    case 50: MEN.platformRequest("native:NAT_MAIN_MENU");
                    break;
                    case 51: Menu.CL.displayCallForm();
                    break;
                    case -12: MEN.notifyDestroyed();
                    break;
                    case 42: MEN.notifyPaused();
                    break;
                    case -4: Menu.disp.setCurrent(Menu.AB);
                    break;
                }
            };
        }catch(Exception e){};
        if (!Menu.NSG){
        if (POS>8)POS = POS - 9;
        if (POS<0)POS = 9 + POS;
        }else{
        if (POS>2)POS = POS - 3;
        if (POS<0)POS = 3 + POS;   
        }
        System.gc();
        repaint();
    }
    
    protected void keyRepeated(int i){
        switch(i){
            case -61: POS--;
            break;
            case -62: POS++;
            break;
            case -59: if (!Menu.NSG)POS -=3;
            break;
            case -60: if (!Menu.NSG)POS +=3;
            break;
        }
        if (!Menu.NSG){
        if (POS>8)POS = POS - 9;
        if (POS<0)POS = 9 + POS;
        }else{
        if (POS>2)POS = POS - 3;
        if (POS<0)POS = 3 + POS;   
        }
        System.gc();
        repaint();
    }
    
    public static int getPlatform(){
        System.out.println(System.getProperty("microedition.platform"));
        if (System.getProperty("microedition.platform").indexOf("SIE-")!=-1)  return 2;
        else return 0;
    }
}
