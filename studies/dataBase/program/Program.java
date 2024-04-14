//conectar com o banco de dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Configurações de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/new_db";
        String usuario = "marcos";
        String senha = "112005ma";

        // Objeto de conexão
        Connection conexao = null;

        try {
            // Estabelece a conexão com o banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);

            // Verifica se a conexão foi bem-sucedida
            if (conexao != null) {
                System.out.println("Conexão bem-sucedida!");
                // Faça operações no banco de dados aqui
            } else {
                System.out.println("Falha na conexão!");
            }
        } catch (SQLException e) {
            // Captura e imprime erros de SQL
            e.printStackTrace();
        } finally {
            try {
                // Fecha a conexão
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
