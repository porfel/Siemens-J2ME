import javax.microedition.lcdui.*;

public class About extends Canvas{
    
    public About() {
        setFullScreenMode(true);
    }
    
    protected void paint(Graphics g) {
        
        g.drawImage(Menu.MM.BACK,0,0,0);
        
        Font FNT = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_PLAIN,Font.SIZE_SMALL);
        Font FNT2 = Font.getFont(Font.FACE_MONOSPACE,Font.STYLE_BOLD,Font.SIZE_SMALL);
        
        Image Foother = Image.createImage(Menu.MM.BACK,0,Menu.MM.BACK.getHeight()-15,Menu.MM.BACK.getWidth(),15,0);
        g.drawImage(Foother,0,getHeight()-15,0);
        
        g.setFont(FNT);
        g.setColor(0x000000);
        g.drawString("О программе",10,2,0);
        g.drawString("Назад",getWidth()-(FNT.stringWidth("Назад")+15),getHeight()-(FNT.getHeight()+1),0);
        g.setColor(0xffffff);
        
        g.setFont(FNT2);
        
        g.drawString("PHONE MENU v2.0c",2,17,0);
        
        g.setFont(FNT);
        
        g.drawString("J2ME menu for Siemens",2,32,0);
        
        g.setFont(FNT2);
        
        if (getHeight()>132){
            g.drawString("Used Resources by:",2,62,0);
            
            g.setColor(0xeeffff);
            
            g.setFont(FNT);
            
            g.drawString("RTFM - background ",2,77,0);
            g.drawString("Клименс - menu icons",2,92,0);
            g.drawString("Front242, PRM - N.CMD.",2,107,0);
            g.drawString("Zero-Cool - tester",2,122,0);
            
            g.setColor(0xffffff);
            g.setFont(FNT2);
            g.drawString("(c) 2007 by Porfel",2,147,0);
        } else{
            g.drawString("Used Resources by:",2,48,0);
            
            g.setColor(0xeeffff);
            
            g.setFont(FNT);
            
            g.drawString("RTFM, Клименс,",2,63,0);
            g.drawString("PRM, Front242",2,78,0);
            
            g.setColor(0xffffff);
            g.setFont(FNT2);
            g.drawString("(c) 2007 by Porfel",2,101,0);
        }
    }
    
    protected void keyPressed(int i){
        if (Menu.NSG)
        switch (i){
            case -4: Menu.disp.setCurrent(Menu.MM);
            break;
            case -12: Menu.disp.setCurrent(Menu.MM);
            break;
            case 42: Menu.MM.MEN.notifyPaused();
            break;
        }
        else{
            switch(i){
            case -4: Menu.disp.setCurrent(Menu.OPT);
            break;
            case -12: Menu.disp.setCurrent(Menu.OPT);
            break;
            case 42: Menu.MM.MEN.notifyPaused();
            break;
            }
        }
    }
}
