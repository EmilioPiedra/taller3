import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Character implements Serializable {
    private String name;
    private List<Weapon> weapons;

    public Character(String name) {
        this.setName(name);
        weapons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public void addWeapon (Weapon weapon){
        weapons.add(weapon);
}

}
