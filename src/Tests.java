import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
		Scanner dati=new Scanner(System.in);
		int cip, atb=0;
		String[] jautajumi = {"Kurš cikls ir cikls ar priekšnosacījumu?\n", "Kā while cikls izpildās?\n", "Tests3\n", "Tests\n", "Tests5\n", "Tests6\n", "Tests7\n", "Tests8\n", "Tests9\n", "Tests10\n",};
		String atbildes = "";
		System.out.println(jautajumi[0]);
		cip=dati.nextInt();
		System.out.println("1. for(int i; i<x; i++)");
		System.out.println("2. do while()");
		System.out.println("3. while()");
		System.out.println("4. switch() case:");
		switch(cip) {
		case 3:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[0];
		}
		System.out.println(jautajumi[1]);
		cip=dati.nextInt();
		System.out.println("1. Cikls izpildas vienu reizi un tad pārbauda nosacījumu");
		System.out.println("2. Cikls pārbauda nosacījumu un tad izpildās");
		System.out.println("3. Cikls nepārbauda nosacījumus un izpildās noteiktas reizes");
		System.out.println("4. Cikls izpildas mūžīgi");
		switch(cip) {
		case 2:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[1];
	}
		System.out.println(jautajumi[2]);
		cip=dati.nextInt();
		
	}

}
