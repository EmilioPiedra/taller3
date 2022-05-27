import java.io.Serializable;

public class Weapon implements Serializable {
    private String name;
    private int supplies;

    public Weapon(String name, int supplies) {
        this.setName(name);
        this.setSupplies(supplies);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupplies() {
        return supplies;
    }

    public void setSupplies(int supplies) {
        this.supplies = supplies;
    }
}
