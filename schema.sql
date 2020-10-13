

CREATE DATABASE sistema_pais1;

CREATE TABLE aeropuertos (
    aeropuerto_id INTEGER UNSIGNED PRIMARY KEY,
    pais VARCHAR(50) NOT NULL
);

CREATE TABLE aviones (
    avion_id INTEGER UNSIGNED PRIMARY KEY,
    origen VARCHAR(50) NOT NULL,
    destino VARCHAR(50) NOT NULL,
    matricula VARCHAR(10) NOT NULL,
    cantidad_pasajeros INTEGER(3) NOT NULL,
    fecha_vuelo DATETIME NOT NULL,
    aeropuerto_id INTEGER UNSIGNED NOT NULL,
    FOREIGN KEY (aeropuerto_id) REFERENCES aeropuertos(aeropuerto_id)
);

CREATE TABLE rutas (
    ruta_id INTEGER UNSIGNED PRIMARY KEY,
    pais VARCHAR(50) NOT NULL,
    origen VARCHAR(50) NOT NULL,
    destino VARCHAR(50) NOT NULL,
    estado ENUM('activa', 'disponible') NOT NULL,
    aeropuerto_id INTEGER UNSIGNED NOT NULL,
    FOREIGN KEY (aeropuerto_id) REFERENCES aeropuertos(aeropuerto_id)
);

