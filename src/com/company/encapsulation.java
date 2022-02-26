package com.company;
/*
we do not declear the values of a object by directly accesing the variables like object.variable
instead we declear the data as private and we use getter and setter methods for data modification.
*/
public class encapsulation {
    private int x, y, z;//data hiding
    private String string;

    /* getter and setter methods for data modification. */

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


}
