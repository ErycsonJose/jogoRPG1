
public class ReinoFogo extends Criacao {
private String nome;
private int PontosDeVida;

ReinoFogo(){
	
}
public void retiraPontosDeVida(int ponto){
	this.PontosDeVida -= ponto;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getPontosDeVida() {
	return PontosDeVida;
}
public void setPontosDeVida(int pontosDeVida) {
	PontosDeVida = pontosDeVida;
}

}
