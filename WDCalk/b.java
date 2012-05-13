// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   b.java

import javax.microedition.lcdui.Font;

public abstract class b
{

    public static boolean DO_DO_dZZ = false;
    public static boolean DO_DO_eZZ = false;
    public static boolean DO_DO_cZZ = false;
    
    public static Font DO_DO_fFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_cFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_lFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_iFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_eFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_bFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_dFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_aFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_hFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_kFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_gFontFont = Font.getFont(0, 0, 8);
    public static Font DO_DO_jFontFont = Font.getFont(0, 0, 8);
    public static int DO_DO_bII = 0x95f6ff;
    public static int DO_DO_aII = 0x2e6dff;
    public static int DO_DO_cII = 0xa9b3ff;
    public static int DO_DO_fII = 0x202080;
    public static int DO_DO_eII = 0xa0a0ff;
    public static int DO_DO_dII = 0xb5b4ff;
    public static boolean DO_DO_bZZ = true;
    public static boolean DO_DO_aZZ = false;

    public b()
    {
    }

    public static int _aII(int i)
    {
        switch(i)
        {
        case -1: 
            return !_isSievZ() ? 8 : 0x80001;

        case -2: 
            return 16;

        case -3: 
            return 32;

        case -4: 
            return !_isSievZ() ? 64 : 0x480002;

        case -5: 
            return 4;

        case -6: 
            return 0x80001;

        case -7: 
            return 0x480002;

        case 65534: 
            return 0x80000;

        case -11: 
            return 0x100001;

        case 65533: 
            return 0x600002;

        case 65535: 
            return 0x400000;

        case -26: 
        case 53: // '5'
            return 4;

        case -59: 
        case 50: // '2'
            return 8;

        case -60: 
        case 56: // '8'
            return 16;

        case -62: 
        case 54: // '6'
            return 64;

        case -61: 
        case 52: // '4'
            return 32;
        }
        return 0;
    }

    public static boolean _isSievZ()
    {
        try{
        Class.forName("com.siemens.mp.io.file.FileConnection");
        return true;}
        catch(ClassNotFoundException e){
        return false;
        }
    }

}
