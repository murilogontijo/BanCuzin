package agencia;




public class Agencia {
	/**
	*  @author Marcos
	*  @author Murilo
	*  Model de Agencias
	*  
	*/
	private int idAgencia;
	private String nome;
	private int codigo;
	private String endereco;
	private String gerente;
	
	
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	public Agencia(int idAgencia, String nome, int codigo, String endereco, String gerente) {
		super();
		this.idAgencia = idAgencia;
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
		this.gerente = gerente;
	}
	
	public Agencia() {
		super();
	}
	@Override
	public String toString() {
		return "Nome: " + nome +"\n" +
			   "Codigo: " + codigo +"\n"+
			   "Endereço: " + endereco +"\n"+
			   "Gerente: " + gerente + "\n";
	}
	
	
	
}
