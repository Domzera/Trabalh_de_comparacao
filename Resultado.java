public class Resultado {
	
	private String nome,tipo;
	private int valorCres,valorDecre;
	
	//Constructor
	public Resultado(){
	}
	
	public Resultado(String nome,String tipo,int valorCres, int valorDecre) {
		setTipo(tipo);
		setNome(nome);
		setValorCres(valorCres);
		setValorDecre(valorDecre);
	}
	
	//Setters
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setValorCres(int valorCres){
		this.valorCres=valorCres;
	}
	public void setValorDecre(int valorDecre){
		this.valorDecre=valorDecre;
	}
	
	//Getters
	public String getTipo(){
		return this.tipo;
	}
	public String getNome(){
		return this.nome;
	}
	public int getValorCres(){
		return this.valorCres;
	}
	public int getValorDecre(){
		return this.valorDecre;
	}
}

