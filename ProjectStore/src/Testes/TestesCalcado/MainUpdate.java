package Testes.TestesCalcado;

import DAO.CalcadoDAO;
import modelos.Calcado;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    System.out.println("<--------- CALÇADO --------->");
    Calcado tenis = new Calcado("Tenis", 29.99, "Tenis, preparado para treinos intensos", 41, "Corrida", "Nike");
    CalcadoDAO.altera(1, tenis);

     System.out.println("ATUALIZA TODOS TIPOS, EXCETO (COM O NOT IN)");
     CalcadoDAO.atualizaPrecoPorTiposExceto(89.0, "Corrida", "Social", "Casual");

     System.out.println("ATUALIZA MARCA, COM O = ");
     CalcadoDAO.atualizaMarcaPorMarca("Polo", "Nike");
     
     System.out.println("ATUALIZA COM O AND");
     CalcadoDAO.atualizaDescricaoPrecoMarca("Tenis feito para você", 79.0, "Nike");
  }
}
