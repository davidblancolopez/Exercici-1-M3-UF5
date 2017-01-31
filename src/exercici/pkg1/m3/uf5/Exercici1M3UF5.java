
package exercici.pkg1.m3.uf5;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Logger;


public class Exercici1M3UF5 {


    public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException {
        Element e = new Element();
        InfoElement info = new InfoElement(e);
        
        
        System.out.println("1. nom de la superclasse: " + info.nomSuperClasse());
        System.out.println("2. nom de la classe complet: " + info.nomClasseComplet());
        System.out.println("3. només el nom de la classe: " + info.nomClasse());
        System.out.println("4. array d'atributs (Field): " + info.arrayAtributs());
        System.out.println("5. array de mètodes (Method): " + info.arrayMetodes());
        System.out.println("6. array dels noms dels atributs: " + info.arrayNomsAtributs());
        System.out.println("7. array dels noms dels mètodes: " + info.arrayNomsMetodes());
        System.out.println("8. modificador d'un atribut: " + info.modificadorAtribut());
        System.out.println("9. modificador d'un mètode: " + info.modificadorMetode());
//        System.out.println("10.executar un dels seus mètodes: " + info.executarMetodes());
        
        info.crearInstancia();
        
        Element clonat = info.clone();
        
        System.out.println("\n Clons");
        System.out.println(e.toString());
        System.out.println(info.toString());
       

        
        
    }
    
}
