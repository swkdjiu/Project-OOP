// Klasa dla rycerza, która dziedziczy po Wojownik i implementuje IBroniony
public class Rycerz extends Wojownik implements IBroniony {

    // Konstruktory
    public Rycerz(int poziom, float zdrowie, int sila, String imie, String rasa, String pancerz, String typBroni) {
        super(poziom, zdrowie, sila, imie, rasa, pancerz, typBroni);
    }

    // Implementacja metody obronaTarcza z IBroniony
    @Override
    public void obronaTarcza() {
        System.out.println(getImie() + " używa tarczy do obrony.");
    }

    // Implementacja metody unik z IBroniony
    @Override
    public void unik() {
        System.out.println(getImie() + " wykonuje unik!");
    }

    // Przykład przeciążonej metody atakuj
    @Override
    public void atakuj() {
        System.out.println(getImie() + " atakuje mieczem rycerskim!");
    }
}
