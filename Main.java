public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco;
    }
}
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String nome, String endereco, String cpf, String dataNascimento) {
        super(nome, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento;
    }
}
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String cnpj, String razaoSocial) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj + ", Razão Social: " + razaoSocial;
    }
}public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua A, 123", "123.456.789-00", "01/01/1990");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Avenida B, 456", "12.345.678/0001-99", "Empresa XYZ Ltda.");

        System.out.println(pf);
        System.out.println(pj);
    }
}


