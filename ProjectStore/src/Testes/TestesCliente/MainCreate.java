package Testes.TestesCliente;

import DAO.ClienteDAO;
import modelos.Cliente;

public class MainCreate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- REGISTRA CLIENTE --------->");
    Cliente cliente = new Cliente("Benic", "Rua teste", "(61) 99999-9999", "123456789", 134);
    ClienteDAO.grava(cliente);
  }
}
