import java.util.Random;
import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;

public class ProjetoJogoArmelin01 {
	
	public static void main(String[] args) {
		
		/* AUTOR: FERNANDO ARMELIN
		 * NOME DO JOGO: Labirinto do Minotauro
		 * Atividade realizada no m�dulo de L�gica de Programa��o da Imers�o Java Xpert 
		 */
		
		Random random = new Random();
		
		//INFORMAR AS VARIAVEIS
		String jogador, time;
		//String personagem [] = new String [Teseo; Hipolita; Jasao; Medeia];
		int avatar = 0, argo = 0, caixa, opcaoh = 0, batalhah = 0, opcaoc = 0;
		//int caixa [] = new int [2]; // PENDENDE DE INFORMAR OS VALORES DO VETOR SENDO "1" E "2".
		double num = 0, n, somah=0, somam=0;
		
		//caixa [0] = 1;
		//caixa [1] = 2;
			
		Scanner leitor = new Scanner(System.in);
		
		// Labirinto do Minotauro
		
		System.out.println("Bem vindo ao Labirinto do Minotauro !!!");
		System.out.println("A partir deste momento, vc pode deixar as suas esperan�as aqui ....hahahaha");
		System.out.println("Sua �nica chance de viver � matando o TEM�VEL MINOTAURO !!!!");
		System.out.println("Qual o seu nome, meu caro pretendente a heroi?");
		jogador = leitor.nextLine();
		System.out.println("Informe a quem voc� defende, qual � a a sua cidade-estado");
		time = leitor.nextLine();
				
		System.out.println("Escolha o seu avatar");
		System.out.println("1 - Teseo");
		System.out.println("2 - Hip�lita");
		System.out.println("3 - Jas�o");
		System.out.println("4 - Medeia");
		avatar = leitor.nextInt();
		
		switch(avatar) {
		
			case 1:
				// Teseo - Cara vc se ferrou....
				System.out.println("Voc� realmente pensou que sabia algo de hist�ria ?!?!");
				System.out.println("Pois est� muito enganado e n�o passar� para a pr�xima fase do jogo !!!!");
				break;
			case 2:
				// Hip�lita - passa para a proxima fase
				System.out.println("Parab�ns pela escolha !!!");
				break;
			case 3:
				// Jas�o
				// Hummmm... passa por um novo teste
				// System.out.println("Sua escolha � question�vel, e para seguir nesse jogo, voc� ter� que provar ser realmente merecedor desta honra");
				System.out.println("Voc� caiu em um loop t�o longo quanto o infinito .....");
				System.out.println("Sua miss�o, meu caro aprendiz, � descobrir qual o n�mero de argon�utas que existiu, excluindo o mais famoso de todos");
				System.out.println("Apenas ao responder corratamente esta quest�o voc� sair� desta roda infitita de sofrimento");
				// iniciar um loop com um teste com tempo
				for (int i=1; i>0;i++){
					System.out.println("Informe, sem demora, o n�mero de aronautas !!!");
					argo = leitor.nextInt();
					if (argo == 50) {
							i = -1;
					}	
					else{
						System.out.println("Meu caro aprendiz, h� muito o que estudar.");
						System.out.println("Tente novamente e ...");
					}
				}
				break;
			case 4:
				// hahahah.... vc se ferrou !!!!!
				System.out.println("Voc� fez uma p�ssima escolha, ficou louco e foi morto tragicamente....");
				break;
			default:
				System.out.println("Voc� n�o soube brincar e est� fora do jogo.....");
		}
			
		// Fase 1

		switch (avatar){
		case 2:
		// Escrevar o que fazer no caso de ser Hip�lita
		System.out.println("Bem vinda ao Labirindo do Minotauro, Hip�lita. A partir de agora, o jogo ser� mais dif�cil");
		System.out.println("Aos seus p�s voc� tem as caixas  lacradas \"1\" e \"2\". Escolha uma e siga o seu caminho.");
		System.out.println("Caso se negue a escolher uma das caixas, os Deuses poder�o deixar de te aben�oar");
		caixa = leitor.nextInt();
		
		if (caixa == 1) {
			System.out.println("Neste caixa voc� encontou um novo escudo feito pelos Deuses com o s�mbolo de " + time);
		// O que acontece agora
		//Fase 1.a
			System.out.println("Agora que voc� j� est� mais protegido, avance at� a pr�xima fase ...");
			System.out.println("...");
			System.out.println("...Keep Walking....\"by Johnny Walker\"...");
			System.out.println("...");
			System.out.println("Finalmente voc� ter� a sua primeira tarefa mais complexa...");
			System.out.println("Decida como deseja enfrentar o tem�vel Minotauro");
			System.out.println("Suas op��es s�o");
			System.out.println("1 - No centro do Labirinto");
			System.out.println("2 - Uma emboscada");
			System.out.println("3 - NDA => Apenas me tire daqui !!!!");
			opcaoh = leitor.nextInt();
				switch (opcaoh) {
				case 1:
					System.out.println("Ok, corrajosa guerreira, voc� enfrentar� o Imbat�vel Minotauro no centro do labirinto");
					break;
				case 2:
					System.out.println("Realmente eu concordo que encarar uma coisa desse tamanho n�o � para qualquer um....");
					break;
				case 3:
					System.out.println("Mas fa�a-me o favor !!! Tenha o m�nimo de compostura mulher !!!");
					break;
				default:
					System.out.println("Voc� n�o soube brincar e est� fora do jogo.....");
					
				}
		}
		// O que acontece agora
		// Fase 1.b
		else if (caixa == 2) {
			System.out.println("Neste caixa voc� encontou uma corda nova, com 1000 p�s de comprimento, mas leve como uma pluma");
			System.out.println("Com esta corda voc� pode:");
			System.out.println("1 - Amarrar o Minotauro");
			System.out.println("2 - Sair do Labirinto");
			switch(opcaoc) {
			case 1:
				System.out.println("Prepare um n� capaz de segurar at� mesmo P�gasus e se prepare");
				break;
			case 2:
				System.out.println("Sua tentativa de saida \"A la Le�o da montanha\" n�o funcionou, o Minotauro o pegou e fiz um delicioso picadinho de voc�, que foi servido no jantar");
				System.out.println("Game Over !!");
				break;
			default:
				System.out.println("Voc� n�o soube usar a suas op��es, sua corda arrebentou e voc� morreu enquanto pegar uma carona com �caro...");
			}
			
		}
		else {
			System.out.println("Voc� perdeu a prote��o dos Deuses e foi banido do jogo");
			System.out.println("GAME OVER");
		}

		// Fase 1
	
		case 3:
		// Escrevar o que fazer no caso de ser Jas�o
		 
			System.out.println("Jas�o");
	
		default:
			System.out.println("Algo deu errado !!!");

	}
		
		// FASE 2
		switch (opcaoh) {
			case 1:
		// Enfrentar o Minotauro no Labirinto
				System.out.println("Destemida guerreira, visto que resolveu enfrentar o Minotauro no centro do labirinto, os Deuses lhe concederam uma ben��o:");
				System.out.println("Voc� foi agraciada com uma nova espada muito mais letal qua a sua. Boa sorte na sua empreitada !!!");
				System.out.println("Com essa espada voc� poder� aplicar 3 golpes no Minotauro com valores entre 1 e 5");
				System.out.println("E se a soma dos seus n�meros for maior do que a do Minotauro, voc� vencou a batalha");
				System.out.println("MAS, se qualquer um dos n�meros informado for MAIOR do que 5,0, o valor considerado ser� 0,01");
				for (int j = 1; j<4;j++) {
					n = leitor.nextDouble();
					if (n > 5.0) {
						n = 0.01;
						}
					somah = somah + n;
					num = random.nextDouble() * 5;
					somam = somam + num; 
				}
				if (somah > num) {
					System.out.println("Parab�ns, voc� venceu !!!");
				}
				else if (num > somah) {
					System.out.println("Parab�ns para o Minotauro, o Eterno Campe�o !!!");
				}
				else {
					System.out.println("Os Deuses devem ter intervido a seu favor para que houvesse esse empate....");
				}
			case 2:
			//Emboscar o Minotauro
				System.out.println("Como voc� resolveu atacar o Minotauro de emboscada, voc� ter� apenas uma chance de vencer");
				System.out.println("Informe um n�mero entre 1 e 4,5 e se o seu n�mero for maior do que o do Minotauro, voc� vencou a batalha");
				System.out.println("MAS, se o n�mero informado for MAIOR do que 4,5, o valor considerado ser� 0,01");
				n = leitor.nextDouble();
				if (n > 4.5) {
					n = 0.01;
				}
				num = random.nextDouble() * 5;
				if (n > num) {
					System.out.println("Parab�ns, voc� venceu !!!");
				}
				else if (num > n) {
					System.out.println("Parab�ns para o Minotauro, o Eterno Campe�o !!!");
				}
				else {
					System.out.println("Os Deuses devem ter intervido a seu favor para que houvesse esse empate....");
				}
			case 3:
				System.out.println("Game Over !!!");
		}

	
		switch (opcaoc) {
			case 1:
		// Amarrar o Minotauro 
				System.out.println("Sua escolha foi pouco usual, afinal de contas, poucos ousariam tentar apenas amarrar tamanha besta.");
				System.out.println("Mas voc� se mostra destamida, e ter� 2 oportunidades de vencer o Minotauro.");
				System.out.println("Para tanto, informe valores entre 1 e 5 e se a soma dos seus n�meros for maior do que a do Minotauro, voc� vencou a batalha");
				System.out.println("MAS, se qualquer um dos n�meros informado for MAIOR do que 5,0, o valor considerado ser� 0,01");
				for (int j = 1; j<3;j++) {
					n = leitor.nextDouble();
					if (n > 5.0) {
						n = 0.01;
					}
					somah = somah + n;
					num = random.nextDouble() * 5;
					somam = somam + num; 
				}
				if (somah > num) {
					System.out.println("Parab�ns, voc� venceu !!!");
				}
				else if (num > somah) {
					System.out.println("Parab�ns para o Minotauro, o Eterno Campe�o !!!");
				}
				else {
					System.out.println("Os Deuses devem ter intervido a seu favor para que houvesse esse empate....");
				}
			case 2:
				//Fugir
				System.out.println("Game Over !!!");
		}
				
		
	}

}
