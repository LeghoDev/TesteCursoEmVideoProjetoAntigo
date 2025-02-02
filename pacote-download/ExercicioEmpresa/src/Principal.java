public class Principal {
    public static void main(String[] args) {
        
        Comissionado c1 = new Comissionado("Leonardo", "Silva", "320.480.820-03", 32, 70.00);
        Horista h1 = new Horista("Vitoria","Ferreira","517.973.526-04", 20.00, 7.00);
        Assalariado a1 = new Assalariado("Carol","Teixeira", "320,378,589-04", 1500);
        
        h1.statusSalario();
        a1.statusSalario();
        c1.statusSalario();
        
        h1.metodoSobrecarga(h1);
        
    }
    
}
