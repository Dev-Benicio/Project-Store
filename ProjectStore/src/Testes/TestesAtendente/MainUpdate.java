package Testes.TestesAtendente;

import modelos.Atendente;
import DAO.AtendenteDAO;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- ATUALIZA ATENDENTE --------->");
    Atendente atendente = new Atendente("benic", "benic@gmail.com", "123456789", "(61) 99999-9999", "matutino", "rua teste");
    
    AtendenteDAO.altera(1, atendente);
    System.out.println("ATUALIZA COM O NOT IN");
    AtendenteDAO.atualizaTurno("Vespertino", 02, 4);
    System.out.println("ATUALIZA COM O = ");
    AtendenteDAO.atualizaEndereco("areal", 2, 4);
    System.out.println("ATUALIZA COM O AND");
    AtendenteDAO.atualizaNome("Benic", 1, "123456789");
  }
}
