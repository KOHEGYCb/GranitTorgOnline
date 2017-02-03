package entities;

/**
 *
 * @author Dmitry
 */
public class User {
    
    private int id;
    private String login;
    private String password;
    private int privacy;

    public User() {
    }

    public User(int id, String login, String password, int privacy) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.privacy = privacy;
    }
    
    public User(String login, String password, int privacy) {
        this.login = login;
        this.password = password;
        this.privacy = privacy;
    }
    
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the privacy
     */
    public int getPrivacy() {
        return privacy;
    }

    /**
     * @param privacy the privacy to set
     */
    public void setPrivacy(int privacy) {
        this.privacy = privacy;
    }
    
}
