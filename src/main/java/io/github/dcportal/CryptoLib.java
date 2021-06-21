package io.github.dcportal;

import jnr.ffi.Pointer;
import jnr.ffi.annotations.In;

public interface CryptoLib {
    String GeneratePassphrase();
    String ValidateTokenExp(@In String token);
    Pointer RefreshPassphrase();
}
