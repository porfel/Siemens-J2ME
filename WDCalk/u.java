// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi 
// Source File Name:   u.java

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public class u
{

    public u()
    {
    }

    public static boolean _aStringZ(String s, String s1)
    {
        try
        {
            MessageConnection messageconnection = (MessageConnection)Connector.open("sms://" + s1);
            TextMessage textmessage = (TextMessage)messageconnection.newMessage("text");
            textmessage.setPayloadText(s);
            messageconnection.send(textmessage);
        }
        catch(Exception exception)
        {
            return false;
        }
        return true;
    }
}
