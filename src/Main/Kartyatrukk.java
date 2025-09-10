
package Main;

public class Kartyatrukk {

    static String[] pakli = new String[22];
    

    public static void main(String[] args) {
        osszeallit();
        kirak();
    }

    public static void osszeallit() {
        int db = 1;
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < szinek.length-1; i++) { 
            for (int j = 0; j < ertekek.length; j++) { 
                pakli[db++] = szinek[i] + " " + ertekek[j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            pakli[db++] = szinek[3] + "_" + ertekek[i];
        }
    }
    
    
    
    public static void kirak() {
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf("%-7s".formatted(pakli[i]));
            if (i % 3 == 0) {
                System.out.println("\n");
            }
        }
    }
}
