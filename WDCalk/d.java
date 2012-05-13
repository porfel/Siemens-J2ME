// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   d.java

import javax.microedition.lcdui.Canvas;

public abstract class d extends Canvas
{

    public d()
    {
        setFullScreenMode(true);
        System.out.println(getWidth()+" "+getHeight());
    }
}
