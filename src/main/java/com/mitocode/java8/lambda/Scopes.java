package com.mitocode.java8.lambda;

public class Scopes {

    private static double atributo1;
    private double atributo2;
    //private double n3 = 3;

    public static void main(String[] args) {
        Scopes app = new Scopes();
        System.out.println(app.testLocalVariable());
    }

    public double testLocalVariable() {
        final double n3 = 3;
        Operacion<Double, Integer> op = new Operacion<Double, Integer>() {
            @Override
            public Double calcular(Double n1, Integer n2) {
                // n3 = n2 + n1;
                return n3 + n2 + n1;
            }
        };

        Operacion<Double, Integer> ope = (x, y) -> (x + y + n3);

        return op.calcular(1.0, 1);
    }

    public double testAtributesStaticVariables() {

        Operacion<Double, Double> op = new Operacion<Double, Double>() {
            @Override
            public Double calcular(Double n1, Double n2) {
                atributo1 = n1 + n2;
                atributo2 = atributo1;
                return atributo1;
            }
        };

        Operacion<Double, Double> ope = (x, y) -> {
            atributo1 = x + y;
            atributo2 = atributo1;
            return atributo1;
        };
        return ope.calcular(3.0, 2.0);
    }
}
