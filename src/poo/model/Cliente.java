package poo.model;

import java.util.ArrayList;
import java.util.List;

// 1º situação criada: dados do cliente para fazer a entrega de seu cartao
public class Cliente {

    public Integer codigo;
    public String nome;
    public String cpf;
    
    private  List<Endereco> enderecos;  // 5º coloco assim em vez de colocar public Endereco endereco; public Endereco enderecoTrabalho. E private p proteger meu atributo e o  acesso direto a ele (6º passo na class Endereco)

    public void adicionarEndereco(Endereco endereco) { // 13º criei um método, que nao retorna nada, que vai adicionarEndereco e recebe o Endereco (este será chamdo de endereco), para facilitar mais
        if (endereco == null) {   // 15º aqui vou validar para que se meu endereço for null, ele mostre um erro
            throw new NullPointerException("Endereço não pode ser nulo");  // 16º essa forma de validacao não é uma boa pratica, teríamos que usar o extends, mas so para fins de entendimento
        }

        if (endereco.cep == null) {         // 17º também podemos validar outros atributos como o cep
            throw new NullPointerException("CEP não pode ser nulo");
        }

        getEnderecos().add(endereco);  // 18º e se passar por todas validações anteriores, coloquei que ele vai ir no getEnderecos (nao da p ir direto no atributo, se nao ele tb será nulo), e adiciona-o na lista endereco
    }

    private List<Endereco> getEnderecos() { //  9º começo a fazer o encapsulamento, e usando getter para Enderecos, para que só acesse e pegue os dados
        if (enderecos == null) {  // 11º toda vez que entrar na class Endereco, vai vir aqui e verificar se o atribbuto é nulo
            enderecos = new ArrayList<Endereco>();  // 12º e se o atributo endereço nao for nulo, ele adicionará um Endereço
        }
        return enderecos;
    }

    // 19º quase esqueci, por convenção, no JAVA é obrigatório colocar todos getters and setters, mesmo que seja de atributos que nao façam nada
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // 2º ah, mas queria cadastrar um outro endereço...
//    public String endereco2;
//    public String numero2;
//    public String complemento2;
//    public String cidade2;
//    public String bairro2;
//    public String estado2;
//    public String cep2;
// ah, queria mais um...
//public String endereco;
//    public String numero;
//    public String complemento;
//    public String cidade;
//    public String bairro;
//    public String estado;
//    public String cep;
//  ah, e queria o endereço do trabalho tambem...
//    public String endereco3;
//    public String numero3;
//    public String complemento3;
//    public String cidade3;
//    public String bairro3;
//    public String estado3;
//    public String cep3;

    // 3º no entanto, pode ser que eu queira adicionar varios endereços, e isso não seria viavel. Por isso,
    // utilizamos a associação de classes = quando utilizamos uma classe dentro de outra classe:
    // é so criar uma classe dentro da ja criada e colar os dados anteriores que vc quer que vai se
    // repetindo e mudando os dados lá (passo 4 na class Endereco)

}
