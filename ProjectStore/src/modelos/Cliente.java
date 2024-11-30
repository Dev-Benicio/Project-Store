package modelos;

public class Cliente {
  private String nome;
  private String endereco;
  private String telefone;
  private Venda pedido;

  public Cliente(String nome, String endereco, String telefone, Venda pedido) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.pedido = pedido;
  }

  public Cliente() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public Venda getPedido() {
    return pedido;
  }

  public void setPedido(Venda pedido) {
    this.pedido = pedido;
  }
}
