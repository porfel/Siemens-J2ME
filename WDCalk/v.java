// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   v.java

import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;

public class v
{

    private static final int DO_DO_aaIaI[] = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 
        30, 31
    };
    public static final String DO_DO_aaStringaString[] = {
        "Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"
    };
    private static final String DO_DO_baStringaString[] = {
        "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", 
        "Ноябрь", "Декабрь"
    };
    public t DO_DO_att;
    private boolean DO_DO_aaZaZ[];
    private static String DO_DO_jStringString;
    private static String DO_DO_pStringString;
    private static String DO_DO_rStringString;
    private static String DO_DO_tStringString;
    private static String DO_DO_kStringString;
    private static String DO_DO_cStringString;
    private static String DO_DO_nStringString;
    private static String DO_DO_uStringString;
    private static String DO_DO_eStringString;
    private static String DO_DO_lStringString;
    private static String DO_DO_hStringString;
    private static String DO_DO_gStringString;
    private j DO_DO_aajaj[];
    private static final String DO_DO_caStringaString[] = {
        "/calendar.png", "/back.png", "/icon-calendar.png", "/icon-flower.png", "/icon-girl.png", "/icon-heart.png", "/icon-question.png"
    };
    private Image DO_DO_aaImageaImage[];
    private Image DO_DO_bImageImage;
    public int DO_DO_bII;
    public int DO_DO_fII;
    public int DO_DO_aII;
    public Image DO_DO_aImageImage;
    public int DO_DO_cII;
    public int DO_DO_dII;
    private i DO_DO_aii;
    public boolean DO_DO_eZZ;
    private int DO_DO_gII;
    private String DO_DO_qStringString;
    private String DO_DO_sStringString;
    public static boolean DO_DO_bZZ = false;
    public boolean DO_DO_aZZ;
    public boolean DO_DO_cZZ;
    public boolean DO_DO_dZZ;
    private static String DO_DO_iStringString;
    private static String DO_DO_vStringString;
    private static String DO_DO_bStringString;
    private static String DO_DO_wStringString;
    private static String DO_DO_oStringString;
    private static String DO_DO_aStringString;
    private static String DO_DO_fStringString;
    private static String DO_DO_mStringString;
    private static String DO_DO_dStringString;
    public int DO_DO_eII;

    public v(t t1)
    {
        DO_DO_aaZaZ = new boolean[2];
        DO_DO_aajaj = new j[12];
        DO_DO_aaImageaImage = new Image[DO_DO_caStringaString.length];
        DO_DO_aImageImage = null;
        DO_DO_dII = 300;
        DO_DO_aii = new i();
        DO_DO_eZZ = h._avh()._avZ();
        DO_DO_gII = 0;
        DO_DO_aZZ = false;
        DO_DO_cZZ = true;
        DO_DO_dZZ = true;
        DO_DO_eII = 0;
        DO_DO_att = t1;
        DO_DO_aII = -1;
        DO_DO_bII = -1;
        DO_DO_fII = 3 + DO_DO_aajaj.length + DO_DO_caStringaString.length;
        DO_DO_aImageImage = Image.createImage(_avI(), _bvI());
        try
        {
            p._aStringV("/lang/ru.lng");
        }
        catch(Exception exception)
        {
            n._aStringV("Error loading lng : " + exception);
        }
    }

    public void _aJV(long l1)
    {
        _cvV();
        if(DO_DO_aII != -1)
            if(!b.DO_DO_dZZ)
            {
                if(DO_DO_att._bIZ(1))
                {
                    DO_DO_aaZaZ[0] = false;
                    _bIV(0);
                } else
                if(DO_DO_att._bIZ(2))
                {
                    DO_DO_aaZaZ[1] = false;
                    _bIV(1);
                } else
                if(DO_DO_att._aIZ(1))
                    DO_DO_aaZaZ[0] = true;
                else
                if(DO_DO_att._aIZ(2))
                    DO_DO_aaZaZ[1] = true;
                else
                if(DO_DO_att._aIZ(0x40000))
                    _avV();
                else
                    DO_DO_aajaj[DO_DO_aII]._aJV(l1);
            } else
            if(DO_DO_att._aIZ(1))
            {
                DO_DO_aaZaZ[0] = false;
                _bIV(0);
            } else
            if(DO_DO_att._aIZ(2))
            {
                DO_DO_aaZaZ[1] = false;
                _bIV(1);
            } else
            if(DO_DO_att._aIZ(0x40000))
                _avV();
            else
                DO_DO_aajaj[DO_DO_aII]._aJV(l1);
    }

    public int _avI()
    {
        return 240;
    }

    public int _bvI()
    {
        
        return 308;
    }

    public void _cvV()
    {
        if(DO_DO_bII == -1)
        {
            DO_DO_aaStringaString[0] = p.DO_DO_aaStringaString[0];
            DO_DO_aaStringaString[1] = p.DO_DO_aaStringaString[1];
            DO_DO_aaStringaString[2] = p.DO_DO_aaStringaString[2];
            DO_DO_aaStringaString[3] = p.DO_DO_aaStringaString[3];
            DO_DO_aaStringaString[4] = p.DO_DO_aaStringaString[4];
            DO_DO_aaStringaString[5] = p.DO_DO_aaStringaString[5];
            DO_DO_aaStringaString[6] = p.DO_DO_aaStringaString[6];
            DO_DO_baStringaString[0] = p.DO_DO_aaStringaString[7];
            DO_DO_baStringaString[1] = p.DO_DO_aaStringaString[8];
            DO_DO_baStringaString[2] = p.DO_DO_aaStringaString[9];
            DO_DO_baStringaString[3] = p.DO_DO_aaStringaString[10];
            DO_DO_baStringaString[4] = p.DO_DO_aaStringaString[11];
            DO_DO_baStringaString[5] = p.DO_DO_aaStringaString[12];
            DO_DO_baStringaString[6] = p.DO_DO_aaStringaString[13];
            DO_DO_baStringaString[7] = p.DO_DO_aaStringaString[14];
            DO_DO_baStringaString[8] = p.DO_DO_aaStringaString[15];
            DO_DO_baStringaString[9] = p.DO_DO_aaStringaString[16];
            DO_DO_baStringaString[10] = p.DO_DO_aaStringaString[17];
            DO_DO_baStringaString[11] = p.DO_DO_aaStringaString[18];
            DO_DO_jStringString = p.DO_DO_aaStringaString[22];
            DO_DO_pStringString = p.DO_DO_aaStringaString[19];
            DO_DO_rStringString = p.DO_DO_aaStringaString[23];
            DO_DO_tStringString = p.DO_DO_aaStringaString[24];
            DO_DO_kStringString = p.DO_DO_aaStringaString[25];
            DO_DO_cStringString = p.DO_DO_aaStringaString[26];
            DO_DO_nStringString = p.DO_DO_aaStringaString[27];
            DO_DO_uStringString = p.DO_DO_aaStringaString[28];
            DO_DO_eStringString = p.DO_DO_aaStringaString[29];
            DO_DO_lStringString = p.DO_DO_aaStringaString[30];
            DO_DO_hStringString = p.DO_DO_aaStringaString[31];
            DO_DO_gStringString = p.DO_DO_aaStringaString[32];
            DO_DO_bImageImage = _aStringIImage("/title.png", _avI(), _bvI());
        } else
        if(DO_DO_bII == 0)
        {
            byte abyte0[] = _aStringaB("config");
            if(abyte0 != null)
                h._avh()._aaBV(abyte0);
            DO_DO_eZZ = h._avh()._avZ();
            DO_DO_iStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Code");
            DO_DO_vStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Short-Number");
            DO_DO_bStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Payment-Text");
            DO_DO_wStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Game1-Name");
            DO_DO_oStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Game1-Code");
            DO_DO_aStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Game2-Name");
            DO_DO_fStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Game2-Code");
            DO_DO_mStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Game3-Name");
            DO_DO_dStringString = DO_DO_att.DO_DO_aMIDletMIDlet.getAppProperty("Game3-Code");
            DO_DO_qStringString = p.DO_DO_aaStringaString[70];
            DO_DO_qStringString += " " + p.DO_DO_aaStringaString[71];
            if(b.DO_DO_cZZ)
                DO_DO_qStringString += p.DO_DO_aaStringaString[63];
            else
                DO_DO_qStringString += p.DO_DO_aaStringaString[78];
            DO_DO_qStringString += p.DO_DO_aaStringaString[72];
            DO_DO_qStringString += "\n";
            if(b.DO_DO_aZZ)
                DO_DO_qStringString += DO_DO_bStringString;
            else
                DO_DO_qStringString += p.DO_DO_aaStringaString[76] + " " + DO_DO_bStringString;
            DO_DO_qStringString += "\n";
            DO_DO_qStringString += p.DO_DO_aaStringaString[81];
            DO_DO_sStringString = p.DO_DO_aaStringaString[79] + " " + p.DO_DO_aaStringaString[73] + " " + DO_DO_iStringString + " " + p.DO_DO_aaStringaString[74] + " " + DO_DO_vStringString;
        } else
        if(DO_DO_bII == 1)
        {
            byte abyte1[] = _aStringaB("calendar");
            if(abyte1 != null)
                DO_DO_aii._aaBV(abyte1);
        } else
        if(DO_DO_bII == 2 + DO_DO_fII)
        {
            System.out.println("Init...");
            _bvV();
        } else
        if(DO_DO_bII - 2 < DO_DO_aaImageaImage.length)
        {
            if(!b.DO_DO_eZZ || DO_DO_bII - 2 > 1)
                DO_DO_aaImageaImage[DO_DO_bII - 2] = _aStringIImage(DO_DO_caStringaString[DO_DO_bII - 2], 1, 1);
        } else
        {
            switch(DO_DO_bII - 2 - DO_DO_aaImageaImage.length)
            {
            default:
                break;

            case 0: // '\0'
                DO_DO_aajaj[0] = new e(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_aii, DO_DO_att);
                break;

            case 1: // '\001'
                DO_DO_aajaj[1] = new a(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att);
                break;

            case 2: // '\002'
                DO_DO_aajaj[2] = new s(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att);
                break;

            case 3: // '\003'
                DO_DO_aajaj[3] = new w(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att);
                break;

            case 4: // '\004'
                DO_DO_aajaj[4] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[54], DO_DO_pStringString, 6, false, p.DO_DO_aaStringaString[63], null);
                break;

            case 5: // '\005'
                DO_DO_aajaj[5] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[64], DO_DO_tStringString, 4, false, p.DO_DO_aaStringaString[63], null);
                break;

            case 6: // '\006'
                DO_DO_aajaj[6] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[55], DO_DO_rStringString, 3, false, p.DO_DO_aaStringaString[63], null);
                break;

            case 7: // '\007'
                DO_DO_aajaj[7] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[38], DO_DO_kStringString, 4, false, p.DO_DO_aaStringaString[63], null);
                break;

            case 8: // '\b'
                DO_DO_aajaj[8] = null;
                break;

            case 9: // '\t'
                DO_DO_aajaj[9] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[56], DO_DO_jStringString, 6, false, p.DO_DO_aaStringaString[40], p.DO_DO_aaStringaString[41]);
                break;

            case 10: // '\n'
                if(b.DO_DO_cZZ)
                    DO_DO_aajaj[10] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[68], DO_DO_qStringString, 3, false, p.DO_DO_aaStringaString[63], p.DO_DO_aaStringaString[50]);
                else
                    DO_DO_aajaj[10] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[69], DO_DO_qStringString, 3, false, p.DO_DO_aaStringaString[78], p.DO_DO_aaStringaString[77]);
                break;

            case 11: // '\013'
                DO_DO_aajaj[11] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, p.DO_DO_aaStringaString[68], DO_DO_sStringString, 3, false, p.DO_DO_aaStringaString[63], null);
                break;
            }
        }
        if(DO_DO_bII < 3 + DO_DO_fII)
            DO_DO_bII++;
    }

    private byte[] _aStringaB(String s1)
    {
        byte abyte0[] = null;
        try
        {
            RecordStore recordstore = RecordStore.openRecordStore(s1, true);
            RecordEnumeration recordenumeration = recordstore.enumerateRecords(null, null, false);
            if(recordenumeration.hasNextElement())
                abyte0 = recordenumeration.nextRecord();
            recordenumeration = null;
            recordstore.closeRecordStore();
            recordstore = null;
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return abyte0;
    }

    public Image _aIImage(int i1)
    {
        return DO_DO_aaImageaImage[i1];
    }

    public void _aIV(int i1)
    {
        DO_DO_gII = DO_DO_aII;
        if(DO_DO_aII != -1)
            DO_DO_aajaj[DO_DO_aII]._dvV();
        if(i1 == 0 && DO_DO_aajaj[8] == null)
        {
            i1 = 8;
            int j1 = DO_DO_aii._avI();
            String s1;
            String s3;
            if(j1 == -1)
            {
                s3 = DO_DO_cStringString;
                s1 = p.DO_DO_aaStringaString[33];
            } else
            {
                e e3 = (e)DO_DO_aajaj[0];
                int k1 = _aIII(e3._cvI(), e3._avI(), e3._bvI());
                int l1 = h._avh()._avI();
                int i2 = h._avh()._bvI();
                int j2 = k1 - j1;
                if(j2 < 0)
                {
                    s3 = "";
                    s1 = "";
                    i1 = 0;
                } else
                if(j2 < l1 - 1)
                {
                    s1 = p.DO_DO_aaStringaString[34];
                    int k2 = l1 - j2;
                    s3 = DO_DO_hStringString + _aIString(k2) + ".";
                } else
                if(j2 < l1)
                {
                    s1 = p.DO_DO_aaStringaString[35];
                    int l2 = i2 - j2;
                    s3 = DO_DO_gStringString + _aIString(l2) + ".";
                } else
                if(j2 < i2 - 1)
                {
                    s1 = p.DO_DO_aaStringaString[36];
                    int i3 = i2 - j2;
                    s3 = DO_DO_lStringString + _aIString(i3) + ".";
                } else
                if(j2 < i2 + 1)
                {
                    s1 = p.DO_DO_aaStringaString[35];
                    s3 = DO_DO_nStringString;
                } else
                if(j2 < i2 + 7)
                {
                    s1 = p.DO_DO_aaStringaString[37];
                    s3 = DO_DO_uStringString;
                } else
                {
                    s1 = p.DO_DO_aaStringaString[38];
                    s3 = DO_DO_eStringString;
                }
            }
            DO_DO_aajaj[8] = new l(DO_DO_att.DO_DO_aMIDletMIDlet, DO_DO_att, s1, s3, 4, true, p.DO_DO_aaStringaString[63], null);
            DO_DO_aajaj[8]._bvV();
        }
        switch(i1)
        {
        case 0: // '\0'
            e e1 = (e)DO_DO_aajaj[0];
            e1._fvV();
            break;

        case 1: // '\001'
        case 2: // '\002'
            s s2 = (s)DO_DO_aajaj[2];
            e e2 = (e)DO_DO_aajaj[0];
            s2._aIIV(e2._cvI(), e2._avI());
            break;
        }
        DO_DO_aII = i1;
        DO_DO_aajaj[DO_DO_aII]._cvV();
    }

    public void _aIIV(int i1, int j1)
    {
        e e1 = (e)DO_DO_aajaj[0];
        e1._aIIV(i1, j1);
        _aIV(0);
    }

    public void _bvV()
    {
        if(h._avh()._avZ())
            _aIV(5);
        else
            _aIV(0);
        for(int i1 = 0; i1 < DO_DO_aajaj.length; i1++)
            if(DO_DO_aajaj[i1] != null)
                DO_DO_aajaj[i1]._bvV();

    }

    public void _aGraphicsV(Graphics g)
    {
        if(DO_DO_aII != -1)
        {
            Graphics g1 = DO_DO_aImageImage.getGraphics();
            DO_DO_aajaj[DO_DO_aII]._aGraphicsV(g1);
            g.fillRect(0, 0, _avI(), 0);
            g.drawImage(DO_DO_aImageImage, 0, 0, 20);
            _bGraphicsV(g);
            g.fillRect(0, 308, _avI(), _bvI() - 0 - 308);
        } else
        {
            int i1 = _avI();
            int j1 = _bvI();
            g.setColor(0);
            if(DO_DO_bII == 0)
            {
                g.fillRect(0, 0, i1, j1);
                if(DO_DO_bImageImage != null)
                {
                    g.drawImage(DO_DO_bImageImage, 0, 0, 20);
                } else
                {
                    g.setColor(0xa9b3ff);
                    g.fillRect(0, 0, i1, 320);
                    Font font = Font.getFont(64, 0, 0);
                    g.setFont(font);
                    g.setColor(0x4444df);
                    g.drawString(p.DO_DO_aaStringaString[39], i1 / 2, (0 + j1 / 2) - font.getHeight() / 2, 17);
                }
            }
            if(DO_DO_bII == 3)
                DO_DO_bImageImage = null;
            if(DO_DO_bII > 0)
            {
                int k1 = i1 - 8;
                g.setColor(0xa9b3ff);
                g.fillRect(2, 300, i1 - 4, 8);
                g.setColor(0x4444df);
                g.drawRect(2, 300, i1 - 4, 8);
                int l1 = (k1 * DO_DO_bII) / ((DO_DO_fII - 1) + 4);
                g.fillRect(4, 302, l1 + 1, 5);
            }
        }
    }

    public void _bIV(int i1)
    {
        switch(DO_DO_aII)
        {
        default:
            break;

        case 0: // '\0'
            if(i1 == 0)
            {
                _aIV(1);
                if(DO_DO_cZZ && DO_DO_bZZ)
                {
                    _aIV(10);
                    DO_DO_cZZ = true;
                }
                break;
            }
            _aIV(9);
            if(DO_DO_dZZ && DO_DO_bZZ)
            {
                _aIV(10);
                DO_DO_dZZ = true;
            }
            break;

        case 1: // '\001'
            if(i1 == 0)
                DO_DO_aajaj[1]._avV();
            else
                _aIV(0);
            break;

        case 2: // '\002'
            if(i1 == 0)
                DO_DO_aajaj[2]._avV();
            else
                _aIV(1);
            break;

        case 3: // '\003'
            if(DO_DO_eZZ)
            {
                if(i1 == 0)
                {
                    DO_DO_eZZ = h._avh()._avZ();
                    _aIV(0);
                }
            } else
            {
                _aIV(1);
            }
            if(i1 == 0)
                DO_DO_aajaj[3]._avV();
            break;

        case 9: // '\t'
            if(i1 == 0)
                DO_DO_att._avV();
            else
                _aIV(DO_DO_gII);
            break;

        case 10: // '\n'
            if(i1 == 0)
            {
                if(u._aStringZ(DO_DO_iStringString, DO_DO_vStringString))
                {
                    DO_DO_aII = 0;
                    _aIV(DO_DO_gII);
                } else
                {
                    DO_DO_aII = 0;
                    _aIV(11);
                }
            } else
            {
                DO_DO_aII = 0;
                _aIV(DO_DO_gII);
            }
            break;

        case 4: // '\004'
        case 6: // '\006'
            if(i1 == 0)
                _aIV(1);
            break;

        case 7: // '\007'
        case 8: // '\b'
        case 11: // '\013'
            if(i1 == 0)
                _aIV(0);
            break;

        case 5: // '\005'
            if(i1 == 0)
                _aIV(3);
            break;
        }
    }

    private void _avV()
    {
        switch(DO_DO_aII)
        {
        case 0: // '\0'
            DO_DO_att._avV();
            break;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
            _aIV(0);
            break;
        }
    }

    private void _bGraphicsV(Graphics g)
    {
        int i1 = _avI();
        int j1 = (3 * i1) / 7;
        String s1 = DO_DO_aajaj[DO_DO_aII]._aIString(0);
        String s2;
        if(DO_DO_eZZ && DO_DO_aII == 3)
            s2 = null;
        else
            s2 = DO_DO_aajaj[DO_DO_aII]._aIString(1);
        g.setFont(b.DO_DO_fFontFont);
        g.setColor(b.DO_DO_dII);
        byte byte0 = 25;
        g.fillRect(0, 320 - byte0, i1, byte0);
        if(s1 != null)
        {
            g.setColor(DO_DO_aaZaZ[0] ? b.DO_DO_fII : b.DO_DO_eII);
            g.fillRect(0, 320 - byte0, j1, byte0);
            g.setColor(DO_DO_aaZaZ[0] ? b.DO_DO_eII : b.DO_DO_fII);
            g.drawString(s1, j1 / 2, 320 - byte0, 17);
        }
        if(s2 != null)
        {
            g.setColor(DO_DO_aaZaZ[1] ? b.DO_DO_fII : b.DO_DO_eII);
            g.fillRect(i1 - j1, 320 - byte0, j1, byte0);
            g.setColor(DO_DO_aaZaZ[1] ? b.DO_DO_eII : b.DO_DO_fII);
            g.drawString(s2, i1 - j1 / 2, 320 - byte0, 17);
        }
    }

    public void _dvV()
    {
        System.out.println("game saved");
        if(h._avh()._bvZ())
            _aStringBV("config", h._avh()._avaB());
        if(DO_DO_aii._avZ())
            _aStringBV("calendar", DO_DO_aii._avaB());
    }

    private void _aStringBV(String s1, byte abyte0[])
    {
        try
        {
            RecordStore recordstore = RecordStore.openRecordStore(s1, true);
            if(recordstore.getNumRecords() == 0)
            {
                recordstore.addRecord(abyte0, 0, abyte0.length);
            } else
            {
                RecordEnumeration recordenumeration = recordstore.enumerateRecords(null, null, false);
                recordstore.setRecord(recordenumeration.nextRecordId(), abyte0, 0, abyte0.length);
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public static String _aIString(int i1)
    {
        if(i1 > 10 && i1 < 20)
            return String.valueOf(i1) + " " + p.DO_DO_aaStringaString[43];
        int j1 = i1 % 10;
        if(j1 == 1)
            if(i1 > 10)
                return String.valueOf(i1) + " " + p.DO_DO_aaStringaString[44];
            else
                return String.valueOf(i1) + " " + p.DO_DO_aaStringaString[42];
        if(j1 > 1 && j1 < 5)
            return String.valueOf(i1) + " " + p.DO_DO_aaStringaString[43];
        else
            return String.valueOf(i1) + " " + p.DO_DO_aaStringaString[43];
    }

    public static Image _aStringIImage(String s1, int i1, int j1)
    {
        Image image;
        try
        {
            image = Image.createImage(s1);
        }
        catch(IOException ioexception)
        {
            image = Image.createImage(i1, j1);
        }
        return image;
    }

    public static int _aIII(int i1, int j1)
    {
        boolean flag = i1 % 4 == 0 && i1 % 100 != 0 || i1 % 400 == 0;
        int k1 = DO_DO_aaIaI[j1];
        if(j1 == 1 && flag)
            k1 = 29;
        return k1;
    }

    public static String _bIString(int i1)
    {
        return DO_DO_baStringaString[i1];
    }

    public static int _aIII(int i1, int j1, int k1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(1, i1);
        calendar.set(2, j1);
        calendar.set(5, k1 + 1);
        long l1 = calendar.getTime().getTime() / 1000L / 60L / 60L / 24L;
        return (int)l1;
    }

    public static Vector _aStringFontVector(String s1, int i1, Font font)
    {
        String as[] = o._aStringaString(s1, font, i1);
        Vector vector = new Vector();
        for(int j1 = 0; j1 < as.length; j1++)
            vector.addElement(as[j1]);

        return vector;
    }

}
