package cl.devweb.model.devwebish;

public class Account {

    private String username;
    private String password;
    private String shipping_rut;
    private User user;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShipping_rut() {
        return shipping_rut;
    }

    public void setShipping_rut(String shipping_rut) {
        this.shipping_rut = shipping_rut;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "cl.devweb.model.devwebish.Account[ id=" + username + " ]";
    }

}
