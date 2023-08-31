public class BMExercicio03{
    public static final float TAXA = 8.25f;
    public static void main(String[] args) {
        float arroz, feijao;
        arroz = 2.95f;
        feijao = 3.84f;
        
        //Inicializando as variáveis, foi necessário o uso do 'f' para explicitar que usaria o tipo 'float'.

        System.out.println("O arroz custa R$" + arroz + " e o feijão custa R$" + feijao);

        //Mostrando o conteúdo.

        float valorTotal;
        valorTotal = arroz+feijao;
        System.out.println("O valor da soma dos produtos é de R$" + valorTotal);

        //Declarando e inicializando e imprimindo a variável que contém a soma dos dois produtos.

        float taxaCalculada;
        taxaCalculada=((TAXA*valorTotal)/100) + valorTotal;
        System.out.printf("Com a taxa o valor total ficará por R$ %.2f %n", taxaCalculada);

        //Aplicando a taxa ao valor total.

        arroz = ((TAXA*arroz)/100) + arroz; 
        feijao = ((TAXA*feijao)/100) + feijao;
        float novoCusto = arroz+feijao;
        System.out.printf("Aplicando a nova taxa individual o valor da compra ficará por R$ %.2f %n", novoCusto);

        //Aplicando a taxa individualmente e realizando uma operação de novo custo.

        boolean muitoCaro = novoCusto>10;
        System.out.println(muitoCaro);

        //Comparando se o valor de 'muitoCaro' retornará 'true' ou 'false'.
    }
}