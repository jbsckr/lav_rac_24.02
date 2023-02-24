class Pes {
    String ime;
    String pasma;
    String starost;
    String barva;

    String opis() {
        return ime + "(pasma: " + pasma + ", starost: " + starost + ", barva: " + barva + ") ";
    }
    String lajaj() {
        return ime + "(pasma: " + pasma + ", starost: " + starost + ", barva: " + barva + ") " + "laja";
    }
    String sedi() {
        return ime + "(pasma: " + pasma + ", starost: " + starost + ", barva: " + barva + ") " + "sedi";
    }
    String spi() {
        return ime + "(pasma: " + pasma + ", starost: " + starost + ", barva: " + barva + ") " + "spi";
    }

    Pes(String vIme, String vPasma, String vStarost, String vBarva){
        ime = vIme;
        pasma = vPasma;
        starost = vStarost;
        barva = vBarva;
    }
}