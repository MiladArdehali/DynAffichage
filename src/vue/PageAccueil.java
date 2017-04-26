package vue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PageAccueil extends JPanel {
	private JTextField id;

	public PageAccueil() {
		setLayout(null);
		
		//JOptionPane.showMessageDialog(null,"nous sommes maintenant qur le nouveau panel");
		this.setSize(800,600);
		this.setLocation(0,0);
		
		JButton btnAffichageEnCours = new JButton("Affichage en cours");
		btnAffichageEnCours.setBounds(350, 100, 200, 40);
		btnAffichageEnCours.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				affichageEnCours();
			}
		});
		add(btnAffichageEnCours);
		
		JButton btnAjouterAffichage = new JButton("Ajouter un affichage");
		btnAjouterAffichage.setBounds(350, 200, 200, 40);
		btnAjouterAffichage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ajouterAffichage();
			}
		});
		add(btnAjouterAffichage);
		
		JButton btnRetirerAffichage = new JButton("Retirer un affichage");
		btnRetirerAffichage.setBounds(350, 300, 200, 40);
		btnRetirerAffichage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				retirerAffichage();
			}
		});
		add(btnRetirerAffichage);
		
		JButton btnGestionIdentification = new JButton("Gestion d'identification");
		btnGestionIdentification.setBounds(350, 400, 200, 40);
		btnGestionIdentification.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gestionIdentification();
			}
		});
		add(btnGestionIdentification);
		
	}
	
	private void affichageEnCours() {
		AffichageEnCours ae = new AffichageEnCours();
		this.removeAll();
		this.repaint();
		this.revalidate();
		
		this.add(ae);
		this.repaint();
		this.revalidate();

	}
	
	private void ajouterAffichage() {
		AjouterAffichage aa = new AjouterAffichage();
		appelDessinFenetre(aa);

	}
	
	private void retirerAffichage() {
		RetirerAffichage ra = new RetirerAffichage();
		appelDessinFenetre(ra);

	}
	
	private void gestionIdentification() {
		
		GestionIdentification ga = new GestionIdentification();
		appelDessinFenetre(ga);
	}
	
	private void appelDessinFenetre(JPanel fenetre) {
		this.removeAll();
		this.repaint();
		this.revalidate();
		this.add(fenetre);
		this.repaint();
		this.revalidate();

	}

}
