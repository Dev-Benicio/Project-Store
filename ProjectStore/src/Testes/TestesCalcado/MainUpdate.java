package Testes.TestesCalcado;

import DAO.CalcadoDAO;
import modelos.Calcado;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CALÇADO --------->");
    Calcado tenis = new Calcado("Tenis", 29.99, "Tenis, preparado para treinos intensos", 41, "Nike", "Elastano");
    CalcadoDAO.altera(1, tenis);

    System.out.println("ATUALIZA COM O NOT IN");
    CalcadoDAO.atualizaPrecoPorTiposExceto(29.99, "Nike", "Elastano", "Nike");

    System.out.println("ATUALIZA COM O = ");
    CalcadoDAO.atualizaMarcaPorTipo("Nike", "Nike");

    System.out.println("ATUALIZA COM O AND");
    CalcadoDAO.atualizaDescricaoPrecoMarca("Nike", 29.99, "Nike");
  }
}
