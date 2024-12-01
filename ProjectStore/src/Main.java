// import modelos.Venda;
import DAO.AcessorioDAO;
import modelos.Acessorio;
// import modelos.Roupa;
public class Main {
  public static void main(String[] args) throws Exception {
    // Roupa camiseta = new Roupa("Camiseta", 100.00, "Uma camiseta de 100 reais", "M", "Algodão", "Nike");
    // System.out.println(camiseta);

    // Venda pedido = new Venda("11/12/2012", "Pix", camiseta);
    // System.out.println(pedido.adicionarProduto(camiseta, 4));
    System.out.println("Acessorio");
    System.out.println("<--------- CRIAR --------->");
    Acessorio acessorio = new Acessorio("brinco", 12.9, "Brinco da cor de um diamante", "sei la", "diamante");
    AcessorioDAO.grava(acessorio);
    System.out.println(acessorio);
  }
}