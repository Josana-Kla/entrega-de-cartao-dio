package poo.model;

public class Pessoa {   //24º criei class Pessoa com seus respectivos atributos

    private static final int TAMANHO_CPF = 11;     // 32º vou criar duas constantes estática para usar só aqui, a qual fala o tamanho que o cpf tem que ter e
    private static final int TAMANHO_CNPJ = 14;    // 33º fala o tamaho que o cnpj tem que ter

    public enum TipoPessoa {FISICA, JURIDICA}  //25º por existir cnpj ou cpf, alterei a String que era cpf para documento e criei esse enum para citar os dois tipos de documentos que quero

    public Integer codigo;
    public String nome;
    private String documento;   // tudo que pode começar com 0, colocamos o tipo de dado como String para evitar ter que fazer tratamentos a mais. Além de que, se aqui fosse Integer para cpf e cnpj não daria pois não podemos somar esses documentos ne?. Outra coisa, como alterei o nome aqui, tive que alterar o nome no getters and setters na class Cliente
    public TipoPessoa tipo;     //26º declarei o enum TipoPessoa e falei que ele é do tipo tipo (27º na class EntregaCartaoApp)

    public String getDocumento() {   // 28º posso criar getters and setters para documentos, já que agora mudei ele para privado
        return documento;
    }

    public void setDocumento(String documento) {   //29º em no setter, posso fazer um tratamento para saber se documento não é nulo ou se não está vazio
        if(documento == null || documento.isEmpty()) {
            throw new RuntimeException("Documento não pode ser nulo ou vazio");    // 30º caso seja nulo ou vazio, vai aparecer essa mensagem
        }

        if(documento.length() == TAMANHO_CPF) {    // 31º e como sabemos que cfp tem 11 digitos e cnpj tem 14, criamos uma constante lá em cima que será usada aqui para saber o tamanho/qtdade de digitos do documento
            setDocumento(documento, tipo = TipoPessoa.FISICA);              // 37º vou acrescentar aqui o setDocument que criei e arrumei no passo anterior
        }
        else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento,tipo = TipoPessoa.JURIDICA);             // 38º e acrescentar aqui tambem
        } else {
            throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
        }

    }

    private void setDocumento(String documento, TipoPessoa tipo) {  // 34º recriei o setter de documento, dessa vez acrescentando TipoPessoa, e vou mover o que tinha nele pra cá
        this.documento = documento;      // 35º vou adicionar um documento
        this.tipo = tipo;                // 36º e falar q o tipo da class é igual ao tipo
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }
}
