
public class Monstro extends ReinoGelo{

	Monstro(){
		
	}
	public int darSoco(ReinoFogo vida){
		int soco = 2;
		vida.retiraPontosDeVida(soco);
		return soco;
	}
	
}
