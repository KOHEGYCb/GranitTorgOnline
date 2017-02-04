package entities;

/**
 *
 * @author Dmitry
 */
public class Parameter {
    
    private int id;
    private Type type;
    private String name;

    public Parameter() {
    }

    public Parameter(int id, Type type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }
    
    public Parameter(Type type, String name) {
        this.type = type;
        this.name = name;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
