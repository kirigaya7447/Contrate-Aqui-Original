package VARIAVEIS.PERFIL;

public class Colaborador {

    private String idColaborador;
    private String idUserColaborador;
    private String areaColaborador;
    private String situacaoColaborador;

    public Colaborador() {

    }

    public void Colaborador(String idColaborador,
            String idUserColaborador,
            String areaColaborador,
            String situacaoColaborador) {
        this.idColaborador = idColaborador;
        this.idUserColaborador = idUserColaborador;
        this.areaColaborador = areaColaborador;
        this.situacaoColaborador = situacaoColaborador;
    }

    public String getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(String idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getIdUserColaborador() {
        return idUserColaborador;
    }

    public void setIdUserColaborador(String idUserColaborador) {
        this.idUserColaborador = idUserColaborador;
    }

    public String getAreaColaborador() {
        return areaColaborador;
    }

    public void setAreaColaborador(String areaColaborador) {
        this.areaColaborador = areaColaborador;
    }

    public String getSituacaoColaborador() {
        return situacaoColaborador;
    }

    public void setSituacaoColaborador(String situacaoColaborador) {
        this.situacaoColaborador = situacaoColaborador;
    }

    @Override
    public String toString() {
        String tudo = "Id: " + idColaborador + "\n"
                + "IdUser: " + idUserColaborador + "\n"
                + "Area: " + areaColaborador + "\n"
                + "Situação: " + situacaoColaborador + "\n";
        return tudo;
    }
}
