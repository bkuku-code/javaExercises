package com.bkuku;

public class Fish {
    boolean scale;
    String tail;
    String fin;
    String name;

    public boolean isScale() {
        return scale;
    }

    public void setScale(boolean scale) {
        this.scale = scale;
    }

    public Fish(boolean scale, String tail, String fin, String name) {
        this.scale = scale;
        this.tail = tail;
        this.fin = fin;
        this.name = name;
    }

    public Fish() {
    }

    public Fish(String tail, String name) {
        this.tail = tail;
        this.name = name;

    }
        class HumanTest{
            public static void main(String[] args) {
                Fish tilapia = new Fish();

            }
        }

}



