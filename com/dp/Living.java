package com.dp;

public interface Living {

    public void setName(String name);
    abstract public String getName();

    public void setHeight(int height);
    public int getHeight();

    public void setWeight(int weight);
    public int getWeight();

    public void setFavFood(String favFood);
    public String getFavFood();

    public void setSpeed(int speed);
    public int getSpeed();

    public void setSound(String sound);
    public String getSound();

    int CONSTANT1 = 10;
    public int CONSTANT2 = 20;
    public static int CONSTANT3 = 30;
    public static final int CONSTNT4 = 40;
    static int CONSTANT5 = 50;
    final int CONSTANT6 = 60;
    // by default public static final

    //They allow us to add new methods to an interface that are automatically available in the implementations.
    // Therefore, we don't need to modify the implementing classes.
    // public is redundant
    public default void someDefaultMethod(){
        System.out.println("Some default method");
    }

    //Java interface static method helps us in providing security by not allowing implementation classes to override them.
    // public is redundant
    public static void someStaticMethod(){
        System.out.println("Some static method");
    }
}
