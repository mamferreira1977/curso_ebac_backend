import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "TB_CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 10, nullable = false)
    private String nome;

    @Column(name = "VALOR", length = 10, nullable = false)
    private int valor;

    @OneToMany(mappedBy = "carro")
    private List<Acessorios> Acessorios;

    @ManyToOne
    @JoinColumn(name="id_marca_fk",
            foreignKey=@ForeignKey(name="fk_carro_acessorios"),
            referencedColumnName="id",nullable=false)
    private Marca marca;

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
    public List<Acessorios> getAcessorios() {
        return Acessorios;
    }

    public void setAcessorios(List<Acessorios> acessorios) {
        Acessorios = acessorios;
    }

    public void setValor(String cursoTeste) {
    }
}


















