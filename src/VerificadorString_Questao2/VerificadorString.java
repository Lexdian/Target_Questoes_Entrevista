package VerificadorString_Questao2;
import java.util.Scanner;

public class VerificadorString {
	public static void main(String[] args) {
		System.out.println("Digite a string que deseja verificar: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int quantChar = Verificador(str);
		System.out.println((quantChar == 0)? "A letra 'a' não está presente na string!":"A letra 'a' está presente na string! Ela aparece "+quantChar+" vezes.");
	}
	public static int Verificador(String str) {
		int num = 0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				num++;
			}
		}
		return num;
	}
}