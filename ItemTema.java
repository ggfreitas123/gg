package atvd;

public class ItemTema {
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    private long id;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private String descricao;
    public ItemTema(long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    public void exibirItemTema (){
        System.out.println(id+" "+ nome+" "+descricao);
    }
    
}
