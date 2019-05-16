package Test;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el primer dígito: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo dígito: ");
		int num2 = sc.nextInt();
		System.out.println("Introduce una operación: S R M D");
		sc = new Scanner (System.in);
		char op = sc.nextLine().charAt(0);
		switch (op) {
		case 'S': 
			Suma s = new Suma (num1, num2);
			System.out.println(s.sumar());
			break;
		case 'R':
			Resta r = new Resta (num1, num2);
			System.out.println(r.restar());
			break;
		case 'M':
			Multiplicacion m = new Multiplicacion (num1, num2);
			System.out.println(m.multiplicar());
			break;
		case 'D':
			Division d = new Division (num1, num2);
			System.out.println(d.dividir());
			break;
		default: System.out.println("La operación introducida no es correcta.");
		}
		

	}

}
