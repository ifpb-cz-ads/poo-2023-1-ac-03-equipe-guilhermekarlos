import java.util.Scanner; // 1. importando a classe Scanner

public class CBBAtividadePratica4 {
    public static void main(String[] args){
        int comprimento;
        int largura;
        int profundidade;

        System.out.println("Calculadora de Orçamento de Piscina\n");

        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        System.out.printf("Informe o comprimento da piscina: ");
        comprimento = ler.nextInt();

        System.out.printf("Informe a largura da piscina: ");
        largura = ler.nextInt();

        System.out.printf("Informe a profundidade da piscina: ");
        profundidade = ler.nextInt();

        int cubagem = comprimento * largura * profundidade;
        int valorMetroCubico = 100;
        int valorTotal = cubagem * valorMetroCubico;

        System.out.println("O valor total da piscina é:  R$" + valorTotal);

        ler.close(); // 3. fechando o objeto Scanner
    }
}
