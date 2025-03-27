import java.util.ArrayList;
import java.util.List;

// Klasa bazowa dla wszystkich postaci
public class Postac {
    // Proste dane
    private int poziom;
    private float zdrowie;
    private int sila;

    // Dane typu String
    private String imie;
    private String rasa;

    // Kolekcja do przechowywania ekwipunku
    private List<String> ekwipunek;

    // Konstruktory
    public Postac() {
        this.poziom = 1;
        this.zdrowie = 100.0f;
        this.sila = 10;
        this.imie = "Nieznajomy";
        this.rasa = "Człowiek";
        this.ekwipunek = new ArrayList<>();
    }

    public Postac(int poziom, float zdrowie, int sila, String imie, String rasa) {
        this.poziom = poziom;
        this.zdrowie = zdrowie;
        this.sila = sila;
        this.imie = imie;
        this.rasa = rasa;
        this.ekwipunek = new ArrayList<>();
    }

    // Konstruktory kopiujące
    public Postac(Postac other) {
        this.poziom = other.poziom;
        this.zdrowie = other.zdrowie;
        this.sila = other.sila;
        this.imie = other.imie;
        this.rasa = other.rasa;
        this.ekwipunek = new ArrayList<>(other.ekwipunek);
    }

    // Metody
    public void atakuj() {
        System.out.println(imie + " atakuje!");
    }

    public void uleczSię() {
        this.zdrowie += 20;
        System.out.println(imie + " leczy się.");
    }

    public void dodajDoEkwipunku(String przedmiot) {
        ekwipunek.add(przedmiot);
        System.out.println(imie + " dodał(a) " + przedmiot + " do ekwipunku.");
    }

    public void usuńZekwipunku(String przedmiot) {
        ekwipunek.remove(przedmiot);
        System.out.println(imie + " usunął(a) " + przedmiot + " z ekwipunku.");
    }

    // Gettery i settery
    public int getPoziom() {
        return poziom;
    }

    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }

    public float getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(float zdrowie) {
        this.zdrowie = zdrowie;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public List<String> getEkwipunek() {
        return ekwipunek;
    }

    public void setEkwipunek(List<String> ekwipunek) {
        this.ekwipunek = ekwipunek;
    }
}
