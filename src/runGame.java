import java.io.*;
import java.sql.SQLOutput;
import java.util.Optional;

public class runGame {
    public static void main(String[] args) {
        Player p1 = new Player("Emilio Piedra", "Emilio14", 300, 3);
        Character c1 = new Character( "Goku");
        Weapon arma = new Weapon("Pistola",20);
        c1.addWeapon(arma);
        p1.setCharacter(c1);
        serialize(p1);
        Player p2 = desearilize();
        System.out.println(p2.getLives());
        System.out.println(p2.getCharacter().getName());
        System.out.println(p2.getCharacter().addWeapon());

    }
    //Serializacion
    private static void serialize(Player player) {
        try {
            //se crea la caperta
            FileOutputStream file = new FileOutputStream("p1.user");
            ObjectOutputStream out = new ObjectOutputStream(file);
            //se le envia el objeto
            out.writeObject(player);
            //
            out.close();
            file.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

// Deserialization
private static Player desearilize () {
        Player obj = null;
        try {
        FileInputStream file = new FileInputStream("p1.user");
        ObjectInputStream  in = new ObjectInputStream(file);
        //
        obj =(Player) in.readObject();
        //
        in.close();
        file.close();
    } catch (IOException | ClassNotFoundException ioe) {
        ioe.printStackTrace();
    }
        return  obj;
}
}
