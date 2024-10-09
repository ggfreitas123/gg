package atvd;

public class Principal {
    public static void main(String[] args) {
        Tema theme = new Tema(1, "first", 2000.00, "Preto");
        Cliente cliente1 = new Cliente(1, "André", "114253463747", "23456789087654", "3456789876543w");
        ItemTema house = new ItemTema(1, "horse", "lorem");
        Endereco casa1 = new Endereco(1, "rua", 15, "mercado ao lado", "vila barth", "Itapetininga", "18205620", "SP");
    
        
        cliente1.exibirCliente();
        casa1.exibirEnd();
        house.exibirItemTema();
        theme.exibirTema();
        
    }
}
