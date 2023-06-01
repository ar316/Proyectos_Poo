import java.util.concurrent.CountedCompleter;

public class Cliente extends Cuenta {
    private String username;

    public Cliente( String username,String numeroCuenta, String tipoCuenta, double balance) {
        super(numeroCuenta, tipoCuenta, balance);
        this.username = username;
        
    }
    public void mostrarInfo() {
        System.out.println("Saldo actual= " + super.getBalance() + " tipo de cuenta= " + super.getTipoCuenta() + " nombre del cliente= " + this.username); 
    }
    
    
    

   
  
}