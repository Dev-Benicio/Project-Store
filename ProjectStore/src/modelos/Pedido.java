package modelos;

public class Pedido {
  private String data;
  private String itens;
  private String forma_pagamento;
  private Produto produto;

  public Pedido(String data, String itens, String forma_pagamento, Produto produto) {
    this.data = data;
    this.itens = itens;
    this.forma_pagamento = forma_pagamento;
    this.produto = produto;
  }

  public Pedido() {
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
