import java.util.List;




    public interface IProdutoDAO {

        public Produto cadastrar(Produto produto);

        public void excluir(Produto pro);

        public List<Produto> buscarTodos();
    }

