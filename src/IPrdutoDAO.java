public interface IProdutoDAO {


    public Integer cadastrar(Produto produto) throws Exception;

    public Cliente consultar(String codigo) throws Exception;

    public Integer excluir(Produto produtoBD) throws Exception;
}
