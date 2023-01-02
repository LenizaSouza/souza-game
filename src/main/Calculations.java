package main;

import java.util.Random;

public class Calculations {
	
	private int nivel;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;
	
	public Calculations(int nivel) {
		Random random = new Random();
		this.operacao = random.nextInt(2); //0-somar, 1-subtrair, 2-multiplicar, 3-dividir
		this.nivel = nivel;
		
		if(nivel == 1) {
			//easy
			this.valor1 = random.nextInt(10);
			this.valor2 = random.nextInt(10);
		}else {
			//hard
			this.valor1 = random.nextInt(100);
			this.valor2 = random.nextInt(100);
		}
	}	
	
	public int getNivel() {
		return nivel;
	}
	
	public int getValor1() {
		return valor1;
	}
	
	public int getValor2() {
		return valor2;
	}
	
	public int getOperacao() {
		return operacao;
	}
	
	public int getResultado() {
		return resultado;
	}
	
	public String toString() {
		String opcao;
		if(this.getOperacao() == 0) {
			opcao = "Somar";
		}else if(this.getOperacao() == 1) {
			opcao = "Subtrair";		
		}else if(this.getOperacao() == 2) {
			opcao = "Multiplicar";
		}else if(this.getOperacao() == 3) {
			opcao = "Dividir";
		}else {
			opcao = "Opcao invalida";
		}
		
			return "valor 1: " + this.getValor1()
					+ "\nValor 2: " + this.getValor2()
					+"\nOperacao: " + opcao
					+"\nDificuldade: " + this.getNivel();		
	}
	
	public boolean somar(int valor) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean acerto = false;
		
		if(valor == this.getResultado()) {
			System.out.println("Resposta correta!");
			acerto = true;
		}else {
			System.out.println("Estude mais!");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + "=" + this.getResultado());
		return acerto;		
	}
	
	public boolean subtrair (int valor) {
		this.resultado = this.getValor1() - this.getValor2();
		boolean certo = false;
		
		if(valor == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		}else {
			System.out.println("Estude mais!");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + "=" + this.getResultado());
		return certo;		
	}
	public boolean multiplicar (int valor) {
		this.resultado = this.getValor1() * this.getValor2();
		boolean acerto = false;
		
		if(valor == this.getResultado()) {
			System.out.println("Resposta correta!");
			acerto = true;
		}else {
			System.out.println("Estude mais!");
		}
		System.out.println(this.getValor1() + " * " + this.getValor2() + "=" + this.getResultado());
		return acerto;		
	}
	
	public boolean dividir (int valor) {
		this.resultado = this.getValor1() / this.getValor2();
		boolean certo = false;
		
		if(valor == this.getResultado()) {
			System.out.println("Resposta correta!");
			certo = true;
		}else {
			System.out.println("Estude mais!");
		}
		System.out.println(this.getValor1() + " / " + this.getValor2() + "=" + this.getResultado());
		return certo;		
	}
	
}
	
	

