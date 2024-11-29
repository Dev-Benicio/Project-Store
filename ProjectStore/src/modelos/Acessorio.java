package modelos;

public class Acessorio extends Produto {
  private String tipo;

  public Acessorio(String nome, Double preco, String descricao, String tipo) {
    super(nome, preco, descricao);
    this.tipo = tipo;
  }

  public Acessorio() {
  }

  @Override
  public String toString() {
    return "\n<--------- ACESSORIO -------->"
      +"\nNome: " + getNome() 
      + "\nPreco: " + getPreco() 
      + "\nDescricao: " + getDescricao()
      + "\nTipo: " + getTipo();
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
}
