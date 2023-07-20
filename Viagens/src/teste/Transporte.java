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
public class Transporte {
    private  String tipo;
    private  double valor;

    public Transporte(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
