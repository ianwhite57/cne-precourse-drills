package com.galvanize;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by IAN.WHITE on 3/10/2017.
 */
public class Business implements Addressable {
    private final String name;
    private final List<Address> addresses;

    public Business(String busName){
        name = busName;
        addresses = new LinkedList<Address>();
    }

    public List<Address> getAddresses(){
        return addresses;
    }

    public void addAddress(Address addr){
        addresses.add(addr);
    }

    public String getName(){
        return name;
    }
}
