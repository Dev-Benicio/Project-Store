package modelos;

public class Venda {
  private String data_venda;
  private Double valor_venda;
  private String metodo_pagamento;
  private Produto produto;
  private Cliente cliente;
  private Atendente atendente;

  public Venda(String data_venda, String metodo_pagamento, Produto produto, Cliente cliente, Atendente atendente, Double valor_venda) {
    this.data_venda = data_venda;
    this.metodo_pagamento = metodo_pagamento;
    this.produto = produto;
    this.cliente = cliente;
    this.atendente = atendente;
    this.valor_venda = valor_venda;
  }

  public Venda() {
  }

  public String adicionarProduto(Produto produto, int quantidade) {
    this.valor_venda = produto.getPreco() * quantidade;
    return "<----- Dados da Venda ----->\n"
        + "Data: " + this.getData() + "\n"
        + "Produto: " + this.getProduto().getNome() + "\n"
        + "Valor: " + getProduto().getPreco() + "\n"
        + "Quantidade: " + quantidade + "\n"
        + "Valor Final: " + getValor_venda() + "\n"
        + "Metodo de Pagamento: " + this.getMetodo_pagamento() + "\n"
        + "Atendente: " + this.getAtendente().getNome() + "\n"
        + "Cliente: " + this.getCliente().getNome() + "\n"
        + "------------------------------";
  }

  public String toString() {
    return "<----- Dados da Venda ----->\n"
        + "Data: " + getData() + "\n"
        + "Produto: " + getProduto().getNome() + "\n"
        + "Valor: " + getProduto().getPreco() + "\n"
        + "Valor Final: " + getValor_venda() + "\n"
        + "Metodo de Pagamento: " + getMetodo_pagamento() + "\n"
        + "Atendente: " + getAtendente().getNome() + "\n"
        + "Cliente: " + getCliente().getNome() + "\n"
        + "------------------------------";
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Atendente getAtendente() {
    return atendente;
  }

  public void setAtendente(Atendente atendente) {
    this.atendente = atendente;
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
