package VARIAVEIS.PERFIL;

public class Empresa {

    private String idEmpresa;
    private String idUserEmpresa;
    private String trabalhoEmpresa;
    private String estagioEmpresa;
    private String avaliacaoEmpresa;
    private String numAvaliacaoEmpresa;

    public Empresa() {

    }

    public Empresa(String idEmpresa,
            String idUserEmpresa,
            String trabalhoEmpresa,
            String estagioEmpresa,
            String avaliacaoEmpresa,
            String numAvaliacaoEmpresa) {
        this.idEmpresa = idEmpresa;
        this.idUserEmpresa = idUserEmpresa;
        this.trabalhoEmpresa = trabalhoEmpresa;
        this.estagioEmpresa = estagioEmpresa;
        this.avaliacaoEmpresa = avaliacaoEmpresa;
        this.numAvaliacaoEmpresa = numAvaliacaoEmpresa;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getIdUserEmpresa() {
        return idUserEmpresa;
    }

    public void setIdUserEmpresa(String idUserEmpresa) {
        this.idUserEmpresa = idUserEmpresa;
    }

    public String getTrabalhoEmpresa() {
        return trabalhoEmpresa;
    }

    public void setTrabalhoEmpresa(String trabalhoEmpresa) {
        this.trabalhoEmpresa = trabalhoEmpresa;
    }

    public String getEstagioEmpresa() {
        return estagioEmpresa;
    }

    public void setEstagioEmpresa(String estagioEmpresa) {
        this.estagioEmpresa = estagioEmpresa;
    }

    public String getAvaliacaoEmpresa() {
        return avaliacaoEmpresa;
    }

    public void setAvaliacaoEmpresa(String avaliacaoEmpresa) {
        this.avaliacaoEmpresa = avaliacaoEmpresa;
    }

    public String getNumAvaliacaoEmpresa() {
        return numAvaliacaoEmpresa;
    }

    public void setnumNumAvaliacaoEmpresa(String numAvaliacaoEmpresa) {
        this.numAvaliacaoEmpresa = numAvaliacaoEmpresa;
    }

    @Override
    public String toString() {
        String tudo = "Id: " + idEmpresa + "\n"
                + "IdUser: " + idUserEmpresa + "\n"
                + "Trabalho: " + trabalhoEmpresa + "\n"
                + "Estagio: " + estagioEmpresa;
        return tudo;
    }
}
