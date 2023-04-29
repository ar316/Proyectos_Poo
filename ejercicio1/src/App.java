import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         Circulo colo1 = new Circulo(3,6,"rojo");

         JOptionPane.showMessageDialog(null, colo1.toString() + "el area es: "+String.format("%.3f", colo1.getArea()) + " la circunferencia es: "+ String.format("%.3f", colo1.getCircunferences()) ) ;// 123.456, "objeto 1", 0);
    }
}
