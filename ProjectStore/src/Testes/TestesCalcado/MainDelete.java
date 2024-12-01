package Testes.TestesCalcado;

import DAO.AcessorioDAO;

public class MainDelete {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- DELETA CALÇADO --------->");
    AcessorioDAO.exclui(1);
  }
}
