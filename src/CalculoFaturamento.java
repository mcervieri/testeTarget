public class CalculoFaturamento {
    
	public static void main(String[] args) {
        
		double[] faturamentoMensal = {1000.0, 0.0, 2500.0, 3000.0, 5000.0, 1000.0, 0.0, 7000.0, 2000.0};

        double soma = 0;
        int diasComFaturamento = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (double faturamento : faturamentoMensal) {
            if (faturamento > 0) {
                soma += faturamento;
                diasComFaturamento++;
                if (faturamento < menor) menor = faturamento;
                if (faturamento > maior) maior = faturamento;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;
        
        for (double faturamento : faturamentoMensal) {
            if (faturamento > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}