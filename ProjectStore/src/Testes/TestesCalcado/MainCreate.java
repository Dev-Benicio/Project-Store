package Testes.TestesCalcado;

import DAO.AcessorioDAO;
import modelos.Acessorio;

public class MainCreate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CRIAR --------->");
    Acessorio joia = new Acessorio("Joia", 29.99, "Joia para festas no palacio", "Joia", "Ouro");
    AcessorioDAO.grava(joia);
  }
}
