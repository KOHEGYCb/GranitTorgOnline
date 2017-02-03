package dao;

import connectionPool.ConnectionPool;
import constants.Columns;
import constants.SqlRequest;
import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class UserDAO extends AbstractDao{
    
    private static UserDAO INSTANCE = new UserDAO();
    
    private UserDAO(){
    }
    
    public static UserDAO getINSTANCE(){
        return INSTANCE;
    }
    
    public boolean isUserFound(User user){
        boolean isFound = false;
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try{
            connection = ConnectionPool.getInstance().getConnection();
            statement = connection.prepareStatement(SqlRequest.GET_USER_BY_LOGIN);
            statement.setString(1, user.getLogin());
            result = statement.executeQuery();
            if(result.next()){
                isFound = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeJDBC(connection, statement, result);
        }
        
        return isFound;
    }

    public User getUser(User user) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try{
            connection = ConnectionPool.getInstance().getConnection();
            statement = connection.prepareStatement(SqlRequest.GET_USER_BY_LOGIN);
            statement.setString(1, user.getLogin());
            result = statement.executeQuery();
            result.next();
            String password = result.getString(Columns.USERS_PASSWORD);
            if(user.getPassword().equals(password)){
                user.setId(result.getInt(Columns.USERS_ID));
                user.setPrivacy(result.getInt(Columns.USERS_PRIVACY));
            }else{
                user.setId(-1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeJDBC(connection, statement, result);
        }
        return user;
    }
}
