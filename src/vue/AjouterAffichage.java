package vue;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.channels.AcceptPendingException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileView;

	

public class AjouterAffichage extends JPanel {

		JTextField chemin, nomFichier, nomAffichage, description;
		FileView apercu;
		File image;
		String direction, nom;
		Boolean retourBDD = false;

	public AjouterAffichage() {
		setLayout(null);
		
		this.setSize(800,600);
		this.setLocation(0,0);
		
		JLabel titre = new JLabel("Ajouter un affichage");
		titre.setSize(800,50);
		titre.setLocation(0,0);
		titre.setHorizontalAlignment(SwingConstants.CENTER);
		add(titre);
		
		nomAffichage= new JTextField();
		nomAffichage.setSize(350,30);
		nomAffichage.setLocation(50,80);
		nomAffichage.setText("Inscrire ici le nom de votre affichage");
		add(nomAffichage);
		
		chemin= new JTextField();
		chemin.setSize(350,30);
		chemin.setLocation(50,130);
		chemin.setText("Chemin d'acces � votre image");
		chemin.setEditable(false);
		add(chemin);
		
		nomFichier= new JTextField();
		nomFichier.setSize(170,30);
		nomFichier.setLocation(430,130);
		nomFichier.setText("Nom du fichier selectionn�");
		nomFichier.setEditable(false);
		add(nomFichier);
		
		JButton btnParcourir = new JButton("Parcourir");
		btnParcourir.setSize(100,30);
		btnParcourir.setLocation(620,130);
		btnParcourir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser file;
				file= new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg", "png", "gif", "JPG & GIF Images");
				file.showOpenDialog(null);
				image = file.getSelectedFile();
				file.setFileFilter(filter);
				direction = image.getAbsolutePath();
				nom = file.getSelectedFile().getName();
				apercu = file.getFileView();
				nomFichier.setText(nom);
				chemin.setText(direction);
				}
			}
		);
		add(btnParcourir);
		
		description= new JTextField();
		description.setSize(700,40);
		description.setLocation(50,450);
		description.setText("Inscrire ici le nom de votre affichage");
		add(description);
		
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(50, 500, 200, 40);
		btnAnnuler.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				changementVue();		
			}
		});
		add(btnAnnuler);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(550, 500, 200, 40);
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// acces a la base de donn�e, si l'enregistrement s'est fait sans probleme, retour d'un booleean avec la valuer true
				if (retourBDD == true){
				changementVue();
				retourBDD = false;
				}else{
					JOptionPane.showMessageDialog(null,"erreur lors de l'enregistrement, \n veuillez verifier vos informations");
				}
			}
		});
		add(btnValider);
		
		JLabel img = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/mario.png")).getImage();
		img.setIcon(new ImageIcon(image));
		img.setSize(400,250);
		img.setLocation(200,180);
		add(img);
		
	}
	
	private void changementVue() {
		PageAccueil pa = new PageAccueil();
		this.removeAll();
		this.repaint();
		this.revalidate();
		this.add(pa);
		this.repaint();
		this.revalidate();
	}
	
}
