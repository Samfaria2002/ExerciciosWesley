import java.util.Scanner;

public class exercicio3 {
    /*
     * Realize uma pesquisa de audiência de canal de TV em várias casas de uma
     * cidade em um
     * determinado dia. Para cada casa consultada, devem ser fornecidos: o número do
     * canal
     * (4, 5, 7, 12) e o número de pessoas que estavam assistindo àquele canal. O
     * algoritmo
     * deve:
     * a. Ler um número indeterminado de dados: número do canal e número de
     * pessoas assistindo o canal.
     * b. Calcular e apresentar o percentual de audiência de cada canal.
     * c. Encerrar o processamento quando o usuário informar o número do canal
     * igual a ZERO.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal;
        int[] canais = { 4, 5, 7, 12 };
        int c4 = 0, c5 = 0, c7 = 0, c12 = 0;
        int pessoas;
        int pessoasSoma = 0;

        do {
            System.out.println("Entre com o número do canal: ");
            canal = input.nextInt();
            if (canal == 4) {
                c4++;
            } else if (canal == 5) {
                c5++;
            } else if (canal == 7) {
                c7++;
            } else if (canal == 12) {
                c12++;
            }
            System.out.println("Quantas pessoas estavam assistindo a esse canal?");
            pessoas = input.nextInt();

            pessoasSoma = pessoas + pessoasSoma;

        } while (canal >= 0);
    }
}
