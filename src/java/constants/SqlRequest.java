package constants;

/**
 *
 * @author Dmitry
 */
public class SqlRequest {

    public static final String CREATE_PLACE = "INSERT INTO place (name) VALUE (?)";

    public static final String GET_USER_BY_LOGIN = "SELECT * FROM users WHERE login = ?";
    public static final String GET_PLACE = "SELECT * FROM place WHERE name = ?";

    private SqlRequest() {
    }

}
