package Testes.TestesRoupa;

import modelos.Roupa;

public class MainCreate {
    public static void main(String[] args) {
        Roupa camiseta = new Roupa("Camiseta", 100.00, "Uma camiseta de 100 reais", "10cm", "Alumínio", "Nike");
        System.out.println(camiseta);
    }
}
