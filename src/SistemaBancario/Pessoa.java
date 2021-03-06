package SistemaBancario;

public class Pessoa {

	private String nome;
	private String CPF;
	private String dataDeNascimento;// dados incluidos
	private String Rg;// dados incluidos
	private String enderešo; // dados incluidos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getRg() {
		return Rg;
	}

	public void setRg(String rg) {
		Rg = rg;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + ", dataDeNascimento=" + dataDeNascimento + ", Rg=" + Rg
				+ ", enderešo=" + enderešo + "]";
	}

}
