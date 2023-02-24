class Avto {
    String znamka;
    String model;
    String cena;
    String voznik;

    Avto(String vZnamka, String vModel, String vCena, String vVoznik){
        znamka = vZnamka;
        model = vModel;
        cena = vCena;
        voznik = vVoznik;
    }

    String opis () {
        return ime + "(znamka: " + znamka + ", model: " + model + ", cena: " + cena + ", voznik: " + voznik + ")";
    }
    String nastavi Voznika () {
        return ime + "(pasma: " + pasma + ", starost: " + starost + ", barva: " + barva + ") " + laja + ")"
    }
    String sedi () {
        return ime + "(pasma: " + pasma + ", starost: " + starost + ", barva: " + barva + ") " + sedi + ")"
    }
    String spi () {
        return ime + "(pasma: " + pasma + ", starost: " + starost + ", barva: " + barva + ") " + spi + ")"
    }
}