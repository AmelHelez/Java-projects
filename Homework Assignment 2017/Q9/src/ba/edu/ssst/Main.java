package ba.edu.ssst;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Team team = new Team(3);
        team.addPlayer(new Player("Sakib","Sakibovic",31));
        team.addPlayer(new Player("Jusuf","Oh",33));
        team.addPlayer(new Player("Haris","Duljevic",25));
        team.addManager(new Manager("Jebo","Mater",12));
        //team.addPlayer(new Player("Ahhh","Ehhh",23));
        team.print();
    }
}
