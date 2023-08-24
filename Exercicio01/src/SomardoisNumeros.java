import java.util.*;

class SomardoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		//Declaracao das variaveis
		int n1,n2,total;
		
		//Leitura das variaveis
		System.out.println("Por favor digite um numero inteiro");
		n1=sc.nextInt();
		System.out.println("Digite agora outro numero inteiro");
		n2=sc.nextInt();
		
		//Somandos os dois numeros
		total=n1+n2;
		
		//exibindo o resultado
		System.out.println("A somatoria e:"+total);
			
	}
}
