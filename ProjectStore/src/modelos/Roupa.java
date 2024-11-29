package modelos;

public class Roupa extends Produto {
  private Double tamanho;
  private String material;

  public Roupa(String nome, Double preco, String descricao, String imagem, Double tamanho, String material) {
    super(nome, preco, descricao, imagem);
    this.tamanho = tamanho;
    this.material = material;
  }

  public Roupa() {
  }

  @Override
  public String toString() {
    return "\n<--------- ROUPA -------->"
      +"\nNome: " + getNome() 
      + "\nPreco: " + getPreco() 
      + "\nDescricao: " + getDescricao()
      + "\nTamanho: " + getTamanho() 
      + "\nMaterial: " + getMaterial();
  }

  public Double getTamanho() {
    return tamanho;
  }

  public void setTamanho(Double tamanho) {
    this.tamanho = tamanho;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }
}
