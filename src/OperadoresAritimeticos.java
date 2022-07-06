public class OperadoresAritimeticos {
    public static void main(String[] args) {
        int minhaIdade = 40;
        int suaIdade = 25;

        //adição
        int totalIdades = minhaIdade + suaIdade + 100;
        System.out.println("Soma das idades: " + totalIdades);

        //subtração
        int diferencalIdades = minhaIdade - suaIdade;
        System.out.println("subtração das idades: " + diferencalIdades);

        //Multiplicação
        int dobroIdade = 2 * suaIdade;
        System.out.println("subtração das idades: " + dobroIdade);

        //Divisão
        double metadeIdade = (double) suaIdade / 2;
        System.out.println("subtração das idades: " + metadeIdade);

        // Módulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da divisão (módulo): " + restoDivisao);
    }
}
