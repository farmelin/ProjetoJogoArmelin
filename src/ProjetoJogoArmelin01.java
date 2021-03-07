import java.util.Random;
import java.util.Scanner;
//import java.util.Timer;
//import java.util.TimerTask;

public class ProjetoJogoArmelin01 {
	
	public static void main(String[] args) {
		
		/* AUTOR: FERNANDO ARMELIN
		 * NOME DO JOGO: Labirinto do Minotauro
		 * Atividade realizada no módulo de Lógica de Programação da Imersão Java Xpert 
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
		System.out.println("A partir deste momento, vc pode deixar as suas esperanças aqui ....hahahaha");
		System.out.println("Sua única chance de viver é matando o TEMÍVEL MINOTAURO !!!!");
		System.out.println("Qual o seu nome, meu caro pretendente a heroi?");
		jogador = leitor.nextLine();
		System.out.println("Informe a quem você defende, qual é a a sua cidade-estado");
		time = leitor.nextLine();
				
		System.out.println("Escolha o seu avatar");
		System.out.println("1 - Teseo");
		System.out.println("2 - Hipólita");
		System.out.println("3 - Jasão");
		System.out.println("4 - Medeia");
		avatar = leitor.nextInt();
		
		switch(avatar) {
		
			case 1:
				// Teseo - Cara vc se ferrou....
				System.out.println("Você realmente pensou que sabia algo de história ?!?!");
				System.out.println("Pois está muito enganado e não passará para a próxima fase do jogo !!!!");
				break;
			case 2:
				// Hipólita - passa para a proxima fase
				System.out.println("Parabéns pela escolha !!!");
				break;
			case 3:
				// Jasão
				// Hummmm... passa por um novo teste
				// System.out.println("Sua escolha é questionável, e para seguir nesse jogo, você terá que provar ser realmente merecedor desta honra");
				System.out.println("Você caiu em um loop tão longo quanto o infinito .....");
				System.out.println("Sua missão, meu caro aprendiz, é descobrir qual o número de argonáutas que existiu, excluindo o mais famoso de todos");
				System.out.println("Apenas ao responder corratamente esta questão você sairá desta roda infitita de sofrimento");
				// iniciar um loop com um teste com tempo
				for (int i=1; i>0;i++){
					System.out.println("Informe, sem demora, o número de aronautas !!!");
					argo = leitor.nextInt();
					if (argo == 50) {
							i = -1;
					}	
					else{
						System.out.println("Meu caro aprendiz, há muito o que estudar.");
						System.out.println("Tente novamente e ...");
					}
				}
				break;
			case 4:
				// hahahah.... vc se ferrou !!!!!
				System.out.println("Você fez uma péssima escolha, ficou louco e foi morto tragicamente....");
				break;
			default:
				System.out.println("Você não soube brincar e está fora do jogo.....");
		}
			
		// Fase 1

		switch (avatar){
		case 2:
		// Escrevar o que fazer no caso de ser Hipólita
		System.out.println("Bem vinda ao Labirindo do Minotauro, Hipólita. A partir de agora, o jogo será mais difícil");
		System.out.println("Aos seus pés você tem as caixas  lacradas \"1\" e \"2\". Escolha uma e siga o seu caminho.");
		System.out.println("Caso se negue a escolher uma das caixas, os Deuses poderão deixar de te abençoar");
		caixa = leitor.nextInt();
		
		if (caixa == 1) {
			System.out.println("Neste caixa você encontou um novo escudo feito pelos Deuses com o símbolo de " + time);
		// O que acontece agora
		//Fase 1.a
			System.out.println("Agora que você já está mais protegido, avance até a próxima fase ...");
			System.out.println("...");
			System.out.println("...Keep Walking....\"by Johnny Walker\"...");
			System.out.println("...");
			System.out.println("Finalmente você terá a sua primeira tarefa mais complexa...");
			System.out.println("Decida como deseja enfrentar o temível Minotauro");
			System.out.println("Suas opções são");
			System.out.println("1 - No centro do Labirinto");
			System.out.println("2 - Uma emboscada");
			System.out.println("3 - NDA => Apenas me tire daqui !!!!");
			opcaoh = leitor.nextInt();
				switch (opcaoh) {
				case 1:
					System.out.println("Ok, corrajosa guerreira, você enfrentará o Imbatível Minotauro no centro do labirinto");
					break;
				case 2:
					System.out.println("Realmente eu concordo que encarar uma coisa desse tamanho não é para qualquer um....");
					break;
				case 3:
					System.out.println("Mas faça-me o favor !!! Tenha o mínimo de compostura mulher !!!");
					break;
				default:
					System.out.println("Você não soube brincar e está fora do jogo.....");
					
				}
		}
		// O que acontece agora
		// Fase 1.b
		else if (caixa == 2) {
			System.out.println("Neste caixa você encontou uma corda nova, com 1000 pés de comprimento, mas leve como uma pluma");
			System.out.println("Com esta corda você pode:");
			System.out.println("1 - Amarrar o Minotauro");
			System.out.println("2 - Sair do Labirinto");
			switch(opcaoc) {
			case 1:
				System.out.println("Prepare um nó capaz de segurar até mesmo Pégasus e se prepare");
				break;
			case 2:
				System.out.println("Sua tentativa de saida \"A la Leão da montanha\" não funcionou, o Minotauro o pegou e fiz um delicioso picadinho de você, que foi servido no jantar");
				System.out.println("Game Over !!");
				break;
			default:
				System.out.println("Você não soube usar a suas opções, sua corda arrebentou e você morreu enquanto pegar uma carona com Ícaro...");
			}
			
		}
		else {
			System.out.println("Você perdeu a proteção dos Deuses e foi banido do jogo");
			System.out.println("GAME OVER");
		}

		// Fase 1
	
		case 3:
		// Escrevar o que fazer no caso de ser Jasão
		 
			System.out.println("Jasão");
	
		default:
			System.out.println("Algo deu errado !!!");

	}
		
		// FASE 2
		switch (opcaoh) {
			case 1:
		// Enfrentar o Minotauro no Labirinto
				System.out.println("Destemida guerreira, visto que resolveu enfrentar o Minotauro no centro do labirinto, os Deuses lhe concederam uma benção:");
				System.out.println("Você foi agraciada com uma nova espada muito mais letal qua a sua. Boa sorte na sua empreitada !!!");
				System.out.println("Com essa espada você poderá aplicar 3 golpes no Minotauro com valores entre 1 e 5");
				System.out.println("E se a soma dos seus números for maior do que a do Minotauro, você vencou a batalha");
				System.out.println("MAS, se qualquer um dos números informado for MAIOR do que 5,0, o valor considerado será 0,01");
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
					System.out.println("Parabéns, você venceu !!!");
				}
				else if (num > somah) {
					System.out.println("Parabéns para o Minotauro, o Eterno Campeão !!!");
				}
				else {
					System.out.println("Os Deuses devem ter intervido a seu favor para que houvesse esse empate....");
				}
			case 2:
			//Emboscar o Minotauro
				System.out.println("Como você resolveu atacar o Minotauro de emboscada, você terá apenas uma chance de vencer");
				System.out.println("Informe um número entre 1 e 4,5 e se o seu número for maior do que o do Minotauro, você vencou a batalha");
				System.out.println("MAS, se o número informado for MAIOR do que 4,5, o valor considerado será 0,01");
				n = leitor.nextDouble();
				if (n > 4.5) {
					n = 0.01;
				}
				num = random.nextDouble() * 5;
				if (n > num) {
					System.out.println("Parabéns, você venceu !!!");
				}
				else if (num > n) {
					System.out.println("Parabéns para o Minotauro, o Eterno Campeão !!!");
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
				System.out.println("Mas você se mostra destamida, e terá 2 oportunidades de vencer o Minotauro.");
				System.out.println("Para tanto, informe valores entre 1 e 5 e se a soma dos seus números for maior do que a do Minotauro, você vencou a batalha");
				System.out.println("MAS, se qualquer um dos números informado for MAIOR do que 5,0, o valor considerado será 0,01");
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
					System.out.println("Parabéns, você venceu !!!");
				}
				else if (num > somah) {
					System.out.println("Parabéns para o Minotauro, o Eterno Campeão !!!");
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
