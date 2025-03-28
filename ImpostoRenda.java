public class ImpostoRenda {
    public static void main(String[] args) {
        double salario = 3850D;
        if (salario <= 1903.98) {
            System.out.println("Isento");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("Você pagará 7.5% " + (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Você pagará 15% " + (salario * 0.15));
        } else if (salario >=3751.06 && salario <= 4664) {
            System.out.println("Você pagará 22.5% " + (salario * 0.225));
        }
        else {
            System.out.println("Você pagará 27.5%" + (salario * 0.275));
        }
        System.out.println("-----------------------------------------");
    }




Adiciona exercício de cálculo de imposto de renda

