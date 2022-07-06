public class AbreviandoOperadoresAritmetico {
    public static void main(String[] args) {
        int quantidadeProdutos = 10;

        // isso aqui:
        // quantidadeProdutos = quantidadeProdutos + 3;

        // é o mesmo que:
        //quantidadeProdutos += 3;
        //quantidadeProdutos -= 3;
        //quantidadeProdutos *= 3;
        //quantidadeProdutos /= 2;
        quantidadeProdutos %= 4;


        System.out.println(quantidadeProdutos);
    }
}
