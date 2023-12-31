package METODOS;

import CONEXAO.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import VARIAVEIS.User;
import METODOS.PERFIL.*;
import VARIAVEIS.PERFIL.*;

public class MEUser {

    private Connection conexao;

    public MEUser() {
        this.conexao = new Conectar().getConexao();
    }

    public void inserir(User user, Autonomo a, Colaborador c, Empresa e, JAprendiz ja) {
        String sql;

        switch (user.getTipoUser()) {

            case "Autônomo":
                sql = "INSERT INTO user(cpfUser, cnpjUser, nomeUser, tipoUser, telefoneUser, "
                        + "emailUser, estadoUser, cidadeUser, bairroUser, bioUser, senhaUser) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?);";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    stmt.setString(1, user.getCpfUser());
                    stmt.setString(2, null);
                    stmt.setString(3, user.getNomeUser());
                    stmt.setString(4, user.getTipoUser());
                    stmt.setString(5, user.getTelefoneUser());
                    stmt.setString(6, user.getEmailUser());
                    stmt.setString(7, user.getEstadoUser());
                    stmt.setString(8, user.getCidadeUser());
                    stmt.setString(9, user.getBairroUser());
                    stmt.setString(10, null);
                    stmt.setString(11, user.getSenhaUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no inserir user: " + err);
                }

                ArrayList<User> idA = pesquisarId(user.getEmailUser(), user.getSenhaUser());
                for (User u : idA) {
                    MEAutonomo meAu = new MEAutonomo();
                    meAu.inserir(a, Integer.parseInt(u.getIdUser()));
                }
                break;

            case "Colaborador":
                sql = "INSERT INTO user(cpfUser, cnpjUser, nomeUser, tipoUser, telefoneUser, "
                        + "emailUser, estadoUser, cidadeUser, bairroUser, bioUser, senhaUser) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?);";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    stmt.setString(1, user.getCpfUser());
                    stmt.setString(2, null);
                    stmt.setString(3, user.getNomeUser());
                    stmt.setString(4, user.getTipoUser());
                    stmt.setString(5, user.getTelefoneUser());
                    stmt.setString(6, user.getEmailUser());
                    stmt.setString(7, user.getEstadoUser());
                    stmt.setString(8, user.getCidadeUser());
                    stmt.setString(9, user.getBairroUser());
                    stmt.setString(10, null);
                    stmt.setString(11, user.getSenhaUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no inserir user: " + err);
                }

                ArrayList<User> idC = pesquisarId(user.getEmailUser(), user.getSenhaUser());
                for (User u : idC) {
                    MEColaborador meCo = new MEColaborador();
                    meCo.inserir(c, Integer.parseInt(u.getIdUser()));
                }
                break;

            case "Empresa":
                sql = "INSERT INTO user(cpfUser, cnpjUser, nomeUser, tipoUser, telefoneUser, "
                        + "emailUser, estadoUser, cidadeUser, bairroUser, bioUser, senhaUser) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?);";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    stmt.setString(1, null);
                    stmt.setString(2, user.getCnpjUser());
                    stmt.setString(3, user.getNomeUser());
                    stmt.setString(4, user.getTipoUser());
                    stmt.setString(5, user.getTelefoneUser());
                    stmt.setString(6, user.getEmailUser());
                    stmt.setString(7, user.getEstadoUser());
                    stmt.setString(8, user.getCidadeUser());
                    stmt.setString(9, user.getBairroUser());
                    stmt.setString(10, null);
                    stmt.setString(11, user.getSenhaUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no inserir user: " + err);
                }

                ArrayList<User> idE = pesquisarId(user.getEmailUser(), user.getSenhaUser());
                for (User u : idE) {
                    MEEmpresa meEmp = new MEEmpresa();
                    meEmp.inserir(e, Integer.parseInt(u.getIdUser()));
                }
                break;

            case "Jovem Aprendiz":
                sql = "INSERT INTO user(cpfUser, cnpjUser, nomeUser, tipoUser, telefoneUser, "
                        + "emailUser, estadoUser, cidadeUser, bairroUser, bioUser, senhaUser) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?);";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    stmt.setString(1, user.getCpfUser());
                    stmt.setString(2, null);
                    stmt.setString(3, user.getNomeUser());
                    stmt.setString(4, user.getTipoUser());
                    stmt.setString(5, user.getTelefoneUser());
                    stmt.setString(6, user.getEmailUser());
                    stmt.setString(7, user.getEstadoUser());
                    stmt.setString(8, user.getCidadeUser());
                    stmt.setString(9, user.getBairroUser());
                    stmt.setString(10, null);
                    stmt.setString(11, user.getSenhaUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no inserir user: " + err);
                }

                ArrayList<User> idJA = pesquisarId(user.getEmailUser(), user.getSenhaUser());
                for (User u : idJA) {
                    MEJAprendiz meJa = new MEJAprendiz();
                    meJa.inserir(ja, Integer.parseInt(u.getIdUser()));
                }
                break;
        }
    }

