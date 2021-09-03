package casa;

import java.util.Scanner;

public class Casa {

	public static void main(String[] args) {

		int res = 0;
		double lar = 0, com = 0, to = 0, tol = 0;
		String nome, respo;
		Scanner ler = new Scanner(System.in);
		while (res == 0) {

			System.out.print("qual o nome do cômodo?");
			nome = ler.next();
			System.out.print("qual a largura do cômodo?");
			lar = ler.nextDouble();
			System.out.print("qual o comprimento do cômodo?");
			com = ler.nextDouble();
			System.out.println("");
			to = lar * com;
			tol = tol + to;

			System.out.println("A(O) " + nome + " tem " + to + " metros quadrados");
			System.out.println("");
			System.out.print("vc deseja adicionar mais cômodos?(S/N) ");
			System.out.println("");
			respo = ler.next();

				if (respo.equals("S")|| respo.equals("s")) {
					res= 0;
				} else if (respo.equals("N")|| respo.equals("n")) {
					res++;
				} else {
					System.out.println("Insira S ou N ");
					res = 0;
				}
			

		}
		ler.close();
		System.out.println("O total de metros quadrados da casa é " + tol);

	}

}
