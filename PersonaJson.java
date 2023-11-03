package jsonjagd;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class PersonaJson {
    /*https://howtodoinjava.com/gson/google-gson-tutorial/ */
    public static void main(String[] args) {
        //Ejemplo 1 convertir objeto java en string json
        Persona pers1= new Persona();
        pers1.setNombre("Pepe");
        pers1.setApellido("Pérez");
        pers1.setEdad(20);
        pers1.setAficiones(Arrays.asList("cine", "fútbol", "LOL"));

        Persona pers2= new Persona();
        pers2.setNombre("María");
        pers2.setApellido("Martínez");
        pers2.setEdad(21);
        pers2.setAficiones(Arrays.asList("libros", "WWE", "música"));

        List<Persona> listaPersonasOut = Arrays.asList(pers1, pers2);        
        Gson gson = new Gson();
        String jsonPers = gson.toJson(listaPersonasOut);
        System.out.println("Lista personas: "+jsonPers);
        /*************************************************** */


        /****************************************** */
        /* ahora  de JSON a objeto */
        String sCadenaJson = "[{\"nombre\":\"Pepe\",\"apellido\":\"Pérez\",\"edad\":20,\"aficiones\":[\"cine\",\"fútbol\",\"LOL\"]},{\"nombre\":\"María\",\"apellido\":\"Martínez\",\"edad\":21,\"aficiones\":[\"libros\",\"WWE\",\"música\"]}]";
       // String sCadenaJson = "[{\"nombre\":\"Pepe\",\"apellido\":\"Pérez\",\"edad\":20},{\"nombre\":\"María\",\"apellido\":\"Martínez\",\"edad\":21 }]";
        
        List<Persona> listaPersonasIn  = gson.fromJson(sCadenaJson, new TypeToken<List<Persona>>(){}.getType()) ;
        System.out.println("JSON leído: "+listaPersonasIn );


    }
     
}
