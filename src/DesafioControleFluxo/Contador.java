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
        }catch(ParametrosInvalidosException e){
            System.out.printf("\nO segundo parâmetro deve ser MAIOR que o primeiro!!");
            System.out.printf("\nErro. Tente novamente! \n");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.printf("\nNúmero de ocorrências => %d - %d = %d\n", parametroDois, parametroUm, contagem);
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++){
            System.out.printf("Imprimindo agora o número %d\n", i+1);
        }

    }
}
