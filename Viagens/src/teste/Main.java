/*
Obtive todos os valores necessários para criar um pacote de viagem e crie esse objeto.
Mostrei na tela as informações do pacote criado, incluindo o valor total. O usuário ainda precisará informar margem de lucro (uma porcentagem).
Obtive do usuário também as informações para a criação de uma venda.
Mostrei na tela todas as informações da venda, incluindo valor total em dólar e valor em reais (o usuário terá que informar a cotação do dólar no dia).

 */
package teste;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Cadastro do Pacote de Viagens");
        System.out.println("------------------");

        System.out.print("Tipo de transporte: ");
        String tipoTransporte = scanner.nextLine();

        System.out.print("Valor transporte em dólar: ");
        double valorTransporte = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Descrição da hospedagem: ");
        String descricaoHospedagem = scanner.nextLine();

        System.out.print("Valor da diária em dólar: ");
        double valorDiaria = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Destino: ");
        String destino = scanner.nextLine();

        System.out.print("Quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();
        scanner.nextLine();
        Transporte transporte = new Transporte (tipoTransporte, valorTransporte);
        Hospedagem hospedagem =  new Hospedagem(descricaoHospedagem, valorDiaria);
        PacoteViagem pacoteViagem = new PacoteViagem(transporte,hospedagem, destino, quantidadeDias);

        System.out.println("\nInformações do Pacote de Viagem");
        System.out.println("------------------------");
        System.out.println("Tipo de transporte: " + tipoTransporte);
        System.out.println("Valor do transporte (em dólar): " + valorTransporte);
        System.out.println("Descrição da hospedagem: " + descricaoHospedagem);
        System.out.println("Valor da Diária: " + valorDiaria);
        System.out.println("Destino: " + destino);
        System.out.println("Quantidade de dias: " + quantidadeDias);
 

        System.out.println("\nMargem de lucro (em %) ");
        double margemLucro = scanner.nextDouble();
        pacoteViagem.setMargemLucro(margemLucro);

        System.out.print("Taxas adicionais (em dólar): ");
        double taxasAdicionais = scanner.nextDouble();
        pacoteViagem.setTaxasAdicionais(taxasAdicionais);

        System.out.println("\nCadastro da Venda:");
        System.out.println("-----------------------");
        System.out.print("Nome do Cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        System.out.print("Forma de pagamento: ");
        String formaPagamento = scanner.nextLine();

        System.out.print("\nCotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);
        venda.mostrarInformacoesVenda(cotacaoDolar);

        scanner.close();

        
    }
}