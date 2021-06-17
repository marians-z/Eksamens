import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
		// Izveidoju scanneri lai lietotājs varētu ievadīt
		Scanner dati=new Scanner(System.in);
		// Izveidoju mainīgos lai piefiksētu Lietotāja ierakstīto un atbilžu skaitu
		int cip, atb=0;
		// Izveidoju masīvu lai piefiksētu Jautājumus vienā mainīgajā
		String[] jautajumi = {"Kurš cikls ir cikls ar priekšnosacījumu?\n", "Kā while cikls izpildās?\n", "Kāds būs iznākums pēc šī koda izpildes?\n", "Kā sauc ciklu kas strādā visu laiku?\n", "Patiess vai Aplams nosacījums ir:\n", "Kas ir jāliek X vietā while(a<=X)?\n", "Kā apzīmē and operatoru?\n", "Kā apzīmē or operatoru?\n", "Ko nozīmē =! vienādībā?\n", "Vai var notikt darbības ar skaitļiem cikla nosacījumā?\n",};
		// Izveidoju mainīgo lai uzskaitītu nepareizās atbildes
		String atbildes = "";
		//Izvadu ekrānā jautājumu ar atbilžu variantiem
		System.out.println(jautajumi[0]);
		System.out.println("1. for(int i; i<x; i++)");
		System.out.println("2. do while()");
		System.out.println("3. while()");
		System.out.println("4. switch() case:");
		//Paprasu lietotājam izvēlēties pareizo atbildi
		cip=dati.nextInt();
		//Nolasu pareizo atbildi
		switch(cip) {
		case 3:
			//Ja atbilde ir pareiza piefiksēju to
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			//Ja atbilde ir nepareiza, piefiksēju to jautājumu
			atbildes=atbildes+jautajumi[0];
		}
		//Tālāk tiek rakstīti jautājumi tādā pašā formā
		System.out.println("***");
		System.out.println(jautajumi[1]);
		System.out.println("1. Cikls izpildas vienu reizi un tad pārbauda nosacījumu");
		System.out.println("2. Cikls pārbauda nosacījumu un tad izpildās");
		System.out.println("3. Cikls nepārbauda nosacījumus un izpildās noteiktas reizes");
		System.out.println("4. Cikls izpildas mūžīgi");
		cip=dati.nextInt();
		switch(cip) {
		case 2:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[1];
	}
		System.out.println("***");
		System.out.println(jautajumi[2]);
		System.out.println("int a=1, x=0;");
		System.out.println("while(a<=5){");
		System.out.println("a++;");
		System.out.println("System.out.print(\" \"x);");
		System.out.println("x++;");
		System.out.println("}");
		System.out.println(" ");
		System.out.println("1. 0 1 2 3 4 5");
		System.out.println("2. 5 4 3 2 1 0");
		System.out.println("3. netiks nekas izvadīts");
		System.out.println("4. 0 1 2 3 4");
		cip=dati.nextInt();
		switch(cip) {
		case 4:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[2];
	}
		System.out.println("***");
		System.out.println(jautajumi[3]);
		System.out.println("1. Saplīsis cikls");
		System.out.println("2. sasaldēts cikls");
		System.out.println("3. garšs cikls");
		System.out.println("4. bezgalīgs cikls");
		cip=dati.nextInt();
		switch(cip) {
		case 4:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[3];
	}
		System.out.println("***");
		System.out.println(jautajumi[4]);
		System.out.println("1. True vai False jeb Boolean");
		System.out.println("2. String");
		System.out.println("3. Char");
		System.out.println("4. for");
		cip=dati.nextInt();
		switch(cip) {
		case 1:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[4];
	}
		System.out.println("***");
		System.out.println(jautajumi[5]);
		System.out.println("1. Skaitlis, vai datu tips ar skaitli");
		System.out.println("2. Boolean");
		System.out.println("3. String");
		System.out.println("4. for, if vai do");
		cip=dati.nextInt();
		switch(cip) {
		case 1:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[5];
	}
		System.out.println("***");
		System.out.println(jautajumi[6]);
		System.out.println("1. un");
		System.out.println("2. ||");
		System.out.println("3. &&");
		System.out.println("4. =!");
		cip=dati.nextInt();
		switch(cip) {
		case 3:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[6];
	}
		System.out.println("***");
		System.out.println(jautajumi[7]);
		System.out.println("1. or");
		System.out.println("2. ||");
		System.out.println("3. !!");
		System.out.println("4. &&");
		cip=dati.nextInt();
		switch(cip) {
		case 2:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[7];
	}
		System.out.println("***");
		System.out.println(jautajumi[8]);
		System.out.println("1. Vienādība");
		System.out.println("2 Un funkcija");
		System.out.println("3. Cikls");
		System.out.println("4. Nevienādība");
		cip=dati.nextInt();
		switch(cip) {
		case 4:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[8];
	}
		System.out.println("***");
		System.out.println(jautajumi[9]);
		System.out.println("1. Jā");
		System.out.println("2. Nē");
		cip=dati.nextInt();
		switch(cip) {
		case 1:
			atb=atb+1;
			System.out.println("Paldies par atbildi");
		break;
		default:
			System.out.println("Paldies par atbildi");
			atbildes=atbildes+jautajumi[9];
	}
		System.out.println("***");
		//Izvadu ekrānā pareižo atbilžu skaitu
		System.out.println("Tu atbildēji pareizi uz "+atb+" jautājumiem");
		System.out.println("Tu atbildēji nepareizi uz sekojošajiem jautājumiem:");
		//Izvadu ekrānā nepareizās atbildes
		System.out.println(atbildes);
		System.out.println("***");
		System.out.println("Testa Beigas");
	}
	

}
