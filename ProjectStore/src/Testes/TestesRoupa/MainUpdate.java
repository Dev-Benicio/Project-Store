package Testes.TestesRoupa;

import DAO.RoupaDAO;
import modelos.Roupa;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<------------- ATUALIZA UMA ROUPA ------------->");
    Roupa camiseta = new Roupa("Camiseta", 800.00, "Uma camiseta de 800 reais", "PP", "Elastano", "Nike");
    RoupaDAO.altera(2, camiseta);

    System.out.println("<------------- ATUALIZA UMA ROUPA (AND) ------------->");
    RoupaDAO.atualizaDescricaoPrecoMaterial("camisa para festivais", 43.2, "Aluminio");

    System.out.println("<------------- ATUALIZA UMA ROUPA ( = ) ------------->");
    RoupaDAO.atualizaMarcaPorTamanho("Adidas", "M");
    
    System.out.println("<------------- ATUALIZA UMA ROUPA (NOT IN) ------------->");
    RoupaDAO.atualizaPrecoPorTiposExceto(900.00, "Adidas", "Polo", "Thunder");
  }
}
