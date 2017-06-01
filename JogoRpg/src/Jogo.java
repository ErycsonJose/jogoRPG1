
public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Reino do Fogo
		 */
		Cavaleiro cv = new Cavaleiro();
		cv.setNome("Lancelot");
		cv.setPontosDeVida(10);
		
		Mago mg = new Mago();
		mg.setNome("Gandalf");
		mg.setPontosDeVida(10);
		
		/*
		 * Reino do Gelo
		 */
		Fada fd = new Fada();
		fd.setNome("Sininho");
		fd.incluirPontosDevida();
		
		Monstro mt = new Monstro();
		mt.setNome("Smigol");
		mt.incluirPontosDeVida(10);
		/*
		 * Batalha
		 */
		Batalha batalha = new Batalha();
		batalha.setPersonagemFogo(cv);
		batalha.setPresonagemGelo(fd);
		
		fd.usarMagia(cv);
		cv.usarEspada(fd);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		cv.usarEspada(fd);
		cv.usarEspada(fd);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		fd.usarMagia(cv);
		
		System.out.println("A fada tem "+ fd.getPontosDeVida()+" pontos de vida");
		System.out.println("O cavaleiro tem "+ cv.getPontosDeVida()+" pontos de vida");
		
		System.out.println(batalha.vencedor());
		System.out.println(batalha.perdedor());
		
	}

}
