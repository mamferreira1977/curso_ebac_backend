
    public class Main {
        public static void main(String[] args) {
            // Obtendo a classe Usuario
            Class<Usuario> usuarioClass = Usuario.class;
    
            // Verificando se a annotation Tabela está presente
            if (usuarioClass.isAnnotationPresent(Tabela.class)) {
                // Obtendo a annotation Tabela
                Tabela tabela = usuarioClass.getAnnotation(Tabela.class);
                // Imprimindo o nome da tabela
                System.out.println("Nome da tabela: " + tabela.nome());
            }
        }
    }
     

