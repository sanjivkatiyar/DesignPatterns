package com.dp;

abstract public class Creature {

    protected String name;
    int weigh;
    String sound;

    abstract public String getName();
    public abstract void setName(String name);

    abstract public int getWeight();

    abstract public void setWeight(int weight);

    public void someConcreteMethod() {
        System.out.println("Some Concrete Method");
    }

    public static void someStaticMethod(){
        System.out.println("Some static method");
    }
}
