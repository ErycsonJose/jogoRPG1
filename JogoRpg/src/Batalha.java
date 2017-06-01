
public class Batalha {
private ReinoFogo personagemFogo;
private ReinoGelo personagemGelo;

Batalha(){
	
}
public String vencedor(){
    boolean vF = personagemFogo.personagemFogoMorreu(personagemFogo);
    if(vF == false){
    	return "Vencedor: Reino do Fogo!";
    }
    else{
    	return "Vencedor: Reino do Gelo!";
    } 
}
public String perdedor(){
	boolean vG = personagemGelo.personagemGeloMorreu(personagemGelo);
	if (vG == true){
		return "Perdedor: Reino do Gelo!";
	}
	else{
		return "Perdedor: Reino do Fogo!";
	}
}
public ReinoFogo getPersonagemFogo() {
	return personagemFogo;
}
public void setPersonagemFogo(ReinoFogo personagemFogo) {
	this.personagemFogo = personagemFogo;
}
public ReinoGelo getPresonagemGelo() {
	return personagemGelo;
}
public void setPresonagemGelo(ReinoGelo presonagemGelo) {
	this.personagemGelo = presonagemGelo;
}


}
