package com.mitocode.java8.lambda;

public class DefaultMethod implements IPersonaA, IPersonaB {

    @Override
    public void caminar() {
        System.out.println("Hellooo");
    }
    
    @Override
    public void hablar(){
        IPersonaB.super.hablar();
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.caminar();
        app.hablar();
    }

}
