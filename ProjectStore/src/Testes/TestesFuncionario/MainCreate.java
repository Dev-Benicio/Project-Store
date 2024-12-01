package Testes.TestesFuncionario;

import modelos.Atendente;
import DAO.AtendenteDAO;

public class MainCreate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CRIAR --------->");
    Atendente atendente = new Atendente("benic", "benic@gmail.com", "123456789", "99999-9999", "segunda", "rua teste");
    AtendenteDAO.grava(atendente);
    System.out.println(AtendenteDAO.leUm(1));
  }
}
