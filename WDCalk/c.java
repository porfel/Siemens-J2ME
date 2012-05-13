// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   c.java

import java.io.ByteArrayOutputStream;
import java.util.Vector;

public class c
{

    private int DO_DO_aII;
    private Vector DO_DO_aVectorVector;

    public c()
    {
        DO_DO_aII = 0;
        DO_DO_aVectorVector = new Vector(12);
        for(int i = 0; i < 12; i++)
            DO_DO_aVectorVector.addElement(null);

    }

    public void _aIIV(int i, int j)
    {
        r r1 = (r)DO_DO_aVectorVector.elementAt(i);
        if(r1 == null)
        {
            r1 = new r();
            DO_DO_aVectorVector.setElementAt(r1, i);
        }
        r1._aIV(j);
        if(r1._avZ())
            DO_DO_aVectorVector.setElementAt(null, i);
    }

    public int _aII(int i)
    {
        for(int j = 11; j >= 0; j--)
        {
            r r1 = (r)DO_DO_aVectorVector.elementAt(j);
            if(r1 == null)
                continue;
            int k = r1._aIII(i, j);
            if(k != -1)
                return k;
        }

        return -1;
    }

    public int _avI()
    {
        return DO_DO_aII;
    }

    public void _aIV(int i)
    {
        DO_DO_aII = i;
    }

    public int _aIII(int i, int j)
    {
        r r1 = (r)DO_DO_aVectorVector.elementAt(j);
        if(r1 == null)
            return 0;
        int k = r1._avI();
        if(k == -1)
            return 0;
        int l = v._aIII(i, j);
        int i1 = l - k;
        int j1 = h._avh()._avI();
        if(i1 >= j1)
            return 0;
        else
            return j1 - i1;
    }

    public int[] _aIaI(int i)
    {
        r r1 = (r)DO_DO_aVectorVector.elementAt(i);
        if(r1 == null)
            return new int[0];
        else
            return r1._avaI();
    }

    public void _aByteArrayOutputStreamV(ByteArrayOutputStream bytearrayoutputstream)
    {
        for(int i = 0; i < 12; i++)
        {
            r r1 = (r)DO_DO_aVectorVector.elementAt(i);
            if(r1 != null)
                r1._aByteArrayOutputStreamIV(bytearrayoutputstream, DO_DO_aII, i);
        }

    }
}
