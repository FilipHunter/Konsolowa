package cku.sopot;

import java.util.Scanner;

/***************************************************************
 * nazwa klasy: Konsolowa
 * opis: Główna klasa uruchomiająca program
 * autor: 880925egzamin
 ***************************************************************/

public class Konsolowa {
    static final int LICZBA_ELEMENTOW = 10;
    static int[] tablica = new int[LICZBA_ELEMENTOW];

    /***************************************************************
     * nazwa klasy: Main
     * parametry wejściowe: args - parametry uruchomieniowe
     * wartość zwracana: brak
     * opis: główna metoda uruchomieniowa
     * autor: 880925egzamin
     ***************************************************************/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < LICZBA_ELEMENTOW; i++) {
            System.out.print("Podaj " + (i + 1) + " element tablicy: ");
            tablica[i] = scanner.nextInt();
        }
        Sortowanie sortowanieWstawianie = new Sortowanie(tablica);
        sortowanieWstawianie.sortuj();
        System.out.println("Tablica po posortowaniu: ");
        System.out.println(sortowanieWstawianie.toString());
    }
}
