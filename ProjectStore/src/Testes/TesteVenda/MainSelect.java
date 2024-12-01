package Testes.TesteVenda;

import DAO.RoupaDAO;

public class MainSelect {
  public static void main(String[] args) throws Exception {
    System.out.println("Select Roupas");
    System.out.println("<------------- BUSCA TODAS AS ROUPAS ------------->");
    RoupaDAO.leTodos();

    System.out.println("<------------- BUSCA UMA ROUPA POR ID ------------->");
    RoupaDAO.leUm(1);

    System.out.println("<------------- BUSCA UMA ROUPA POR IDS (BETWEEN) ------------->");
    RoupaDAO.pesquisaPorIdForaIntervalo(1, 5);

    System.out.println("<------------- BUSCA UMA ROUPA POR IDS (IN) ------------->");
    RoupaDAO.pesquisaPorMultiplosIds(1, 4, 6);

    System.out.println("<------------- BUSCA ROUPAS COM NOME INICIAL (LIKE) ------------->");
    RoupaDAO.pesquisaPorNomeInicial("b");
  }
}
