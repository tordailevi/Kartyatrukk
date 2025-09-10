
package Main;

public class Kartyatrukk {
    static String[] pakli = new String[22];

    
    
    public static void kirak(){
        for (int i = 0; i < 10; i++) {
            System.out.print();
        }
        
        
        
        
        
        
        
        
        
        

        }
    
    
    
    public static void main(String[] args) {
        kirak();
        for (int db = 0; db < pakli.length; db++) {
            System.out.println(pakli[db]);
        }  
    }
    
    private static void osszeallit(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        
        int index = 1;
        for (int i = 0; i < szinek.length-1; i++) {
            for (int j = 0; j < ertekek.length; j++) {
                pakli[index++] = szinek[i] + " " + ertekek[j];
                index++;
                }
            }
        for (int i = 0; i < 3; i++) {
            pakli[index++] = szinek[3] + " " + ertekek[i];
        }
        }
    }
