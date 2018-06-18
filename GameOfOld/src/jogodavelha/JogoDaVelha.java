package jogodavelha;
public class JogoDaVelha {

	private String [][] m = {{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"}};
	// Método para imprimir o quadro de jogo 
	public String Mostrar() {
		for(int li= 0; li < 3;li++) {
			for (int co = 0; co < m.length; co++) {
				System.out.print("  |"+ m[li][co] + "| ");
			}
			System.out.println("\n  ---------------");
		}
		return null;	
	}
	//Método para verificar se a posição desejada para o jogador é válida ou inv
	public boolean verificar(String pos) {
		for(int li = 0; li <3 ;li++) {
			for(int co = 0; co <3;co++) {
				if(m[li][co].equals(pos)) {
					return true;
				}
			}		
		}
		return false;
	}
	// Método para marcar no tabuleiro a jogada do jogador
	// Perguntar para o professor se nesse método poderia ser utilizado o select case ..
	public void Jogada(String pos, String jogador) {
		if(pos.equals("1")) {
			m [0][0] = jogador;
		} 
		else if(pos.equals("2")) {
			m[0][1] = jogador;
		}
		else if(pos.equals("3")) {
			m[0][2] = jogador;
			
		}
		else if(pos.equals("4")) {
			m[1][0] = jogador;
			
		}
		else if(pos.equals("5")) {
			m[1][1] = jogador;
			
		}
		else if(pos.equals("6")) {
			m[1][2] = jogador;
			
		}
		else if(pos.equals("7")) {
			m[2][0] = jogador;
			
		}
		else if(pos.equals("8")) {
			m[2][1] = jogador;
			
		}
		else if(pos.equals("9")) {
			m[2][2] = jogador;
			
		}
	}
	public String Vencedor(int Jogadas) {
		String []T = new String [8]; // 
		String vencedor = "null" ;
		//verifica se chegou ao limite de jogadas
		if(Jogadas ==9) {
			vencedor = "Deu velha, reinicie o jogo";
		}
		// Verifica todas as possibilidades de se ganhar o jogo
		//horizontais
		T [0] = m [0][0] + m[0][1] + m [0][2];
		T [1] = m [1][0] + m[1][1] + m [1][2];
		T [2] = m [2][0] + m[2][1] + m [2][2];
		//verticais
		T [3] = m [0][0] + m[1][0] + m [2][0];
		T [4] = m [0][1] + m[1][1] + m [2][1];
		T [5] = m [0][2] + m[1][2] + m [2][2];
		//diagonais
		T [6] = m [0][0] + m[1][1] + m [2][2];
		T [7] = m [0][2] + m[1][1] + m [2][0];
		
		for (int i = 0; i < T.length; i++) {
			if(T[i].equals("XXX")){
				vencedor = "\n Parabéns!! \n O Jogador 1 (X) ganhou a partida \n Fala para o pato que perdeu treinar mais hahahah";
			}
				else if(T[i].equals("OOO")) {
				vencedor = "\n Parabéns!! \n O Jogador 2 (O) ganhou a partida \n Fala para o pato que perdeu treinar mais hahahah";
				}
			}
		return vencedor;
		}
	}
	
	





















