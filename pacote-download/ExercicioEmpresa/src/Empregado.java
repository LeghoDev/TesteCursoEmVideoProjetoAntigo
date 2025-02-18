public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double vencimento;
    
    Empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public double vencimento(){
       return 0;
    }
    
    public String toString(){
        return super.toString()+"\nNome:\n"+this.nome+"Sobrenome:\n"+this.sobrenome+"CPF:\n"+this.cpf;
    }
    
    public abstract void statusSalario();
    
}
