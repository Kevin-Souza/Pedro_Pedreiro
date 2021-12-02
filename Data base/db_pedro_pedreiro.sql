-- Criando o banco de dados
CREATE DATABASE  IF NOT EXISTS db_pedro_pedreiro; 
USE db_pedro_pedreiro;

-- Criando as tabelas
CREATE TABLE cliente (
  -- Classe Pessoa
  id_cliente 		    	int 	 		PRIMARY KEY  NOT NULL AUTO_INCREMENT,
  nome 				    	varchar(100) 	NOT NULL,
  telefone 			    	varchar(20)  	NOT NULL,
  email 		        	varchar(150) 		NULL,
  documento					varchar(15)  	NOT NULL,
  data_nascimento       	datetime 	  	NOT NULL,
  -- Classe Cliente
  numero_cartao_fidelidade	varchar(150) 	NOT NULL,
  -- Classe Endereço
  logradouro 				varchar(100) 	NOT NULL,
  bairro 	 				varchar(100) 	NOT NULL,
  cep                  	 	varchar(9)   	NOT NULL,
  cidade                	varchar(100) 	NOT NULL,
  complemento           	varchar(250) 		NULL,
  numero                	varchar(15)  	NOT NULL,
  uf                    	varchar(2)   	NOT NULL    
); 

CREATE TABLE fornecedor (
  -- Classe Pessoa
  id_fornecedor		 		int 			PRIMARY KEY	  NOT NULL AUTO_INCREMENT,
  nome 			     		varchar(100) 	NOT NULL,
  telefone 			 		varchar(20)  	NOT NULL,
  email 			 		varchar(150) 		NULL,
  documento			 		varchar(15)  	NOT NULL,
  data_nascimento 	 		datetime     	NOT NULL,
  -- Classe Fornecedor
  razao_social 		 		varchar(45)  	NOT NULL,
  inscricao_estadual 		varchar(45)  	NOT NULL,
  categoria 		 		varchar(45)  	NOT NULL,
  tipo_produto 		 		varchar(45)  	NOT NULL, 
  -- Classe Endereço
  logradouro 		 		varchar(100) 	NOT NULL,
  bairro 			 		varchar(100) 	NOT NULL,
  cep    			 		varchar(9)   	NOT NULL,
  cidade 		    		varchar(100) 	NOT NULL,
  complemento 	    		varchar(250) 		NULL,
  numero 			 		varchar(15)  	NOT NULL,
  uf     			 		varchar(2)   	NOT NULL
  );

CREATE TABLE funcionario (
  -- Classe Pessoa
  id_funcionario 			int        		NOT NULL PRIMARY KEY  AUTO_INCREMENT,
  nome 						varchar(100)    NOT NULL,
  telefone 					varchar(10)     NOT NULL,
  email 					varchar(150)     	NULL,
  documento			 		varchar(15)  	NOT NULL,
  data_nascimento 			datetime  		NOT NULL,
  -- Classe Funcionario
  salario 					double 	NOT NULL,
  pis 						varchar(45)		NOT NULL,  
  -- Classe Endereço
  logradouro 				varchar(100)   	NOT NULL,
  bairro 					varchar(100) 	NOT NULL,
  cep 						varchar(9) 		NOT NULL,
  cidade 					varchar(100) 	NOT NULL,
  complemento 				varchar(250)  		NULL,
  numero 					varchar(15) 	NOT NULL,
  uf 						varchar(2)		NOT NULL
) ;

CREATE TABLE produto (
  -- Classe Produto
  id_produto 				int 			NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nome_produto				varchar(50)		NOT NULL,
  descricao_reduzida 		varchar(150) 	NOT NULL,
  descricao_completa 		varchar(200) 	NOT NULL,
  marca						varchar(50)		NOT NULL,
  preco_custo 				double 			NOT NULL,
  preco_venda 				double			NOT NULL,
  qtd 						double 			NOT NULL,
  id_fornecedor 				  			INT,
  
  CONSTRAINT fk_fornecedor_produto FOREIGN KEY (id_fornecedor) REFERENCES fornecedor (id_fornecedor)
);

CREATE TABLE venda (
  -- Classe Venda
  id_venda       			int 			NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nota_fiscal    			varchar(45) 	NOT NULL,
  data_venda				datetime		NOT NULL,
  valor_venda    			double	     	DEFAULT 0,
  cliente_id     			int	   	 		NOT NULL,
  funcionario_id 			int 		 	NOT NULL,
  
  CONSTRAINT fk_cliente     FOREIGN KEY (cliente_id)     REFERENCES cliente (id_cliente),
  CONSTRAINT fk_funcionario FOREIGN KEY (funcionario_id) REFERENCES funcionario (id_funcionario)
) ;

CREATE TABLE item_venda (
  -- Classe Item Venda
  qtd 		 				double  		NOT NULL,
  sub_total  				double  		NOT NULL,
  num_item   				int 	 		NOT NULL,
  id_produto 				int 	 		NOT NULL,
  id_venda   				int 	 		NOT NULL,

  PRIMARY KEY (id_venda,num_item),  
  CONSTRAINT fk_produto_venda FOREIGN KEY (id_produto) REFERENCES produto (id_produto),
  CONSTRAINT fk_venda_item FOREIGN KEY (id_venda) REFERENCES venda (id_venda)
);

-- Selects
SELECT * FROM db_pedro_pedreiro.cliente;
SELECT * FROM db_pedro_pedreiro.fornecedor;
SELECT * FROM db_pedro_pedreiro.funcionario;
SELECT * FROM db_pedro_pedreiro.item_venda;
SELECT * FROM db_pedro_pedreiro.produto;
SELECT * FROM db_pedro_pedreiro.venda;