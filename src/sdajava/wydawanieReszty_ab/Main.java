package sdajava.wydawanieReszty_ab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int tab[] = {200,100,50,20,10,5,2,1};

        Scanner wejscie = new Scanner(System.in);
        System.out.print("Podaj kwote do wydania:");
        int r = wejscie.nextInt();

        int i = 0;

        while (r > 0) {
           if (r >= tab[i]) {
               int l = r / tab[i];
               r = r - (tab[i] * l);
               System.out.println("Wyplac nominal " + tab[i] + " w ilosci  " + l);
           }
        i++;
        }
    }
}
