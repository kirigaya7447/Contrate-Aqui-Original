package METODOS.PERFIL;

import CONEXAO.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import VARIAVEIS.PERFIL.JAprendiz;

public class MEJAprendiz {
    
    private Connection conexao;
    
    public MEJAprendiz() {
        this.conexao = new Conectar().getConexao();
    }
    
    public void inserir(JAprendiz aprendiz, int id) {
        String sql = "INSERT INTO jovemaprendiz(idUserAprendiz, instituicaoAprendiz, areaAprendiz) "
                + "VALUES(?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, String.valueOf(id));
            stmt.setString(2, aprendiz.getInstituicaoAprendiz());
            stmt.setString(3, aprendiz.getAreaAprendiz());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no inserir aprendiz: " + err);
        }
    }
    
    public ArrayList pesquisarJAprendiz(int idApr) {
        ArrayList<JAprendiz> aprendiz = new ArrayList();
        JAprendiz a;
        String sql = "SELECT * FROM jovemaprendiz WHERE idUserAprendiz = " + idApr + ";";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                a = new JAprendiz();
                a.setAreaAprendiz(rs.getString("areaAprendiz"));
                a.setInstituicaoAprendiz(rs.getString("instituicaoAprendiz"));
                aprendiz.add(a);
                stmt.execute();
            }
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar Aprendiz: " + err);
        }
        return aprendiz;
    }
    
    public void alterar(JAprendiz aprendiz, int id) {
        String sql = "UPDATE jovemaprendiz SET areaAprendiz = ?, instituicaoAprendiz = ? "
                + "WHERE idUserAprendiz = " + id;
        
        try {
            PreparedStatement stmt = conexao.prepareCall(sql);
            stmt.setString(1, aprendiz.getAreaAprendiz());
            stmt.setString(2, aprendiz.getInstituicaoAprendiz());
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no alterar Aprendiz: " + err);
        }
    }
    
}
