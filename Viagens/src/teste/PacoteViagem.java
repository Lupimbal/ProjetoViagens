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
public class PacoteViagem {
    private  Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;
    private double margemLucro;
    private double taxasAdicionais;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
        this.margemLucro = 0.0;
        this.taxasAdicionais = 0.0;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getTaxasAdicionais() {
        return taxasAdicionais;
    }

    public void setTaxasAdicionais(double taxasAdicionais) {
        this.taxasAdicionais = taxasAdicionais;
    }



    public double calcularTotal() {
        double totalTransporte = transporte.getValor();
        double totalHospedagem = hospedagem.calcularTotal(quantidadeDias);
        double lucro = totalTransporte + totalHospedagem + taxasAdicionais;
        return lucro + (lucro * (margemLucro / 100.0));
    }

}