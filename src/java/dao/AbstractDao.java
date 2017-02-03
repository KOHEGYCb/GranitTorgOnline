package dao;

import connectionPool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dmitry
 */
public abstract class AbstractDao {
        protected void closeJDBC(Connection connection, PreparedStatement statement, ResultSet result) {
        try {
            if (result != null) {
                result.close();
            }
        } catch (SQLException e) {
        }
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
        }
        if (connection != null) {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
    }

    protected void closeJDBC(Connection connection, PreparedStatement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
        }
        if (connection != null) {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
    }
}
