package VARIAVEIS;

public class Posts {

    private String idPost;
    private String idUserPost;
    private String emailPost;
    private String dataPost;
    private String tempPost;
    private String textoPost;
    private String nomeInteressadosPost;
    private String numInteressadosPost;
    private String finalizadoPost;
    private String imagemPost;
    private String publicoPost;
    private String apagadoPost;

    public Posts() {

    }

    public Posts(String idPost, 
            String idUserPost, 
            String emailPost, 
            String dataPost, 
            String tempPost,
            String textoPost, 
            String nomeInteressadosPost, 
            String numInteressadosPost,
            String finalizadoPost, 
            String imagemPost, 
            String publicoPost, 
            String apagadoPost) {
        this.idPost = idPost;
        this.idUserPost = idUserPost;
        this.emailPost = emailPost;
        this.dataPost = dataPost;
        this.tempPost = tempPost;
        this.textoPost = textoPost;
        this.nomeInteressadosPost = nomeInteressadosPost;
        this.numInteressadosPost = numInteressadosPost;
        this.finalizadoPost = finalizadoPost;
        this.imagemPost = imagemPost;
        this.publicoPost = publicoPost;
        this.apagadoPost = apagadoPost;
    }

    public String getIdPost() {
        return idPost;
    }

    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }

    public String getIdUserPost() {
        return idUserPost;
    }

    public void setIdUserPost(String idUserPost) {
        this.idUserPost = idUserPost;
    }

    public String getEmailPost() {
        return emailPost;
    }

    public void setEmailPost(String emailPost) {
        this.emailPost = emailPost;
    }

    public String getDataPost() {
        return dataPost;
    }

    public void setDataPost(String dataPost) {
        this.dataPost = dataPost;
    }

    public String getTempPost() {
        return tempPost;
    }

    public void setTempPost(String tempPost) {
        this.tempPost = tempPost;
    }

    public String getTextoPost() {
        return textoPost;
    }

    public void setTextoPost(String textoPost) {
        this.textoPost = textoPost;
    }

    public String getNomeInteressadosPost() {
        return nomeInteressadosPost;
    }

    public void setNomeInteressadosPost(String nomeInteressadosPost) {
        this.nomeInteressadosPost = nomeInteressadosPost;
    }

    public String getNumInteressadosPost() {
        return numInteressadosPost;
    }

    public void setNumInteressadosPost(String numInteressadosPost) {
        this.numInteressadosPost = numInteressadosPost;
    }

    public String getFinalizadoPost() {
        return finalizadoPost;
    }

    public void setFinalizadoPost(String finalizadoPost) {
        this.finalizadoPost = finalizadoPost;
    }

    public String getImagemPost() {
        return imagemPost;
    }

    public void setImagemPost(String imagemPost) {
        this.imagemPost = imagemPost;
    }

    public String getPublicoPost() {
        return publicoPost;
    }

    public void setPublicoPost(String publicoPost) {
        this.publicoPost = publicoPost;
    }

    public String getApagadoPost() {
        return apagadoPost;
    }

    public void setApagadoPost(String apagadoPost) {
        this.apagadoPost = apagadoPost;
    }

    @Override
    public String toString() {
        String tudo = ("Id: " + idPost + "\n"
                + "IdUser: " + idUserPost + "\n"
                + "Data: " + dataPost + "\n"
                + "Temp: " + tempPost + "\n"
                + "Texto: " + textoPost + "\n"
                + "Nome dos interessados: " + nomeInteressadosPost + "\n"
                + "Finalizado: " + finalizadoPost + "\n"
                + "Imagem: " + imagemPost + "\n"
                + "Publico: " + publicoPost);
        return tudo;
    }

}
