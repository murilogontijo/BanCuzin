package Conta;

import Cliente.Cliente;

public class contaCorrente extends Conta {

	public contaCorrente(Cliente client, double saldo) {
		super(client, saldo);
		this.cliente = client;
		this.saldo = saldo;
	}
	
}
