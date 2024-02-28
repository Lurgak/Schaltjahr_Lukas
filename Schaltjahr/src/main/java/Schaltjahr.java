import javax.swing.JOptionPane;

public class Schaltjahr  {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Bitte eine Jahreszahl eingeben:");
        double jahr = Integer.parseInt(input);

        if ( input.endsWith("00") ) {
            System.out.println((int)jahr + " st kein Schaltjahr weil: Es handelt sich um ein Jahrhundert");
        } else {
            if (( jahr / 4) % 1 == 0 ) {
                System.out.println((int)jahr + " ist ein Schaltjahr");
                
            } else {
                System.out.println((int)jahr + " ist kein Schaltjahr weil: Ihre Eingabe ist nicht durch 4 teilbar");
            }
        }
    }
}