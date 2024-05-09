/**
 * Aggiungi qui una descrizione della classe Bicycle
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Bicycle
{
 private String npro;
 
 public Bicycle(){
    this.npro = "unknown";
    }
    public void setnpro(String n){
        this.npro=n;
    }
    public String getnpro(){
        return this.npro;
    }
    public String toString(){
    String frase="";
    System.out.println("il proprietario della bici è "+ this.npro);
    return frase;
    }
}
