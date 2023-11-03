package jsonjagd;

import java.io.FileWriter;

import java.nio.charset.StandardCharsets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class FichJson1 {
    public static void main(String[] args) {
        
        JsonObject objetoJson = new JsonObject();
        objetoJson.addProperty("coche", "rojo");
        objetoJson.addProperty("temperatura",22.5);
        objetoJson.addProperty("año", 2010);

        JsonObject objetoJson2 = new JsonObject();
        objetoJson2.addProperty("Hola", "mundo");

        //Insertamos objeto 2 en el objeto
        objetoJson.add("mensaje", objetoJson2);

        //ahora objeto jsonArray        
        JsonArray jsonArrayMeses = new JsonArray();
        jsonArrayMeses.add("Enero");
        jsonArrayMeses.add("Febrero");
        jsonArrayMeses.add("Marzo");
        objetoJson.add("meses", jsonArrayMeses);
        System.out.println("Objeto json: "+objetoJson.toString());
        String RUTA_FICH = "E:\\Tema2-clase\\";
        try {
            /*Writer writer = Files.newBufferedWriter( Paths.get(RUTA_FICH+"objeto.json"));
            Gson gson = new Gson();
            gson.toJson(objetoJson, writer);
            writer.close();*/
            FileWriter file = new FileWriter(RUTA_FICH+"objeto.json", StandardCharsets.UTF_8);
            file.write(objetoJson.toString());
            file.close();
            System.out.println("Fichero creado");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*escribir a fichero https://howtodoinjava.com/java/library/json-simple-read-write-json-examples/
         * 
         otros ejemplos: https://attacomsian.com/blog/gson-read-write-json
         */
        
    }
}
