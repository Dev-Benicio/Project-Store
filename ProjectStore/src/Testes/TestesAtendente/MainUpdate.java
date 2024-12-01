package Testes.TestesAtendente;

import modelos.Atendente;
import DAO.AtendenteDAO;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- ATUALIZA ATENDENTE --------->");
    Atendente atendente = new Atendente("Lucia", "12349856789", "(61) 99999-9999", "Vespertino", "Areal"); 
    AtendenteDAO.altera(2, atendente);
    System.out.println("ATUALIZA COM O NOT IN");
    AtendenteDAO.atualizaTurno("Vespertino", 02, 4);
    System.out.println("ATUALIZA COM O = ");
    AtendenteDAO.atualizaEndereco("Aguas", 2);
    System.out.println("ATUALIZA COM O AND");
    AtendenteDAO.atualizaNome("Robervaldo", 1, "12354123456");
  }
}
