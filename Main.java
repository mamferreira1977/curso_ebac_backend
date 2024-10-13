
// Car.java
interface Carro {
    void drive();
}
// SportCar.java
class CarroEsporte implements Carro {
    @Override
    public void drive() {
        System.out.println("Dirigindo um carro esportivo!");
    }
}

// ElectricCar.java
class CarroEletrico implements Carro {
    @Override
    public void drive() {
        System.out.println("Dirigindo um carro elétrico ");
    }
}
// CarFactory.java
interface CarroFactory {
    Carro createCarro();
}

// SportCarFactory.java
class CarroEsporteFactory implements CarroFactory {
    @Override
    public Carro createCarro() {
        return new CarroEsporte();
    }
}

// ElectricCarFactory.java
class CarroEletricoFactory implements CarroFactory {
    @Override
    public Carro createCarro() {
        return new CarroEletrico();
    }
}

// Client.java
class Cliente {
    private Carro carro;

    public Cliente(CarroFactory factory) {
        this.carro = factory.createCarro();
    }

    public void driveCar() {
        carro.drive();
    }

    public static void main(String[] args) {
        // Criar um carro esportivo
        CarroFactory CarroEsporteFactory = new CarroEsporteFactory();
        Cliente CarroEsporteCliente = new Cliente(CarroEsporteFactory);
        CarroEsporteCliente.driveCar();

        // Criar um carro elétrico
        CarroFactory CarroEletricoFactory = new CarroEletricoFactory();
        Cliente electricCarClient = new Cliente(CarroEletricoFactory);
        electricCarClient.driveCar();
    }
}

























