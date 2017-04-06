import org.basex.api.client.ClientSession;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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



    public static void coneccion() throws IOException {

        ClientSession session = new ClientSession("localhost", 1984, "admin", "admin");

    }

    public static void createColecciones(String username, String pass, String ip) throws IOException {
        BaseXClient session = new BaseXClient(ip, 1984, username, pass);
        session.execute("create db TahaBakk");
        System.out.println(session.info());
    }


    public static void createResursos(String username, String pass, String ip) throws IOException {
        BaseXClient session = new BaseXClient(ip, 1984, username, pass);
        ByteArrayInputStream bais = new ByteArrayInputStream("<x>Hello im taha !^_^!</x>".getBytes());
        session.add("TahaBakk/UF3-ExamenF-Plantes.xml", bais);
        System.out.println(session.info());
    }

    public static void consultas(String username, String pass, String ruta, String bbdd, String consulta, String ip, String tipo){

        /*try (ClientSession session = new ClientSession(ip, 1984, username, pass)) {//IP, PUERTO, USERNAME, PASSWORD
            session.execute(new CreateDB(bbdd, ruta));//BBDD que se creara, y ruta del fitxero
            try (ClientQuery query = session.query(consulta)) {//consulta
                if (tipo == "consulta"){
                    System.out.println(query.execute());//imprimir resultado
                }else if (tipo.equalsIgnoreCase("parserXML")){
                    parserXML(query.execute(),"tercera");
                }else if (tipo.equalsIgnoreCase("segunda")){
                    parserXML(query.execute(),"segunda");
                }
            } catch (SAXException | ParserConfigurationException e) {
                e.printStackTrace();
            }
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    public static void deleteColecciones(){

    }

    public static void deleteRecursos(){

    }


}
