// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   m.java


public final class m
{

    private boolean DO_DO_aZZ;

    public m(boolean flag)
    {
        DO_DO_aZZ = flag;
    }

    public synchronized void _cvV()
    {
        DO_DO_aZZ = false;
    }

    public synchronized void _bvV()
    {
        DO_DO_aZZ = true;
        notifyAll();
    }

    public synchronized void _avV()
    {
        while(!DO_DO_aZZ) 
            try
            {
                wait();
            }
            catch(Exception exception) { }
    }

    public synchronized void _aJV(long l)
    {
        long l2 = System.currentTimeMillis();
        long l1;
        for(long l3 = 0L; l3 < l; l3 = l1 - l2)
        {
            try
            {
                wait(l - l3);
            }
            catch(Exception exception) { }
            l1 = System.currentTimeMillis();
        }

    }
}
