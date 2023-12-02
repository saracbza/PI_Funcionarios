
/**
 * Author:  sasac
 * Created: 10 de nov. de 2023
 */

-- criando o banco
CREATE DATABASE funcionarios
USE funcionarios

-- criando tabelas
CREATE TABLE cargo (
cod_cargo int primary key identity,
nome_cargo varchar(35) not null,
valor_por_hr money not null
)

CREATE TABLE senioridade (
cod_sen int primary key identity,
nivel varchar (6) not null,
porc_rec decimal(3,2)
)

CREATE TABLE funcionario (
cod_func int primary key identity,
nome varchar(50) not null,
cpf char(11) unique not null,
data_nasc date not null,
data_contrat date not null,
dependentes int 
)

CREATE TABLE pagamento (
cod_pagamento int primary key identity,
cod_func int not null,
cargo_sen varchar(45) not null,
salario money not null,
inss money not null,
irrf money not null,
fgts money not null,
data_pagamento date not null
)

CREATE TABLE cargo_funcionario (
cod_cargofunc int primary key identity,
cod_cargo int not null references cargo on delete cascade,
cod_func int not null references funcionario on delete cascade,
data_alt date not null
)

CREATE TABLE sen_funcionario (
cod_senfunc int primary key identity,
cod_sen int not null references senioridade on delete cascade,
cod_func int not null references funcionario on delete cascade,
data_alt date not null
)

-- atribuindo valores para testes
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Analista', 20.11)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Projetista', 22.62)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Gerente de Produção', 24.98)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Gerente de Vendas', 24.65)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Auxiliar de Produção', 12.54)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Engenheiro de Produção', 26.83)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Operador de Máquina', 19.44)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Almoxarife', 14.64)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Mecânico de Manuteção', 21.55)
INSERT INTO cargo (nome_cargo, valor_por_hr)
VALUES ('Operador de Produção', 19.46)

-- existem apenas 3 graus de senioridade
INSERT INTO senioridade (nivel) VALUES ('Júnior')
INSERT INTO senioridade (nivel, porc_rec) VALUES ('Pleno', 0.12)
INSERT INTO senioridade (nivel, porc_rec) VALUES ('Sênior', 0.15)

INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Manoel Rocha', '12345678910', '1992-09-18', '2021-09-12', 0)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Rosangela Silva', '98765432100', '2000-11-08', '2021-09-15', 1)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Sonia Marques', '54634869531', '1999-04-17', '2022-10-02', 2)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Josué Munhoz', '56684599244', '1999-04-17', '2022-10-02', 2)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Manoela Rodrigues', '98765315733', '2000-04-17', '2021-04-01', 0)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Ricardo Moraes', '96412764825', '1989-04-17', '2021-03-18', 0)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Abgail Fontana', '94387615833', '1991-04-17', '2022-08-06', 1)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Afonso Ferreira', '45376194634', '1990-04-17', '2020-10-09', 3)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Melissa Melinsk', '98346752819', '2001-04-17', '2021-05-11', 4)
INSERT INTO funcionario (nome, cpf, data_nasc, data_contrat, dependentes)
VALUES 
('Giuseppe Muller', '34698525764', '2004-04-17', '2022-11-27', 3)

INSERT INTO cargo_funcionario VALUES (1, 1, '2021-09-12')
INSERT INTO cargo_funcionario VALUES (2, 2, '2021-09-15')
INSERT INTO cargo_funcionario VALUES (4, 3, '2022-10-02')
INSERT INTO cargo_funcionario VALUES (3, 4, '2022-10-02')
INSERT INTO cargo_funcionario VALUES (8, 5, '2021-04-01')
INSERT INTO cargo_funcionario VALUES (9, 6, '2021-03-18')
INSERT INTO cargo_funcionario VALUES (6, 7, '2022-08-06')
INSERT INTO cargo_funcionario VALUES (5, 8, '2020-10-09')
INSERT INTO cargo_funcionario VALUES (10, 9, '2021-05-11')
INSERT INTO cargo_funcionario VALUES (7, 10, '2022-11-27')

INSERT INTO sen_funcionario VALUES (3, 1, '2021-09-12')
INSERT INTO sen_funcionario VALUES (2, 2, '2021-09-15')
INSERT INTO sen_funcionario VALUES (1, 3, '2022-10-02')
INSERT INTO sen_funcionario VALUES (3, 4, '2022-10-02')
INSERT INTO sen_funcionario VALUES (1, 5, '2021-04-01')
INSERT INTO sen_funcionario VALUES (1, 6, '2021-03-18')
INSERT INTO sen_funcionario VALUES (1, 7, '2022-08-06')
INSERT INTO sen_funcionario VALUES (2, 8, '2020-10-09')
INSERT INTO sen_funcionario VALUES (3, 9, '2021-05-11')
INSERT INTO sen_funcionario VALUES (1, 10, '2022-11-27')

INSERT INTO pagamento VALUES 
(1, 'Analista Sênior', 2546.98, 559.25, 568.35, 46.98, '2022-11-20')
INSERT INTO pagamento VALUES 
(2, 'Projetista Pleno', 3546.98, 566.80, 154.66, 96.56, '2022-11-20')
INSERT INTO pagamento VALUES 
(3, 'Gerente de Vendas Junior', 2986.98, 154.66, 566.80, 54.66, '2022-11-20')
INSERT INTO pagamento VALUES 
(4, 'Gerente de Produção Senior', 6589.66, 494.69, 658.33, 94.69, '2022-11-05')
INSERT INTO pagamento VALUES 
(5, 'Almoxarife Junior', 9865.30, 557.50, 234.55, 57.50, '2022-11-20')
INSERT INTO pagamento VALUES 
(6, 'Mecânico de Manutenção Junior', 1235.69, 234.55, 234.55, 35.69, '2022-11-20')
INSERT INTO pagamento VALUES 
(7, 'Engenheiro de Produção Junior', 1589.47, 658.33, 235.69, 89.47, '2022-11-20')
INSERT INTO pagamento VALUES 
(8, 'Auxiliar de Produção Pleno', 6532.86, 344.25, 234.55, 96.56, '2022-11-05')
INSERT INTO pagamento VALUES 
(9, 'Operador de Produção Senior', 4856.25, 327.65, 235.69, 35.69, '2022-11-20')
INSERT INTO pagamento VALUES 
(10, 'Operador de Máquina Junior', 1545.36, 123.60, 546.98, 44.25, '2022-11-05')
