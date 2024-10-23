import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        Carro carro1 = new CarroEsportivo("Ferrari F8", "Ferrari", 2020, 250000.00, 720.0);
        Carro carro2 = new CarroSUV("Toyota RAV4", "Toyota", 2021, 30000.00, true);
        Carro carro3 = new CarroEsportivo("Porsche 911", "Porsche", 2022, 120000.00, 640.0);
        Carro carro4 = new CarroSUV("Ford EcoSport", "Ford", 2019, 20000.00, false);

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);

        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}

    

