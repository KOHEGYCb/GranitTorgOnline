package dao;

import connectionPool.ConnectionPool;
import constants.Columns;
import constants.SqlRequest;
import entities.Parameter;
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
public class ParameterDAO extends AbstractDao {

    private static ParameterDAO INSTANCE = new ParameterDAO();

    private ParameterDAO() {
    }

    public static ParameterDAO getINSTANCE() {
        return INSTANCE;
    }

    public void create(Parameter parameter) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionPool.getInstance().getConnection();
            statement = connection.prepareStatement(SqlRequest.CREATE_PARAMETER);
            statement.setInt(1, parameter.getType().getId());
            statement.setString(2, parameter.getName());
        } catch (SQLException ex) {
            Logger.getLogger(ParameterDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeJDBC(connection, statement);
        }
    }

    public boolean isFound(Parameter parameter) {
        boolean isFound = false;

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            connection = ConnectionPool.getInstance().getConnection();
            statement = connection.prepareStatement(SqlRequest.GET_PARAMETER_BY_NAME);
            statement.setString(1, parameter.getName());
            result = statement.executeQuery();
            if (result.next()) {
                isFound = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ParameterDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeJDBC(connection, statement, result);
        }

        return isFound;
    }

}
