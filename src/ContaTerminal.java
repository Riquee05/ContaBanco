import java.util.Scanner;

import java.util.Locale;

public class ContaTerminal{
    public static void main (String[] args){    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Informações para serem exibidas no output

        System.out.println("Digite o Numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, confirme sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();


        //Imprimir os dados inseridos pelo o Usuario.
        System.out.println("Olá " + nome + " "+ sobrenome +" Obrigado por criar uma conta em nosso Banco, sua agencia é:  " + agencia +" e o numero da sua conta é "+ conta +" "+ "e seu Saldo de: " + saldo + " " + "Ja esta disponivel para Saque!");

    }



}