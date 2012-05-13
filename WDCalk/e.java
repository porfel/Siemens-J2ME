// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   e.java

import java.util.Calendar;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class e
    implements j
{

    private WDCalk DO_DO_aMIDletMIDlet;
    private i DO_DO_aii;
    private t DO_DO_att;
    public boolean DO_DO_dZZ;
    public Image DO_DO_bImageImage;
    public int DO_DO_cII;
    public int DO_DO_bII;
    public int DO_DO_dII;
    public int DO_DO_eII;
    public int DO_DO_aII;
    public Image DO_DO_aImageImage;
    private boolean DO_DO_cZZ;
    private boolean DO_DO_eZZ;
    private boolean DO_DO_aZZ;
    private boolean DO_DO_bZZ;

    public e(WDCalk midlet, i l, t t1)
    {
        DO_DO_cZZ = false;
        DO_DO_eZZ = false;
        DO_DO_aZZ = false;
        DO_DO_bZZ = false;
        DO_DO_aMIDletMIDlet = midlet;
        DO_DO_aii = l;
        DO_DO_att = t1;
        DO_DO_dZZ = true;
        DO_DO_bImageImage = Image.createImage(DO_DO_att.DO_DO_avv._avI(), DO_DO_att.DO_DO_avv._bvI());
        Calendar calendar = Calendar.getInstance();
        DO_DO_bII = calendar.get(2);
        DO_DO_cII = calendar.get(1);
        DO_DO_dII = calendar.get(5) - 1;
        DO_DO_aII = v._aIII(DO_DO_cII, DO_DO_bII);
        DO_DO_eII = 0;
    }

    public void _bvV()
    {
        DO_DO_eII = DO_DO_aii._avI();
        DO_DO_aImageImage = DO_DO_att.DO_DO_avv._aIImage(0);
    }

    public int _cvI()
    {
        return DO_DO_cII;
    }

    public int _avI()
    {
        return DO_DO_bII;
    }

    public int _bvI()
    {
        return DO_DO_dII;
    }

    public void _aIIV(int l, int i1)
    {
        DO_DO_cII = l;
        DO_DO_bII = i1;
        DO_DO_dII = 0;
        DO_DO_dZZ = true;
        DO_DO_aII = v._aIII(l, i1);
    }

    public void _aGraphicsV(Graphics g)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, DO_DO_cII);
        calendar.set(2, DO_DO_bII);
        calendar.set(5, 1);
        int l = calendar.get(7) - 1;
        l = l == 0 ? 6 : l - 1;
        _aIIV(l, DO_DO_bII, DO_DO_cII);
        int i1 = (DO_DO_att.DO_DO_avv.DO_DO_aImageImage.getWidth() - 12) / 7;
        g.drawImage(DO_DO_bImageImage, 0, 0, 20);
        int j1 = (l + DO_DO_dII) / 7;
        int k1 = (l + DO_DO_dII) % 7;
        g.setColor(0);
        g.fillRect(6 + k1 * i1 + 1, 44 + j1 * 28 + 1, i1 - 1, 23);
        g.setColor(0xffffff);
        g.setFont(b.DO_DO_iFontFont);
        g.drawString(String.valueOf(DO_DO_dII + 1), 6 + (k1 + 1) * i1, 44 + j1 * 28 + 1, 24);
    }

    public void _aIIV(int l, int i1, int j1)
    {
        int k1 = v._aIII(j1, i1, 0);
        Graphics g = DO_DO_bImageImage.getGraphics();
        int l1 = DO_DO_att.DO_DO_avv.DO_DO_aImageImage.getWidth();
        int i2 = DO_DO_att.DO_DO_avv._bvI();
        int j2 = (l1 - 12) / 7;
        if(DO_DO_aImageImage != null)
        {
            g.drawImage(DO_DO_aImageImage, 0, 0, 20);
        } else
        {
            g.setColor(b.DO_DO_cII);
            g.fillRect(0, 0, l1, i2 + 14);
            g.setColor(0, 0, 0);
            for(int k2 = 6; k2 <= 6 + j2 * 7; k2 += j2)
                g.drawLine(k2, 44, k2, 128);

            for(int l2 = 44; l2 <= 128; l2 += 14)
                g.drawLine(6, l2, 6 + j2 * 7, l2);

            g.setColor(b.DO_DO_fII);
            g.setFont(b.DO_DO_lFontFont);
            for(int i3 = 0; i3 < v.DO_DO_aaStringaString.length; i3++)
                g.drawString(v.DO_DO_aaStringaString[i3], 6 + j2 * i3 + j2 / 2, 43, 33);

        }
        int j3 = h._avh()._bvI();
        int k3 = 0;
        if(DO_DO_eII != -1)
            k3 = (k1 - DO_DO_eII) % j3;
        int ai[] = DO_DO_aii._aIIaI(DO_DO_cII, DO_DO_bII);
        int l3 = 0;
        int i4 = ai.length > 0 ? ai[0] : -1;
        int j4 = DO_DO_aii._aIII(DO_DO_cII, DO_DO_bII);
        int k4 = h._avh()._avI();
        g.setFont(b.DO_DO_iFontFont);
        int l4 = l / 7;
        int i5 = l % 7;
        int j5 = 0;
        for(int k5 = k1; j5 < DO_DO_aII; k5++)
        {
            if(k3 >= j3)
                k3 = 0;
            if(j5 == i4)
            {
                g.setColor(b.DO_DO_aII);
                g.fillRect(6 + i5 * j2 + 1, 44 + l4 * 14 + 1, j2 - 1, 23);
                j4 = h._avh()._avI() - 1;
                l3++;
                i4 = ai.length > l3 ? ai[l3] : -1;
            } else
            if(j4 > 0)
            {
                j4--;
                g.setColor(b.DO_DO_bII);
                g.fillRect(6 + i5 * j2 + 1, 44 + l4 * 14 + 1, j2 - 1, 23);
            }
            if(DO_DO_eII != -1 && k5 >= DO_DO_eII && k3 < k4)
            {
                g.setColor(k5 == DO_DO_eII ? b.DO_DO_aII : b.DO_DO_bII);
                g.fillRect(6 + i5 * j2 + 1, 44 + l4 * 14 + 1, j2 - 1, 23);
            }
            g.setColor(0);
            g.drawString(String.valueOf(j5 + 1), 6 + (i5 + 1) * j2, 44 + l4 * 14 + 1, 24);
            if(++i5 > 6)
            {
                l4+=2;
                i5 = 0;
            }
            j5++;
            k3++;
        }

        g.setFont(b.DO_DO_cFontFont);
        String s = v._bIString(i1) + " " + String.valueOf(j1);
        g.setColor(0xa080f0);
        g.drawString(s, l1 / 2 + 1, 2, 17);
        g.setColor(0xd020f0);
        g.drawString(s, l1 / 2, 1, 17);
    }

    public void _aIIIV(int l, int i1, int j1, boolean flag)
    {
        if(DO_DO_cII != l || DO_DO_bII != i1)
        {
            DO_DO_cII = l;
            DO_DO_bII = i1;
            DO_DO_aII = v._aIII(DO_DO_cII, DO_DO_bII);
            DO_DO_dZZ = true;
        }
        DO_DO_dII = j1;
        DO_DO_dZZ |= flag;
    }

    private void _evV()
    {
        DO_DO_aii._aIIV(DO_DO_cII, DO_DO_bII, DO_DO_dII);
        boolean flag = _avZ();
        DO_DO_eII = DO_DO_aii._avI();
        _aIIIV(DO_DO_cII, DO_DO_bII, DO_DO_dII, true);
        if(flag)
            DO_DO_att.DO_DO_avv._aIV(7);
    }

    private boolean _avZ()
    {
        boolean flag = false;
        int l = v._aIII(DO_DO_cII, DO_DO_bII, DO_DO_dII);
        int j2;
        int l1 = j2 = DO_DO_cII;
        int k2;
        int i2 = k2 = DO_DO_bII;
        for(int i1 = h._avh()._avI() - DO_DO_dII; i1 > 0; i1 -= v._aIII(l1, i2))
            if(--i2 < 0)
            {
                l1--;
                i2 = 11;
            }

        for(int j1 = h._avh()._avI() - (v._aIII(j2, k2) - DO_DO_dII); j1 > 0; j1 -= v._aIII(j2, k2))
            if(++k2 == 12)
            {
                k2 = 0;
                j2++;
            }

        int l2 = w._avI() - 1;
        int k1 = h._avh()._avI();
        for(int i3 = l1; i3 <= j2; i3++)
        {
            int j3 = i3 == l1 ? i2 : 0;
            int k3 = i3 == j2 ? k2 : 11;
            for(int l3 = j3; l3 <= k3; l3++)
            {
                int ai[] = DO_DO_aii._aIIaI(i3, l3);
                for(int i4 = 0; i4 < ai.length; i4++)
                {
                    int j4 = v._aIII(i3, l3, ai[i4]);
                    if(Math.abs(j4 - l) < l2 && (i3 != DO_DO_cII || l3 != DO_DO_bII || ai[i4] != DO_DO_dII))
                    {
                        DO_DO_aii._aIIV(i3, l3, ai[i4]);
                        flag = true;
                    }
                }

            }

        }

        return flag;
    }

    public void _aJV(long l)
    {
        if(DO_DO_att._aIZ(32))
        {
            DO_DO_aZZ = true;
            DO_DO_bZZ = false;
            DO_DO_cZZ = false;
            DO_DO_eZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(64))
        {
            DO_DO_bZZ = true;
            DO_DO_aZZ = false;
            DO_DO_cZZ = false;
            DO_DO_eZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(8))
        {
            DO_DO_cZZ = true;
            DO_DO_aZZ = false;
            DO_DO_bZZ = false;
            DO_DO_eZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(16))
        {
            DO_DO_eZZ = true;
            DO_DO_aZZ = false;
            DO_DO_bZZ = false;
            DO_DO_cZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(4))
        {
            if(DO_DO_att.DO_DO_avv.DO_DO_aZZ && v.DO_DO_bZZ)
                DO_DO_att.DO_DO_avv._aIV(10);
            DO_DO_att.DO_DO_avv.DO_DO_aZZ = false;
            _evV();
        }
        if(DO_DO_att._bIZ(32))
            DO_DO_aZZ = false;
        else
        if(DO_DO_att._bIZ(64))
            DO_DO_bZZ = false;
        else
        if(DO_DO_att._bIZ(8))
            DO_DO_cZZ = false;
        else
        if(DO_DO_att._bIZ(16))
            DO_DO_eZZ = false;
        if(DO_DO_att.DO_DO_avv.DO_DO_cII > DO_DO_att.DO_DO_avv.DO_DO_dII)
        {
            DO_DO_att.DO_DO_avv.DO_DO_cII = 0;
            if(DO_DO_aZZ)
                _aIV(-1);
            if(DO_DO_bZZ)
                _aIV(1);
            if(DO_DO_cZZ)
                _aIV(-7);
            if(DO_DO_eZZ)
                _aIV(7);
        }
        DO_DO_att.DO_DO_avv.DO_DO_cII += l;
    }

    public void _avV()
    {
    }

    public void _cvV()
    {
    }

    public void _dvV()
    {
    }

    private void _aIV(int l)
    {
        int i1 = DO_DO_cII;
        int j1 = DO_DO_bII;
        int k1 = DO_DO_dII;
        int l1 = DO_DO_eII;
        if(l > 0)
        {
            boolean flag = false;
            if(k1 < DO_DO_aII - l)
            {
                k1 += l;
            } else
            {
                int i2 = l - (DO_DO_aII - k1);
                if(j1 < 11)
                    j1++;
                else
                if(++i1 > 2050)
                {
                    i1 = 2050;
                    flag = true;
                } else
                {
                    j1 = 0;
                }
                DO_DO_aII = v._aIII(i1, j1);
                k1 = flag ? DO_DO_aII - 1 : i2;
            }
            _aIIIV(i1, j1, k1, false);
        } else
        if(l < 0)
        {
            boolean flag1 = false;
            l = -l;
            if(k1 >= l)
            {
                k1 -= l;
            } else
            {
                int j2 = l - k1;
                if(j1 > 0)
                    j1--;
                else
                if(--i1 < 1970)
                {
                    flag1 = true;
                    i1 = 1970;
                } else
                {
                    j1 = 11;
                }
                DO_DO_aII = v._aIII(i1, j1);
                k1 = flag1 ? 0 : DO_DO_aII - j2;
            }
            _aIIIV(i1, j1, k1, false);
        }
    }

    public void _fvV()
    {
        DO_DO_dZZ = true;
    }

    public String _aIString(int l)
    {
        return l == 0 ? p.DO_DO_aaStringaString[45] : p.DO_DO_aaStringaString[56];
    }
}
