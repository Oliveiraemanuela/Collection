import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int parametroUm = scanner.nextInt();
            
            System.out.println("Digite o segundo número: ");
            int parametroDois = scanner.nextInt();
            
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int quantidade = parametroDois - parametroUm;
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
