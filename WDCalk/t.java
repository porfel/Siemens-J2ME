// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   t.java

import javax.microedition.lcdui.Graphics;

public class t extends d
{

    public WDCalk DO_DO_aMIDletMIDlet;
    public v DO_DO_avv;
    private m DO_DO_bmm;
    private m DO_DO_amm;
    private int DO_DO_aII;
    private int DO_DO_bII;
    private int DO_DO_cII;
    private int DO_DO_fII;
    private int DO_DO_eII;
    private boolean DO_DO_aZZ;
    private int DO_DO_dII;

    public t(WDCalk midlet)
    {
        DO_DO_aMIDletMIDlet = midlet;
        DO_DO_avv = new v(this);
        DO_DO_bmm = g._avm();
        DO_DO_amm = g._bvm();
        DO_DO_aZZ = false;
    }

    public void keyPressed(int i)
    {
        DO_DO_aII |= b._aII(i);
    }

    public void keyRepeated(int j)
    {
    }

    public void keyReleased(int i)
    {
        DO_DO_bII |= b._aII(i);
    }

    public void paint(Graphics g1)
    {
        DO_DO_avv._aGraphicsV(g1);
        DO_DO_bmm._bvV();
    }

    public void _aJV(long l)
    {
        DO_DO_fII = DO_DO_aII;
        DO_DO_eII = DO_DO_bII;
        DO_DO_cII = (DO_DO_cII | DO_DO_fII) & ~DO_DO_eII;
        DO_DO_aII = 0;
        DO_DO_bII = 0;
        DO_DO_avv._aJV(l);
        if(DO_DO_aZZ)
        {
            keyReleased(DO_DO_dII);
            DO_DO_aZZ = false;
        }
    }

    public void hideNotify()
    {
        DO_DO_amm._cvV();
    }

    public void showNotify()
    {
        DO_DO_amm._bvV();
    }

    public boolean _aIZ(int i)
    {
        return (DO_DO_fII & i) != 0;
    }

    public boolean _bIZ(int i)
    {
        return (DO_DO_eII & i) != 0;
    }

    public void _bvV()
    {
        if(DO_DO_avv != null && !v.DO_DO_bZZ)
            DO_DO_avv._dvV();
    }

    public void _avV()
    {
        DO_DO_aMIDletMIDlet.destroyApp(false);
    }
}
