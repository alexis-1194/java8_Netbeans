package com.mitocode.java8.lambda;

public interface Operacion<T,K> {

    T calcular(T n1, K n2);
//    T calcularPromedio(T n1);
}
