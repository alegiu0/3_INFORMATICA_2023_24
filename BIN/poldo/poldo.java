
/**
 * Ricrea il sito poldo
 * 
 * @author (Giusti Alessandro) 
 * @version (29/10/2023)
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class poldo{
    public static void main (String[]args){
        int ps,pc, pp, pt, n, q, tot, v;
        Scanner inp=new Scanner(System.in);
        Scanner myObj=new Scanner(System.in);
        ps=1;
        pc=2;
        pp=3;
        pt=4;
        System.out.println("le opzioni sono:paninosalame(1), paninocatoletta(2), paninoprosciutto(3), paninotacchino(4)");
        System.out.println("dimmi l'opzione");
        n=inp.nextInt();
        do {
                switch(n){
                    case 1:System.out.print("quanti ne vuoi");
                            n=1;
                            break;
                    case 2:System.out.print("quanti ne vuoi");
                            n=2;
                            break;
                    case 3:System.out.print("quanti ne vuoi");
                            n=1;
                            break;
                    case 4:System.out.print("quanti ne vuoi");
                            n=1;
                            break;
                    default:System.out.print("error");
                }
        }while(n!=1 && n!=2  && n!=3 && n!=4);
         q=inp.nextInt();
         tot=n*q;
         System.out.println("il totale è:"+tot);
        }
    }
