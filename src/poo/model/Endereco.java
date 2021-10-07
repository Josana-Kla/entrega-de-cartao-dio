package poo.model;
// 4º criei o que tera na classe Endereco
public class Endereco extends Object {   // toda classe extends Object. Não precisamos colocar como coloquei aqui, pq por padrão isso já acontece

    public enum TipoEndereco {  // 6º crio um enum para dizer quais vao ser os tipos de Endereco
        RESIDENCIAL,
        ENTREGA,
        TRABALHO
    }

    public String endereco;
    public String numero;
    public String complemento;
    public String cidade;
    public String bairro;
    public String estado;
    public String cep;
    public TipoEndereco tipo;  // 7º declaro o enum aqui e coloco que ele será do tipo tipo (passo 8º na class Cliente)

}
