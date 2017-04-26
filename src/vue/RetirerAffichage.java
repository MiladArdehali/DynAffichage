package vue;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class RetirerAffichage extends JPanel{

		boolean erreur = false;
		ArrayList<String> tab = new ArrayList<>();

	public RetirerAffichage() {
		setLayout(null);
		
		tab.add("un");
		tab.add("deux");
		
		this.setSize(800,600);
		this.setLocation(0,0);
		JScrollPane fenetreResultat = new JScrollPane();
		fenetreResultat.setPreferredSize(new Dimension(200, 300));
		for(int i=0; i<tab.size(); i++ ){
			JLabel listeAffichage = new JLabel("");
			listeAffichage.setSize(200,20);
			listeAffichage.setLocation(50,i*50);
			add(listeAffichage);
			
		}
		
		
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
				if (suppressionVue()== true){
					changementVue();
					erreur = false;
				}else{
					JOptionPane.showMessageDialog(null,"erreur lors de l'enregistrement, \n veuillez verifier vos informations");
				}	
				
			}
		});
		add(btnValider);
		
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
	
	private boolean suppressionVue() {
		//methode d'acces à la base de donnée afin de supprimer un affichage
		//si l'acces a la base de donée a reussit alors le boolen tenvoir true sinon en ca d'eerer le boolen renvoit false
		return erreur;
	}
	
}
