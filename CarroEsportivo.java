public class CarroEsportivo extends Carro {
    private double potencia;

    public CarroEsportivo(String modelo, String marca, int ano, double preco, double potencia) {
        super(modelo, marca, ano, preco);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Potência: %.2f", potencia);
    }
}
