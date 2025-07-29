package Models;
import java.util.Arrays;

  public class Perfume {
    private int id;
    private String nome;
    private Marca marca;
    private double volume;
    private String unidadeMedida;
    private FamiliaOlfativa[] familiaOlfativa;
    private String genero;
    private double preco;
    private String descricao;
    private static int contadorId;

    public Perfume(String nome, Marca marca, double volume, String unidadeMedida, FamiliaOlfativa[] familiaOlfativa, String genero, double preco, String descricao) {
      contadorId++;
      this.id = contadorId;
      this.nome = nome;
      this.marca = marca;
      this.volume = volume;
      this.unidadeMedida = unidadeMedida;
      this.familiaOlfativa = familiaOlfativa;
      this.genero = genero;
      this.preco = preco;
      this.descricao = descricao;
    }

    public Perfume() {
    }

    public int getId() {
      return id;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public Marca getMarca() {
      return marca;
    }

    public void setMarca(Marca marca) {
      this.marca = marca;
    }

    public double getVolume() {
      return volume;
    }

    public void setVolume(double volume) {
      this.volume = volume;
    }

    public String getUnidadeMedida() {
      return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
      this.unidadeMedida = unidadeMedida;
    }

    public FamiliaOlfativa[] getFamiliaOlfativa() {
      return familiaOlfativa;
    }

    public void setFamiliaOlfativa(FamiliaOlfativa[] familiaOlfativa) {
      this.familiaOlfativa = familiaOlfativa;
    }

    public String getGenero() {
      return genero;
    }

    public void setGenero(String genero) {
      this.genero = genero;
    }

    public double getPreco() {
      return preco;
    }

    public void setPreco(double preco) {
      this.preco = preco;
    }

    public String getDescricao() {
      return descricao;
    }

    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }

    @Override
    public String toString() {
      return "Perfume:" +
              "\nNome: " + nome +
              "\nMarca: " + marca +
              "\nVolume: " + volume +
              "\nUnidade de Medida: '" + unidadeMedida +
              "\nFamilia Olfativa: " + Arrays.toString(familiaOlfativa) +
              "\nGenero: " + genero +
              "\nPreco: " + preco +
              "\nDescrição: " + descricao +
              "\nID: " + id;
    }
  }


