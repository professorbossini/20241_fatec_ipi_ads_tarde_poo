-- Active: 1715278887504@@127.0.0.1@5432@20241_fatec_ipi_poo_pessoas@public
CREATE TABLE tb_pessoa (
    cod_pessoa SERIAL PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    fone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NULL,
    idade INT NOT NULL
);

SELECT * FROM tb_pessoa;