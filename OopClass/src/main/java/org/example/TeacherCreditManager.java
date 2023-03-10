package org.example;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Teacher credit calculated");
    }
    @Override
    public void save(){
        System.out.println("Teacher Saved");
    }

}
