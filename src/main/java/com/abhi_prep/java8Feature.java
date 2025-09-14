package com.abhi_prep;

public class java8Feature {
    /*
        URL: https://www.geeksforgeeks.org/java/java-8-features/
        Major Java 8 Features Introduced

        1. Lambda Expressions: Concise functional code using ->.
        2. Functional Interfaces: Single-method interfaces.
        3. Introduced and Improved APIs:
                Stream API: Efficient Data Manipulation.
                Date/Time API: Robust Date and Time Handling.
                Collection API Improvements: Enhanced Methods for Collections (e.g., removeIf, replaceAll).
                Concurrency API Improvements: New classes for parallel processing (e.g., CompletableFuture).

        4. Optional Class: Handle null values safely.
        5. forEach() Method in Iterable Interface: Executes an action for each element in a Collection.
        6. Default Methods: Evolve interfaces without breaking compatibility.
        7. Static Methods: Allows adding methods with default implementations to interfaces.
        8. Method References: Refer to methods easily.
     */



    /*
         URL: https://www.geeksforgeeks.org/java/lambda-expressions-java-8/

         Lambda Expressions
             def: provide a concise way to express instances of single-method interfaces using a block of code.

         Key Functionalities of Lambda Expression
            a. Lambda Expressions implement the only abstract function and therefore implement functional interfaces.
            b. Lambda expressions are added in Java 8 and provide the following functionalities.

            Functional Interfaces: A functional interface is an interface that contains only one abstract method.
            Code as Data: Treat functionality as a method argument.
            Class Independence: Create functions without defining a class.
            Pass and Execute: Pass lambda expressions as objects and execute on demand.

     */

    /*
        Types of Functional Interfaces in Java
        Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations as mentioned below:
            1. Consumer
            2. Predicate
            3. Function
            4. Supplier

        1. Consumer: The consumer interface of the functional interface that accepts only one argument and has no return value.
         There are also functional variants of the Consumer — DoubleConsumer, IntConsumer, and LongConsumer.

        2. Predicate: The Predicate interface represents a boolean-valued function of one argument. It is commonly used for filtering operations in streams.
        These are IntPredicate, DoublePredicate, and LongPredicate

        3. Function: A function is a type of functional interface in Java that receives only a single argument and returns a value after the required processing.

        4. Supplier: is also a type of functional interface that does not take any input or argument and yet returns a single output.


     */
}
