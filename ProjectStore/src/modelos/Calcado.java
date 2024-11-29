package modelos;

public class Calcado extends Produto {
  private int numero;
  private String tipo;

  public Calcado(String nome, Double preco, String descricao, String imagem, int numero, String tipo) {
    super(nome, preco, descricao, imagem);
    this.numero = numero;
    this.tipo = tipo;
  }

  public Calcado() {
  }

  @Override
  public String toString() {
    return "\n<--------- CALCADO -------->"
      +"\nNome: " + getNome() 
      + "\nPreco: " + getPreco() 
      + "\nDescricao: " + getDescricao()
      + "\nNumero: " + getNumero() 
      + "\nTipo: " + getTipo();
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
