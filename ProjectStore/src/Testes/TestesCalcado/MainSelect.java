package Testes.TestesCalcado;

import DAO.AcessorioDAO;

public class MainSelect {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- SELECIONA TODOS --------->");
    System.out.println(AcessorioDAO.leTodos());

    System.out.println("<--------- SELECIONA UM --------->");
    System.out.println(AcessorioDAO.leUm(1));

    System.out.println("<--------- PESQUISA POR NOME INICIAL (LIKE) --------->");
    System.out.println(AcessorioDAO.pesquisaPorNomeInicial("b"));

    System.out.println("<--------- PESQUISA POR MULTIPLOS IDS (IN)--------->");
    System.out.println(AcessorioDAO.pesquisaPorMultiplosIds(1, 2, 3));

    System.out.println("<--------- PESQUISA POR ID FORA DO INTERVALO (NOT BETWEEN) --------->");
    System.out.println(AcessorioDAO.pesquisaPorIdForaIntervalo(1, 5));
  }
}
