package modelos;

public class Cliente {
  private String nome;
  private String cpf;
  private String telefone;
  private String endereco;
  private int numero_residencia;

  public Cliente(String nome, String endereco, String telefone, String cpf, int numero_residencia) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.cpf = cpf;
    this.numero_residencia = numero_residencia;
  }

  public Cliente() {
  }

  public String toString() {
    return "\n<------------ Cliente ------------>\n"
        + "Nome: " + getNome()
        + "\nCPF: " + getCpf()
        + "\nTelefone: " + getTelefone()
        + "\nEndereco: " + getEndereco()
        + "\nNumero Residencia: " + getNumero_residencia()
        + "\n<------------------------------------>";
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

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getNumero_residencia() {
    return numero_residencia;
  }

  public void setNumero_residencia(int numero_residencia) {
    this.numero_residencia = numero_residencia;
  }
}
