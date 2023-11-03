package jsonjagd;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class FichJson3In {
    final static String RUTA_FICH = "C:\\Users\\ariza\\ownCloud\\IES-PioBaroja22-23\\DAM2-AccesoDatos\\javaAccesoDatos2\\javaAccesoDatos\\tema2jagd\\src\\main\\clase\\jsonjagd\\";
    public static void main(String[] args) {
        try {
            //Creamos instancia JSON
            Gson gson = new Gson();
            //creamos el reader
            Reader reader = Files.newBufferedReader( Paths.get(  RUTA_FICH+"persona.json") );
            //Convertimos el fichero a lista de objetos JSON
            List<Persona> listaPersonaIn = Arrays.asList(gson.fromJson(reader, Persona[].class ));
            listaPersonaIn.forEach(System.out::println);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
