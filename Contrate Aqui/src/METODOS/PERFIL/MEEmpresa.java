package METODOS.PERFIL;

import CONEXAO.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import VARIAVEIS.PERFIL.Empresa;

public class MEEmpresa {

    private Connection conexao;

    public MEEmpresa() {
        this.conexao = new Conectar().getConexao();
    }

    public void inserir(Empresa empresa, int id) {
        String sql = "INSERT INTO empresa(idUserEmpresa, trabalhoEmpresa, estagioEmpresa, "
                + "avaliacaoEmpresa, numAvaliacaoEmpresa) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, String.valueOf(id));
            stmt.setString(2, empresa.getTrabalhoEmpresa());
            stmt.setString(3, empresa.getEstagioEmpresa());
            stmt.setString(4, "0.0");
            stmt.setString(5, "0");
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no inserir empresa: " + err);
        }

    }

    public ArrayList pesquisarEmpresa(int idEmp) {
        ArrayList<Empresa> empresa = new ArrayList();
        Empresa e;
        String sql = "SELECT * FROM empresa WHERE idUserEmpresa = " + idEmp + ";";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                e = new Empresa();
                e.setTrabalhoEmpresa(rs.getString("trabalhoEmpresa"));
                e.setEstagioEmpresa(rs.getString("estagioEmpresa"));
                e.setnumNumAvaliacaoEmpresa(rs.getString("numAvaliacaoEmpresa"));
                empresa.add(e);
                stmt.execute();
            }
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar Empresa: " + err);
        }
        return empresa;
    }

    public void alterar(Empresa empresa, int id) {
        String sql = "UPDATE empresa SET trabalhoEmpresa = ?, estagioEmpresa = ? "
                + "WHERE idUserEmpresa = " + id;

        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt.setString(1, empresa.getTrabalhoEmpresa());
            stmt.setString(2, empresa.getEstagioEmpresa());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no alterar Empresa: " + err);
        }
    }

}
