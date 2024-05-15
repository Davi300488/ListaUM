public class Animal {
	private String nome;
	private String raca;
	private double idade;
	
	public Animal(String novoNome, String novoRaca, double novoIdade) {
	this. nome = novoNome;
	this. raca = novoRaca;
	this. idade = novoIdade;
	}
	
	public Animal(String novoNome, double novoIdade) {
		this. nome = novoNome;
		this. idade = novoIdade;
		}
	public String getNome() {
		return nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public double getIdade() {
		return idade;
	}
	
	public void  setNome(String novoNome) {
		this.nome= novoNome;
	}
	
	public void  setRaca(String novoRaca) {
		this.raca= novoRaca;
	}
	
	public void  setIdade(double novoIdade) {
		this.idade= novoIdade;
	}
	
	public static void main (String[] agrs) {
		 System.out.println ("classe testada");
	 }
	
	public String imitar(String a) {
		return a;
	}
	public String imprimirInformacoes() {
		return "O nome do seu animal é" + this.nome +"e a raça dele é"+this.raca +"e sua idade é"+this.idade + ".";
	}
}
