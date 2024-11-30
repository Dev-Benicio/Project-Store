package DAO;

import modelos.Venda;
import modelos.Produto;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
  private static final String ProdutoDAO = null;
    protected static Connection conexao;
    protected static PreparedStatement stmt;
    protected static ResultSet rs;
  
    public static int grava(Venda venda, int opcao, int idProduto) throws Exception {
      int id = 0;
      String colunaProduto;

      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return 0;
      }
      try {
        String sql = "INSERT INTO venda (data_venda, valor_venda, metodo_pagamento, " + colunaProduto
            + ") VALUES (?, ?, ?, ?)";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, venda.getData());
        stmt.setDouble(2, venda.getValor_venda());
        stmt.setString(3, venda.getMetodo_pagamento());

        switch (opcao) {
          case 1:
            stmt.setInt(4, idProduto);
            break;
          case 2:
            stmt.setInt(4, idProduto);
            break;
          case 3:
            stmt.setInt(4, idProduto);
            break;
        }

        id = stmt.executeUpdate();
        rs.close();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return id;
    }
  
    public static List<Venda> leTodos(int opcao, int idProduto) throws Exception {
      List<Venda> venda = new ArrayList<Venda>();
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return venda;
      }
      try {
        String sql = "SELECT * FROM venda WHERE " + colunaProduto + " = ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idProduto);
        rs = stmt.executeQuery();
        while (rs.next()) {
          Venda vendas = new Venda();
          vendas.setData(rs.getString("data_venda"));
          vendas.setValor_venda(rs.getDouble("valor_venda"));
          vendas.setMetodo_pagamento(rs.getString("metodo_pagamento"));
          switch (opcao) {
            case 1:
              vendas.setProduto(RoupaDAO.leUm(idProduto));
              break;
            case 2:
              vendas.setProduto(CalcadoDAO.leUm(idProduto));
              break;
            case 3:
              vendas.setProduto(AcessorioDAO.leUm(idProduto));
              break;
          }
          venda.add(vendas);
        }
        rs.close();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return venda;
    }

    public static Venda leUm(int id, int opcao, int idProduto) throws Exception {
      Venda venda = new Venda();
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return venda;
      }
      try {
        String sql = "SELECT * FROM venda WHERE id_venda = ? AND " + colunaProduto + " = ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setInt(2, idProduto);
        rs = stmt.executeQuery();
        while (rs.next()) {
          venda.setData(rs.getString("data_venda"));
          venda.setValor_venda(rs.getDouble("valor_venda"));
          venda.setMetodo_pagamento(rs.getString("metodo_pagamento"));
          switch (opcao) {
            case 1:
              venda.setProduto(RoupaDAO.leUm(idProduto));
              break;
            case 2:
              venda.setProduto(CalcadoDAO.leUm(idProduto));
              break;
            case 3:
              venda.setProduto(AcessorioDAO.leUm(idProduto));
              break;
          }
        }
        rs.close();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return venda;
    }

    public static int altera(int id, Venda venda, int opcao, int idProduto) throws Exception {
      int id = 0;
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return 0;
      }
      try {
        String sql = "UPDATE venda SET data_venda = ?, valor_venda = ?, metodo_pagamento = ?, "
            + colunaProduto + " = ? WHERE id_venda = ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, venda.getData());
        stmt.setDouble(2, venda.getValor_venda());
        stmt.setString(3, venda.getMetodo_pagamento());

        switch (opcao) {
          case 1:
            stmt.setInt(4, idProduto);
            break;
          case 2:
            stmt.setInt(4, idProduto);
            break;
          case 3:
            stmt.setInt(4, idProduto);
            break;
        }

        stmt.setInt(5, id);
        id = stmt.executeUpdate();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return id;
    }
    
    public static int exclui(int id) throws Exception {
      try {
        String sql = "DELETE FROM venda WHERE id_venda = ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        rs = stmt.getGeneratedKeys();
        if (rs.next()) {
          id = rs.getInt(1);
        }
        rs.close();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return id;
    }

    public static List<Venda> pesquisaletraTipo(String tipo, int opcao, int idProduto) throws Exception {
      List<Venda> venda = new ArrayList<Venda>();
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return venda;
      }
      try {
        String sql = "SELECT * FROM venda WHERE " + colunaProduto + " = ? LIKE tipo = ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idProduto);
        stmt.setString(2, tipo);
        rs = stmt.executeQuery();
        while (rs.next()) {
          Venda vendas = new Venda();
          vendas.setData(rs.getString("data_venda"));
          vendas.setValor_venda(rs.getDouble("valor_venda"));
          vendas.setMetodo_pagamento(rs.getString("metodo_pagamento"));
          switch (opcao) {
            case 1:
              vendas.setProduto(RoupaDAO.leUm(idProduto));
              break;
            case 2:
              vendas.setProduto(CalcadoDAO.leUm(idProduto));
              break;
            case 3:
              vendas.setProduto(AcessorioDAO.leUm(idProduto));
              break;
          }
          venda.add(vendas);
        }
        rs.close();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return venda;
    }

    // `Pesquisa entre valores de venda
    public static List<Venda> pesquisaExcetoEntreValores(int opcao, int idProduto, double valor_min, double valor_max)
        throws Exception {
      List<Venda> venda = new ArrayList<Venda>();
      String colunaProduto;

      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return venda;
      }

      try {
        String sql = "SELECT * FROM venda WHERE " + colunaProduto + " = ? AND valor_venda NOT BETWEEN ? AND ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, idProduto);
        stmt.setDouble(2, valor_min);
        stmt.setDouble(3, valor_max);
        rs = stmt.executeQuery();

        while (rs.next()) {
          Venda vendas = new Venda();
          vendas.setData(rs.getString("data_venda"));
          vendas.setValor_venda(rs.getDouble("valor_venda"));
          vendas.setMetodo_pagamento(rs.getString("metodo_pagamento"));

          switch (opcao) {
            case 1:
              vendas.setProduto(RoupaDAO.leUm(idProduto));
              break;
            case 2:
              vendas.setProduto(CalcadoDAO.leUm(idProduto));
              break;
            case 3:
              vendas.setProduto(AcessorioDAO.leUm(idProduto));
              break;
          }
          venda.add(vendas);
        }
        rs.close();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return venda;
    }

    // Pesquisa com in(?,?)
    public static List<Venda> pesquisaIn(int opcao, int idProduto, int id_min, int id_max) throws Exception {
      List<Venda> venda = new ArrayList<Venda>();
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return venda;
      }
      try {
        String sql = "SELECT * FROM venda WHERE " + colunaProduto + " = ? AND id_venda IN (?,?)";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, idProduto);
        stmt.setInt(2, id_min);
        stmt.setInt(3, id_max);
        rs = stmt.executeQuery();
        while (rs.next()) {
          Venda vendas = new Venda();
          vendas.setData(rs.getString("data_venda"));
          vendas.setValor_venda(rs.getDouble("valor_venda"));
          vendas.setMetodo_pagamento(rs.getString("metodo_pagamento"));
          switch (opcao) {
            case 1:
              vendas.setProduto(RoupaDAO.leUm(idProduto));
              break;
            case 2:
              vendas.setProduto(CalcadoDAO.leUm(idProduto));
              break;
            case 3:
              vendas.setProduto(AcessorioDAO.leUm(idProduto));
              break;
          }
          venda.add(vendas);
        }
        rs.close();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return venda;
    }

    // Altera utilizando NOT IN(?,?)
    public static int alteraNotIn(int id, Venda venda, int opcao, int idProduto) throws Exception {
      int id_rs = 0;
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return 0;
      }
      try {
        String sql = "UPDATE venda SET data_venda = ?, valor_venda = ?, metodo_pagamento = ?, "
            + colunaProduto + " = ? WHERE id_venda = ? AND " + colunaProduto + " NOT IN (?,?)";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, venda.getData());
        stmt.setDouble(2, venda.getValor_venda());
        stmt.setString(3, venda.getMetodo_pagamento());

        switch (opcao) {
          case 1:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            break;
          case 2:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            break;
          case 3:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            break;
        }

        stmt.setInt(6, id);
        id_rs = stmt.executeUpdate();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return id_rs;
    }

    // Altera utilizando o = ?
    public static int alteraOnde(int id, Venda venda, int opcao, int idProduto) throws Exception {
      int id_rs = 0;
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return 0;
      }
      try {
        String sql = "UPDATE venda SET data_venda = ?, valor_venda = ?, metodo_pagamento = ?, "
            + colunaProduto + " = ? WHERE id_venda = ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, venda.getData());
        stmt.setDouble(2, venda.getValor_venda());
        stmt.setString(3, venda.getMetodo_pagamento());

        switch (opcao) {
          case 1:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            break;
          case 2:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            break;
          case 3:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            break;
        }
        id_rs = stmt.executeUpdate();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return id_rs;
    }

    // Altera utilizando o And
    public static int alteraAnd(int id, Venda venda, int opcao, int idProduto) throws Exception {
      int id_rs = 0;
      String colunaProduto;
      switch (opcao) {
        case 1:
          colunaProduto = "id_roupa";
          break;
        case 2:
          colunaProduto = "id_calcado";
          break;
        case 3:
          colunaProduto = "id_acessorio";
          break;
        default:
          return 0;
      }
      try {
        String sql = "UPDATE venda SET data_venda = ?, valor_venda = ?, metodo_pagamento = ?, "
            + colunaProduto + " = ? WHERE id_venda = ? AND " + colunaProduto + " = ?";
        conexao = ConnectionFactory.getConnection();
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, venda.getData());
        stmt.setDouble(2, venda.getValor_venda());
        stmt.setString(3, venda.getMetodo_pagamento());

        switch (opcao) {
          case 1:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            stmt.setInt(6, id);
            break;
          case 2:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            stmt.setInt(6, id);
            break;
          case 3:
            stmt.setInt(4, idProduto);
            stmt.setInt(5, idProduto);
            break;
        }
        id_rs = stmt.executeUpdate();
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
      return id_rs;
    }
  }
