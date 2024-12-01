package Testes.TestesCalcado;

import DAO.CalcadoDAO;

public class MainDelete {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- DELETA CALÇADO --------->");
    CalcadoDAO.exclui(3);
  }
}
