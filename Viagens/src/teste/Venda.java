/*
Obtenha todos os valores necessários para criar um pacote de viagem e crie esse objeto.
Mostre na tela as informações do pacote criado, incluindo o valor total. O usuário ainda precisará informar margem de lucro (uma porcentagem).
Obtenha do usuário também as informações para a criação de uma venda.
Mostre na tela todas as informações da venda, incluindo valor total em dólar e valor em reais (o usuário terá que informar a cotação do dólar no dia).
 */
package teste;

/**
 *
 * @author luiza
 */
public class Venda {
    private  String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public void setPacoteViagem(PacoteViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }
    

    public double converterDolarParaReal(double valorDolar, double cotacaoDolar) {
        return valorDolar * cotacaoDolar;
    }

    public void mostrarInformacoesVenda(double cotacaoDolar) {
        System.out.println("Informação da venda");
        System.out.println("-----------------");
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Valor Total (em dólar): " + pacoteViagem.calcularTotal());
        System.out.println("Valor Total (em real): " + converterDolarParaReal(pacoteViagem.calcularTotal(), cotacaoDolar));
    }

}
