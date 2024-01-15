import java.util.Scanner;

public class sortowaniePrzezWybieranie {

    Scanner skan = new Scanner(System.in);

    private int tablicaElementow[] = new int[10];

    void uzupelnianieTablicy(){

        for (int i = 0; i < 10; i++){

            System.out.print("Podaj liczbe dla "+i+" indexu tablicy > ");
            tablicaElementow[i] = skan.nextInt();

        }
    }

    /**
     * nazwa funkcji: matodaSortujaca
     * parametry wejsciowe: brak
     * wartosc zwracana: brak
     * autor: 00000000000
     */
    void metodaSortujaca(){

        for (int i = 0; i < tablicaElementow.length; i++){

            int najwiekszyIndex = i;

            for (int j = i + 1; j < tablicaElementow.length; j++){

                if (tablicaElementow[j] > tablicaElementow[najwiekszyIndex]){

                    najwiekszyIndex = j;

                }

            }

            int temp = tablicaElementow[i];
            tablicaElementow[i] = tablicaElementow[najwiekszyIndex];
            tablicaElementow[najwiekszyIndex] = temp;

        }

    }

    /**
     * nazwa funkcji: matodaSzukajaca
     * parametry wejsciowe: brak
     * wartosc zwracana: najwiekszaWartosc - przechowuje najwieksza wyszukana wartosc
     * autor: 00000000000
     */
    private int metodaSzukajaca(){

        int najwiekszaWartosc = tablicaElementow[0];

        for (int i = 1; i < tablicaElementow.length; i++){

            if (najwiekszaWartosc < tablicaElementow[i]){

                najwiekszaWartosc = tablicaElementow[i];

            }

        }

        return najwiekszaWartosc;

    }

    public static void main(String[] args) {

        sortowaniePrzezWybieranie algorytm = new sortowaniePrzezWybieranie();

        algorytm.uzupelnianieTablicy();

        algorytm.metodaSortujaca();

        System.out.println("Najwieksza liczba : "+algorytm.metodaSzukajaca());

        for (int y = 0; y < algorytm.tablicaElementow.length; y++){

            System.out.print(algorytm.tablicaElementow[y]+" ");

        }

    }

}
