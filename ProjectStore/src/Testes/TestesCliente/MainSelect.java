package Testes.TestesCliente;

import DAO.ClienteDAO;

public class MainSelect {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- SELECIONA TODOS --------->");
    System.out.println(ClienteDAO.leTodos());

    System.out.println("<--------- SELECIONA UM --------->");
    System.out.println(ClienteDAO.leUm(1));

    System.out.println("<--------- PESQUISA POR NOME INICIAL (LIKE) --------->");
    System.out.println(ClienteDAO.pesquisaPorNomeInicial("b"));

    System.out.println("<--------- PESQUISA POR MULTIPLOS IDS (IN)--------->");
    System.out.println(ClienteDAO.pesquisaPorMultiplosIds(1, 2, 3));

    System.out.println("<--------- PESQUISA TODOS QUE ESTÃO FORA DO INTERVALO DESSES ID (NOT BETWEEN) --------->");
    System.out.println(ClienteDAO.pesquisaPorIdForaIntervalo(3, 5));
  }
}
