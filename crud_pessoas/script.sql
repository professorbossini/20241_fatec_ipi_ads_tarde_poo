-- Active: 1715685873518@@localhost@5432@20241_fatec_ipi_poo_pessoas
CREATE TABLE tb_pessoa (
    cod_pessoa SERIAL PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    fone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NULL,
    idade INT NOT NULL
);

SELECT * FROM tb_pessoa;