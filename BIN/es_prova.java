//crea un arrey con dentro varie strunghe e in output scrive lettera per lettera 

import java.util.*;
public class Esgiusti{
    public static void main(String[]args){
        
        Scanner inp = new Scanner(System.in);
        int n=4,totale=0,l=0;
        String vet[];
        char tot;
        vet = new String[n];
        //prende in ingresso le stringhe
        for(int i= 0; i<n;i++){
            System.out.println("inserisci una stringa");
            vet[i] = inp.nextLine();
        }
        
        for(int j = 0; j<n;j++){
            
            for(int i =0;i < vet[j].length();i++){
                tot = vet[j].charAt(i);
                System.out.println(tot);   
            }
        }
    }
}
