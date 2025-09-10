
package Main;

import java.util.Scanner;

public class Kartyatrukk {

    static String[] pakli = new String[22];
    static Scanner scn = new Scanner(System.in);

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
            pakli[db++] = szinek[3] + " " + ertekek[i];
        }
    }
    
    public static int beker() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("Melyik oszlop (1-3): ");
            oszlop = scn.nextInt();
            jo = oszlop >= 1 && oszlop <=3;
        } while (!jo);
        return oszlop;
    }
    
    
    public static void kirak() {
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf("%-7s".formatted(pakli[i]));
            if (i % 3 == 0) {
                System.out.println("\n");
            }
        }
    }
    
    public static void kever(){
        //a választott oszlop mindig középre kerüljön
    }
    
    private static void melyikVolt(){
        System.out.println("A választott lap: " +pakli[11]);
    }
    
}