// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   g.java

import javax.microedition.lcdui.Canvas;

public final class g extends Thread
{

    private t DO_DO_att;
    private static final m DO_DO_bmm = new m(false);
    private static final m DO_DO_amm = new m(false);
    private long DO_DO_aJJ;
    private long DO_DO_bJJ;

    public g(t t1)
    {
        DO_DO_att = t1;
    }

    public final void run()
    {
        do
        {
            DO_DO_amm._avV();
            long l = System.currentTimeMillis();
            DO_DO_aJJ = l - DO_DO_bJJ;
            if(DO_DO_aJJ >= 40L)
            {
                DO_DO_bJJ = l;
                DO_DO_att._aJV(DO_DO_aJJ);
                DO_DO_amm._avV();
                DO_DO_bmm._cvV();
                DO_DO_att.repaint();
                DO_DO_bmm._avV();
            } else
            {
                try
                {
                    DO_DO_bmm._aJV(40L - DO_DO_aJJ);
                }
                catch(Exception exception)
                {
                    n._aStringV("Thread waitTimeForce : " + exception);
                }
            }
        } while(true);
    }

    public static final m _avm()
    {
        return DO_DO_bmm;
    }

    public static final m _bvm()
    {
        return DO_DO_amm;
    }

}
