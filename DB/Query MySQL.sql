DROP DATABASE IF EXISTS colegio;
CREATE SCHEMA IF NOT EXISTS colegio;
USE colegio;


-- Tabla estudiante:
CREATE TABLE IF NOT EXISTS estudiante (
  id_est INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  edad INT NULL,
  grado VARCHAR(45) NOT NULL,
  PRIMARY KEY (id_est));

-- Tabla docente:
CREATE TABLE IF NOT EXISTS docente (
  id_doc INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  edad INT NULL,
  curso VARCHAR(45) NOT NULL,
  estudiante_id_est INT NOT NULL,
  PRIMARY KEY (id_doc),
  INDEX fk_docente_estudiante1_idx (estudiante_id_est ASC),
  CONSTRAINT fk_docente_estudiante1
    FOREIGN KEY (estudiante_id_est)
    REFERENCES estudiante (id_est)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- Tabla acudiente:

CREATE TABLE IF NOT EXISTS acudiente (
  id_acu INT NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  apellido VARCHAR(45) NOT NULL,
  tipo VARCHAR(45) NOT NULL,
  telefono INT NOT NULL,
  estudiante_id_est INT NOT NULL,
  PRIMARY KEY (id_acu),
  INDEX fk_acudiente_estudiante_idx (estudiante_id_est ASC),
  CONSTRAINT fk_acudiente_estudiante
    FOREIGN KEY (estudiante_id_est)
    REFERENCES estudiante (id_est)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    

INSERT INTO estudiante (id_est,nombre, apellido,edad,grado)
	VALUES (1001,"Diego","Herrera",18,"once");
    
INSERT INTO docente (id_doc,nombre, apellido,edad,curso,estudiante_id_est) 
	VALUES (2001,"Nicolas","Armando",32,"Matematicas",1001);
    
INSERT INTO acudiente (id_acu,nombre, apellido,tipo,telefono,estudiante_id_est) 
	VALUES (3001,"Andres","Lopez","Padre",3167018,1001);
    
/*

DELETE FROM estudiante WHERE id_est = 100222;
CREATE OR REPLACE VIEW vista1 AS(SELECT * FROM estudiante WHERE grado = 'once');
SELECT id_est FROM estudiante;
SELECT * FROM estudiante WHERE id_est > 1004 AND id_est < 1008 ORDER BY estudiante.edad; 
CREATE OR REPLACE VIEW vista2 AS (SELECT id_est FROM estudiante WHERE  edad > 18);
SELECT * FROM docente INNER JOIN acudiente ON
docente.estudiante_id_est = acudiente.estudiante_id_est;
SELECT * FROM  vista2;
SELECT estudiante.nombre FROM estudiante INNER JOIN acudiente ON
estudiante.id_est = acudiente.estudiante_id_est WHERE edad >= 18;

DROP PROCEDURE IF EXISTS p_procedimiento;
DELIMITER $$
USE colegio$$
CREATE PROCEDURE p_procedimiento (id INT, nomb VARCHAR(60), apell VARCHAR(60), eda INT, grad VARCHAR(78))
BEGIN
		INSERT INTO estudiante(id_est, nombre, apellido, edad, grado) VALUES(id, nomb, apell, eda, grad);
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS p_procedimiento2;
DELIMITER $$
USE colegio$$
CREATE PROCEDURE p_procedimiento2()
BEGIN
	SELECT estudiante.id_est, docente.id_doc, acudiente.id_acu FROM estudiante INNER JOIN 
    docente ON estudiante.id_est = docente.id_doc INNER JOIN acudiente ON estudiante.id_est = acudiente.id_acu;
END$$
DELIMITER ;
CALL p_procedimiento2;

CREATE TABLE AUDITORIA_ESTUDIANTES_INSERT (
	id INT(6) AUTO_INCREMENT NOT NULL,
	fecha DATETIME NOT NULL,
    nombre VARCHAR(200),
    numero VARCHAR(45),
	descripcion VARCHAR(200) NOT NULL,
	PRIMARY KEY(id)
);
DROP TRIGGER IF EXISTS t_insercion;
CREATE 
    TRIGGER  t_insercion
 AFTER INSERT ON estudiante FOR EACH ROW 
    INSERT INTO AUDITORIA_ESTUDIANTES_INSERT (id , fecha , nombre , numero , usuario) VALUES (id , NOW() , NEW.nombre , NEW.id_est , CURRENT_USER()); 
    
*/

select * from estudiante;
select * from docente;
select * from acudiente;
