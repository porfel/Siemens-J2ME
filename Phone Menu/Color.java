import javax.microedition.lcdui.*;
public class Color implements CommandListener{
    public static List colors = new List("�����",List.EXCLUSIVE);
    
    public static int[] COLSCM = {0x000000,0x000000,0xffffff};
    // 1: ���� ���������, 2: ���� ������ ����, 3: ���� ������
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
