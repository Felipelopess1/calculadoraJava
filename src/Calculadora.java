import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();
        
        String operacao;
        do {
            System.out.println("Digite a operacao (+, -, *, /):");
            operacao = scanner.next();
            
            if (!validarOperacao(operacao)) {
                System.out.println("Operacao invalida. Tente novamente.");
            }
        } while (!validarOperacao(operacao));
        
        double resultado = calcular(num1, num2, operacao);
        
        System.out.println("Resultado: " + resultado);
    }
    
    public static boolean validarOperacao(String operacao) {
        return operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/");
    }
    
    public static double calcular(double num1, double num2, String operacao) {
        switch (operacao) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return 0;
                }
            default:
                System.out.println("Operaçao invalida.");
                System.exit(1);
        }
        return 0;
    }
}