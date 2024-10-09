package atvd;

public class Endereco {
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    private long id;
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    private String logradouro;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    private int numero;
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    private String complemento;
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    private String bairro;
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    private String cidade;
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    private String cep;
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    private String uf;

    public Endereco(long id, String logradouro, int numero, String complemento, String bairro, String cidade,
            String cep, String uf) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
    }
    public void exibirEnd(){
        System.out.println(id + " "+logradouro+" "+ numero + " "+ complemento+ " "+ bairro+ " "+ cidade +" "+ cep+" "+ uf);
    }
    

}
