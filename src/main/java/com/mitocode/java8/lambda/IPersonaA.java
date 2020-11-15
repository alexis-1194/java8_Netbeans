package com.mitocode.java8.lambda;

public interface IPersonaA {

    public void caminar();
    
    default public void hablar(){
        System.out.println("Greetings IPersonaA");
    }
}
