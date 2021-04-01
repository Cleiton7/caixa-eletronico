CREATE TABLE TB_CLIENTE (
	id_cliente bigint NOT NULL AUTO_INCREMENT,
	cpf_cliente varchar(50) NOT NULL,
	nm_cliente varchar(50) NOT NULL,
	sd_cliente decimal(14,2) NOT NULL,
	PRIMARY KEY (id_cliente)
)