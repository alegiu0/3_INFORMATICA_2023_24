import java.io.*;
import java.util.*;
import javax.swing.*;
public class Es1{
    public static void main(String[]args){
        int aa,mm,gg;
        Scanner inp = new Scanner(System.in);
        System.out.println("dammi l'anno");
        aa=inp.nextInt();
        System.out.println("dammi il mese");
        mm=inp.nextInt();
        System.out.println("dammi il giorno");
        gg=inp.nextInt();
        if(aa>2024){
              System.out.println("data non valida");
        }
        if(mm>12){
             System.out.println("data non valida");
        }
        switch(mm){
            case 1:if(gg>=1 && gg<=31){
                System.out.println("data valida");
            }
            break;
            case 2:if(aa%4==0){ 
                if(gg>=1 && gg<=29){
                System.out.println("data valida");}
                else{if(gg>=1 && gg<=28){
                System.out.println("data valida");}}            }
            break;
            case 3:if(gg>=1 && gg<=31){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 4:if(gg>=1 && gg<=30){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 5:if(gg>=1 && gg<=31){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 6:if(gg>=1 && gg<=30){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 7:if(gg>=1 && gg<=31){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 8:if(gg>=1 && gg<=31){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 9:if(gg>=1 && gg<=30){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 10:if(gg>=1 && gg<=31){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 11:if(gg>=1 && gg<=30){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            case 12:if(gg>=1 && gg<=31){
                System.out.println("data valida");
            }
            else{ System.out.println("data non valida");}
            break;
            
        }
        
        
         
        
        
    }}
        
