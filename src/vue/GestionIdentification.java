package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GestionIdentification extends JPanel {

	private JTextField identifiant;
	private JTextField ancienMotDePasse;
	private JTextField nouveauMotDePasse;
	private JTextField confirmationMotDePasse;

	public GestionIdentification() {
		setLayout(null);
		
		this.setSize(800,600);
		this.setLocation(0,0);
		
		JLabel lblPage = new JLabel("Votre identifiant actuel");
		lblPage.setSize(800, 50);
		lblPage.setLocation(0, 0);
		lblPage.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblPage);
		
		identifiant = new JTextField();
		identifiant.setLocation(300,75);
		identifiant.setSize(250, 30);
		identifiant.setText("saisir ici votre nouvel identifiant");
		add(identifiant);
		
		JButton btnConfirmer = new JButton("Valider votre nouvel identifiant");
		btnConfirmer.setBounds(300, 110, 280, 40);
		btnConfirmer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				enregistrementNouvelIdentifiant();
			}
		});
		add(btnConfirmer);

		ancienMotDePasse = new JTextField();
		ancienMotDePasse.setLocation(300,260);
		ancienMotDePasse.setSize(250, 30);
		ancienMotDePasse.setText("saisir ici votre mot de passe actuel");
		add(ancienMotDePasse);
		
		nouveauMotDePasse = new JTextField();
		nouveauMotDePasse.setLocation(300,310);
		nouveauMotDePasse.setSize(250, 30);
		nouveauMotDePasse.setText("saisir ici votre nouveau mot de passe");
		add(nouveauMotDePasse);
		
		confirmationMotDePasse = new JTextField();
		confirmationMotDePasse.setLocation(300,350);
		confirmationMotDePasse.setSize(250, 30);
		confirmationMotDePasse.setText("saisir à nouveau votre mot de passe");
		add(confirmationMotDePasse);
		
		JButton btnConfirmerMDP = new JButton("Valider votre nouveau mot de passe");
		btnConfirmerMDP.setBounds(300, 400, 280, 40);
		btnConfirmerMDP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				enregistrementNouveauMotDePasse();
			}
		});
		add(btnConfirmerMDP);
		
		
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(300, 500, 200, 40);
		btnAnnuler.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				retourPageAccueil();				
			}
		});
		add(btnAnnuler);
		
		
	}
	
	private void retourPageAccueil() {
		PageAccueil pa = new PageAccueil();
		this.removeAll();
		this.repaint();
		this.revalidate();
		this.add(pa);
		this.repaint();
		this.revalidate();
	}
	
	private void enregistrementNouvelIdentifiant() {
		//ici l'acces a la class permettant l'enregitrement  dans la base de donnée
	}
	
	private void enregistrementNouveauMotDePasse() {
		//ici l'acces a la class permettant l'enregitrement  dans la base de donnée

	}
}
