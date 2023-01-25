package Model;

public class Hobbies {
    String h_name;
    int id;

    public Hobbies(String h_name, int id) {
        this.h_name = h_name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }
}
