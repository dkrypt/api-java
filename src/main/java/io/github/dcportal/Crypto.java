package io.github.dcportal;

import jnr.ffi.LibraryLoader;
import jnr.ffi.Pointer;

public class Crypto {
    CryptoLib cryptoLib;
    public Crypto() {
        cryptoLib = LibraryLoader.create(CryptoLib.class).load("./lib/crypto");
    }
    public String GeneratePassphrase() {
        return cryptoLib.GeneratePassphrase();
    }
    public String ValidateToken(String token) {
        return cryptoLib.ValidateTokenExp(token);
    }
    public Pointer RefreshPassphrase() {
        return cryptoLib.RefreshPassphrase();
    }
}
