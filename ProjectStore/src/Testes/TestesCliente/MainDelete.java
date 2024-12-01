package Testes.TestesCliente;

import DAO.ClienteDAO;

public class MainDelete {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- DELETA CLIENTE --------->");
    ClienteDAO.exclui(3);
  }
}
