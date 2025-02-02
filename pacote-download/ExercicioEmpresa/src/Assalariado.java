public class Assalariado extends Empregado{
    private double salario;
    
    Assalariado(String nome, String sobrenome, String cpf, double salario){
        super (nome,sobrenome,cpf);
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double vencimento(){
        return getSalario();
    }
    public void statusSalario(){
        System.out.println("       Assalariado\n---------------------\n Valor do salario atual: R$ "+this.vencimento()+"\n---------------------");
    }
    
    
}
