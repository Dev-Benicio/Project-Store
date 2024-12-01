package Testes.TestesAtendente;

import DAO.AtendenteDAO;

public class MainSelect {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- SELECIONA TODOS --------->");
    System.out.println(AtendenteDAO.leTodos());

    System.out.println("<--------- SELECIONA UM --------->");
    System.out.println(AtendenteDAO.leUm(1));

    System.out.println("<--------- PESQUISA POR NOME INICIAL (LIKE) --------->");
    System.out.println(AtendenteDAO.pesquisaPorNomeInicial("b"));

    System.out.println("<--------- PESQUISA POR MULTIPLOS IDS (IN)--------->");
    System.out.println(AtendenteDAO.pesquisaPorMultiplosIds(1, 2, 3));

    System.out.println("<--------- PESQUISA POR ID FORA DO INTERVALO (NOT BETWEEN)--------->");
    System.out.println(AtendenteDAO.pesquisaPorIdForaIntervalo(1, 5));
  }
}
