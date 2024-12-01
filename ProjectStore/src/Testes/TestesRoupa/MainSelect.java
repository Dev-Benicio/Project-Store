package Testes.TestesRoupa;

import DAO.RoupaDAO;

public class MainSelect {
  public static void main(String[] args) throws Exception {
    System.out.println("Select Roupas");
    System.out.println("<------------- BUSCA TODAS AS ROUPAS ------------->");
    System.out.println(RoupaDAO.leTodos());

    System.out.println("<------------- BUSCA UMA ROUPA POR ID ------------->");
    System.out.println(RoupaDAO.leUm(1));

    System.out.println("<------------- BUSCA UMA ROUPA POR IDS (BETWEEN) ------------->");
    System.out.println(RoupaDAO.pesquisaPorIdForaIntervalo(1, 5));

    System.out.println("<------------- BUSCA UMA ROUPA POR IDS (IN) ------------->");
    System.out.println(RoupaDAO.pesquisaPorMultiplosIds(1, 4, 6));
    
    System.out.println("<------------- BUSCA ROUPAS COM NOME INICIAL (LIKE) ------------->");
    System.out.println(RoupaDAO.pesquisaPorNomeInicial("C"));
  }
}
