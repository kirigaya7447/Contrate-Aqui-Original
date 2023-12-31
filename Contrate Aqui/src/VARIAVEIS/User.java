package VARIAVEIS;

public class User {

    private String idUser;
    private String cpfUser;
    private String cnpjUser;
    private String nomeUser;
    private String tipoUser;
    private String telefoneUser;
    private String emailUser;
    private String estadoUser;
    private String cidadeUser;
    private String bairroUser;
    private String dataUser;
    private String filhoUser;
    private String fotoUser;
    private String bioUser;
    private String experienciaUser;
    private String senhaUser;

    public User() {

    }

    public User(String idUser,
            String cpfUser,
            String cnpjUser,
            String nomeUser,
            String tipoUser,
            String telefoneUser,
            String emailUser,
            String estadoUser,
            String cidadeUser,
            String bairroUser,
            String dataUser,
            String filhoUser,
            String experienciaUser,
            String bioUser,
            String fotoUser,
            String senhaUser) {
        this.idUser = idUser;
        this.cpfUser = cpfUser;
        this.cnpjUser = cnpjUser;
        this.nomeUser = nomeUser;
        this.tipoUser = tipoUser;
        this.telefoneUser = telefoneUser;
        this.emailUser = emailUser;
        this.estadoUser = estadoUser;
        this.cidadeUser = cidadeUser;
        this.bairroUser = bairroUser;
        this.dataUser = dataUser;
        this.filhoUser = filhoUser;
        this.experienciaUser = experienciaUser;
        this.bioUser = bioUser;
        this.fotoUser = fotoUser;
        this.senhaUser = senhaUser;

    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getCpfUser() {
        return cpfUser;
    }

    public void setCpfUser(String cpfUser) {
        this.cpfUser = cpfUser;
    }

    public String getCnpjUser() {
        return cnpjUser;
    }

    public void setCnpjUser(String cnpjUser) {
        this.cnpjUser = cnpjUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getTelefoneUser() {
        return telefoneUser;
    }

    public void setTelefoneUser(String telefoneUser) {
        this.telefoneUser = telefoneUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getEstadoUser() {
        return estadoUser;
    }

    public void setEstadoUser(String estadoUser) {
        this.estadoUser = estadoUser;
    }

    public String getCidadeUser() {
        return cidadeUser;
    }

    public void setCidadeUser(String cidadeUser) {
        this.cidadeUser = cidadeUser;
    }

    public String getBairroUser() {
        return bairroUser;
    }

    public void setBairroUser(String bairroUser) {
        this.bairroUser = bairroUser;
    }

    public String getDataUser() {
        return dataUser;
    }

    public void setDataUser(String dataUser) {
        this.dataUser = dataUser;
    }

    public String getFilhoUser() {
        return filhoUser;
    }

    public void setFilhoUser(String filhoUser) {
        this.filhoUser = filhoUser;
    }

    public String getExperienciaUser() {
        return experienciaUser;
    }

    public void setExperienciaUser(String experienciaUser) {
        this.experienciaUser = experienciaUser;
    }

    public String getBioUser() {
        return bioUser;
    }

    public void setBioUser(String bioUser) {
        this.bioUser = bioUser;
    }

    public String getFotoUser() {
        return fotoUser;
    }

    public void setFotoUser(String fotoUser) {
        this.fotoUser = fotoUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }

}
