
public class Cavaleiro extends ReinoFogo {
private int durabilidadeEspada = 10;

Cavaleiro(){
	
}
public int usarEspada(ReinoGelo vida){
	if((this.durabilidadeEspada > 0)&&(this.getPontosDeVida() > 0)){
		this.durabilidadeEspada--;
		vida.retiraPontoDeVida(1);
	}
	else{
		durabilidadeEspada--;	
	}
	return durabilidadeEspada;
}

public int getDurabilidadeEspada() {
	return durabilidadeEspada;
}

private void setDurabilidadeEspada(int durabilidadeEspada) {
	this.durabilidadeEspada = durabilidadeEspada;
}

}
