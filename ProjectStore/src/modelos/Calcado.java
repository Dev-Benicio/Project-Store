package modelos;

public class Calcado extends Produto {
  private int numero;
  private String tipo;
  private String marca;

  public Calcado(String nome, Double preco, String descricao, int numero, String tipo, String marca) {
    super(nome, preco, descricao);
    this.numero = numero;
    this.tipo = tipo;
    this.marca = marca;
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
      + "\nTipo: " + getTipo()
      + "\nMarca: " + getMarca()
    ;
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

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }
}
