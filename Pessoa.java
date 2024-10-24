public class Pessoa {
    private String nome;
    private String sexo; // "M" para masculino, "F" para feminino

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
}
