
/**
 * Estrarre da una stringa la sottostringa che va dalla posizione a alla posizione b comprese
 * 
 * @author (Giusti Alessandro) 
 * @version (V1)
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Es1{
    public static void main(String[]args){
        int a,b;
        String sottostringa,parola="";
        Scanner inp = new Scanner(System.in);
        System.out.println("dammi la parola");
        parola=inp.nextLine();
        do{
              System.out.println("dammi il primo numero");
              a=inp.nextInt();
              System.out.println("dammi il secondo numero");
              b=inp.nextInt();
              if(a>parola.length() || b>parola.length() || a<0 || b<0 ||a<b ){
                   System.out.println("Errore il secondo numero");
                }
              
            }while(a>parola.length() || b>parola.length() || a<0 || b<0 ||a<b);
            sottostringa= parola.substring(a,b+1);
            System.out.println(sottostringa);
    }
}
