import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }
}

public class Lista {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        
        // Adicionando pessoas à lista
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("José", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Carlos", "Masculino"));
        
        // Filtrando apenas as mulheres
        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> "Feminino".equalsIgnoreCase(p.getSexo()))
                .collect(Collectors.toList());

        // Exibindo as mulheres filtradas
        mulheres.forEach(System.out::println);
    }
}
