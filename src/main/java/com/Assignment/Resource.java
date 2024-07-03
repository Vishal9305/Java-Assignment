package com.Assignment;



public class Resource implements AutoCloseable {
    public Resource() {
        System.out.println("Resource opened.");
    }

    public void doSomething() {
        System.out.println("Doing something with the resource.");
    }

    @Override
    public void close() {
        System.out.println("Resource closed.");
    }
}

