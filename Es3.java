import java.io.*;
import java.util.*;
import javax.swing.*;
public class Es3{
    public static void main(String[]args){
          int a1,m1,g1,a2,m2,g2,x,y,z;
        Scanner inp = new Scanner(System.in);
        System.out.println("dammi l'anno (max 2024)");
        a1=inp.nextInt();
        System.out.println("dammi il mese (max 2024)");
        m1=inp.nextInt();
        System.out.println("dammi il giorno");
        g1=inp.nextInt();
        System.out.println("dammi il secondo anno(max 2024)");
        a2=inp.nextInt();
        System.out.println("dammi il secondo mese(max 2024)");
        m2=inp.nextInt();
        System.out.println("dammi il secondo giorno");
        g2=inp.nextInt();
         switch(m1){
            case 1: m1=0;
            break;
            case 2: m1=31;
            break;
            case 3: if(a1%4==0) {m1=60; }
                    else{m1=59;};
            break;
            case 4: if(a1%4==0) {m1=91; }
                    else{m1=90;};
            break;
            case 5: if(a1%4==0) {m1=121; }
                    else{m1=120;};
            break;
            case 6: if(a1%4==0) {m1=152; }
                    else{m1=151;};
            break;
            case 7:if(a1%4==0) {m1=182; }
                    else{m1=181;};
            break;
            case 8: if(a1%4==0) {m1=213; }
                    else{m1=212;};
            break;
            case 9: if(a1%4==0) {m1=244; }
                    else{m1=243;};
            break;
            case 10: if(a1%4==0) {m1=274; }
                    else{m1=273;};
            break;
            case 11: if(a1%4==0) {m1=305; }
                    else{m1=304;};
            break;
            case 12: if(a1%4==0) {m1=335; }
                    else{m1=334;};
                    
            break;
        }
         switch(m2){
            case 1: m2=0;
            break;
            case 2: m2=31;
            break;
            case 3: if(a2%4==0) {m2=60; }
                    else{m2=59;};
            break;
            case 4: if(a2%4==0) {m2=91; }
                    else{m2=90;};
            break;
            case 5: if(a2%4==0) {m2=121; }
                    else{m2=120;};
            break;
            case 6: if(a2%4==0) {m2=152; }
                    else{m2=151;};
            break;
            case 7:if(a2%4==0) {m2=182; }
                    else{m2=181;};
            break;
            case 8: if(a2%4==0) {m2=213; }
                    else{m2=212;};
            break;
            case 9: if(a2%4==0) {m2=244; }
                    else{m2=243;};
            break;
            case 10: if(a2%4==0) {m2=274; }
                    else{m2=273;};
            break;
            case 11: if(a2%4==0) {m2=305; }
                    else{m2=304;};
            break;
            case 12: if(a2%4==0) {m2=335; }
                    else{m2=334;};
                    
            break;
        }
        a1=a1*365;
        x=a1+m1+g1;
        a2=a2*365;
        y=a2+m2+g2;
        z=x-y;
        if(z<0){
            z=z*(-1);
        }
        System.out.println("la differenza tra le date é"+z+" giorni");
    }
}
    
    