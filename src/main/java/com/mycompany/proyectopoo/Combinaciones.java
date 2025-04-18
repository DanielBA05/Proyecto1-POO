
package com.mycompany.proyectopoo;
import java.util.List;

public abstract class Combinaciones {
    protected List<Ficha> fichas; //Sé que aún no tenemos una clase ficha, entonces creé el file sin nada. Se hace lo que se puede con lo que hay :(
    protected int cantFichas; 
    
    public Combinaciones(List<Ficha> fichasP){
        esValido(); //Nota: necesitamos agregar algo para que, si no es válido, no lo deje hacerlo.
        fichas = fichasP;
        cantFichas = fichas.size();
    }
    
    private boolean esValido(){
        return cantFichas >= 3;
    }
    
    //como necesita los atributos de otra clase que no ha sido creada, vamos a dejarlo en stand-by.
    
    /*public boolean mismoColor(){ //ambas subclases necesitan verificar los colores. En las series, necesita ser un false, en las escaleras un true.
        
    }
    */

    public List<Ficha> getFichas() {
        return fichas;
    }

    public int getCantFichas() {
        return cantFichas;
    }
    
}
