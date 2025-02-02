public class Comissionado extends Empregado{
    private double totalVenda;
    private double totalComissao;
    
    Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double totalComissao){
        super(nome,sobrenome,cpf);
        this.totalVenda = totalVenda;
        this.totalComissao = totalComissao;
    }
    public double getTotalVenda(){
        return totalVenda;
    }
    public void setTotalVenda(double totalVenda){
        this.totalVenda = totalVenda;
    }
    public double vencimento(){
        return totalVenda*totalComissao;
    }
    public void statusSalario(){
       System.out.println("       Comissionado\n---------------------\n Valor do salario atual: R$ "+this.vencimento()+"\n---------------------");
    }
}
