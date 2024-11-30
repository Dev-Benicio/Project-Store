package modelos;

public class Cliente {
  private String nome;
  private String cpf;
  private String telefone;
  private String endereco;
  private int numero_residencia;
  private Venda venda;

  public Cliente(String nome, String endereco, String telefone, Venda venda) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.venda = venda;
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

  public Venda getVenda() {
    return venda;
  }

  public void setVenda(Venda venda) {
    this.venda = venda;
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
