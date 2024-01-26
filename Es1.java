/**
 * Leggere un valore l compreso tra 3 e 10
   Leggere un vettore di l elementi interi 
   fare la somma di tutti i valori del vettore e visualizzare la somma
   fare la somma di tutti i valori in posizione pari (sommapp) e visualizzare il risultato
 * 
 * @author (Giusti Alessandro) 
 * @version (1)
 */
import java.util.*;
public class Es1
    { public static void main(String[]args){
        int l,somma,pari,dispari;
        int v[];
        Scanner inp=new Scanner(System.in);
        somma=0;
        pari=0;
        dispari=0;
        do{
               System.out.println("dammi la lunghezza");
               l=inp.nextInt();
               
        }while(l<3||l>10);
        v=new int[l];
        for (int i=0;i<l;i++){
            System.out.println("dammi il voto");
            v[i]=inp.nextInt();
            somma=somma+v[i];
            if(v[i]%2==0){
                pari=pari+v[i];
            }else{
                dispari=dispari+v[i];
            }
            
        }
         System.out.println("somma totale:"+somma+" somma pari: "+pari+" somma dispari:"+dispari);
        
        
        
        
    }
}
