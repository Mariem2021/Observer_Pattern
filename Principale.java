import java.util.Scanner;

public class Principale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Theme theme = new theme();

        new BinaryObs(theme);
        new OctaleObs(theme);
        new HexObs(theme);

        System.out.println("*****CONVERSION******");
        int number;
        System.out.println();

        int i = 0;
        while (i < 2) {
            System.out.println("donner le nombre à convertir:"):
            number = sc.nextInt();
            theme.setState(number);
        }
    }
}