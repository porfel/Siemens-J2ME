// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   w.java

import java.util.Vector;
import javax.microedition.lcdui.*;

public class w
    implements j
{

    private t DO_DO_att;
    private WDCalk DO_DO_aMIDletMIDlet;
    public static String DO_DO_aaStringaString[] = {
        "Длина цикла это количество дней от начала одних месячных, до начала следующих.", "Продолжительность - это количество дней самих месячных."
    };
    public Vector DO_DO_aaVectoraVector[];
    public int DO_DO_bII;
    public f DO_DO_aafaf[];
    public Image DO_DO_bImageImage;
    public Image DO_DO_aImageImage;
    public int DO_DO_aII;
    private boolean DO_DO_cZZ;
    private boolean DO_DO_dZZ;
    private boolean DO_DO_aZZ;
    private boolean DO_DO_bZZ;

    public w(WDCalk midlet, t t1)
    {
        DO_DO_aaVectoraVector = new Vector[2];
        DO_DO_bII = 0;
        DO_DO_aafaf = new f[2];
        DO_DO_cZZ = false;
        DO_DO_dZZ = false;
        DO_DO_aZZ = false;
        DO_DO_bZZ = false;
        DO_DO_aMIDletMIDlet = midlet;
        DO_DO_att = t1;
        int i = b.DO_DO_aFontFont.getHeight() + 4;
        if(DO_DO_aImageImage != null && i < DO_DO_aImageImage.getHeight())
            i = DO_DO_aImageImage.getHeight();
        DO_DO_aII = i + 1;
        DO_DO_aafaf[0] = new f(p.DO_DO_aaStringaString[60] + " ", b.DO_DO_hFontFont, b.DO_DO_hFontFont, 1, DO_DO_aII, t1.getWidth() - 2);
        for(int l = 1; l < 26; l++)
            DO_DO_aafaf[0]._aStringV(String.valueOf(l));

        DO_DO_aafaf[1] = new f(p.DO_DO_aaStringaString[61], b.DO_DO_hFontFont, b.DO_DO_hFontFont, 1, DO_DO_aII + DO_DO_aafaf[0]._bvI(), t1.getWidth() - 2);
        for(int i1 = 1; i1 < 8; i1++)
            DO_DO_aafaf[1]._aStringV(String.valueOf(i1));

        DO_DO_aaStringaString[0] = p.DO_DO_aaStringaString[58];
        DO_DO_aaStringaString[1] = p.DO_DO_aaStringaString[59];
        int j1 = DO_DO_att.DO_DO_avv._avI() - 2;
        for(int k1 = 0; k1 < DO_DO_aaStringaString.length; k1++)
            DO_DO_aaVectoraVector[k1] = v._aStringFontVector(DO_DO_aaStringaString[k1], j1, b.DO_DO_kFontFont);

    }

    public static int _avI()
    {
        return 1;
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
        g.setFont(b.DO_DO_aFontFont);
        String s = p.DO_DO_aaStringaString[62];
        g.setColor(96);
        int i1 = i / 2 - b.DO_DO_aFontFont.stringWidth(s) / 2;
        g.drawString(s, i1, 1, 20);
        if(DO_DO_aImageImage != null)
            g.drawImage(DO_DO_aImageImage, i1 - 2, 0, 24);
        g.setColor(128);
        g.drawLine(1, DO_DO_aII, i - 1 - 1, DO_DO_aII);
        for(int j1 = 0; j1 < DO_DO_aafaf.length; j1++)
            DO_DO_aafaf[j1]._bGraphicsvV(g, DO_DO_bII == j1);

        int k1 = DO_DO_aafaf[0]._bvI() + DO_DO_aafaf[1]._bvI() + DO_DO_aII + 1;
        g.setColor(128);
        g.drawLine(1, k1, i - 1 - 1, k1);
        g.setFont(b.DO_DO_kFontFont);
        g.setColor(0x202080);
        Vector vector = DO_DO_aaVectoraVector[DO_DO_bII];
        int l1 = 0;
        for(int i2 = k1; l1 < vector.size(); i2 += b.DO_DO_kFontFont.getHeight() - 0)
        {
            g.drawString((String)vector.elementAt(l1), 1, i2, 20);
            l1++;
        }

    }

    public void _cvV()
    {
        DO_DO_bII = 0;
        DO_DO_aafaf[0]._aIV(h._avh()._bvI() - 1);
        DO_DO_aafaf[1]._aIV(h._avh()._avI() - 1);
    }

    public void _dvV()
    {
    }

    public void _aJV(long l)
    {
        if(DO_DO_att._aIZ(8))
        {
            if(DO_DO_bII == 1)
                DO_DO_bII = 0;
        } else
        if(DO_DO_att._aIZ(16))
        {
            if(DO_DO_bII == 0)
                DO_DO_bII = 1;
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
            if(DO_DO_bII == 0)
                DO_DO_bII = 1;
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
                DO_DO_aafaf[DO_DO_bII]._aZV(false);
            if(DO_DO_bZZ)
                DO_DO_aafaf[DO_DO_bII]._aZV(true);
        }
        DO_DO_att.DO_DO_avv.DO_DO_cII += l;
    }

    public void _bvV()
    {
        DO_DO_bImageImage = DO_DO_att.DO_DO_avv._aIImage(1);
        DO_DO_aImageImage = DO_DO_att.DO_DO_avv._aIImage(5);
        for(int i = 0; i < DO_DO_aafaf.length; i++)
            DO_DO_aafaf[i]._aImageV(DO_DO_bImageImage);

        DO_DO_aaStringaString[0] = p.DO_DO_aaStringaString[58];
        DO_DO_aaStringaString[1] = p.DO_DO_aaStringaString[59];
    }

    public void _avV()
    {
        h._avh()._aIV(DO_DO_aafaf[0]._avI() + 1 + DO_DO_aafaf[1]._avI() + 1);
        h._avh()._bIV(DO_DO_aafaf[1]._avI() + 1);
    }

    public String _aIString(int i)
    {
        String s = "";
        if(!b.DO_DO_cZZ);
        if(b.DO_DO_cZZ)
            s = p.DO_DO_aaStringaString[67];
        else
            s = p.DO_DO_aaStringaString[66];
        return i == 0 ? s : p.DO_DO_aaStringaString[50];
    }

}
