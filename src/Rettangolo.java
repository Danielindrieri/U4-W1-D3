public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        setAltezza(altezza);
        setLarghezza(larghezza);
    }
    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("Altezza non valida o deve essere maggiore di 0.");
        }
    }
    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        if (larghezza > 0) {
            this.larghezza = larghezza;
        } else {
            System.out.println("Larghezza non valida. Deve essere maggiore di 0.");
        }
    }

    public void stampaRettangolo() {
        int area = altezza * larghezza;
        int perimetro = 2 * (altezza + larghezza);
        System.out.println("Area: " + area + ", Perimetro: " + perimetro);
    }


    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);

        rettangolo.stampaRettangolo();
    }
}
