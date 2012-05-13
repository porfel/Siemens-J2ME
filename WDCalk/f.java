// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   f.java

import java.util.Vector;
import javax.microedition.lcdui.*;

public class f
{

    private Vector DO_DO_aVectorVector;
    private int DO_DO_fII;
    private int DO_DO_dII;
    private int DO_DO_bII;
    private int DO_DO_eII;
    private String DO_DO_aStringString;
    private Font DO_DO_bFontFont;
    private Font DO_DO_aFontFont;
    private int DO_DO_cII;
    private int DO_DO_aII;
    private boolean DO_DO_aZZ;
    private boolean DO_DO_bZZ;
    private Image DO_DO_bImageImage;
    private Image DO_DO_aImageImage;

    public f(String s, Font font, Font font1, int i, int j, int k)
    {
        DO_DO_aVectorVector = new Vector();
        DO_DO_aZZ = true;
        DO_DO_bZZ = false;
        DO_DO_aImageImage = null;
        DO_DO_aStringString = s;
        DO_DO_bFontFont = font;
        DO_DO_aFontFont = font1;
        DO_DO_dII = i;
        DO_DO_bII = j;
        DO_DO_eII = k;
        DO_DO_cII = font.getHeight();
        DO_DO_aII = font1.getHeight();
        DO_DO_bImageImage = Image.createImage(k, _bvI());
    }

    public void _aImageV(Image image)
    {
        DO_DO_aImageImage = image;
    }

    public void _aStringV(String s)
    {
        int i = DO_DO_aFontFont.stringWidth(s) + 8;
        DO_DO_aVectorVector.addElement(new q(this, s, i));
    }

    public int _bvI()
    {
        return DO_DO_cII + DO_DO_aII + 4;
    }

    public void _bGraphicsvV(Graphics g, boolean flag)
    {
        if(DO_DO_aZZ || DO_DO_bZZ != flag)
        {
            _aGraphicsvV(DO_DO_bImageImage.getGraphics(), flag);
            DO_DO_bZZ = flag;
        }
        g.drawImage(DO_DO_bImageImage, DO_DO_dII, DO_DO_bII, 20);
    }

    private void _aGraphicsvV(Graphics g, boolean flag)
    {
        if(flag)
        {
            g.setColor(0x6060d0);
            g.fillRect(0, 0, DO_DO_eII, _bvI());
        } else
        if(DO_DO_aImageImage != null)
        {
            g.drawImage(DO_DO_aImageImage, -DO_DO_dII, -DO_DO_bII, 20);
        } else
        {
            g.setColor(255, 255, 255);
            g.fillRect(0, 0, 132, 176);
        }
        g.setColor(flag ? 0xffffff : 128);
        g.setFont(DO_DO_bFontFont);
        g.drawString(DO_DO_aStringString, 4, 0, 20);
        g.setFont(DO_DO_aFontFont);
        q q1 = (q)DO_DO_aVectorVector.elementAt(DO_DO_fII);
        int i = DO_DO_eII / 2 - q1.DO_DO_aII / 2;
        int j = DO_DO_eII / 2 + q1.DO_DO_aII / 2 + 4;
        _aGraphicsIV(g, q1, i, true, flag);
        int k = DO_DO_fII - 1;
        do
        {
            if(k < 0)
                break;
            q q2 = (q)DO_DO_aVectorVector.elementAt(k);
            i -= q2.DO_DO_aII + 4;
            if(i + q2.DO_DO_aII + 4 < 0)
                break;
            _aGraphicsIV(g, q2, i, false, flag);
            k--;
        } while(true);
        k = DO_DO_fII + 1;
        do
        {
            if(k >= DO_DO_aVectorVector.size())
                break;
            q q3 = (q)DO_DO_aVectorVector.elementAt(k);
            _aGraphicsIV(g, q3, j, false, flag);
            j += q3.DO_DO_aII + 4;
            k++;
        } while(j < DO_DO_eII);
        DO_DO_aZZ = false;
    }

    private void _aGraphicsIV(Graphics g, q q1, int i, boolean flag, boolean flag1)
    {
        if(flag1)
            g.setColor(flag ? 0xffffff : 0xa0a0ff);
        else
            g.setColor(flag ? 0x800000 : 0x404080);
        g.drawRect(i, DO_DO_cII, q1.DO_DO_aII, DO_DO_aII);
        if(flag)
            g.drawRect(i + 1, DO_DO_cII + 1, q1.DO_DO_aII - 2, DO_DO_aII - 2);
        g.drawString(q1.DO_DO_aStringString, i + 4 + 1, DO_DO_cII + 1, 20);
    }

    public void _aIV(int i)
    {
        DO_DO_fII = i;
    }

    public int _avI()
    {
        return DO_DO_fII;
    }

    public void _aZV(boolean flag)
    {
        if(flag)
        {
            if(DO_DO_fII < DO_DO_aVectorVector.size() - 1)
            {
                DO_DO_fII++;
                DO_DO_aZZ = true;
            }
        } else
        if(DO_DO_fII > 0)
        {
            DO_DO_fII--;
            DO_DO_aZZ = true;
        }
    }
}
