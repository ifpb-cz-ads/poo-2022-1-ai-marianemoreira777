import java.util.Scanner;

class Calculo {
    void processo(int valor) {
        int contador = 0;
        int limiteTabuada = 10;
        int operacao = 0;
        int auxiliar = valor;

        String[] resultado = new String[limiteTabuada];

        while (contador < limiteTabuada) {
            switch (operacao) {
                case 0:
                    resultado[contador] = auxiliar + " + " + contador + " = " + ((float) auxiliar + contador);
                    System.out.println(resultado[contador]);
                    break;
                case 1:
                    resultado[contador] = auxiliar + " - " + contador + " = " + ((float) auxiliar - contador);
                    System.out.println(resultado[contador]);
                    break;
                case 2:
                    resultado[contador] = auxiliar + " * " + contador + " = " + ((float) auxiliar * contador);
                    System.out.println(resultado[contador]);
                    break;
                case 3:
                    if (contador == 0) {
                        System.out.println("Divisão por zero não existe");
                    } else {
                        resultado[contador] = auxiliar + " / " + contador + " = " + ((float) auxiliar / contador);
                        System.out.println(resultado[contador]);
                    }
                    break;
            }
            contador += 1;
            if (contador == limiteTabuada) {
                operacao += 1;
                contador = 0;
                System.out.println("\n");
                if (operacao > 3) {
                    contador = limiteTabuada;
                }
            }
        }
    }
}

public class TabuadaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int valor = sc.nextInt();

        Calculo calculo = new Calculo();
        calculo.processo(valor);

        sc.close();
    }
}