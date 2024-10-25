package Fibonacci_Questao1;
import java.util.Scanner;

public class BuscadorFibonacci {
	public static void main(String[] args) {
		System.out.println("Digite o número que deseja buscar: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println((Verificar(num))? "Sim, o número esta presente na sequencia de Fibonacci!!":"Não, o número não esta presente na sequencia de Fibonacci!!");
	}
	public static boolean Verificar(int num) {
		if(num == 0) {
			return true;
		}
		int atual = 1;
		int anterior = 1;
		
		while(atual < num) {
			int novoAtual = atual+anterior;
			anterior = atual;
			atual = novoAtual;
		}
		return atual==num;
	}
}