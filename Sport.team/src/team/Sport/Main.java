package team.Sport;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter manager first and last name: ");
    String fn = input.next();
    String ln = input.next();
    System.out.print("Enter manager's years of experience: ");
    int exp = input.nextInt();
    Manager manager = new Manager(fn,ln,exp);

    System.out.print("Enter the number of players: ");
    int n = input.nextInt();

    Team team = new Team(n,manager);

    for(int i = 0; i < n; i++) {
        System.out.print("Enter first and last name of " + (i+1) + ". player: ");
        String first = input.next();
        String last = input.next();
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        Player player = new Player(first,last,age);
        team.addPlayer(player);
    }
    team.printTeam();
    }
}
