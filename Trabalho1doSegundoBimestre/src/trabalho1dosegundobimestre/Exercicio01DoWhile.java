package trabalho1dosegundobimestre;

public class Exercicio01DoWhile {

    public static void main(String[] args) {
        //Escreva um algoritmo que imprime todos os números ímpares de 1 até 100.
        int num = 1;

        do {
            System.out.println(num);
            num += 2;
        } while (num < 101);
    }
}
