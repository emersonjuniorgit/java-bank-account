import entities.ContaBancaria;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int escolha;

        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe a sua idade: ");
        Integer idade = sc.nextInt();
        Pessoa pessoa = new Pessoa(nome, idade);

        if(pessoa.verificarIdade(idade) == true) {
            System.out.print("Informe o valor de depósito: ");
            double deposito = sc.nextDouble();
            ContaBancaria conta = new ContaBancaria(deposito, pessoa);
            conta.limiteChequeEspecial(false);

            do {
                System.out.println();
                System.out.println("==============================");
                System.out.println("BEM-VINDO!!!");
                System.out.println("==============================");
                System.out.println("1. Consultar saldo");
                System.out.println("2. Consultar cheque especial");
                System.out.println("3. Depositar valor");
                System.out.println("4. Sacar valor");
                System.out.println("5. Pagar boleto");
                System.out.println("6. Verificar se a conta usa cheque especial");
                System.out.println("-------------------------------");
                System.out.println("0. FINALIZAR PROGRAMA");
                System.out.println("-------------------------------");
                System.out.print("Escolha uma opção: ");
                escolha = sc.nextInt();

                switch (escolha) {
                    case 1:
                        conta.getSaldo();
                        System.out.printf("Seu saldo atual é de R$%.2f%n", conta.getSaldo());
                        break;

                    case 2:
                        if (!(conta.getChequeEspecial() <= 0.0)) {
                            conta.verificarUsoChequeEspecial();
                            System.out.printf("O seu saldo de cheque especial é de R$ %.2f%n", conta.getChequeEspecial());
                            System.out.printf("O limite é de R$ %.2f para o cheque especial %n", conta.limiteChequeEspecial(true));
                            conta.checarLimiteChequeEspecial();
                        }
                        break;

                    case 3:
                        System.out.print("Informe o valor de deposito: ");
                        deposito = sc.nextDouble();
                        conta.depositarValor(deposito);
                        conta.checarLimiteChequeEspecial();
                        break;

                    case 4:
                        System.out.print("Informe o valor de saque: ");
                        Double saque = sc.nextDouble();
                        if(conta.verificarSaqueValido(saque) == true){
                            conta.sacarValor(saque);
                            System.out.printf("Saldo após o saque: R$ %.2f%n ", conta.getSaldo());
                        }
                        break;

                    case 5:
                        System.out.print("Informe o valor de pagamento do boleto: ");
                        Double valorBoleto = sc.nextDouble();
                        conta.pagarBoleto(valorBoleto);
                        break;

                    case 6:
                        if (conta.verificarUsoChequeEspecial() == true) {
                            System.out.printf("A conta possui cheque especial, no valor de R$ %.2f%n", conta.getChequeEspecial());
                        } else {
                            System.out.println("A conta não possui cheque especial");
                        }
                        break;

                    case 0:
                        System.out.println("PROGRAMA ENCERRADO!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }while(escolha != 0);
        }
        sc.close();
        }
    }

