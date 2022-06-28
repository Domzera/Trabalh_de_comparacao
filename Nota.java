public class Nota {
	
	private String nome;
	private double valor;
	
	public Nota (String nome,double valor) {
		setNome(nome);
		setValor(valor);
	}
	
	public void setNome(String nome){
	
		if(nome.isEmpty())
			throw new IllegalArgumentException("Nome nau pode ser vazio");
		
		if(nome.trim().length()<2)
			throw new IllegalArgumentException("Nome nau pode ser menor que dois caracteres");
		
		this.nome =nome;
	}
	
	public void setValor(double valor){
	
		if(valor<0 || valor >10)
			throw new IllegalArgumentException("Valor de nota invalido.\nUse valores entre 0 e 10!");
		
		this.valor=valor;
	}
	
	public double getValor(){
		return valor;
	}
	
	@Override
	public String toString(){
		return String.format("[%-10s, %4.1f]", nome,valor);
	}
}

