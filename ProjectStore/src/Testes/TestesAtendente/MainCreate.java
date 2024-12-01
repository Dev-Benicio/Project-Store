package Testes.TestesAtendente;

import modelos.Atendente;
import DAO.AtendenteDAO;

public class MainCreate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CRIAR --------->");
    Atendente atendente = new Atendente("benic", "12354123456", "(61) 99999-9999", "matutino", "rua teste");
    AtendenteDAO.grava(atendente);
  }
}
