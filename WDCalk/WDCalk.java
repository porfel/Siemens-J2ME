// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   MIDlet.java

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class WDCalk extends MIDlet
{

    public g DO_DO_agg;
    public t DO_DO_att;

    public WDCalk()
    {
        n._aMIDletIV(this, true, 10000);
        DO_DO_att = new t(this);
        Display.getDisplay(this).setCurrent(DO_DO_att);
        DO_DO_agg = new g(DO_DO_att);
        DO_DO_agg.start();
    }

    public void startApp()
    {
    }

    public void pauseApp()
    {
    }

    public void destroyApp(boolean flag)
    {
        DO_DO_att._bvV();
        notifyDestroyed();
    }
}
