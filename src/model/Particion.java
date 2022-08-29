package model;

/**
 *
 * @author eyanez
 */
public class Particion {
    private int id;
    private String x;
    private String fx;
    private String res;

    public Particion() {
    }

    public Particion(int id, String x, String fx, String res) {
        this.id = id;
        this.x = x;
        this.fx = fx;
        this.res = res;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
}
