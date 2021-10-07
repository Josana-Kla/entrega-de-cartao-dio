package poo;

import poo.model.Cliente;
import poo.model.Endereco;

// classe para pegar os dados e juntá-los para saber onde e para quem o cartao será entregue
public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "42735987";  //22º caso eu tire o cep, vai aparecer a mensagem de erro que criamos: "Houve um erro ao adicionar..." (23º na class extends)
        // dados do endereço

        Cliente cliente = new Cliente();
        // cliente.codigo    // 27º depois que extendemos a classe e colocamos para acessar aqui tal atributo do cliente, como o codigo, eles aparecem aqui (28º na class Pessoa)
        // dados do cliente
        //cliente.getEnderecos().add(endereco); // 10º usamos o add pq é uma lista, que é um objeto, e que a está programada no JAVA. O getEnderecos é pq assim, toda vez que entrar na class Endereco ele será verificado antes de adicionar um novo no passo 11º na class Cliente

        try {           // 20º Também podemos usar o try catch para forçar o tratamento e não deixar acontecer as exceções. E aqui dentro deles fazemos o tratamento que já tínhamos feito antes
            cliente.adicionarEndereco(endereco);                   // 21º basicamente ele vai tentar isso aqui e, se nao der, vai para o catch e mostra o erro
            System.out.println("Endereço adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Houve um erro ao adicionar endereço: " + e.getMessage());
        }

//        cliente.adicionarEndereco(endereco); // 14º para usar o método criado que facilita a chamada p adicionar um endereco
//        System.out.println("Endereço adicionado com sucesso!");
    }
}
