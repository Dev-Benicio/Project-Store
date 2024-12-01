package Testes.TestesCalcado;

import DAO.CalcadoDAO;

public class MainSelect {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- SELECIONA TODOS --------->");
    System.out.println(CalcadoDAO.leTodos());

    System.out.println("<--------- SELECIONA UM --------->");
    System.out.println(CalcadoDAO.leUm(1));

    System.out.println("<--------- PESQUISA POR NOME INICIAL (LIKE) --------->");
    System.out.println(CalcadoDAO.pesquisaPorNomeInicial("T"));

    System.out.println("<--------- PESQUISA POR MULTIPLOS IDS (IN)--------->");
    System.out.println(CalcadoDAO.pesquisaPorMultiplosIds(1, 2, 3));

    System.out.println("<--------- PESQUISA TUDO, EXCETO ENTRE ESSES ID (NOT BETWEEN) --------->");
    System.out.println(CalcadoDAO.pesquisaPorIdForaIntervalo(3, 5));
  }
}
