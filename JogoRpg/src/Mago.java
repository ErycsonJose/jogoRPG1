
public class Mago extends ReinoFogo{
private int quantidadePoMagico = 10;

   Mago(){
	
   }
public int usarPoMagico(ReinoGelo vida){
	if((this.quantidadePoMagico > 0)&&(this.getPontosDeVida() > 0)){
		quantidadePoMagico--;
		vida.retiraPontoDeVida(1);
	}
	else{
		quantidadePoMagico--;
	}
	return quantidadePoMagico;
}
public void incluirPontosDeVida(){
	super.setPontosDeVida(1);
}

public int getQuantidadePoMagico() {
	return quantidadePoMagico;
}

private void setQuantidadePoMagico(int quantidadePoMagico) {
	this.quantidadePoMagico = quantidadePoMagico;
}
   
}
