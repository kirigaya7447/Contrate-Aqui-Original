package METODOS;

import CONEXAO.Conectar;
import java.sql.Connection;
import VARIAVEIS.Login;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class MELogin {

    private Connection conexao;

    public MELogin() {
        this.conexao = new Conectar().getConexao();
    }

    public void inserirLogin(Login login) {
        String sql;
        sql = "INSERT INTO login(idUserLogin, tipoLogin, horaLogin) VALUES(?,?,?);";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, login.getIdUserLogin());
            stmt.setString(2, login.getTipoLogin());
            stmt.setString(3, login.getHoraLogin());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no inserir login: " + err);
        }
    }
}
