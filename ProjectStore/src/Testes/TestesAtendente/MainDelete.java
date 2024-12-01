package Testes.TestesAtendente;

import DAO.AtendenteDAO;

public class MainDelete {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- DELETA ATENDENTE --------->");
    AtendenteDAO.exclui(4);
  }
}
