package Testes.TestesAcessorio;

import DAO.AcessorioDAO;

public class MainDelete {
  public static void main(String[] args) throws Exception {
    System.out.println("Acessorio");
    System.out.println("<--------- DELETA --------->");
    AcessorioDAO.exclui(1);
  }
}
