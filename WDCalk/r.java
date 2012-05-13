// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   r.java

import java.io.ByteArrayOutputStream;
import java.util.Vector;

public class r
{

    private Vector DO_DO_aVectorVector;

    public r()
    {
        DO_DO_aVectorVector = new Vector();
    }

    public void _aIV(int i)
    {
        Integer integer = new Integer(i);
        if(DO_DO_aVectorVector.contains(integer))
        {
            DO_DO_aVectorVector.removeElement(integer);
        } else
        {
            int j = 0;
            do
            {
                if(j >= DO_DO_aVectorVector.size())
                    break;
                Integer integer1 = (Integer)DO_DO_aVectorVector.elementAt(j);
                if(integer1.intValue() > i)
                    break;
                j++;
            } while(true);
            DO_DO_aVectorVector.insertElementAt(integer, j);
        }
    }

    public boolean _avZ()
    {
        return DO_DO_aVectorVector.isEmpty();
    }

    public int _aIII(int i, int j)
    {
        if(DO_DO_aVectorVector.isEmpty())
        {
            return -1;
        } else
        {
            Integer integer = (Integer)DO_DO_aVectorVector.elementAt(DO_DO_aVectorVector.size() - 1);
            return v._aIII(i, j, integer.intValue());
        }
    }

    public int _avI()
    {
        if(DO_DO_aVectorVector.isEmpty())
        {
            return -1;
        } else
        {
            Integer integer = (Integer)DO_DO_aVectorVector.elementAt(DO_DO_aVectorVector.size() - 1);
            return integer.intValue();
        }
    }

    public int[] _avaI()
    {
        int ai[] = new int[DO_DO_aVectorVector.size()];
        for(int i = 0; i < DO_DO_aVectorVector.size(); i++)
            ai[i] = ((Integer)DO_DO_aVectorVector.elementAt(i)).intValue();

        return ai;
    }

    public void _aByteArrayOutputStreamIV(ByteArrayOutputStream bytearrayoutputstream, int i, int j)
    {
        byte byte0 = (byte)(i - 1970);
        byte byte1 = (byte)j;
        for(int k = 0; k < DO_DO_aVectorVector.size(); k++)
        {
            int l = ((Integer)DO_DO_aVectorVector.elementAt(k)).intValue();
            byte byte2 = (byte)l;
            try
            {
                bytearrayoutputstream.write(byte0);
                bytearrayoutputstream.write(byte1);
                bytearrayoutputstream.write(byte2);
            }
            catch(Exception exception)
            {
                n._aStringV("there is an exception whili saving Data: " + exception.getMessage());
            }
        }

    }
}
