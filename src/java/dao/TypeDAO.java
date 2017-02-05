package dao;

import entities.Type;

/**
 *
 * @author Dmitry
 */
class TypeDAO extends AbstractDao {

    private static TypeDAO INSTANCE = new TypeDAO();

    private TypeDAO() {
    }

    public static TypeDAO getINSTANCE() {
        return INSTANCE;
    }

    public Type getType(int id){
        Type type = null;
        
        return type;
    }
    
}
