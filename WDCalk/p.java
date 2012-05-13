// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   p.java

import java.io.*;

public class p
{

    public static String DO_DO_aaStringaString[] = new String[82];

    public p()
    {
    }

    public static void _aStringV(String s)
        throws IOException
    {
        InputStream inputstream = DO_DO_aaStringaString.getClass().getResourceAsStream(s);
        if(inputstream == null)
            throw new IOException(s + ": File not found");
        DataInputStream datainputstream = new DataInputStream(inputstream);
        for(int k = 0; k < 82; k++)
        {
            String s1 = datainputstream.readUTF();
            DO_DO_aaStringaString[k] = s1.substring(0, s1.length() - 1);
        }

        datainputstream.close();
    }

}
