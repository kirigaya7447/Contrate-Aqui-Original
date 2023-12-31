package CONEXAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conectar {

    public Conectar() {

    }

    public Connection getConexao() {
        String url = "jdbc:mysql://localhost:3306/ca";
        String login = "root";
        String senha = "vertrigo";
        try {
            return DriverManager.getConnection(url, login, senha);
        } catch (SQLException err) {
            senha = "";
            try {
                return DriverManager.getConnection(url, login, senha);
            } catch (SQLException err1) {
            }
            throw new RuntimeException(err);

        }
    }

}
