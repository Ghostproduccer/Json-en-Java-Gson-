package jsonjagd;

import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import com.google.gson.GsonBuilder;

public class FichJson2Out {
    public static void main(String[] args) {
        Persona pers1 = new Persona();
        pers1.setNombre("Pepe");
        pers1.setApellido("Pérez");
        pers1.setEdad(20);
        pers1.setAficiones(Arrays.asList("cine", "fútbol", "LOL"));

        Persona pers2 = new Persona();
        pers2.setNombre("María");
        pers2.setApellido("Martínez");
        pers2.setEdad(21);
        pers2.setAficiones(Arrays.asList("libros", "WWE", "música"));

        List<Persona> listaPersonasOut = Arrays.asList(pers1, pers2);
        String RUTA_FICH = "C:\\Users\\ariza\\ownCloud\\IES-PioBaroja22-23\\DAM2-AccesoDatos\\javaAccesoDatos2\\javaAccesoDatos\\tema2jagd\\src\\main\\clase\\jsonjagd\\";
        try {

            Writer writer = Files.newBufferedWriter(Paths.get(RUTA_FICH + "persona.json"));
            // crear instancia Gson
            // Gson gson = new Gson();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(listaPersonasOut, writer);
            writer.close();

        } catch (IOException ioex) {
            ioex.printStackTrace();
        }

    }
}
