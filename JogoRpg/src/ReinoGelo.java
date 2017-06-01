
public class ReinoGelo extends Criacao{
private String nome;
private int pontosDeVida;

ReinoGelo(){
	
}
public void retiraPontoDeVida(int ponto){
	this.pontosDeVida -= ponto;
}
public void incluirPontosDeVida(int ponto){
	this.pontosDeVida += ponto;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getPontosDeVida() {
	return pontosDeVida;
}
public void setPontosDeVida(int pontosDeVida) {
	this.pontosDeVida = pontosDeVida;
}

}
