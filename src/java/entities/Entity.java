package entities;

/**
 *
 * @author Dmitry
 */
public class Entity {

    private int id;
    private Parameter parameter;
    private int kol;
    private Place place;
    private int reserv;

    public Entity() {
    }

    public Entity(int id, Parameter parameter, int kol, Place place, int reserv) {
        this.id = id;
        this.parameter = parameter;
        this.kol = kol;
        this.place = place;
        this.reserv = reserv;
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
     * @return the parameter
     */
    public Parameter getParameter() {
        return parameter;
    }

    /**
     * @param parameter the parameter to set
     */
    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    /**
     * @return the kol
     */
    public int getKol() {
        return kol;
    }

    /**
     * @param kol the kol to set
     */
    public void setKol(int kol) {
        this.kol = kol;
    }

    /**
     * @return the place
     */
    public Place getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(Place place) {
        this.place = place;
    }

    /**
     * @return the reserv
     */
    public int getReserv() {
        return reserv;
    }

    /**
     * @param reserv the reserv to set
     */
    public void setReserv(int reserv) {
        this.reserv = reserv;
    }
    
    
    
}
