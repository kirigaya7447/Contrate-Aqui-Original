package METODOS;

import CONEXAO.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import VARIAVEIS.Posts;
import VARIAVEIS.User;

public class MEPosts {

    private Connection conexao;

    public MEPosts() {
        this.conexao = new Conectar().getConexao();
    }

    public void inserir(Posts post) {
        String sql = "INSERT INTO posts(idUserPost, emailPost, dataPost, tempPost, textoPost, "
                + "finalizadoPost, imagemPost, publicoPost, numInteressadoPost, apagadoPost) VALUES(?,?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, post.getIdUserPost());
            stmt.setString(2, post.getEmailPost());
            stmt.setString(3, post.getDataPost());
            stmt.setString(4, "Não");
            stmt.setString(5, post.getTextoPost());
            stmt.setString(6, "Não");
            stmt.setString(7, post.getImagemPost());
            stmt.setString(8, post.getPublicoPost());
            stmt.setString(9, "0");
            stmt.setString(10, "Não");
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no inserir post: " + err);
        }
    }

    public void inserirTemporario(Posts post) {
        String sql = "INSERT INTO posts(idUserPost, emailPost, dataPost, tempPost, textoPost, "
                + "finalizadoPost, imagemPost, publicoPost, numInteressadoPost) VALUES(?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, post.getIdUserPost());
            stmt.setString(2, post.getEmailPost());
            stmt.setString(3, post.getDataPost());
            stmt.setString(4, "Sim");
            stmt.setString(5, post.getTextoPost());
            stmt.setString(6, "Não");
            stmt.setString(7, post.getImagemPost());
            stmt.setString(8, post.getPublicoPost());
            stmt.setString(9, "0");
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no inserir post: " + err);
        }
    }

    public ArrayList carregar(String tipo) {
        ArrayList<Posts> posts = new ArrayList();
        String sql;
        Posts p;
        switch (tipo) {
            case "Autônomo":
                sql = "SELECT * FROM posts WHERE publicoPost LIKE \"%Autônomo%\" AND finalizadoPost LIKE \"Não\" AND apagadoPost LIKE \"Não\" ORDER BY dataPost DESC;";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        p = new Posts();
                        p.setIdUserPost(rs.getString("idUserPost"));
                        p.setEmailPost(rs.getString("emailPost"));
                        p.setDataPost(rs.getString("dataPost"));
                        p.setTextoPost(rs.getString("textoPost"));
                        p.setNumInteressadosPost(rs.getString("numInteressadoPost"));
                        p.setFinalizadoPost(rs.getString("finalizadoPost"));
                        p.setImagemPost(rs.getString("imagemPost"));
                        posts.add(p);
                        stmt.execute();
                    }
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no pesquisar posts Autônomo: " + err);
                }
                break;

            case "Colaborador":
                sql = "SELECT * FROM posts WHERE publicoPost LIKE \"%Colaborador%\" AND finalizadoPost LIKE \"Não\" AND apagadoPost LIKE \"Não\" ORDER BY dataPost DESC;";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        p = new Posts();
                        p.setIdUserPost(rs.getString("idUserPost"));
                        p.setEmailPost(rs.getString("emailPost"));
                        p.setDataPost(rs.getString("dataPost"));
                        p.setTextoPost(rs.getString("textoPost"));
                        p.setNumInteressadosPost(rs.getString("numInteressadoPost"));
                        p.setFinalizadoPost(rs.getString("finalizadoPost"));
                        p.setImagemPost(rs.getString("imagemPost"));
                        posts.add(p);
                        stmt.execute();
                    }
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no pesquisar posts Colaborador: " + err);
                }
                break;

            case "Empresa":
                sql = "SELECT * FROM posts WHERE publicoPost LIKE \"%Empresa%\" AND finalizadoPost LIKE \"Não\" AND apagadoPost LIKE \"Não\" ORDER BY dataPost DESC;";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        p = new Posts();
                        p.setIdUserPost(rs.getString("idUserPost"));
                        p.setEmailPost(rs.getString("emailPost"));
                        p.setDataPost(rs.getString("dataPost"));
                        p.setTextoPost(rs.getString("textoPost"));
                        p.setNumInteressadosPost(rs.getString("numInteressadoPost"));
                        p.setFinalizadoPost(rs.getString("finalizadoPost"));
                        p.setImagemPost(rs.getString("imagemPost"));
                        posts.add(p);
                        stmt.execute();
                    }
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no pesquisar posts Empresa: " + err);
                }
                break;

            case "Jovem Aprendiz":
                sql = "SELECT * FROM posts WHERE publicoPost LIKE \"%Jovem Aprendiz%\" AND finalizadoPost LIKE \"Não\" AND apagadoPost LIKE \"Não\" ORDER BY dataPost DESC;";

                try {
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        p = new Posts();
                        p.setIdUserPost(rs.getString("idUserPost"));
                        p.setEmailPost(rs.getString("emailPost"));
                        p.setDataPost(rs.getString("dataPost"));
                        p.setTextoPost(rs.getString("textoPost"));
                        p.setNumInteressadosPost(rs.getString("numInteressadoPost"));
                        p.setFinalizadoPost(rs.getString("finalizadoPost"));
                        p.setImagemPost(rs.getString("imagemPost"));
                        posts.add(p);
                        stmt.execute();
                    }
                    stmt.close();
                } catch (SQLException err) {
                    throw new RuntimeException("Erro no pesquisar posts JAprendiz: " + err);
                }
                break;
        }
        return posts;
    }

    public ArrayList pesquisarId(String email, String data) {
        ArrayList<Posts> id = new ArrayList();
        String sql = "SELECT idPost FROM posts WHERE emailPost LIKE \"" + email + "\""
                + "AND dataPost LIKE \"" + data + "\";";
        Posts p;

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Posts();
                p.setIdPost(rs.getString("idPost"));
                id.add(p);
                stmt.execute();
            }
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no pesquisar id post: " + err);
        }
        System.out.println("Pesquisou o id");
        return id;
    }

    public ArrayList verPost(int id) {
        ArrayList<Posts> post = new ArrayList();
        String sql = "SELECT * FROM posts WHERE idPost = "+  id + ";";
        Posts p;

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Posts();
                p.setDataPost(rs.getString("dataPost"));
                p.setEmailPost(rs.getString("EmailPost"));
                p.setFinalizadoPost(rs.getString("FinalizadoPost"));
                p.setImagemPost(rs.getString("imagemPost"));
                p.setTextoPost(rs.getString("textoPost"));
                p.setNomeInteressadosPost(rs.getString("nomeInteressadoPost"));
                p.setNumInteressadosPost(rs.getString("numInteressadoPost"));
                post.add(p);
                stmt.execute();
            }
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no ver post: " + err);
        }
        return post;
    }

    public void interessadoNoPost(String id, String interesse, String email) {
        String sql = "UPDATE posts SET numInteressadoPost = ?, nomeInteressadoPost = ? "
                + "WHERE idPost = " + id + ";";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, interesse);
            stmt.setString(2, email + "/");
            stmt.execute();
            stmt.close();
        } catch (SQLException err) {
            throw new RuntimeException("Erro no interessado: " + err);
        }
    }

    public ArrayList verPerfil(String email) {
        ArrayList<User> user = new ArrayList();
        String sql = "SELECT * FROM user WHERE emailUser LIKE \"" + email + "\";";
        User u;

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                u = new User();
                u.setIdUser(rs.getString("idUser"));
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
            throw new RuntimeException("Erro no pesquisar user do posts: " + err);
        }
        return user;
    }

}
