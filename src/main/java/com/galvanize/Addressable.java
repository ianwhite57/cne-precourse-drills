package com.galvanize;

import java.util.List;

/**
 * Created by IAN.WHITE on 3/10/2017.
 */
public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address addr);
}
