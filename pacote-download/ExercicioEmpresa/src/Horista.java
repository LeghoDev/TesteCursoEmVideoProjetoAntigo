public class Horista extends Empregado{
    private double precoHora;
    private double horasTrabalhadas;
    
    Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas){
            super(nome, sobrenome, cpf);
            this.precoHora = precoHora;
            this.horasTrabalhadas = horasTrabalhadas;
    }
    public double vencimento(){
        return horasTrabalhadas*precoHora;
    }
    public void statusSalario(){
        System.out.println("       Horsita\n---------------------\n Valor do salario atual: R$ "+this.vencimento()+"\n---------------------");
    }
    
    public void metodoSobrecarga(Horista status){
        System.out.println(status.getNome());
        System.out.println(status.getSobrenome());
        System.out.println(status.getCpf());
    }
    public String metodoSobrecarga(){
        return "Preco hora: " + this.precoHora + "\nHoras trabalhadas: " + this.horasTrabalhadas;
    }
   
}
