import java.util.*;
import java.util.Scanner;

class Principale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Theme theme = new Theme();

        new BinaryObs(theme);
        new OctaleObs(theme);
        new HexObs(theme);

        System.out.println("*****CONVERSION******");
        int number;
        System.out.println();

        for (int i=0; i<3 ;i++) {
            System.out.println("*****le nombre a convertir******");
            number = sc.nextInt();
            theme.setState(number);
            System.out.println();
         }   
    }
}