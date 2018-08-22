public class Carro {
	//Atributos
	private String cor;
	private String modelo;
	private String fabricante;
	private int anoFabricacao;
	
	//Construtor(es)
	public Carro(String cor, String modelo, String fabricante, int anoFabricacao){
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoFabricacao = anoFabricacao;
	}
	
	//Métodos
	public String getCor(){
		return cor;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public String getFabricante(){
		return fabricante;
	}
	public void setFabricante(String fabricante){
		this.fabricante = fabricante;
	}
	public int getAnoFabricacao(){
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}
}
