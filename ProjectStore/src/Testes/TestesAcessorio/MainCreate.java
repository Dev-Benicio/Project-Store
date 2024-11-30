package Testes.TestesAcessorio;

import modelos.Acessorio;
import DAO.AcessorioDAO;

public class MainCreate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CRIAR --------->");
    Acessorio acessorio = new Acessorio("brinco", 12.9, "Brinco da cor de um diamante", "sei la", "diamante");
    AcessorioDAO.grava(acessorio);
  }
}
