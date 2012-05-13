// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   h.java


public class h
{

    private int DO_DO_bII;
    private int DO_DO_aII;
    private boolean DO_DO_aZZ;
    private boolean DO_DO_bZZ;
    private static h DO_DO_ahh = new h();

    public int _bvI()
    {
        return DO_DO_bII;
    }

    public int _avI()
    {
        return DO_DO_aII;
    }

    public boolean _avZ()
    {
        return DO_DO_aZZ;
    }

    public boolean _bvZ()
    {
        return DO_DO_bZZ;
    }

    public void _aIV(int i)
    {
        DO_DO_bII = i;
        DO_DO_aZZ = false;
        DO_DO_bZZ = true;
    }

    public void _bIV(int i)
    {
        DO_DO_aII = i;
        DO_DO_aZZ = false;
        DO_DO_bZZ = true;
    }

    public byte[] _avaB()
    {
        byte abyte0[] = new byte[3];
        abyte0[0] = (byte)DO_DO_bII;
        abyte0[1] = (byte)DO_DO_aII;
        abyte0[2] = (byte)(DO_DO_aZZ ? 1 : 0);
        DO_DO_bZZ = false;
        return abyte0;
    }

    public void _aaBV(byte abyte0[])
    {
        if(abyte0.length > 0)
            DO_DO_bII = abyte0[0];
        if(abyte0.length > 1)
            DO_DO_aII = abyte0[1];
        if(abyte0.length > 2)
            DO_DO_aZZ = abyte0[2] != 0;
        DO_DO_bZZ = false;
    }

    private h()
    {
        DO_DO_bII = 25;
        DO_DO_aII = 5;
        DO_DO_aZZ = true;
        DO_DO_bZZ = false;
    }

    public static h _avh()
    {
        return DO_DO_ahh;
    }

}
