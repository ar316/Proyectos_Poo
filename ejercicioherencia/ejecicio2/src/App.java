public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente arnold = new Cliente("arnold","1003734", "ahoroos", 100.000);
        Cuenta bairon = new Cuenta("312123","ahorross",200.000);
        arnold.credito(100.000);
        arnold.mostrarInfo();
       

    }
}
