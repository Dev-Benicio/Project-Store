DROP DATABASE IF EXISTS project_store;
CREATE DATABASE project_store;
USE project_store;

DROP TABLE IF EXISTS atendente;
DROP TABLE IF EXISTS venda;
DROP TABLE IF EXISTS cliente;
DROP TABLE IF EXISTS roupa;
DROP TABLE IF EXISTS calcado;
DROP TABLE IF EXISTS acessorio;


CREATE TABLE atendente (
id_atendente INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(50) NOT NULL,
cpf CHAR(11) NOT NULL,
endereco VARCHAR(100) NOT NULL,
telefone VARCHAR(11) NOT NULL,
turno VARCHAR(15) NOT NULL);

CREATE TABLE venda (
id_venda INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
metodo_pagamento VARCHAR(20) NOT NULL,
valor_venda DECIMAL(10,2) NOT NULL,
data_venda DATE NOT NULL,
id_atendente INT NOT NULL,
id_cliente INT NOT NULL,
id_roupa INT NULL,
id_calcado INT NULL,
id_acessorio INT NULL);

CREATE TABLE cliente (
id_cliente INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(50) NOT NULL,
cpf CHAR(11) NOT NULL,
endereco VARCHAR(100) NOT NULL,
telefone VARCHAR(15) NOT NULL,
numero_residencia INT(3) NOT NULL);

CREATE TABLE roupa (
id_roupa INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(30) NOT NULL,
descricao VARCHAR(50) NOT NULL,
marca VARCHAR(20) NOT NULL,
preco DECIMAL(10,2) NOT NULL,
tamanho VARCHAR(5) NOT NULL,
material VARCHAR(20) NOT NULL);

CREATE TABLE calcado (
id_calcado INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(20) NOT NULL,
descricao VARCHAR(50) NOT NULL,
marca VARCHAR(20) NOT NULL,
tipo VARCHAR(30) NOT NULL,
preco DECIMAL(10,2) NOT NULL,
numero INT(2) NOT NULL);

CREATE TABLE acessorio (
id_acessorio INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(30) NOT NULL,
descricao VARCHAR(50) NOT NULL,
preco DECIMAL(10,2) NOT NULL,
tipo VARCHAR(25) NOT NULL,
material VARCHAR(20) NOT NULL);

ALTER TABLE venda ADD CONSTRAINT venda_id_atendente_atendente_id_atendente FOREIGN KEY (id_atendente) REFERENCES atendente(id_atendente) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE venda ADD CONSTRAINT venda_id_cliente_cliente_id_cliente FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE venda ADD CONSTRAINT venda_id_roupa_roupa_id_roupa FOREIGN KEY (id_roupa) REFERENCES roupa(id_roupa) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE venda ADD CONSTRAINT venda_id_calcado_calcado_id_calcado FOREIGN KEY (id_calcado) REFERENCES calcado(id_calcado) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE venda ADD CONSTRAINT venda_id_acessorio_acessorio_id_acessorio FOREIGN KEY (id_acessorio) REFERENCES acessorio(id_acessorio) ON DELETE CASCADE ON UPDATE CASCADE;