package METODOS.PERFIL;

import CONEXAO.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import VARIAVEIS.PERFIL.Colaborador;

public class MEColaborador {

    private Connection conexao;

    public MEColaborador() {
        this.conexao = new Conectar().getConexao();
    }

    public void inserir(Colaborador colaborador, int id) {
        String sql = "INSERT INTO colaborador(idUserColaborador, areaColaborador, situacaoColaborador)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, String.valueOf(id));
            stmt.setString(2, colaborador.getAreaColaborador());
            stmt.setString(3, "PROCURANDO OPORTUNIDADES");
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no inserir colaborador: " + err);
        }
    }

    public ArrayList pesquisarColaborador(int idCol) {
        ArrayList<Colaborador> colaborador = new ArrayList();
        Colaborador c;
        String sql = "SELECT * FROM colaborador WHERE idUserColaborador = " + idCol + ";";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                c = new Colaborador();
                c.setAreaColaborador(rs.getString("areaColaborador"));
                c.setSituacaoColaborador(rs.getString("situacaoColaborador"));
                colaborador.add(c);
                stmt.execute();
            }
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar Colaborador: " + err);
        }
        return colaborador;
    }
    
    public void alterar(Colaborador colaborador, int id) {
        String sql = "UPDATE colaborador SET areaColaborador = ?, situacaoColaborador = ? "
                + "WHERE idUserColaborador = " + id;

        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt.setString(1, colaborador.getAreaColaborador());
            stmt.setString(2, colaborador.getSituacaoColaborador());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no alterar Colaborador: " + err);
        }
    }

}
