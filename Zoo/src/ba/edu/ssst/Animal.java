package ba.edu.ssst;

public class Animal {
    private String type;
    private String nickname;
    private int years;


    public Animal(String type, String nickname, int years) {
        this.type = type;
        this.nickname = nickname;
        this.years = years;
    }

    public String getType() {
        return type;
    }

    public String getNickname() {
        return nickname;
    }

    public int getYears() {
        return years;
    }

    public void increaseYears() {
        years++;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + "\nNickname: " + this.nickname + "\nYears: " + this.years;
    }
}
