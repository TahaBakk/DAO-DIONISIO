import java.util.Scanner;

/**
 * Created by x3727349s on 06/04/17.
 */
public class DAO {


/**
 * Crear col·leccions
 * Crear recursos
 * Fer consultes Xpath i fer consultes XQuery
 * Esborrar recursos i col·leccions
 */

    public static Scanner sc = new Scanner(System.in);

    public static String rutaMondial;
    public static String nameBBDD;
    public static String consulta;
    public static String nomColeccion;
    public static String nomRecurs;
    public static String rutaExist = "xmldb:exist://localhost:8080/exist/xmlrpc";
    public static String drivers = "org.exist.xmldb.DatabaseImpl";



    public static void coneccion(){

        ClientSession session = new ClientSession("localhost", 1984, "admin", "admin");

    }

    public static void createColecciones(){

    }

    public static void createResursos(){

    }

    public static void consultas(){

    }

    public static void deleteColecciones(){

    }

    public static void deleteRecursos(){

    }


}
