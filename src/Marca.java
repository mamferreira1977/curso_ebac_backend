import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "TB_MARCA")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "marca_seq")
    @SequenceGenerator(name = "marca_seq", sequenceName = "sq_marca", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 10, nullable = false)
    private String nome;

    @Column(name = "VALOR", length = 10, nullable = false)
    private int valor;


    @OneToMany(mappedBy = "marca")
    private List<Carro> Carro;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int GetValor() {
        return valor;
    }

    public void SetValor(int valor) {
        this.valor = valor;

    }

    public List<Carro> getCarro() {
        return Carro;
    }
}

