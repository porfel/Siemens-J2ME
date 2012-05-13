// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   s.java

import javax.microedition.lcdui.*;

public class s
    implements j
{

    private t DO_DO_att;
    private WDCalk DO_DO_aMIDletMIDlet;
    public int DO_DO_aII;
    public f DO_DO_aafaf[];
    public Image DO_DO_bImageImage;
    public Image DO_DO_aImageImage;
    private boolean DO_DO_aZZ;
    private boolean DO_DO_bZZ;

    public s(WDCalk midlet, t t1)
    {
        DO_DO_aII = 0;
        DO_DO_aafaf = new f[2];
        DO_DO_aZZ = false;
        DO_DO_bZZ = false;
        DO_DO_aMIDletMIDlet = midlet;
        DO_DO_att = t1;
        DO_DO_aafaf[0] = new f(p.DO_DO_aaStringaString[46], b.DO_DO_bFontFont, b.DO_DO_bFontFont, 2, 26, t1.getWidth() - 4);
        for(int i = 1970; i < 2050; i++)
            DO_DO_aafaf[0]._aStringV(String.valueOf(i));

        DO_DO_aafaf[1] = new f(p.DO_DO_aaStringaString[47], b.DO_DO_bFontFont, b.DO_DO_bFontFont, 2, 26 + DO_DO_aafaf[0]._bvI() + 2, t1.getWidth() - 4);
        for(int l = 0; l < 12; l++)
            DO_DO_aafaf[1]._aStringV(v._bIString(l));

    }

    public void _aIIV(int i, int l)
    {
        DO_DO_aafaf[0]._aIV(i - 1970);
        DO_DO_aafaf[1]._aIV(l);
    }

    public int _bvI()
    {
        return DO_DO_aafaf[0]._avI() + 1970;
    }

    public int _avI()
    {
        return DO_DO_aafaf[1]._avI();
    }

    public void _aGraphicsV(Graphics g)
    {
        int i = DO_DO_att.DO_DO_avv._avI();
        int l = DO_DO_att.DO_DO_avv._bvI();
        if(DO_DO_bImageImage != null)
        {
            g.drawImage(DO_DO_bImageImage, 0, 0, 20);
        } else
        {
            g.setColor(b.DO_DO_cII);
            g.fillRect(0, 0, i, l + 14);
        }
        g.setFont(b.DO_DO_eFontFont);
        String s1 = p.DO_DO_aaStringaString[48];
        g.setColor(96);
        int i1 = i / 2 - b.DO_DO_eFontFont.stringWidth(s1) / 2;
        g.drawString(s1, i1, 1, 20);
        int j1 = b.DO_DO_eFontFont.getHeight();
        if(DO_DO_aImageImage != null)
        {
            g.drawImage(DO_DO_aImageImage, i1 - 2, 0, 24);
            if(DO_DO_aImageImage.getHeight() > j1)
                j1 = DO_DO_aImageImage.getHeight();
        }
        g.setColor(128);
        g.drawLine(2, 4 + j1, i - 2 - 1, 4 + j1);
        for(int k1 = 0; k1 < DO_DO_aafaf.length; k1++)
            DO_DO_aafaf[k1]._bGraphicsvV(g, DO_DO_aII == k1);

    }

    public void _cvV()
    {
        DO_DO_aII = 0;
    }

    public void _dvV()
    {
    }

    public void _aJV(long l)
    {
        if(DO_DO_att._aIZ(8))
        {
            if(DO_DO_aII == 1)
                DO_DO_aII = 0;
        } else
        if(DO_DO_att._aIZ(16))
        {
            if(DO_DO_aII == 0)
                DO_DO_aII = 1;
        } else
        if(DO_DO_att._aIZ(32))
        {
            DO_DO_aZZ = true;
            DO_DO_bZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(64))
        {
            DO_DO_bZZ = true;
            DO_DO_aZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(4))
            if(DO_DO_aII == 0)
                DO_DO_aII = 1;
            else
                DO_DO_att.DO_DO_avv._bIV(0);
        if(DO_DO_att._bIZ(32))
            DO_DO_aZZ = false;
        else
        if(DO_DO_att._bIZ(64))
            DO_DO_bZZ = false;
        if(DO_DO_att.DO_DO_avv.DO_DO_cII > DO_DO_att.DO_DO_avv.DO_DO_dII)
        {
            DO_DO_att.DO_DO_avv.DO_DO_cII = 0;
            if(DO_DO_aZZ)
                DO_DO_aafaf[DO_DO_aII]._aZV(false);
            if(DO_DO_bZZ)
                DO_DO_aafaf[DO_DO_aII]._aZV(true);
        }
        DO_DO_att.DO_DO_avv.DO_DO_cII += l;
    }

    public void _bvV()
    {
        DO_DO_bImageImage = DO_DO_att.DO_DO_avv._aIImage(1);
        DO_DO_aImageImage = DO_DO_att.DO_DO_avv._aIImage(2);
        for(int i = 0; i < DO_DO_aafaf.length; i++)
            DO_DO_aafaf[i]._aImageV(DO_DO_bImageImage);

    }

    public void _avV()
    {
        DO_DO_att.DO_DO_avv._aIIV(_bvI(), _avI());
    }

    public String _aIString(int i)
    {
        if(b.DO_DO_cZZ)
            return i == 0 ? p.DO_DO_aaStringaString[63] : p.DO_DO_aaStringaString[50];
        else
            return i == 0 ? p.DO_DO_aaStringaString[49] : p.DO_DO_aaStringaString[50];
    }
}
