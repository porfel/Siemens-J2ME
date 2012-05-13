// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   n.java

import java.io.PrintStream;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class n
{

    private static boolean DO_DO_aZZ = false;
    private static MIDlet DO_DO_aMIDletMIDlet = null;
    private static int DO_DO_aII;

    private n()
    {
    }

    public static void _aMIDletIV(MIDlet midlet, boolean flag, int i)
    {
        DO_DO_aMIDletMIDlet = midlet;
        DO_DO_aZZ = flag;
        DO_DO_aII = i;
    }

    public static void _aStringV(String s)
    {
        if(DO_DO_aZZ)
            System.out.println(s);
        else
        if(DO_DO_aMIDletMIDlet != null)
        {
            Alert alert = new Alert("Error!", s, null, null);
            alert.setTimeout(DO_DO_aII);
            Display.getDisplay(DO_DO_aMIDletMIDlet).setCurrent(alert);
        } else
        {
            throw new RuntimeException(s);
        }
    }

}
