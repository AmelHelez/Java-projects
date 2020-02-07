package team.Sport;

public class Player {
    private String first_name;
    private String last_name;
    private int age;

    public String GetFName() {
        return first_name;
    }
    public String GetLName() {
        return last_name;
    }
    public int GetAge() {
        return age;
    }
    public void SetFName(String first_name) {
        this.first_name = first_name;
    }
    public void SetLName(String last_name) {
        this.last_name = last_name;
    }
    public void SetAge(int age) {
        this.age = age;
    }
    public Player(String first_name,String last_name,int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public String toString() {
        return "Player { " + first_name + " " + last_name + " " + age + " years old. }";
    }

}
