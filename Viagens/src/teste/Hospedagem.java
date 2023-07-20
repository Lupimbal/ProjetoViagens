/*
A empresa de desenvolvimento retorna ao projeto de desenvolvimento de sistema para uma agência de viagens. 
Esse sistema precisa registrar pacotes de viagens e registrar dados de uma venda. 
Cada pacote de viagens é formado pelo meio de transporte e pela hospedagem – cada meio de transporte tem tipo e valor e cada hospedagem tem tipo e valor.
 Os valores de pacote de viagem são formados pelos valores do transporte e hospedagem somados a uma margem de lucro e taxas adicionais.

A venda inclui dados do cliente, forma de pagamento, data, pacote sendo vendido e precisa ser capaz de converter o valor do pacote em reais para dólar e vice versa.
Classe para hospedagem, com descrição e valor de diária;
 */
package teste;

/**
 *
 * @author luiza
 */
public class Hospedagem {
    private String descricao;
    private double valorDiaria;

    public Hospedagem(String descricao, double valorDiaria){
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        }
    
    public String getDescricao(){
      return descricao;
         }
  
    public void setDescricao(String descricao){
      this.descricao = descricao;
        }
  
     public double getValorDiaria(){
      return valorDiaria;
        }
  
    public void setValorDiaria(){
      this.valorDiaria = valorDiaria;
        }

    public double calcularTotal(int quantidadeDias){
        return valorDiaria * quantidadeDias;
         }    

 
}
    

