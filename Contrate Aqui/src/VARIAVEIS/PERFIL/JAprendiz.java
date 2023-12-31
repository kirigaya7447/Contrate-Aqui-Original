package VARIAVEIS.PERFIL;

public class JAprendiz {

    private String idAprendiz;
    private String idUserAprendiz;
    private String instituicaoAprendiz;
    private String areaAprendiz;

    public JAprendiz() {

    }

    public JAprendiz(String idAprendiz,
            String idUserAprendiz,
            String instituicaoAprendiz,
            String areaAprendiz) {
        this.idAprendiz = idAprendiz;
        this.idUserAprendiz = idUserAprendiz;
        this.instituicaoAprendiz = instituicaoAprendiz;
        this.areaAprendiz = areaAprendiz;
    }

    public String getIdAprendiz() {
        return idAprendiz;
    }

    public void setIdAprendiz(String idAprendiz) {
        this.idAprendiz = idAprendiz;
    }

    public String getIdUserAprendiz() {
        return idUserAprendiz;
    }

    public void setIdUserAprendiz(String idUserAprendiz) {
        this.idUserAprendiz = idUserAprendiz;
    }

    public String getInstituicaoAprendiz() {
        return instituicaoAprendiz;
    }

    public void setInstituicaoAprendiz(String instituicaoAprendiz) {
        this.instituicaoAprendiz = instituicaoAprendiz;
    }

    public String getAreaAprendiz() {
        return areaAprendiz;
    }

    public void setAreaAprendiz(String areaAprendiz) {
        this.areaAprendiz = areaAprendiz;
    }

    @Override
    public String toString() {
        String tudo = "Id: " + idAprendiz + "\n"
                + "IdUser: " + idUserAprendiz + "\n"
                + "Instituicao: " + instituicaoAprendiz + "\n"
                + "Area: " + areaAprendiz + "\n";
        return tudo;
    }

}
