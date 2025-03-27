public class Main {
    public static void main(String[] args) {
        // Tworzymy postacie
        Postac postac = new Postac(1, 100.0f, 10, "Adolf", "Elf");
        Wojownik wojownik = new Wojownik(5, 120.0f, 15, "Thorin", "Dwarf", "Ciężki pancerz", "Toporek");
        Rycerz rycerz = new Rycerz(10, 150.0f, 20, "Lancelot", "Człowiek", "Tarcza", "Miecz");
        Barbarzynca barbarzyniec = new Barbarzynca(8, 180.0f, 25, "Groot", "Orc", "Lekka zbroja", "Topór dwuręczny");

        // Demonstrujemy działanie metod
        postac.atakuj();
        wojownik.atakuj();
        wojownik.obrona();
        rycerz.obronaTarcza();
        rycerz.atakuj();
        barbarzyniec.szalBojowy();
        barbarzyniec.atakuj();

        // Użycie ekwipunku
        wojownik.dodajDoEkwipunku("Helmet");
        wojownik.usuńZekwipunku("Helmet");
    }
}
