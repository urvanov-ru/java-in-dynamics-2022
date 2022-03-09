CREATE TABLE creature (
    id SERIAL PRIMARY KEY,
    health DOUBLE PRECISION,
    x DOUBLE PRECISION,
    y DOUBLE PRECISION
);

INSERT INTO creature(health, x, y)
VALUES(100.0, 10.2, -3.4);

INSERT INTO creature(health, x, y)
VALUES(200.0, 50.2, -34.4);

INSERT INTO creature(health, x, y)
VALUES(150.0, 3.2, 54.4);