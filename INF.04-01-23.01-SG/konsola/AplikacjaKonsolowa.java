package INF04.inf04012301sg.konsola;

import java.util.Scanner;

public class AplikacjaKonsolowa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbe a");
        int a = input.nextInt();

        System.out.println("Podaj liczbe b");
        int b = input.nextInt();

        new AplikacjaKonsolowa(a,b);

    }

    public AplikacjaKonsolowa(int a, int b) {

            while (a != b) {

                if (a > b) {

                    a = a - b;

                    //System.out.println("sprawdzanie a : " + a);

                } else {

                    b = b - a;

                    //System.out.println("sprawdzanie b : " + a);

                }

            }

        System.out.println("NWD : " + a);

    }


}
