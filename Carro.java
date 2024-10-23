public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double preco;

    public Carro(String modelo, String marca, int ano, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("Carro [Modelo: %s, Marca: %s, Ano: %d, Preço: %.2f]", modelo, marca, ano, preco);
    }
}
