package cku.sopot;

import java.util.Arrays;

/***************************************************************
 * nazwa klasy: Sortowanie
 * opis: Klasa pozwalająca na sortowanie 10cio elementowej tablicy liczb w porządku rosnącym
 * autor: 880925egzamin
 ***************************************************************/

public class Sortowanie {
    static final int LICZBA_ELEMENTOW = 10;
    private int[] tablica = new int[LICZBA_ELEMENTOW];

    /***************************************************************
     * nazwa funkcji: Sortowanie
     * parametry wejściowe: tablica - sortowana tablica
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 880925egzamin
     ***************************************************************/

    public Sortowanie(int[] tablica) {
        this.tablica = tablica;
    }

    /***************************************************************
     * nazwa funkcji: Sortuj
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sortuje poprzez wstawianie tablicę w porządku rosnącym
     * autor: 880925egzamin
     ***************************************************************/

    public void sortuj() {
        for (int i = 0; i < LICZBA_ELEMENTOW - 1; i++) {
            int indexNajmniejszego = najmniejsza(i);
            zamien(i, indexNajmniejszego);
        }
    }

    /***************************************************************
     * nazwa funkcji: Sortuj
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: sortuje poprzez wstawianie tablicę w porządku malejącym
     * autor: 880925egzamin
     ***************************************************************/

    /*
    public void sortujMalejaco(){
        for (int i = 0; i < LICZBA_ELEMENTOW-1; i++) {
            int indexNajwiekszego = najwieksza(i);
            zamien(i, indexNajwiekszego);
        }

    }
    */

    /***************************************************************
     * nazwa funkcji: najmniejsza
     * parametry wejściowe: odElementu - indeks elementu, do którego wyszukujemy najmniejszy element tablicy
     * wartość zwracana: indeks najmniejszego elementu
     * opis: wyszukuje indeks najmniejszego elementu tablicy począwszy od indeksu wskazanego w parametrze odElementu
     * autor: 880925egzamin
     ***************************************************************/

    public int najmniejsza(int odElementu) {
        int indexNajmniejszego = odElementu;
        for (int i = odElementu; i < LICZBA_ELEMENTOW; i++) {
            if (tablica[indexNajmniejszego] > tablica[i]) {
                indexNajmniejszego = i;
            }
        }
        return indexNajmniejszego;
    }

    /***************************************************************
     * nazwa funkcji: zamień
     * parametry wejściowe: indexElement1 - indeks pierwszego zamienianego elementu
     * parametry wejściowe: indexElement2 - indeks drugiego zamienianego elementu
     * wartość zwracana:
     * opis: zamienia ze sobą elementy tablicy o indeksach indexElement1 i indexElement2
     * autor: 880925egzamin
     ***************************************************************/

    public void zamien(int indexElement1, int indexElement2) {
        int pomocniczy = tablica[indexElement1];
        tablica[indexElement1] = tablica[indexElement2];
        tablica[indexElement2] = pomocniczy;
    }

    /***************************************************************
     * nazwa funkcji: toString
     * parametry wejściowe: brak
     * wartość zwracana: napis zawierający elementy tablicy oddzielone przecinkami
     * opis: zwraca napis pokazujący zawartość tablicy w formacie [element1, element2...]
     * autor: 880925egzamin
     ***************************************************************/

    @Override
    public String toString() {
        return Arrays.toString(tablica);
    }
}
