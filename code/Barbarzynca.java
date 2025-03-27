// Klasa dla barbarzyńcy, która dziedziczy po Wojownik
public class Barbarzynca extends Wojownik {

    // Konstruktory
    public Barbarzynca(int poziom, float zdrowie, int sila, String imie, String rasa, String pancerz, String typBroni) {
        super(poziom, zdrowie, sila, imie, rasa, pancerz, typBroni);
    }

    // Metoda ataku dla barbarzyńcy
    @Override
    public void atakuj() {
        System.out.println(getImie() + " atakuje z ogromną siłą!");
    }

    // Metoda, która aktywuje tryb "szału bojowego"
    public void szalBojowy() {
        System.out.println(getImie() + " wchodzi w tryb szału bojowego!");
    }
}
