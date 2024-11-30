package modelos;

public class Roupa extends Produto {
  private String tamanho;
  private String material;
  private String marca;

  public Roupa(String nome, Double preco, String descricao, String tamanho, String material, String marca) {
    super(nome, preco, descricao);
    this.tamanho = tamanho;
    this.material = material;
    this.marca = marca;
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
      + "\nMaterial: " + getMaterial()
      + "\nMarca: " + getMarca()
    ;
  }

  public String getTamanho() {
    return tamanho;
  }

  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }
}
