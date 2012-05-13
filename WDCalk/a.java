// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   a.java

import javax.microedition.lcdui.*;

public class a
    implements j
{

    public static final String DO_DO_aaStringaString[] = {
        "Календарь", "Настройки", "Выбор даты", "Помощь", "О программе", "Выход"
    };
    private t DO_DO_att;
    private WDCalk DO_DO_aMIDletMIDlet;
    public static int DO_DO_aII = 0;
    public Image DO_DO_aImageImage;
    private boolean DO_DO_aZZ;
    private boolean DO_DO_bZZ;

    public a(WDCalk midlet, t t1)
    {
        DO_DO_aZZ = false;
        DO_DO_bZZ = false;
        DO_DO_aMIDletMIDlet = midlet;
        DO_DO_att = t1;
    }

    public void _aGraphicsV(Graphics g)
    {
        int i = DO_DO_att.DO_DO_avv._avI();
        int l = DO_DO_att.DO_DO_avv._bvI();
        if(DO_DO_aImageImage != null)
        {
            g.drawImage(DO_DO_aImageImage, 0, 0, 20);
        } else
        {
            g.setColor(b.DO_DO_cII);
            g.fillRect(0, 0, i, l + 14);
        }
        int i1 = b.DO_DO_dFontFont.getHeight();
        g.setFont(b.DO_DO_dFontFont);
        g.setColor(b.DO_DO_fII);
        int j1 = 0;
        for(int k1 = 4; j1 < DO_DO_aaStringaString.length; k1 += (i1 + 1) - 1)
        {
            if(j1 == DO_DO_aII)
            {
                g.fillRect(4, k1, i - 8, (i1 + 1) - 1);
                g.setColor(0xffffff);
            } else
            {
                g.setColor(b.DO_DO_fII);
            }
            g.drawString(DO_DO_aaStringaString[j1], i / 2, k1, 17);
            j1++;
        }

    }

    public void _aJV(long l)
    {
        if(DO_DO_att._aIZ(8))
        {
            DO_DO_aZZ = true;
            DO_DO_bZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(16))
        {
            DO_DO_bZZ = true;
            DO_DO_aZZ = false;
            DO_DO_att.DO_DO_avv.DO_DO_cII = DO_DO_att.DO_DO_avv.DO_DO_dII + 1;
        } else
        if(DO_DO_att._aIZ(4))
            DO_DO_att.DO_DO_avv._bIV(0);
        if(DO_DO_att._bIZ(8))
            DO_DO_aZZ = false;
        else
        if(DO_DO_att._bIZ(16))
            DO_DO_bZZ = false;
        if(DO_DO_att.DO_DO_avv.DO_DO_cII > DO_DO_att.DO_DO_avv.DO_DO_dII)
        {
            DO_DO_att.DO_DO_avv.DO_DO_cII = 0;
            if(DO_DO_aZZ)
                if(DO_DO_aII > 0)
                    DO_DO_aII--;
                else
                    DO_DO_aII = DO_DO_aaStringaString.length - 1;
            if(DO_DO_bZZ)
                if(DO_DO_aII < DO_DO_aaStringaString.length - 1)
                    DO_DO_aII++;
                else
                    DO_DO_aII = 0;
        }
        DO_DO_att.DO_DO_avv.DO_DO_cII += l;
    }

    public void _bvV()
    {
        DO_DO_aImageImage = DO_DO_att.DO_DO_avv._aIImage(1);
        DO_DO_aaStringaString[0] = p.DO_DO_aaStringaString[51];
        DO_DO_aaStringaString[1] = p.DO_DO_aaStringaString[52];
        DO_DO_aaStringaString[2] = p.DO_DO_aaStringaString[53];
        DO_DO_aaStringaString[3] = p.DO_DO_aaStringaString[54];
        DO_DO_aaStringaString[4] = p.DO_DO_aaStringaString[55];
        DO_DO_aaStringaString[5] = p.DO_DO_aaStringaString[56];
    }

    public void _cvV()
    {
    }

    public void _dvV()
    {
    }

    public void _avV()
    {
        switch(DO_DO_aII)
        {
        case 0: // '\0'
            DO_DO_att.DO_DO_avv._aIV(0);
            break;

        case 1: // '\001'
            DO_DO_att.DO_DO_avv._aIV(3);
            break;

        case 2: // '\002'
            DO_DO_att.DO_DO_avv._aIV(2);
            break;

        case 3: // '\003'
            DO_DO_att.DO_DO_avv._aIV(4);
            break;

        case 4: // '\004'
            DO_DO_att.DO_DO_avv._aIV(6);
            break;

        case 5: // '\005'
            DO_DO_att.DO_DO_avv._aIV(9);
            break;
        }
    }

    public String _aIString(int i)
    {
        if(b.DO_DO_cZZ)
            return i == 0 ? p.DO_DO_aaStringaString[63] : p.DO_DO_aaStringaString[50];
        else
            return i == 0 ? p.DO_DO_aaStringaString[57] : p.DO_DO_aaStringaString[50];
    }

}
