public class CarroSUV extends Carro {
    private boolean tracaoNasQuatro;

    public CarroSUV(String modelo, String marca, int ano, double preco, boolean tracaoNasQuatro) {
        super(modelo, marca, ano, preco);
        this.tracaoNasQuatro = tracaoNasQuatro;
    }

    public boolean isTracaoNasQuatro() {
        return tracaoNasQuatro;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Tração nas Quatro: %s", tracaoNasQuatro ? "Sim" : "Não");
    }
}
