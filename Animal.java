package mtodos3;

public class Animal {

	private float tamanho;
	private String cor;
	
	public Animal () {
	}

	public Animal (String cor) {
		this.cor = cor;
	}
	public Animal (String cor, float tamanho) {
		this.cor = cor;
		this.tamanho = tamanho;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
