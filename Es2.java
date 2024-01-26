/**
 * Leggere un valore l compreso tra 3 e 10
   leggere un vettore di l valori double corrispondenti ai voti di un alunno (voto compreso tra 3 e 10)
   calcolare e visualizzare la media dei voti
   dire se l'alunno è promosso o bocciato
   visualizzare il voto più basso e il voto più alto
 * 
 * @author (Giusti Alessandro) 
 * @version (1)
 */
import javax.swing.*;
import java.util.*;
public class Es2
    { public static void main(String[]args){
        int l;
        double v[],somma,media,totale;
        Scanner inp=new Scanner(System.in);
        somma=0;
        media=0;
        
        do{
               System.out.println("quanti voti hai?");
               l=inp.nextInt();
               
        }while(l<3||l>10);
        
        v=new double[l];
        
        for (int i=0;i<l;i++){
            v[i]=Double.parseDouble(JOptionPane.showInputDialog("dammi il voto"));
            somma=somma+v[i];
            media=media+1;
        }
        
        totale=somma/media;
        System.out.println("la tua media è:"+totale);
        if(totale<6){
              System.out.println("bocciato");
            }else{System.out.println("promosso");}
          
            
            

        
        
        
        
    }
}
