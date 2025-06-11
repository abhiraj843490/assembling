package com.abhi_prep.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
    Reflection is a process in which modifying and examining the runtime behaviour of a class at runtime.
    When to Use Reflection:
        1. Frameworks and Libraries: Reflection is commonly used in libraries like Spring, Hibernate, and JUnit
        to dynamically inspect and interact with user code.
        2. Serialization/Deserialization: To dynamically access fields and methods of a class during the serialization
        or deserialization process.
        Testing: To access and test private methods or fields without modifying the class.
 */

public class ReflectionPoc {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> person = Person.class;
        System.out.println("class name: " + person.getName());

        Constructor<?> constructor = person.getConstructor();
        Object consObj = constructor.newInstance();
        Field f = person.getDeclaredField("name");
        f.setAccessible(true);
        f.set(consObj, "abhi");

        Field fa = person.getDeclaredField("age");
        fa.setAccessible(true);
        fa.set(consObj, 67);

        Method method = person.getDeclaredMethod("sayHello");
        method.invoke(consObj);
    }
}


class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "John Doe";
        this.age = 30;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " age is " + age);
    }
}
