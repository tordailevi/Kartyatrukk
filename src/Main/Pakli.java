
package Main;

import java.util.Scanner;


public class Pakli {
    private String[] pakli = new String[22];
    private String[] ujPakli = new String[22];
    static Scanner scn = new Scanner(System.in);
    private Lap[] lapok;

    public Pakli(){
        this.osszeallit(this.lapok);
        this.kirak(this.pakli);
        for (int i = 0; i < 3; i++) {
            this.kever(this.beker());
            this.kirak(this.ujPakli);
        }
        this.melyikVolt();
    }
    
    private void feltolt(){
        int db = 0;
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < szinek.length-1; i++) { 
            for (int j = 0; j < ertekek.length; j++) {
                this.pakli[db++] = szinek[i] + " " + ertekek[j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            this.pakli[db++] = szinek[3] + " " + ertekek[i];
        }
    }
    
    private void osszeallit(Lap[] lapok) {
        int db = 0;
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};

        for (int i = 0; i < szinek.length-1; i++) { 
            for (int j = 0; j < ertekek.length; j++) {
                String leiras = szinek[i] + " " + ertekek[j];
                this.lapok[db++] = new Lap(leiras);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            String leiras2 = szinek[3] + " " + ertekek[i];
            this.lapok[db++] = new Lap(leiras2);
        }
    }
    
    private void kirak(String[] pakli) {
        for (int i = 0; i < pakli.length; i++) {
            System.out.printf("%-7s".formatted(pakli[i]));
            if (i % 3 == 0) {
                System.out.println("\n");
            }
        }
    }
    
    private void kever(int oszlop){
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    this.ujPakli[i] = this.pakli[20-(i-1)*3];
                    this.ujPakli[i+7] = this.pakli[19-(i-1)*3];
                    this.ujPakli[i+14] = this.pakli[21-(i-1)*3];
                }break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    this.ujPakli[i] = this.pakli[19-(i-1)*3];
                    this.ujPakli[i+7] = this.pakli[20-(i-1)*3];
                    this.ujPakli[i+14] = this.pakli[21-(i-1)*3];
                }break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    this.ujPakli[i] = this.pakli[20-(i-1)*3];
                    this.ujPakli[i+7] = this.pakli[21-(i-1)*3];
                    this.ujPakli[i+14] = this.pakli[19-(i-1)*3];
                }break;
        }
    }
    
    private int beker() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("Melyik oszlop (1-3): ");
            oszlop = scn.nextInt();
            jo = oszlop >= 1 && oszlop <=3;
        } while (!jo);
        return oszlop;
    }
    
    private void melyikVolt(){
        System.out.println("A valasztott lap: " +ujPakli[11]);
    
    }
}
