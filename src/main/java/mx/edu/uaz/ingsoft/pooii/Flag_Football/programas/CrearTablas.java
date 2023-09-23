package mx.edu.uaz.ingsoft.pooii.Flag_Football.programas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Logger;

public class CrearTablas {
    public static final int ERR_DRIVER_NOT_FOUND = 10;
    public static final String MSG_DRIVER_OK = "Se cargó correctamente el driver";
    public static final String MSG_ERR_DRIVER = "No se pudo cargar el controlador";
    public static final String DRIVER_CLASS = "org.sqlite.JDBC";
    public static void main(String[] args) {
        Logger log = Logger.getAnonymousLogger();
        try {
            Class.forName(DRIVER_CLASS);
            log.info(MSG_DRIVER_OK);
        } catch (Exception e) {
            log.severe(MSG_ERR_DRIVER);
            System.exit(ERR_DRIVER_NOT_FOUND);
        }
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:saluuuuuud.db"
            );
            Statement statement = conn.createStatement();
            statement.executeUpdate("""
                            CREATE TABLE equipo (
                               id          INTEGER    PRIMARY KEY,
                               nombre      CHAR (100) UNIQUE
                                                      NOT NULL,
                               pais CHAR (100),
                               estadio CHAR (100),
                               entrenador    CHAR    NOT NULL
                           );
                    """
            );
            statement.close();
            conn.close();
        } catch (Exception e) {
            log.severe("Error al acceder a la BD");
            System.exit(11);
        }
    }
}