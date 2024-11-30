package modelos;

public class Acessorio extends Produto {
  private String tipo;
  private String material;

  public Acessorio(String nome, Double preco, String descricao, String tipo, String material) {
    super(nome, preco, descricao);
    this.tipo = tipo;
    this.material = material;
  }

  public Acessorio() {
  }

  @Override
  public String toString() {
    return "\n<--------- ACESSORIO -------->"
      +"\nNome: " + getNome() 
      + "\nPreco: " + getPreco() 
      + "\nDescricao: " + getDescricao()
      + "\nTipo: " + getTipo()
      + "\nMaterial: " + getMaterial()
    ;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
}
