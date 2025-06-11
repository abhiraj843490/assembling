package com.abhi_prep.practice;

public class Test {
    public static void main(String[]args){
        System.out.println(Singleton.getInstance().hashCode());
        System.out.println(Singleton.getInstance().hashCode());
    }
}
class Singleton{
    private static Singleton singltonIns = null;
    public Singleton(){}

    public static Singleton getInstance(){
        if(singltonIns==null){
            singltonIns = new Singleton();
        }
        return singltonIns;
    }

}
