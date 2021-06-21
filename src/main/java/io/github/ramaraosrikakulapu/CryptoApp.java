package io.github.ramaraosrikakulapu;

public class CryptoApp {
    public static void main(String[] args) {
        Crypto crypto = new Crypto();
        String passphrase = crypto.GeneratePassphrase();
        System.out.println(passphrase);
    }
}
