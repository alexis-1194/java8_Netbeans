package com.mitocode.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Mitocode");
        lista.add("Code");
        lista.add("Mito");
        LambdaApp app = new LambdaApp();
        app.ordenar(lista);

        for (String list : lista) {
            System.out.println(list);
        }
        app.calcular();
    }

    public void ordenar(List<String> lista) {
//        Collections.sort(lista, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
    }
    
    public void calcular(){
//        Operacion ope = new Operacion() {
//            @Override
//            public double calcularPromedio(int n1, int n2) {
//                return (double)(n1+n2)/2;
//            }
 //        };
//        System.out.println(ope.calcularPromedio(2, 3));

          /*Se puede inferir el tipo de dato de los parametros antes de la función lambda*/
          Operacion<Double,Double> ope = (x,y) -> (x+y/2);
         
          System.out.println(ope.calcular(2.0, 3.0));
    }

}
