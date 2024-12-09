
import javax.persistence.*;


@Entity
@Table(name = "TB_ACESSORIOS")
public class Acessorios {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorios_seq")
    @SequenceGenerator(name = "acessorios_seq", sequenceName = "sq_acessorios", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 10, nullable = false)
    private String nome;

    @Column(name = "VALOR", length = 10, nullable = false)
    private int valor;

    @ManyToOne
    @JoinColumn(name="id_carro_fk",
    foreignKey=@ForeignKey(name="fk_carro_acessorios"),
    referencedColumnName="id",nullable=false)
    private Acessorios carro;


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

    public void setValor(String number) {
    }
}
