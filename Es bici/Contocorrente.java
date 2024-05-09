
/**
 * Aggiungi qui una descrizione della classe Contocorrente
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Contocorrente {
    private int numconto;
    private double saldo;
    public Contocorrente() {
        this.numconto = 0; //da valori di defoult
        this.saldo = 0.0;
    }
    public Contocorrente(int nC, double s){
        if(nC>0){       //dai dei valori a numcont e a saldo
            this.numconto=nC;
        }else{
            this.numconto=0;
        }
        saldo=s;
    }
    public Contocorrente(Contocorrente c){
        this.numconto=c.numconto; //copia in questo c numcont e saldo
        this.saldo=c.saldo;
    
    }
    public void setnumconto(int nC){
        if(nC>0){
            this.numconto=nC;
        }else{
            this.numconto=0;
        }
    
    }
    public void setsaldo(double s){
     this.saldo=s;
    
    }
    public int getnumconto(){
        return this.numconto;
    }
     public double getsaldo(){
        return this.saldo;
    }
    public String toString(){
        String out="";
        out+="Il numero del conto corrente è "+this.numconto+" ";
        out+="Il numero del saldo è "+this.saldo;
        return out;
    }
}
