package modelos;

public class Venda {
  private String data;
  private String itens;
  private String forma_pagamento;
  private Produto produto;

  public Venda(String data, String itens, String forma_pagamento, Produto produto) {
    this.data = data;
    this.itens = itens;
    this.forma_pagamento = forma_pagamento;
    this.produto = produto;
  }

  public Venda() {
  }

  public String adicionarProduto(Produto produto, int quantidade) {
      Double valor_final =  produto.getPreco() * quantidade;
      return "<----- Dados do Pedido ----->\n"
          + "Data: " + this.getData() + "\n"
          + "Produto: " + this.getProduto().getNome() + "\n"
          + "Valor: " + getProduto().getPreco() + "\n"
          + "Quantidade: " + quantidade + "\n"
          + "Valor Final: " + valor_final + "\n"
          + "Forma de Pagamento: " + this.getForma_pagamento() + "\n"
          + "------------------------------";
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getItens() {
    return itens;
  }

  public void setItens(String itens) {
    this.itens = itens;
  }

  public String getForma_pagamento() {
    return forma_pagamento;
  }

  public void setForma_pagamento(String forma_pagamento) {
    this.forma_pagamento = forma_pagamento;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }
}
