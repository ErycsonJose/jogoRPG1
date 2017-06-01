
public class Fada extends ReinoGelo{
private int durabilidadeMagia = 10;


Fada(){
	
}
public void incluirPontosDevida(){
	super.incluirPontosDeVida(3);
	
}
public int usarMagia(ReinoFogo vida){
	if((this.durabilidadeMagia > 0)&&(this.getPontosDeVida() > 0)){
		this.durabilidadeMagia--;
		vida.retiraPontosDeVida(1);
		
	}
	else{
	     this.durabilidadeMagia--;
	}
	return durabilidadeMagia;
}
public int getDurabilidadeMagia() {
	return durabilidadeMagia;
}
private void setDurabilidadeMagia(int durabilidadeMagia) {
	this.durabilidadeMagia = durabilidadeMagia;
}

}
