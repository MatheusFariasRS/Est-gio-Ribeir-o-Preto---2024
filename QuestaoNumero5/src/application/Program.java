package application;

public class Program {

	public static void main(String[] args) {
		   String original = "Estágio Ribeirão Preto - 2024";
	        String invertida = inverteString(original);
	        System.out.println("String original: " + original);
	        System.out.println("String invertida: " + invertida);
	    }

	    public static String inverteString(String str) {
	        char[] caracteres = str.toCharArray();
	        int inicio = 0;
	        int fim = caracteres.length - 1;

	        while (inicio < fim) {
	            // Troca os caracteres de posição
	            char temp = caracteres[inicio];
	            caracteres[inicio] = caracteres[fim];
	            caracteres[fim] = temp;

	            // Avança para o próximo caractere inicial e recua para o próximo caractere final
	            inicio++;
	            fim--;
	        }

	        // Retorna a string invertida
	        return new String(caracteres);
	    }
	}
