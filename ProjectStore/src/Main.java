import modelos.Venda;
import modelos.Roupa;
public class Main {
  public static void main(String[] args) {
    Roupa camiseta = new Roupa("Camiseta", 100.00, "Uma camiseta de 100 reais", 20.00, "Alumínio");
    System.out.println(camiseta);

    Venda pedido = new Venda("11/12/2012", "Camiseta","Pix", camiseta);
    System.out.println(pedido.adicionarProduto(camiseta, 1));
  }
}