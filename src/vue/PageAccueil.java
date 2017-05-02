package vue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import model.AccesBDD;

public class PageAccueil extends JPanel {

	private JTextField accueil;
	private Font f;

	public PageAccueil() {
		setLayout(null);

		this.setSize(800, 600);
		this.setLocation(0, 0);

		f = new Font("Courrier", Font.BOLD, 20);

		accueil = new JTextField();
		accueil.setSize(500, 40);
		accueil.setLocation(5, 5);
		accueil.setText("Bienvenue sur votre page d'accueil");
		accueil.setFont(f);
		accueil.setBackground(null);
		accueil.setBorder(null);
		accueil.setEditable(false);
		add(accueil);

		JButton btnConfiguration = new JButton("Configuration");
		btnConfiguration.setSize(130, 20);
		btnConfiguration.setLocation(650, 20);
		btnConfiguration.setBackground(Color.ORANGE);
		btnConfiguration.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				affichageConfiguration();
			}
		});
		add(btnConfiguration);

		JButton btnAffichageEnCours = new JButton("Affichage en cours");
		btnAffichageEnCours.setBounds(300, 100, 200, 40);
		btnAffichageEnCours.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				affichageEnCours();
			}
		});
		add(btnAffichageEnCours);

		JButton btnAjouterAffichage = new JButton("Ajouter un affichage");
		btnAjouterAffichage.setBounds(300, 200, 200, 40);
		btnAjouterAffichage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ajouterAffichage();
			}
		});
		add(btnAjouterAffichage);

		JButton btnRetirerAffichage = new JButton("Retirer un affichage");
		btnRetirerAffichage.setBounds(300, 300, 200, 40);
		btnRetirerAffichage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				retirerAffichage();
			}
		});
		add(btnRetirerAffichage);

		JButton btnGestionIdentification = new JButton("Gestion d'identification");
		btnGestionIdentification.setBounds(300, 400, 200, 40);
		btnGestionIdentification.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gestionIdentification();
			}
		});
		add(btnGestionIdentification);

	}

	private void affichageConfiguration() {
		Configuration pc = new Configuration();
		appelDessinFenetre(pc);
	}

	private void affichageEnCours() {
		AffichageEnCours ae = new AffichageEnCours();
		appelDessinFenetre(ae);

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
