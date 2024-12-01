package Testes.TestesCalcado;

import modelos.Calcado;
import DAO.CalcadoDAO;

public class MainCreate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CRIAR --------->");
    Calcado tenis = new Calcado("Tenis", 78.2, "Tenis para corrida", 41, "Tenis", "Nike");
    CalcadoDAO.grava(tenis);
  }
}
