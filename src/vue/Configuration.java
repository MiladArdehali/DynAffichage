package vue;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Configuration extends JPanel {

	JTextField configuration;
	Font f;

	public Configuration() {
		setLayout(null);
		
		this.setSize(800,600);
		this.setLocation(0, 0);

		configuration = new JTextField();
		f = new Font("Courrier", Font.BOLD, 20);
		configuration = new JTextField();
		configuration.setSize(500, 40);
		configuration.setLocation(5, 5);
		configuration.setText("Bienvenue sur votre page d'accueil");
		configuration.setFont(f);
		configuration.setBackground(null);
		configuration.setBorder(null);
		configuration.setEditable(false);
		add(configuration);
		
		
		JLabel lblBDD = new JLabel("Nom de la base de donnée : ");
		lblBDD.setSize(250,30);
		lblBDD.setLocation(200, 200);
		lblBDD.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblBDD);
		
		JLabel lblPort = new JLabel("Numero de port : ");
		lblPort.setSize(250,30);
		lblPort.setLocation(200, 300);
		lblPort.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblPort);
		
		JLabel lblAccesServeur = new JLabel("Chemin d'acces fichier du Serveur : ");
		lblAccesServeur.setSize(250,30);
		lblAccesServeur.setLocation(200, 400);
		lblAccesServeur.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblAccesServeur);

		//JOptionPane.showMessageDialog(null, "nous sommes maintenant qur le nouveau panel");

	}

}
