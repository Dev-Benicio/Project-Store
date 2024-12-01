package Testes.TesteVenda;

import java.util.InputMismatchException;
import java.util.Scanner;
import modelos.Cliente;
import modelos.Atendente;
import modelos.Calcado;
import modelos.Roupa;
import modelos.Acessorio;
import modelos.Venda;
import DAO.VendaDAO;

public class MainUpdate {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    Atendente atendente = new Atendente("benic", "benic@gmail.com", "123456789", "(61) 99999-9999", "matutino",
        "rua teste");
    Cliente cliente = new Cliente("Benic", "Rua teste", "(61) 99999-9999", "123456789", 134);

    boolean opcaoValida = false;
    while (!opcaoValida) {
      System.out.println("Escolha o tipo de produto:");
      System.out.println("1 - Roupa");
      System.out.println("2 - Calçado");
      System.out.println("3 - Acessório");

      try {
        int op = sc.nextInt();
        if (op >= 1 && op <= 3) {
          switch (op) {
            case 1:
              System.out.println("<--------- ATUALIZA VENDA --------->");
              Roupa camiseta = new Roupa("Camiseta", 29.99, "Camiseta elastano, preparada para treinos intensos", "M",
                  "Elastano", "Nike");
              Venda venda = new Venda("2020-01-01", "Pagamento em conta", camiseta, cliente, atendente,
                  camiseta.getPreco());
              VendaDAO.altera(1, venda, op, 1, 2, 3);
              opcaoValida = true;

              System.out.println("<--------- ATUALIZA VENDA (AND) ---------->");
              VendaDAO.alteraAnd(1, venda, op, op);

              System.out.println("<--------- ATUALIZA VENDA ( = ) ---------->");
              VendaDAO.alteraOnde(1, venda, op, op); 

              System.out.println("<--------- ATUALIZA VENDA (NOT IN) ---------->");
              VendaDAO.alteraNotIn(1, venda, op, 1, 2, 3, 1, 2);
              break;
            case 2:
              System.out.println("<--------- ATUALIZA VENDA --------->");
              Calcado tenis = new Calcado("Tenis", 29.99, "Tenis, preparado para treinos intensos", 41, "Nike",
                  "Elastano");
              venda = new Venda("2020-01-01", "Pagamento em conta", tenis, cliente, atendente, tenis.getPreco());
              VendaDAO.altera(1, venda, op, 1, 2, 3);
              opcaoValida = true;

              System.out.println("<--------- ATUALIZA VENDA (AND) ---------->");
              VendaDAO.alteraAnd(1, venda, op, op);

              System.out.println("<--------- ATUALIZA VENDA ( = ) ---------->");
              VendaDAO.alteraOnde(1, venda, op, op);

              System.out.println("<--------- ATUALIZA VENDA (NOT IN) ---------->");
              VendaDAO.alteraNotIn(1, venda, op, 1, 2, 3, 1, 2);
              break;
            case 3:
              System.out.println("<--------- ATUALIZA VENDA --------->");
              Acessorio acessorio = new Acessorio("Joias", 29.99, "Joias para festas no palacio", "Joia", "Ouro");
              venda = new Venda("2020-01-01", "Pagamento em conta", acessorio, cliente, atendente,
                  acessorio.getPreco());
              VendaDAO.altera(1, venda, op, 1, 2, 3);
              opcaoValida = true;

              System.out.println("<--------- ATUALIZA VENDA (AND) ---------->");
              VendaDAO.alteraAnd(1, venda, op, op);

              System.out.println("<--------- ATUALIZA VENDA ( = ) ---------->");
              VendaDAO.alteraOnde(1, venda, op, op);

              System.out.println("<--------- ATUALIZA VENDA (NOT IN) ---------->");
              VendaDAO.alteraNotIn(1, venda, op, 1, 2, 3, 1, 2);
              break;
          }
        } else {
          System.out.println("Digite um número entre 1 e 3!");
        }
      } catch (InputMismatchException e) {
        System.out.println("Digite apenas números!");
        sc.next();
      } finally {
        sc.close();
      }
    }
  }
}
