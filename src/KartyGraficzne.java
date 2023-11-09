public class KartyGraficzne {
    //Pola klasy
    private String nazwa;
    private int pamiec;
    private int cena;

    //Konstruktor
    public KartyGraficzne(String nazwa, int pamiec, int cena)
    {
        this.nazwa = nazwa;
        this.pamiec = pamiec;
        this.cena = cena;
    }

    //Metody
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPamiec() {
        return pamiec;
    }

    public void setPamiec(int pamiec) {
        this.pamiec = pamiec;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void wyswietlInformacje() {
        System.out.println("Karta Graficzna o nazwie " + nazwa + " ma " + pamiec + " GB RAM pamięci i kosztuje " +
                cena + " zł");
    }

}
