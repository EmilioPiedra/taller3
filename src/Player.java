import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String nickName;
    private long score;
    private int lives;
    private Character character;

    public Player(String name, String nickName, long score, int lives) {
        this.setName(name);
        this.setNickName(nickName);
        this.setScore(score);
        this.setLives(lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

}
