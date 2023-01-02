package view;

import java.util.Scanner;

import main.Calculations;

public class Play {
	
	static Scanner input = new Scanner (System.in);
	static int pontos = 0;
	static Calculations calculos;
	
	public static void main (String[] args) {
		Play.play();
	}
	
	public static void play() {
		System.out.println("Informe o nivel de dificuldade desejado[1 ou 2]: ");
		int nivel = Play.input.nextInt();
		
		Play.calculos = new Calculations(nivel);
		System.out.println("Informe o resultado para a seguinte operação: ");
		
		//soma
		if(calculos.getOperacao() == 0) {
			System.out.println(calculos.getValor1() + "+" + calculos.getValor2());
		int resposta = Play.input.nextInt();
		
		if(calculos.somar(resposta)) {
			Play.pontos += 1;
			System.out.println("Você tem " + Play.pontos + "ponto(s).");
			}
		}
		//subtrair
				if(calculos.getOperacao() == 0) {
					System.out.println(calculos.getValor1() + "-" + calculos.getValor2());
				int resposta = Play.input.nextInt();
				
				if(calculos.subtrair(resposta)) {
					Play.pontos += 1;
					System.out.println("Você tem " + Play.pontos + "ponto(s).");
					}
				}
		//multiplicar
				if(calculos.getOperacao() == 0) {
					System.out.println(calculos.getValor1() + "*" + calculos.getValor2());
				int resposta = Play.input.nextInt();
				
				if(calculos.multiplicar(resposta)) {
					Play.pontos += 1;
					System.out.println("Você tem " + Play.pontos + "ponto(s).");
					}
				}
		//dividir
				if(calculos.getOperacao() == 0) {
					System.out.println(calculos.getValor1() + "/" + calculos.getValor2());
				int resposta = Play.input.nextInt();
				
				if(calculos.dividir(resposta)) {
					Play.pontos += 1;
					System.out.println("Você tem " + Play.pontos + "ponto(s).");
					}
				}else {
					System.out.println("A operação " + calculos.getOperacao() + "não é reconhecida.");
					
				}
				
				System.out.println("Deseja continuar? [1-sim, 0-não]");
				int continuar = Play.input.nextInt();
				
				if(continuar == 1){
					Play.play();
		}else {
			System.out.println("Você fez " + Play.pontos + "ponto(s).");
			System.out.println("Até a próxima!");
			System.exit(0);
			
		}
	}
}
