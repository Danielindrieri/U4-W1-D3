public class Main {
    public static void main(String[] args) {
//        Sim miaSim = new Sim ("3503968485", 50,"chiamata da Manuel,chamata da Erica");
//                miaSim.stampaDettagliSim();
//        miaSim.setCredito(30);
//        miaSim.setListachiamate("chamata da Gionny");
//        miaSim.stampaDettagliSim();


        Articolo articolo = new Articolo("2740274", "Ps5", (int) 560.99, 15);
        articolo.stampaDettagliArticolo();
        articolo.setPrezzo(499.99);
        articolo.setPezzidisponibili(3);

        articolo.stampaDettagliArticolo();
//
    } }