package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int x;

        for (int i = 0; i < 5; i++) {
            x = in.nextInt();
            brojevi.add(x);
        }
        System.out.println(checkFour(brojevi));

    }

    public static boolean checkFour(ArrayList<Integer> checkArray){
        ArrayList<Integer> positions = new ArrayList<Integer>();
        boolean check = false;

        for(int i = 0; i < checkArray.size(); i++){
            if(checkArray.get(i) == 4) positions.add(i);
        }

        for(int i = 0; i < positions.size(); i++){
            if(i != 0 && positions.get(i) == positions.get(i-1) + 1)
                check = true;
            else
                check = false;
        }
        return check;
    }
    }


