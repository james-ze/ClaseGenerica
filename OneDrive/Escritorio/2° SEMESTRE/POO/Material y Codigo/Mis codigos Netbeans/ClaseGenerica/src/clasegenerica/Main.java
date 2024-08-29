
package clasegenerica;

public class Main {
    public static void main(String[] args) {     
        Pair<?, ?>[] pares = new Pair[2];    
        pares[0] = new Pair<>(25, "Juan Pérez");
        pares[1] = new Pair<>("SURA", "1998-08-15");
        for (Pair<?, ?> par : pares) {
            System.out.println("Datos: " + par);
        }
    }
}