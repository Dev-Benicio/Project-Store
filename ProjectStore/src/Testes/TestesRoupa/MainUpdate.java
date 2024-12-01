package Testes.TestesRoupa;

import DAO.RoupaDAO;
import modelos.Roupa;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("Update Roupas");
    System.out.println("<------------- ATUALIZA UMA ROUPA ------------->");
    Roupa camiseta = new Roupa("Camiseta", 100.00, "Uma camiseta de 100 reais", "10cm", "Alumínio", "Nike");
    RoupaDAO.altera(1, camiseta);

    System.out.println("<------------- ATUALIZA UMA ROUPA (AND) ------------->");
    RoupaDAO.atualizaDescricaoPrecoMaterial("camisa para festivais", 43.2, "algodão");

    System.out.println("<------------- ATUALIZA UMA ROUPA ( = ) ------------->");
    RoupaDAO.atualizaMarcaPorTamanho("Adidas", "M");
    
    System.out.println("<------------- ATUALIZA UMA ROUPA (NOT IN) ------------->");
    RoupaDAO.atualizaPrecoPorTiposExceto(100.00, "Camiseta", "Camiseta", "Camiseta");
  }
}
