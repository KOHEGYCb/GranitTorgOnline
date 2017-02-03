package dao;

import connectionPool.ConnectionPool;
import constants.SqlRequest;
import entities.Place;
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
public class PlaceDAO extends AbstractDao{
    
    private static PlaceDAO INSTANCE = new PlaceDAO();
    
    private PlaceDAO(){}
    
    public static PlaceDAO getINSTANCE(){
        return INSTANCE;
    }
    
    public void create(Place place){
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = ConnectionPool.getInstance().getConnection();
            statement = connection.prepareStatement(SqlRequest.CREATE_PLACE);
            statement.setString(1, place.getName());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PlaceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeJDBC(connection, statement);
        }
    }
    
    public boolean isFound(Place place){
        boolean isFound = false;
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        
        try{
            connection = ConnectionPool.getInstance().getConnection();
            statement = connection.prepareStatement(SqlRequest.GET_PLACE);
            statement.setString(1, place.getName());
            result = statement.executeQuery();
            if(result.next()){
                isFound = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PlaceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeJDBC(connection, statement, result);
        }
        
        return isFound;
    }
}
