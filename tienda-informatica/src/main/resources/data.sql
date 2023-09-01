DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

CREATE TABLE fabricantes(
	codigo int auto_increment,
    nombre nvarchar(100),
    PRIMARY KEY(codigo)
);

CREATE TABLE articulos(
	codigo int auto_increment,
    nombre nvarchar(100),
    precio int,
    fabricante int,
    PRIMARY KEY(codigo),
    FOREIGN KEY(fabricante) REFERENCES fabricantes (codigo)
    ON DELETE cascade
    ON UPDATE cascade
);

INSERT INTO fabricantes (nombre) VALUES ('Sony');
INSERT INTO fabricantes (nombre) VALUES ('Creative Labs');
INSERT INTO fabricantes (nombre) VALUES ('Hewlett-Packard');
INSERT INTO fabricantes (nombre) VALUES ('Iomega');
INSERT INTO fabricantes (nombre) VALUES ('Fujitsu');
INSERT INTO fabricantes (nombre) VALUES ('Winchester');

INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Hard drive',240,5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Memory',120,6);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('ZIP drive',150,4);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Floppy disk',5,6);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Monitor',240,1);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('DVD drive',180,2);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('CD drive',90,2);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Printer',270,3);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Toner cartridge',66,3);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('DVD burner',180,2);