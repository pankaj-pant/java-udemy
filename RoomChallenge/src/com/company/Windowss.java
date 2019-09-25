package com.company;

public class Windowss {
    int numberOfWindows;

    public Windowss(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public void openWindows(){
        System.out.println("Open the windows ... and...");
        freshAir();
    }

    private void freshAir(){
        System.out.println("fresh air enters...");
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
