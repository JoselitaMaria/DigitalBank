package SistemaBancario;

public class Pessoa {

	private String nome;
	private String CPF;
	private String dataDeNascimento;// dados incluidos
	private String Rg;// dados incluidos
	private String endere�o; // dados incluidos

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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + ", dataDeNascimento=" + dataDeNascimento + ", Rg=" + Rg
				+ ", endere�o=" + endere�o + "]";
	}

}
