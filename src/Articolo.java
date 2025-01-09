public class Articolo {
    private String codicearticolo;
    private String descrizione;
    private double prezzo;
    private int pezzidisponibili;

    public Articolo(String codicearticolo, String descrizione, int prezzo, int pezzidisponibili) {
        setCodicearticolo(codicearticolo);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setPezzidisponibili(pezzidisponibili);
    }

    public String getCodicearticolo() {
        return codicearticolo;
    }

    public void setCodicearticolo(String codicearticolo) {
        if (codicearticolo != null && codicearticolo.length() == 7) {
            this.codicearticolo = codicearticolo;
        } else {
            System.out.println("codice non valido o articolo inesistente");
        }
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        if (descrizione != null && !descrizione.trim().isEmpty()) {
            this.descrizione = descrizione;
        } else {
            this.descrizione = "nessuna descione per questo articolo";
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0.01) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Prezzo non valido");
        }
    }

    public int getPezzidisponibili() {
        return pezzidisponibili;
    }

    public void setPezzidisponibili(int pezzidisponibili) {
        if (pezzidisponibili > 0) {
            this.pezzidisponibili = pezzidisponibili;
        } else {
            System.out.println("esaurito");
        }
    }

    public void stampaDettagliArticolo() {
        System.out.println("Codice articolo: " + codicearticolo);
        System.out.println("Descrizione: " + descrizione);
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Pezzi disponibili: " + pezzidisponibili); {
        }
    }
}
