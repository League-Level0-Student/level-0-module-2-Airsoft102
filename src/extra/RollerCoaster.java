package extra;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {

		String tall = JOptionPane.showInputDialog("How tall are you?");

		int tallness = Integer.parseInt(tall);

		if (tallness > 47) {
			JOptionPane.showMessageDialog(null, "You can ride the roller coaster");
			
			
			
			
			
			
	}
		else {
			JOptionPane.showMessageDialog(null, "sorry mate not today");
		}
	}
}
