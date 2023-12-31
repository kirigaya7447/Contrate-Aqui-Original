package METODOS.PERFIL;

import CONEXAO.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import VARIAVEIS.PERFIL.Autonomo;

public class MEAutonomo {

    private Connection conexao;

    public MEAutonomo() {
        this.conexao = new Conectar().getConexao();
    }

    public void inserir(Autonomo autonomo, int id) {
        String sql = "INSERT INTO autonomo(idUserAutonomo, profissaoAutonomo, avaliacaoAutonomo, "
                + "numAvaliacaoAutonomo) VALUES(?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, String.valueOf(id));
            stmt.setString(2, autonomo.getProfissaoAutonomo());
            stmt.setString(3, "0.0");
            stmt.setString(4, "0");
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no inserir autonomo:" + err);
        }
    }

    public ArrayList pesquisarAutonomo(int idAut) {
        ArrayList<Autonomo> autonomo = new ArrayList();
        Autonomo a;
        String sql = "SELECT * FROM autonomo WHERE idUserAutonomo = " + idAut + ";";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                a = new Autonomo();
                a.setAvaliacaoAutonomo(rs.getString("avaliacaoAutonomo"));
                a.setProfissaoAutonomo(rs.getString("profissaoAutonomo"));
                autonomo.add(a);
                stmt.execute();
            }
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar Autonomo: " + err);
        }
        return autonomo;
    }

    public void alterar(Autonomo autonomo, int id) {
        String sql = "UPDATE autonomo SET profissaoAutonomo = ? WHERE idUserAutonomo = " + id;

        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt.setString(1, autonomo.getProfissaoAutonomo());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no alterar Autonomo: " + err);
        }
    }

}
