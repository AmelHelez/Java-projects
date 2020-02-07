import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person newP = new Person();

        System.out.print("Please enter the full name: ");
        String name = in.nextLine();
        newP.SetName(name);

        System.out.println("The entered name is: ");
        System.out.println(newP.getFullName());
    }
}
