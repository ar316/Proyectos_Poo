import javax.swing.JOptionPane;

public class App {

    static int selec = -1;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Account arnold = new Account("3173121433",0);



        while (selec != 0){
            String lectura = JOptionPane.showInputDialog(null,"************************\nElige opción:\n1.- Ver informacion de la cuenta " +
						"\n2.- consiganar\n" +
						"3.- retirar dinero\n" +
						"0.- Salir\n************************");
				//Recoger una variable por consola
				selec = Integer.parseInt(lectura); 

                switch(selec){
                    case 1 :
                            JOptionPane.showMessageDialog(null, arnold.toString(), " informacion de la Cuenta ", selec);
                            break;
                    case 2: 
                            String monto =JOptionPane.showInputDialog(null, "Digite al cantidad de dinero que quuiere agregar a la cuenta ");
                            float amount = Float.parseFloat(monto);
                    arnold.credit("3173121433", amount);
                    break;

                    case 3:
                            break;
                            
                            
                }
        }
    }
}
