// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   i.java

import java.io.ByteArrayOutputStream;
import java.util.Vector;

public class i
{

    private boolean DO_DO_aZZ;
    private Vector DO_DO_aVectorVector;

    public i()
    {
        DO_DO_aZZ = false;
        DO_DO_aVectorVector = new Vector();
    }

    private c _aIc(int j)
    {
        for(int k = 0; k < DO_DO_aVectorVector.size(); k++)
        {
            c c1 = (c)DO_DO_aVectorVector.elementAt(k);
            if(c1._avI() == j)
                return c1;
        }

        return null;
    }

    public void _aIIV(int j, int k, int l)
    {
        DO_DO_aZZ = true;
        int i1 = 0;
        do
        {
            if(i1 >= DO_DO_aVectorVector.size())
                break;
            c c1 = (c)DO_DO_aVectorVector.elementAt(i1);
            if(c1._avI() == j)
            {
                c1._aIIV(k, l);
                return;
            }
            if(c1._avI() > j)
                break;
            i1++;
        } while(true);
        c c2 = new c();
        c2._aIV(j);
        c2._aIIV(k, l);
        DO_DO_aVectorVector.insertElementAt(c2, i1);
    }

    public int _avI()
    {
        for(int j = DO_DO_aVectorVector.size() - 1; j >= 0; j--)
        {
            c c1 = (c)DO_DO_aVectorVector.elementAt(j);
            int k = c1._aII(c1._avI());
            if(k != -1)
                return k;
        }

        return -1;
    }

    public int[] _aIIaI(int j, int k)
    {
        c c1 = _aIc(j);
        return c1 == null ? new int[0] : c1._aIaI(k);
    }

    public int _aIII(int j, int k)
    {
        if(k > 0)
        {
            k--;
        } else
        {
            j--;
            k = 11;
        }
        c c1 = _aIc(j);
        return c1 == null ? 0 : c1._aIII(j, k);
    }

    public void _aaBV(byte abyte0[])
    {
        DO_DO_aVectorVector = new Vector();
        for(int j = 0; j < abyte0.length; j += 3)
        {
            int k = 1970 + abyte0[j + 0];
            byte byte0 = abyte0[j + 1];
            byte byte1 = abyte0[j + 2];
            _aIIV(k, byte0, byte1);
        }

        DO_DO_aZZ = false;
    }

    public byte[] _avaB()
    {
        DO_DO_aZZ = false;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        for(int j = 0; j < DO_DO_aVectorVector.size(); j++)
        {
            c c1 = (c)DO_DO_aVectorVector.elementAt(j);
            c1._aByteArrayOutputStreamV(bytearrayoutputstream);
        }

        return bytearrayoutputstream.toByteArray();
    }

    public boolean _avZ()
    {
        return DO_DO_aZZ;
    }
}
