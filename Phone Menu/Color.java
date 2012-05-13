import javax.microedition.lcdui.*;
public class Color implements CommandListener{
    public static List colors = new List("Цвета",List.EXCLUSIVE);
    
    public static int[] COLSCM = {0x000000,0x000000,0xffffff};
    // 1: Цвет заголовка, 2: Цвет строки меню, 3: Цвет текста
    public Color(){
        
    }

    public Image colImage(int color){
        Image img = Image.createImage(Font.getDefaultFont().getHeight(),Font.getDefaultFont().getHeight());
        Graphics g = img.getGraphics();
        g.setColor(color);
        g.fillRect(0,0,img.getWidth(),img.getHeight());
        return img;
    }
    
    public void commandAction(Command command, Displayable displayable) {
        
    }
    
}
