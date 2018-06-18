package jogodavelha;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();
		String posicao;
		int valida = 0;
		int Jogadas = 0;
		System.out.println(".:.:| JOGO DA VELHA |:.:.");
		jogo.Mostrar();

		while (true) {
			
			//iniciar jogador 1
			do {
				System.out.println("Jogador 1, informe uma posição: ");
				posicao = leitor.next();
				while(!jogo.verificar(posicao)) {
					System.out.println("Jogada inválida, tente novamente!");
					System.out.println("Jogador 1, informe uma posição: ");
					posicao = leitor.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "X");
				valida = 1;
			}while(valida == 0); //fim jogador 1
			Jogadas++;
			valida = 0;
			jogo.Mostrar();
			if(!jogo.Vencedor(Jogadas).equals("null")) {
				break;
			}
			
			//iniciar jogador 2
			do {
				System.out.println("Jogador 2, informe uma posição: ");
				posicao = leitor.next();
				while(!jogo.verificar(posicao)) {
					System.out.println("Jogada inválida, tente novamente!");
					System.out.println("Jogador 2, informe uma posição: ");
					posicao = leitor.next();
					valida = 0;
				}
				jogo.Jogada(posicao, "O");
				valida = 1;
			}while(valida == 0); //fim jogador 2
			Jogadas++;
			valida = 0;
			jogo.Mostrar();
		if(!jogo.Vencedor(Jogadas).equals("null")) {
				break;
			}		
		}
System.out.println(jogo.Vencedor(Jogadas));	
	}}
