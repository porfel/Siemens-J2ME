/* �����, ���������� �� ������������� �������. �������� � MANIFEST.MF */

import javax.microedition.midlet.*; // ���������� ������.
import javax.microedition.lcdui.*;

public class CCMon extends MIDlet { // ������. ����� CCMon ��������� ��������� ����� MIDlet, �.�. �������� ��� �����������.
    
    //������ �������/����������
    
    public static Display disp;
    public static Result res;
    public static InputForm input;
    public static Misc misc;
    
    //**********************
    //����� ����������� ������//
    public CCMon(){
        disp = Display.getDisplay(this); //�������������� �������.
        input = new InputForm(this);
        res = new Result(this);
        misc = new Misc();
    }
    
    //**********************
    // ����� startApp - ���������, ����������� �������������
    
    public void startApp() {
        disp.setCurrent(input.IF); // ���������� ����� �����. ������������� ������� �� ����� ����� � ������� ������ setCurrent()
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
