package entities;

/**
 *
 * @author Dmitry
 */
public class Parameter {
    
    private int id;
    private Type type;
    private String parameter;

    public Parameter() {
    }

    public Parameter(int id, Type type, String parameter) {
        this.id = id;
        this.type = type;
        this.parameter = parameter;
    }
    
    public Parameter(Type type, String parameter) {
        this.type = type;
        this.parameter = parameter;
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
     * @return the type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return the parameter
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * @param parameter the parameter to set
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
    
}
