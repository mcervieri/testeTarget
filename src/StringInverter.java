import java.util.Scanner;

public class StringInverter {
   
	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String str = scanner.nextLine();

        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        System.out.println("String invertida: " + new String(caracteres));
        scanner.close();
    }
}