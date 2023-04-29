import javax.swing.JOptionPane;

public class Account {
    

    private String accountNumber;
    private double balance;
    private Object equals;



    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }



    public String getAccountNumber() {
        return accountNumber;
    }



    public double getBalance() {
        return balance;
    }


   

    

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }



    public void credit(String accountNumber, double amount) {

        if (accountNumber.equals(this.accountNumber) && amount >0){

            this.balance += amount;
            JOptionPane.showConfirmDialog(null, "felicidades has realizao la consigancion", accountNumber, JOptionPane.DEFAULT_OPTION);

        }else
        {
            JOptionPane.showConfirmDialog(null, "No se pudo realizar la consignacion valor incorrecto o Numero de cuanta equivocado", accountNumber, 0);
        }


    }

    


    












}
