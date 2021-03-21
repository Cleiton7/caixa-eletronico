CREATE TABLE TB_CLIENTE (
	id_cliente bigint NOT NULL AUTO_INCREMENT,
	cpf_cliente varchar(50) NOT NULL,
	nm_cliente varchar(50) NOT NULL,
	sd_conta_cliente bigint NOT NULL,
	fk_id_conta bigint,
	PRIMARY KEY (id_cliente),
	FOREIGN KEY(fk_id_conta) REFERENCES TB_CONTA(id_conta)
)