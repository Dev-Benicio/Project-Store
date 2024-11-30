package modelos;

public class Venda {
  private String data_venda;
  private Double valor_venda;
  private String metodo_pagamento;
  private Produto produto;

  public Venda(String data_venda, String metodo_pagamento, Produto produto) {
    this.data_venda = data_venda;
    this.metodo_pagamento = metodo_pagamento;
    this.produto = produto;
  }

  public Venda() {
  }

  public String adicionarProduto(Produto produto, int quantidade) {
    this.valor_venda = produto.getPreco() * quantidade;
    return "<----- Dados do Pedido ----->\n"
        + "Data: " + this.getData() + "\n"
        + "Produto: " + this.getProduto().getNome() + "\n"
        + "Valor: " + getProduto().getPreco() + "\n"
        + "Quantidade: " + quantidade + "\n"
        + "Valor Final: " + valor_venda + "\n"
        + "Metodo de Pagamento: " + this.getMetodo_pagamento() + "\n"
        + "------------------------------";
  }

  public String getData() {
    return data_venda;
  }

  public void setData(String data_venda) {
    this.data_venda = data_venda;
  }

  public Double getValor_venda() {
    return valor_venda;
  }

  public void setValor_venda(Double valor_venda) {
    this.valor_venda = valor_venda;
  }

  public String getMetodo_pagamento() {
    return metodo_pagamento;
  }

  public void setMetodo_pagamento(String metodo_pagamento) {
    this.metodo_pagamento = metodo_pagamento;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }
}
