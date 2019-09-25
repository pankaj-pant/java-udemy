package com.company;

public class Furniture {
    private String object1;
    private String object2;
    private String object3;

    public Furniture(String object1, String object2, String object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public void describeObjects(){
        System.out.println("The room has a " + object1 + ", a " + object2 + " and a " + object3);
    }


}
