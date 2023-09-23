package mx.edu.uaz.ingsoft.pooii.Flag_Football.programas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;
public class ConsultarTablas {
    public static final int ERR_DRIVER_NOT_FOUND = 10;
    public static final String MSG_DRIVER_OK = "Se cargó correctamente el driver";
    public static final String MSG_ERR_DRIVER = "No se pudo cargar el controlador";
    public static final String DRIVER_CLASS = "org.sqlite.JDBC";
    public static void main(String[] args) {
        Logger log = Logger.getAnonymousLogger();
        try{
            Class.forName(DRIVER_CLASS);
            log.info(MSG_DRIVER_OK);
        }catch(Exception e){
            log.severe(MSG_ERR_DRIVER);
            System.exit(ERR_DRIVER_NOT_FOUND);
        }
        try{
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:saluuuuuud.db"
            );
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("""
                    select * from equipo
            """
            );
            while(resultSet.next()){
                System.out.println("id = "+resultSet.getInt("id")+
                        "nombre = "+resultSet.getString("nombre")+
                        "pais = "+resultSet.getString("pais")+
                        "estadio = "+resultSet.getString("estadio")+
                        "entrenador = "+resultSet.getString("entrenador"));
            }
            statement.close();
            conn.close();
        }catch(Exception e){
            log.severe("Error al acceder a la BD");
            log.severe(e.getMessage());
            System.exit(11);
        }


    }
}
