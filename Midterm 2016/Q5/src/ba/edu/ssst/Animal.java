package ba.edu.ssst;

public class Animal {
    private String type;
    private String nickname;
    private int years;

    public Animal(String type, String nickname, int years) {
        this.type= type;
        this. nickname= nickname;
        this.years= years;
    }

    public String getType() {
        return type;
    }

    public String getNickname() {
        return nickname;
    }

    public int IncreaseYear() {
        return years++;
    }

    @Override
    public String toString() {

        return "Animal type: " + this.type + "\n" + "Animal nickname: " + this.nickname + "\n" + "Years: " + this.years + "\n";
    }
}
