package vue;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AffichageEnCours extends JPanel{


	public AffichageEnCours() {
		setLayout(null);
		
		JOptionPane.showMessageDialog(null,"nous sommes maintenant qur le panel AffichageEnCours");
		this.setSize(800,600);
		this.setLocation(0,0);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(50, 500, 200, 40);
		add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(550, 500, 200, 40);
		add(btnValider);
		
		
	}

}
