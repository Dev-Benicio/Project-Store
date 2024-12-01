package Testes.TestesAcessorio;

import modelos.Acessorio;
import DAO.AcessorioDAO;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- ATUALIZA --------->");
    Acessorio acessorio = new Acessorio("brinco", 13.0, "Brinco da cor de um diamante", "joia", "diamante");
    AcessorioDAO.altera(1, acessorio);
    System.out.println("<--------- ATUALIZA PREÇO ------------->");
    System.out.println(AcessorioDAO.atualizaPrecoPorTiposExceto(20.0, "sei la", "diamante", "brinco"));
    System.out.println("<----------- ATUALIZA MATERIAL --------->");
    System.out.println(AcessorioDAO.atualizaMaterialPorTipo("ouro", "joia"));
    System.out.println("<----------- ATUALIZA DESCRICAO --------->");
    System.out.println(AcessorioDAO.atualizaDescricaoPrecoMaterial("Brinco da cor de um diamante", 12.9, "ouro"));

  }
}