    public boolean pesquisarEmailSenha(String email, String senha) {
        ArrayList<User> users = new ArrayList();
        User u = new User();
        boolean certo = false;

        String sql = "SELECT cpfUser, cnpjUser FROM user WHERE emailUser "
                + "LIKE \"" + email + "\" AND senhaUser LIKE \"" + senha + "\";";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                u.setCpfUser(rs.getString("cpfUser"));
                u.setCnpjUser(rs.getString("cnpjUser"));
                users.add(u);
                stmt.execute();

            }

            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar login do user: " + err);
        }

        if (!users.isEmpty()) {
            certo = true;
        }
        return certo;
    }

    public ArrayList pesquisarId(String email, String senha) {
        ArrayList<User> user = new ArrayList();
        User u;
        String sql = "SELECT idUser, tipoUser FROM user WHERE emailUser LIKE \"" + email
                + "\" AND senhaUser LIKE \"" + senha + "\";";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                u = new User();
                u.setIdUser(rs.getString("idUser"));
                u.setTipoUser(rs.getString("tipoUser"));
                user.add(u);
                stmt.execute();
            }
            stmt.close();

        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar id do user" + err);
        }
        return user;
    }

    public ArrayList pesquisarUser(int id) {
        ArrayList<User> user = new ArrayList();
        User u;
        String sql = "SELECT * FROM user WHERE idUser = " + id + ";";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                u = new User();
                u.setCpfUser(rs.getString("cpfUser"));
                u.setCnpjUser(rs.getString("cnpjUser"));
                u.setNomeUser(rs.getString("nomeUser"));
                u.setTipoUser(rs.getString("tipoUser"));
                u.setTelefoneUser(rs.getString("telefoneUser"));
                u.setEmailUser(rs.getString("emailUser"));
                u.setEstadoUser(rs.getString("estadoUser"));
                u.setCidadeUser(rs.getString("cidadeUser"));
                u.setBairroUser(rs.getString("bairroUser"));
                u.setDataUser(rs.getString("dataUser"));
                u.setFilhoUser(rs.getString("filhoUser"));
                u.setBioUser(rs.getString("bioUser"));
                u.setFotoUser(rs.getString("fotoUser"));
                user.add(u);
                stmt.execute();
            }
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar User: " + err);
        }
        return user;
    }

    public void alterar(User user, Autonomo a, Colaborador c, Empresa e, JAprendiz ja,
            int id, String tipo) {
        String sql;
        switch (tipo) {
            case "Autônomo":
                sql = "UPDATE user SET nomeUser = ?, cpfUser = ?, telefoneUser = ?, "
                        + "emailUser = ?, estadoUser = ?, cidadeUser = ?, bairroUser = ?, "
                        + "dataUser = ?, filhoUser = ?, bioUser = ? WHERE idUser = " + id + ";";

                try {
                    PreparedStatement stmt = conexao.prepareCall(sql);
                    stmt.setString(1, user.getNomeUser());
                    stmt.setString(2, user.getCpfUser());
                    stmt.setString(3, user.getTelefoneUser());
                    stmt.setString(4, user.getEmailUser());
                    stmt.setString(5, user.getEstadoUser());
                    stmt.setString(6, user.getCidadeUser());
                    stmt.setString(7, user.getBairroUser());
                    stmt.setString(8, user.getDataUser());
                    stmt.setString(9, user.getFilhoUser());
                    stmt.setString(10, user.getBioUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no alterar do Autonomo: " + err);
                }

                MEAutonomo meAu = new MEAutonomo();
                meAu.alterar(a, id);
                break;

            case "Colaborador":
                sql = "UPDATE user SET nomeUser = ?, cpfUser = ?, telefoneUser = ?, "
                        + "emailUser = ?, estadoUser = ?, cidadeUser = ?, bairroUser = ?, "
                        + "dataUser = ?, filhoUser = ?, bioUser = ? WHERE idUser = " + id + ";";

                try {
                    PreparedStatement stmt = conexao.prepareCall(sql);
                    stmt.setString(1, user.getNomeUser());
                    stmt.setString(2, user.getCpfUser());
                    stmt.setString(3, user.getTelefoneUser());
                    stmt.setString(4, user.getEmailUser());
                    stmt.setString(5, user.getEstadoUser());
                    stmt.setString(6, user.getCidadeUser());
                    stmt.setString(7, user.getBairroUser());
                    stmt.setString(8, user.getDataUser());
                    stmt.setString(9, user.getFilhoUser());
                    stmt.setString(10, user.getBioUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no alterar do Colaborador: " + err);
                }

                MEColaborador mecol = new MEColaborador();
                mecol.alterar(c, id);
                break;

            case "Empresa":
                sql = "UPDATE user SET nomeUser = ?, cnpjUser = ?, telefoneUser = ?, "
                        + "emailUser = ?, estadoUser = ?, cidadeUser = ?, bairroUser = ?, "
                        + " bioUser = ? WHERE idUser = " + id + ";";

                try {
                    PreparedStatement stmt = conexao.prepareCall(sql);
                    stmt.setString(1, user.getNomeUser());
                    stmt.setString(2, user.getCnpjUser());
                    stmt.setString(3, user.getTelefoneUser());
                    stmt.setString(4, user.getEmailUser());
                    stmt.setString(5, user.getEstadoUser());
                    stmt.setString(6, user.getCidadeUser());
                    stmt.setString(7, user.getBairroUser());
                    stmt.setString(8, user.getBioUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no alterar da Empresa: " + err);
                }

                MEEmpresa meemp = new MEEmpresa();
                meemp.alterar(e, id);
                break;

            case "Jovem Aprendiz":
                sql = "UPDATE user SET nomeUser = ?, cpfUser = ?, telefoneUser = ?, "
                        + "emailUser = ?, estadoUser = ?, cidadeUser = ?, bairroUser = ?, "
                        + "dataUser = ?, bioUser = ? WHERE idUser = " + id + ";";

                try {
                    PreparedStatement stmt = conexao.prepareCall(sql);
                    stmt.setString(1, user.getNomeUser());
                    stmt.setString(2, user.getCpfUser());
                    stmt.setString(3, user.getTelefoneUser());
                    stmt.setString(4, user.getEmailUser());
                    stmt.setString(5, user.getEstadoUser());
                    stmt.setString(6, user.getCidadeUser());
                    stmt.setString(7, user.getBairroUser());
                    stmt.setString(8, user.getDataUser());
                    stmt.setString(9, user.getBioUser());
                    stmt.execute();
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no alterar do JAprendiz: " + err);
                }

                MEJAprendiz meja = new MEJAprendiz();
                meja.alterar(ja, id);
                break;
        }

    }

    public void alterarFoto(int id, String nomeFoto) {
        String sql = "UPDATE user SET fotoUser = ? WHERE idUser = " + id + ";";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nomeFoto);
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no alterar imagem: " + err);
        }
    }
}
