/**
 * Presa una stringa, separare ogni carattere con un trattino. (ciao → c-i-a-o)
 * 
 * @author (Giusti Alessandro) 
 * @version (V1)
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Es2{
    public static void main(String[]args){
        String parola="";
        Scanner inp = new Scanner(System.in);
        int np,i;
        System.out.println("dammi la parola");
        parola=inp.nextLine();
        np=parola.length();
        for(i=0;i<np;i++){
            if(i>0){
                 System.out.print("-");
            }
             System.out.print(parola.charAt(i));
        }
    }
}