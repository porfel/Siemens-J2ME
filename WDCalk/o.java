// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   o.java

import java.util.Vector;
import javax.microedition.lcdui.Font;

public final class o
{

    private o()
    {
    }

    public static String[] _aStringaString(String s, Font font, int i)
    {
        String as[] = null;
        int j = _aFontvI(font, i);
        String as1[] = _aStringaString(s);
        Vector vector = new Vector();
        for(int i1 = 0; i1 < as1.length; i1++)
        {
            s = as1[i1];
            int l = 0;
            int k = s.length();
            boolean flag;
            if(k > 0)
            {
                flag = false;
            } else
            {
                vector.addElement("");
                flag = true;
            }
            while(!flag) 
                if(l < k)
                {
                    if(l + j > k)
                        j = k - l;
                    String s1;
                    for(s1 = s.substring(l, l + j); font.stringWidth(s1) < i - 1 && l + j < k; s1 = s.substring(l, l + j))
                        j++;

                    for(; font.stringWidth(s1) >= i; s1 = s.substring(l, l + j))
                        j--;

                    if(l + j < k)
                    {
                        if(s.charAt(l + j) == ' ')
                        {
                            l = l + j + 1;
                        } else
                        {
                            int l1 = s1.lastIndexOf(' ');
                            if(l1 < 1)
                            {
                                l1 = s.indexOf(' ', l + j);
                                if(l1 == -1)
                                {
                                    s1 = s.substring(l, k);
                                    flag = true;
                                } else
                                {
                                    s1 = s.substring(l, l1);
                                    l = l1 + 1;
                                }
                            } else
                            {
                                s1 = s.substring(l, l + l1);
                                l = l + l1 + 1;
                            }
                        }
                    } else
                    {
                        flag = true;
                    }
                    vector.addElement(s1);
                } else
                {
                    flag = true;
                }
        }

        int j1 = vector.size();
        if(j1 > 0)
        {
            as = new String[j1];
            for(int k1 = 0; k1 < j1; k1++)
                as[k1] = (String)vector.elementAt(k1);

        }
        return as;
    }

    private static int _aFontvI(Font font, int i)
    {
        int j = 2;
        for(String s = "aa"; font.stringWidth(s) < i; s = s + 'a')
            j++;

        return --j;
    }

    private static String[] _aStringaString(String s)
    {
        Vector vector = new Vector();
        int i = 0;
        for(int j = s.indexOf('\n'); j >= 0; j = s.indexOf('\n', i))
        {
            String s1 = s.substring(i, j);
            if(s1 == null)
                s1 = "";
            vector.addElement(s1);
            i = j + 1;
        }

        String s2 = s.substring(i, s.length());
        vector.addElement(s2);
        int k = vector.size();
        String as[] = new String[k];
        for(int l = 0; l < k; l++)
            as[l] = (String)vector.elementAt(l);

        return as;
    }
}
