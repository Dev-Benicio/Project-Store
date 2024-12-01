package Testes.TesteVenda;

import DAO.VendaDAO;

public class MainDelete {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- DELETA VENDA --------->");
    VendaDAO.exclui(11);
  }
}
