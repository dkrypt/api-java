package io.github.dcportal;

public class JNIApp
{
    static {
        System.load("C:\\Users\\212687506\\Documents\\Workspace\\libra\\jni-example\\lib\\crypto.dll");
    }
    public native String GeneratePassphrase();
    public static void main( String[] args )
    {
        JNIApp myApp = new JNIApp();
        System.out.println(myApp.GeneratePassphrase());
    }
}
