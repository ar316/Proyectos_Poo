public class Cuenta {
    private String numeroCuenta;
    private String tipoCuenta;
    private double balance;

    public Cuenta(String numeroCuenta, String tipoCuenta, double balance) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.balance = balance;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void credito(double cantidad) {
        balance += cantidad;
    }

    public void debito(double cantidad) {
        if (balance >= cantidad) {
            balance -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + balance);
    }

    
    public String tuiString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", balance=" + balance + "]";
    }

   

}