/* Класс, отвечающий за инициализацию мидлета. Прописан в MANIFEST.MF */

import javax.microedition.midlet.*; // подключаем пакеты.
import javax.microedition.lcdui.*;

public class CCMon extends MIDlet { // Начало. Класс CCMon расширяет системный класс MIDlet, т.е. является его наследником.
    
    //Задаем объекты/переменные
    
    public static Display disp;
    public static Result res;
    public static InputForm input;
    public static Misc misc;
    
    //**********************
    //Далее конструктор класса//
    public CCMon(){
        disp = Display.getDisplay(this); //Инициализируем объекты.
        input = new InputForm(this);
        res = new Result(this);
        misc = new Misc();
    }
    
    //**********************
    // метод startApp - системный, выполняется автоматически
    
    public void startApp() {
        disp.setCurrent(input.IF); // Отображаем форму ввода. Устанавливаем дисплей на форме ввода с помощью метода setCurrent()
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
