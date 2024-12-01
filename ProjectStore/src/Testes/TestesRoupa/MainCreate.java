package Testes.TestesRoupa;

import DAO.RoupaDAO;
import modelos.Roupa;

public class MainCreate {
    public static void main(String[] args) throws Exception {
        Roupa camiseta = new Roupa("Camiseta", 100.00, "Uma camiseta de 100 reais", "10cm", "Alumínio", "Nike");
        RoupaDAO.grava(camiseta);
    }
}
