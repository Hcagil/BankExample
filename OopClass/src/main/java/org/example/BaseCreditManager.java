package org.example;

abstract class BaseCreditManager implements ICreditManager {
    public abstract void calculate();
    public void save(){
        System.out.println("Saved");
    }

}
