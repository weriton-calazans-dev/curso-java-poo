package entities;

public class Cadastro {
    // inicializando os atributos privados para garantir a segurança.
    // e em string para não quebra o programa
    private String nome;
    private String conta;
    private String saldo;

    //inicializando um construtor com apenas dois atributos como parâmetros.
    public Cadastro(String nome, String conta) {
        // chamando a método setter para incluir o nome no atributo
        setNome(nome);
        // validando a conta antes de incluir no atributo com uma regra de so número e 4 digito obrigatorio.
        if(conta.matches("^[0-9]{4}$")){
            // utilizando a palavra (this) para indicar o atributo da classe.
            this.conta = conta;
        } else {
            System.out.println("Erro! Número da conta inválido:");
        }
        // iniciando o saldo com 0 para não mostrar null na hora da apresentaçao do cadastro.
        this.saldo = "0";
    }
    // inicializando outro construtor com os três atributos como parâmetro.
    public Cadastro(String nome, String conta, String saldo) {
        setNome(nome);

        if (conta.strip().matches("^[0-9]{4}$")) {
            this.conta = conta;
        } else {
            System.out.println("Erro! Número da conta inválido:");
        }
        //validando o saldo fazendo a remoção de espaços extras e colocando como opcional o encremento de (,.).
        //e se vier como decimal obrigatoriamente para ter duas casas decimais
        if (saldo.strip().matches("^[0-9]+([,.][0-9]{1,2})?$")) {
            //modificando se estiver (,) como separador de centavos por (.) para mais tarde transformar em double.
            this.saldo = saldo.replace(",",".");
        } else {
            System.out.println("Erro! Valor inválido:");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // validando se o nome estiver com espaço extra e transformado em maiúsculo e validando se vem apenas letras.
        // para inserir no atributo nome.
        if (nome.toUpperCase().strip().matches("^[A-Z ]+$")) {
            this.nome = nome;
        } else {
            System.out.println("Erro! Nome inválido:");
        }
    }

    public String getConta() {
        return conta;
    }

    public String getSaldo() {
        return saldo;
    }
    // metodo para fazer depósito
    public void deposito(String deposito) {

        if (deposito.matches("^[0-9]+([,.][0-9]{1,2})?$")) {
            // transformando o valor que vem em string para número com decimal e trocando se veio com (,) para (.).
            double valor = Double.parseDouble(deposito.replace(",","."));
            double valor1 = Double.parseDouble(this.saldo);
            double soma = valor1 + valor;
            //transformando o valor de volta para string e atualizando o atributo.
            this.saldo = String.valueOf(soma);
        } else {
            System.out.println("Erro! Valor inválido:");
        }
    }

    public void saque(String saque) {
        if (saque.matches("^[0-9]+([,.][0-9]{1,2})?$")) {
            double valor = Double.parseDouble(saque.replace(",","."));
            double valor1 = Double.parseDouble(this.saldo);
            //validando se o saque é maior ou igual ao saldo para fazer o saque.
            if (valor1 >= (valor + 5.00)) {
                double soma = valor1 - (valor + 5.00);
                this.saldo = String.valueOf(soma);
            } else {
                System.out.println("Erro! Saldo insuficiente");
            }
        }
    }
    @Override

    //método de representação.
    public String toString() {
        return "Cliente: " + nome + "\n" +
                "Numero da conta: " + conta + "\n" +
                "Saldo: R$ " + String.format("%.2f",Double.parseDouble(this.saldo));
    }
}
