package VARIAVEIS.PERFIL;

public class Autonomo {

    private String idAutonomo;
    private String idUserAutonomo;
    private String profissaoAutonomo;
    private String avaliacaoAutonomo;

    public Autonomo() {

    }

    public void Autonomo(String idAutonomo,
            String idUserAutonomo,
            String profissaoAutonomo,
            String avaliacaoAutonomo) {
        this.idAutonomo = idAutonomo;
        this.idUserAutonomo = idUserAutonomo;
        this.profissaoAutonomo = profissaoAutonomo;
        this.avaliacaoAutonomo = avaliacaoAutonomo;
    }

    public String getIdAutonomo() {
        return idAutonomo;
    }

    public void setIdAutonomo(String idAutonomo) {
        this.idAutonomo = idAutonomo;
    }

    public String getIdUserAutonomo() {
        return idUserAutonomo;
    }

    public void setIdUserAutonomo(String idUserAutonomo) {
        this.idUserAutonomo = idUserAutonomo;
    }

    public String getProfissaoAutonomo() {
        return profissaoAutonomo;
    }

    public void setProfissaoAutonomo(String profissaoAutonomo) {
        this.profissaoAutonomo = profissaoAutonomo;
    }

    public String getAvaliacaoAutonomo() {
        return avaliacaoAutonomo;
    }

    public void setAvaliacaoAutonomo(String avaliacaoAutonomo) {
        this.avaliacaoAutonomo = avaliacaoAutonomo;
    }

    @Override
    public String toString() {
        String tudo = "Id: " + idAutonomo + "\n"
                + "IdUser: " + idUserAutonomo + "\n"
                + "Profissao: " + profissaoAutonomo + "\n"
                + "Avaliacao: " + avaliacaoAutonomo + "\n";
        return tudo;
    }
}
