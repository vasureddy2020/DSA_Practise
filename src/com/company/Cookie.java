package com.company;

import java.security.PublicKey;

public class Cookie {
    private String colour;
    private String size;
    public Cookie(String col,String siz){
        this.colour=col;
        this.size=siz;
        System.out.println(colour);
        System.out.println(size);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }
}
