package com.mitocode.java8.lambda;

public interface IPersonaB {

    public void caminar();
    
    default public void hablar() {
        System.out.println("Greetings IPersonaB");
    }
}
