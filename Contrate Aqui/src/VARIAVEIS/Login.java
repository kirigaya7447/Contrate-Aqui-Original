package VARIAVEIS;

public class Login {

    private String idLogin;
    private String idUserLogin;
    private String tipoLogin;
    private String horaLogin;

    public Login() {

    }

    public Login(String idLogin, String idUserLogin, String tipoLogin, String horaLogin) {
        this.idLogin = idLogin;
        this.idUserLogin = idUserLogin;
        this.tipoLogin = tipoLogin;
        this.horaLogin = horaLogin;
    }

    public String getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(String idLogin) {
        this.idLogin = idLogin;
    }

    public String getIdUserLogin() {
        return idUserLogin;
    }

    public void setIdUserLogin(String idUserLogin) {
        this.idUserLogin = idUserLogin;
    }

    public String getTipoLogin() {
        return tipoLogin;
    }

    public void setTipoLogin(String tipoLogin) {
        this.tipoLogin = tipoLogin;
    }

    public String getHoraLogin() {
        return horaLogin;
    }

    public void setHoraLogin(String horaLogin) {
        this.horaLogin = horaLogin;
    }

    @Override
    public String toString() {
        String tudo = "Id: " + idLogin + "\n"
                + "IdUser: " + idUserLogin + "\n"
                + "Tipo: " + tipoLogin + "\n"
                + "Temp: " + horaLogin + "\n";
        return tudo;
    }
}
