
package Main;

import java.util.Scanner;

public class Kartyatrukk {

    static String[] pakli = new String[22];
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        osszeallit();
        kirak();
        beker();
        kever(1);
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
    
    public static void kever(int val){
        switch (val) {
            case 1:
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[20-(i-1)*3];
                    pakli[i+7] = pakli[19-(i-1)*3];
                    pakli[i+14] = pakli[21-(i-1)*3];
                    System.out.println(pakli[i]);
                }
            case 2:
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[19-(i-1)*3];
                    pakli[i+7] = pakli[20-(i-1)*3];
                    pakli[i+14] = pakli[21-(i-1)*3];
                    System.out.println(pakli[i]);
                }
            case 3:
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[21-(i-1)*3];
                    pakli[i+7] = pakli[19-(i-1)*3];
                    pakli[i+14] = pakli[20-(i-1)*3];
                    System.out.println(pakli[i]);
                }
        }
    }

    private static void melyikVolt(){
        System.out.println("A választott lap: " +pakli[11]);
    }
    
}