
package exercici.pkg1.m3.uf5;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Logger;


public class Exercici1M3UF5 {


    public static void main(String[] args) {
        Element e = new Element();
        InfoElement info = new InfoElement(e);
        
        
        System.out.println("1. nom de la superclasse: " + info.nomSuperClasse());
        System.out.println("2. nom de la classe complet: " + info.nomClasseComplet());
        System.out.println("3. només el nom de la classe: " + info.nomClasse());
        System.out.println("4. array d'atributs (Field): " + info.arrayAtributs());
        System.out.println("5. array de mètodes (Method): " + info.arrayMetodes());
        System.out.println("6. array dels noms dels atributs: " + info.arrayNomsAtributs());
        System.out.println("7. array dels noms dels mètodes: " + info.arrayNomsMetodes());



//• modificador d'un atribut.
//• modificador d'un mètode.
//• modificar el valor d'un atribut.
//• executar un dels seus mètodes.
//• crear una instància.
//• crear objecte clonat.
        
        
//        Element el = new Element(4, "BATMAN");
//        
//        Method[] metodes = el.getClass().getDeclaredMethods();
//        Method[] metodesTots = el.getClass().getMethods();
//        
//        
//        System.out.println("TOTS els metodes: \n"
//                + Arrays.toString(metodesTots));
//        
//        System.out.println("Metodes DECLARATS: \n"
//                + Arrays.toString(metodes));
        
        
        
    }
    
}
