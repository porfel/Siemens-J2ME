// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   l.java

import java.util.Vector;
import javax.microedition.lcdui.*;

public class l
    implements j
{

    public Vector DO_DO_aVectorVector;
    private t DO_DO_att;
    private WDCalk DO_DO_aMIDletMIDlet;
    public String DO_DO_cStringString;
    public int DO_DO_bII;
    public int DO_DO_cII;
    public Image DO_DO_bImageImage;
    public int DO_DO_aII;
    public Image DO_DO_aImageImage;
    public boolean DO_DO_bZZ;
    private boolean DO_DO_aZZ;
    private boolean DO_DO_cZZ;
    private String DO_DO_bStringString;
    private String DO_DO_aStringString;

    public l(WDCalk midlet, t t1, String s, String s1, int i, boolean flag, String s2, 
            String s3)
    {
        DO_DO_bII = -1;
        DO_DO_cII = 0;
        DO_DO_aZZ = false;
        DO_DO_cZZ = false;
        DO_DO_bStringString = s2;
        DO_DO_aStringString = s3;
        DO_DO_aMIDletMIDlet = midlet;
        DO_DO_att = t1;
        DO_DO_cStringString = s;
        DO_DO_aII = i;
        DO_DO_bZZ = flag;
        int i1 = DO_DO_att.DO_DO_avv._avI();
        int j1 = i1 - 4 - 4 - 2;
        DO_DO_aVectorVector = v._aStringFontVector(s1, j1, b.DO_DO_jFontFont);
    }

    public void _aGraphicsV(Graphics g)
    {
        int i = DO_DO_att.DO_DO_avv._avI();
        int i1 = DO_DO_att.DO_DO_avv._bvI();
        if(DO_DO_bImageImage != null)
        {
            g.drawImage(DO_DO_bImageImage, 0, 0, 20);
        } else
        {
            g.setColor(b.DO_DO_cII);
            g.fillRect(0, 0, i, i1);
        }
        int j1 = b.DO_DO_jFontFont.getHeight();
        if(DO_DO_bII == -1)
            DO_DO_bII = (i1 - 24) / j1;
        g.setColor(96);
        g.setFont(b.DO_DO_gFontFont);
        int k1 = i / 2 - b.DO_DO_gFontFont.stringWidth(DO_DO_cStringString) / 2;
        if(DO_DO_aImageImage != null && k1 - 2 < DO_DO_aImageImage.getWidth())
            k1 = DO_DO_aImageImage.getWidth() + 2;
        g.drawString(DO_DO_cStringString, k1, 5, 20);
        if(DO_DO_aImageImage != null)
            g.drawImage(DO_DO_aImageImage, k1 - 2, 0, 24);
        g.setColor(0xffffff);
        g.setFont(b.DO_DO_jFontFont);
        if(DO_DO_bZZ)
        {
            int l1 = DO_DO_cII;
            for(int k2 = 24; l1 < DO_DO_aVectorVector.size() && l1 - DO_DO_cII < DO_DO_bII; k2 += j1)
            {
                g.drawString((String)DO_DO_aVectorVector.elementAt(l1), i / 2 - 2, k2, 17);
                l1++;
            }

        } else
        {
            int i2 = DO_DO_cII;
            for(int l2 = 24; i2 < DO_DO_aVectorVector.size() && i2 - DO_DO_cII < DO_DO_bII; l2 += j1)
            {
                g.drawString((String)DO_DO_aVectorVector.elementAt(i2), 2, l2, 20);
                i2++;
            }

        }
        if(DO_DO_aVectorVector.size() > DO_DO_bII)
        {
            g.setColor(0xa5a4ff);
            int j2 = DO_DO_bII * j1;
            g.fillRect(i - 2 - 4, 24, 4, j2);
            int i3 = (DO_DO_bII * j2) / DO_DO_aVectorVector.size();
            int j3 = (DO_DO_cII * (j2 - i3)) / (DO_DO_aVectorVector.size() - DO_DO_bII);
            g.setColor(0x746bfd);
            g.fillRect(i - 2 - 4, 24 + j3, 4, i3);
        }
    }

    public void _aJV(long l1)
    {
        if(DO_DO_att._aIZ(8))
        {
            DO_DO_aZZ = true;
            DO_DO_cZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(16))
        {
            DO_DO_cZZ = true;
            DO_DO_aZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(4))
            DO_DO_att.DO_DO_avv._bIV(0);
        if(DO_DO_att._bIZ(8))
            DO_DO_aZZ = false;
        else
        if(DO_DO_att._bIZ(16))
            DO_DO_cZZ = false;
        if(DO_DO_att.DO_DO_avv.DO_DO_cII > DO_DO_att.DO_DO_avv.DO_DO_dII)
        {
            DO_DO_att.DO_DO_avv.DO_DO_cII = 0;
            if(DO_DO_aZZ && DO_DO_cII > 0)
                DO_DO_cII--;
            if(DO_DO_cZZ && DO_DO_cII + DO_DO_bII < DO_DO_aVectorVector.size())
                DO_DO_cII++;
        }
        DO_DO_att.DO_DO_avv.DO_DO_cII += l1;
    }

    public void _cvV()
    {
        DO_DO_cII = 0;
    }

    public void _dvV()
    {
    }

    public void _bvV()
    {
        DO_DO_bImageImage = DO_DO_att.DO_DO_avv._aIImage(1);
        DO_DO_aImageImage = DO_DO_att.DO_DO_avv._aIImage(DO_DO_aII);
    }

    public void _avV()
    {
    }

    public String _aIString(int i)
    {
        return i == 0 ? DO_DO_bStringString : DO_DO_aStringString;
    }
}
