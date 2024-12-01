package Testes.TestesCliente;

import modelos.Cliente; 
import DAO.ClienteDAO;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CLIENTE --------->");
    Cliente cliente = new Cliente("Benic", "Areal", "(61) 99999-9999", "123456789", 134);
    ClienteDAO.altera(1, cliente);

    System.out.println("ATUALIZA COM O = ");
    ClienteDAO.atualizaNumeroResidencia(134, "123456789");

    System.out.println("ATUALIZA COM O AND ");
    ClienteDAO.atualizaCpf("(61) 99999-9999", "Benic", "123456789");

    System.out.println("ATUALIZA COM O NOT IN, Numero da residencia");
    ClienteDAO.atualizaPrecoPorTiposExceto(29.99, 1, 2, 3);
  }
}
