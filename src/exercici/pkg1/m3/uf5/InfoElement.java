
package exercici.pkg1.m3.uf5;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author ALUMNEDAM
 */
public class InfoElement {
    private Element e;
    
    public InfoElement(Element e){
        this.e = e;
    }
    
    public String nomSuperClasse (){
        return e.getClass().getSuperclass().getSimpleName();
    }
    
    // nom de la classe complet.
    public String nomClasseComplet (){
        return e.getClass().getName();
    }
    
    // només el nom de la classe.
    public String nomClasse(){
        return e.getClass().getSimpleName();
    }
    
    // array d'atributs (Field).
    public Field[] arrayAtributs(){
        return e.getClass().getDeclaredFields();
    }
 
    // array de mètodes (Method).
    public Method[] arrayMetodes(){
        return e.getClass().getMethods();
    }
    
    // array dels noms dels atributs.
    public String[] arrayNomsAtributs(){
        String[] nomAtributs = new String[arrayAtributs().length];
        Field[] att = arrayAtributs();
        for(int i = 0; i < nomAtributs.length; i++){
            nomAtributs[i] = att[i].getName();
        }        
        return nomAtributs;
    }
    
    // array dels noms dels mètodes.
    public String[] arrayNomsMetodes(){
        String[] nomMetodes = new String[arrayMetodes().length];
        Method[] meth = arrayMetodes();
        for (int i = 0; i < nomMetodes.length; i++) {
            nomMetodes[i] = meth[i].getName();
        }
        return nomMetodes;
    }
    
    // modificador d'un atribut.
    public String modificadorAtribut(){
        return e;
    }
    
    
}



// modificador d'un mètode.
// modificar el valor d'un atribut.
// executar un dels seus mètodes.
// crear una instància.
// crear objecte clonat.
