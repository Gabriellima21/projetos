USE sucos; 

ALTER TABLE tbcliente1 ADD PRIMARY KEY (CFP);

ALTER TABLE tbcliente1 ADD COLUMN (Data_Nascimento DATE); 

 INSERT INTO tbcliente1 (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,
 ESTADO,CEP,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA,Data_Nascimento)
 VALUES('46024458810', 'Gabriel','Rua1','Rua2', 'Vila Remédios','São Paulo',
'São Paulo','05100900',22, 2222222, 'M', 15135451, 0, '1998-05-14');

