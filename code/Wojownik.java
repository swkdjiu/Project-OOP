// Klasa dla postaci typu wojownik, która dziedziczy po Postac
public class Wojownik extends Postac {
    private String pancerz;
    private String typBroni;

    // Konstruktory
    public Wojownik(int poziom, float zdrowie, int sila, String imie, String rasa, String pancerz, String typBroni) {
        super(poziom, zdrowie, sila, imie, rasa);
        this.pancerz = pancerz;
        this.typBroni = typBroni;
    }

    // Metoda ataku, przeciążona
    @Override
    public void atakuj() {
        System.out.println(getImie() + " atakuje używając " + typBroni);
    }

    // Metoda obrony, przeciążona
    public void obrona() {
        System.out.println(getImie() + " broni się używając " + pancerz);
    }

    // Gettery i settery
    public String getPancerz() {
        return pancerz;
    }

    public void setPancerz(String pancerz) {
        this.pancerz = pancerz;
    }

    public String getTypBroni() {
        return typBroni;
    }

    public void setTypBroni(String typBroni) {
        this.typBroni = typBroni;
    }
}
