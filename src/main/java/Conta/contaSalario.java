package Conta;

import Cliente.Cliente;

public class contaSalario extends Conta {
	
	public contaSalario (Cliente client, double saldo) {
		super(client, saldo);
		this.cliente = client;
		this.saldo = saldo;
	}
	
}