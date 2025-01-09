public class Sim {
    private String numero;
    private int credito;
    private String listachiamate;

    public Sim ( String numero,int credito,String listachiamate) {
        setNumero(numero);
        setCredito(credito);
        setListachiamate(listachiamate);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero != null && numero.matches("\\d{10}")) {
            this.numero = numero;
        } else {
            System.out.println("numero non valido");
        }
    }

        public int getCredito() {
            return credito;
        }

        public void setCredito(int credito) {
            if (credito >= 0) {
                this.credito = credito;
            } else {
                System.out.println("credito insufficente,ricaricare il credito");
            }
        }

            public String getListachiamate() {
                return listachiamate;
            }

            public void setListachiamate(String listachiamate) {
                if(listachiamate != null && !listachiamate.trim().isEmpty()) {
                    this.listachiamate = listachiamate;
                }else {
                    System.out.println("nessuna chiamata persa");
                }
            }

            public void stampaDettagliSim() {
                System.out.println("Numero: " + numero);
                System.out.println("Credito: " + credito + "€");
                System.out.println("Lista chiamate: " + listachiamate);
            }
        }
