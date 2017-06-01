
public class Criacao {

	Criacao(){
		
	}
	public boolean personagemFogoMorreu(ReinoFogo fogo){
		if(fogo.getPontosDeVida() <= 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	public boolean personagemGeloMorreu(ReinoGelo gelo){
		if(gelo.getPontosDeVida() <= 0){
			return true;
		}
		else{
			return false;
		}
	}
}
