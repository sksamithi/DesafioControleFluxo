import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            try {
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException e){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        }finally {
            scanner.close();
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm){
            throw new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int indice = 1; indice <= contagem; indice++){
                System.out.println("Imprimindo o número " + indice);
            }

        }
    }
}