package io.github.ramaraosrikakulapu;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class JNAApp {
    public interface CryptoLib extends Library {
        CryptoLib INSTANCE = Native.load("C:\\Users\\212687506\\Documents\\Workspace\\libra\\crypto.dll", CryptoLib.class);
        void RefreshPassphrase();
        Pointer GeneratePassphrase();
        String ValidateToken(String token);
    }
    public static void main( String[] args )
    {
        CryptoLib myLib = CryptoLib.INSTANCE;
        System.out.println(myLib.GeneratePassphrase());
    }
}
