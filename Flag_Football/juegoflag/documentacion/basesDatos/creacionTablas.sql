 CREATE TABLE equipo (
    id          INTEGER    PRIMARY KEY,
    nombre      CHAR (100) UNIQUE
                           NOT NULL,
    pais CHAR (100),
    estadio CHAR (100),
    entrenador    CHAR    NOT NULL
);

CREATE TABLE jugador (
    id        INTEGER   PRIMARY KEY,
    nombre    CHAR (50) NOT NULL,
    apellidos CHAR (50) NOT NULL,
    posicion CHAR (50),
    numero INTEGER NOT NULL,
    equipo_actual      CHAR(100)
);

CREATE TABLE jugador_equipo (
    id         INTEGER PRIMARY KEY,
    idEquipo         REFERENCES equipo (id),
    idJugador          REFERENCES jugador (id)
);

