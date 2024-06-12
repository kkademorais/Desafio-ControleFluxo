package DesafioControleFluxo;
import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("\nDigite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.printf("\nDigite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch(){
            System.out.printf("\nO segundo parâmetro deve ser MAIOR que o primeiro!!");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
    }
}
