package modelos;

public class Atendente {
  private String nome;
  private String cpf;
  private String telefone;
  private String turno;
  private String endereco;

  public Atendente(String nome, String email, String cpf, String telefone, String turno, String endereco) {
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.turno = turno;
    this.endereco = endereco;
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
}
