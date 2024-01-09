import java.io.*;
import java.util.*;
import javax.swing.*;
public class Es2{
    public static void main(String[]args){
        int aa,mm,gg,t,z,y;
        Scanner inp = new Scanner(System.in);
        System.out.println("dammi l'anno");
        aa=inp.nextInt();
        System.out.println("dammi il mese");
        mm=inp.nextInt();
        System.out.println("dammi il giorno");
        gg=inp.nextInt();
        t=0;
        z=738760;
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

        switch(mm){
            case 1: mm=0;
            break;
            case 2: mm=31;
            break;
            case 3: if(aa%4==0) {mm=60; }
                    else{mm=59;};
            break;
            case 4: if(aa%4==0) {mm=91; }
                    else{mm=90;};
            break;
            case 5: if(aa%4==0) {mm=121; }
                    else{mm=120;};
            break;
            case 6: if(aa%4==0) {mm=152; }
                    else{mm=151;};
            break;
            case 7:if(aa%4==0) {mm=182; }
                    else{mm=181;};
            break;
            case 8: if(aa%4==0) {mm=213; }
                    else{mm=212;};
            break;
            case 9: if(aa%4==0) {mm=244; }
                    else{mm=243;};
            break;
            case 10: if(aa%4==0) {mm=274; }
                    else{mm=273;};
            break;
            case 11: if(aa%4==0) {mm=305; }
                    else{mm=304;};
            break;
            case 12: if(aa%4==0) {mm=335; }
                    else{mm=334;};
                    
            break;
        }
        aa=aa*365;
        t=aa+mm+gg;
        y=z-t;
        y=y*(-1);
        System.out.println("sono passati"+y+"giorni");
        
         
        
        
    }
}

        
