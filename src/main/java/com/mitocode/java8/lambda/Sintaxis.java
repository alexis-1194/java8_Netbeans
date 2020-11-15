package com.mitocode.java8.lambda;

public class Sintaxis {
   
    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();
        System.out.println(app.testSintaxis());
    }
    
    public double testSintaxis(){
//        Operacion<Double> ope = (x,y) -> (x/y)/2;
//        Operacion<Double> ope = (x,y) -> {
//            double ans = 0;
//            ans = (x/y)/2;
//            return ans;
//        };
        /*Expresion sin parametros de una funcion(sin parametros)*/
//        Operacion<Double> ope = () -> 2.0;
        Operacion<Double, Double> ope = (x,y) -> (x+y)/2;
        return ope.calcular(2.0, 3.0);
    }
}
