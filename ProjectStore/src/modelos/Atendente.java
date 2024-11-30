package modelos;

public class Atendente {
  private String nome;
  private String cpf;
  private String telefone;
  private String turno;
  private String endereco;
  private Cliente cliente;
  private Venda venda;

  public Atendente(String nome, String email, String cpf, String telefone, String turno, String endereco, Cliente cliente, Venda venda) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.turno = turno;
    this.endereco = endereco;
    this.cliente = cliente;
    this.venda = venda;
  }

  public Atendente() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Venda getVenda() {
    return venda;
  }

  public void setVenda(Venda venda) {
    this.venda = venda;
  }
}
