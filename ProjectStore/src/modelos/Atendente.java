package modelos;

public class Atendente {
  private String nome;
  private String email;
  private Cliente cliente;

  public Atendente(String nome, String email, Cliente cliente) {
    this.nome = nome;
    this.email = email;
    this.cliente = cliente;
  }

  public Atendente() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
}
