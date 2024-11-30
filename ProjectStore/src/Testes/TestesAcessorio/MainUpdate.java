package Testes.TestesAcessorio;

import modelos.Acessorio;
import DAO.AcessorioDAO;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- ATUALIZA --------->");
    System.out.println(AcessorioDAO.leUm(1));
    Acessorio acessorio = new Acessorio("brinco", 12.9, "Brinco da cor de um diamante", "sei la", "diamante");
    AcessorioDAO.altera(1, acessorio);
    System.out.println(AcessorioDAO.leUm(1));
    System.out.println("<--------- ATUALIZA PREÇO ------------->");
    System.out.println(AcessorioDAO.atualizaPrecoPorTiposExceto(20.0, "sei la", "diamante", "brinco"));
    System.out.println("<----------- ATUALIZA MATERIAL --------->");
    System.out.println(AcessorioDAO.atualizaMaterialPorTipo("diamante", "sei la"));
    System.out.println("<----------- ATUALIZA DESCRICAO --------->");
    System.out.println(AcessorioDAO.atualizaDescricaoPrecoMaterial("Brinco da cor de um diamante", 12.9, "diamante"));

  }
}
