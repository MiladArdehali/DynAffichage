package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class AffichageEnCours extends JPanel{
	
		boolean validation = false;
		ArrayList<String> tab = new ArrayList<>();

	public AffichageEnCours() {
		setLayout(null);
		
		
		this.setSize(800,600);
		this.setLocation(0,0);
		JScrollPane fenetreResultat = new JScrollPane();
		fenetreResultat.setPreferredSize(new Dimension(200, 300));
		tab = chargementAffichage();
		for(int i=0; i<tab.size(); i++ ){
			JLabel listeAffichage = new JLabel("Affichage n° "+i+" :");
			listeAffichage.setSize(200,20);
			listeAffichage.setLocation(50,i*50);
			listeAffichage.setText(tab.get(i));
			add(listeAffichage);
			
			JToggleButton toggleButton = new JToggleButton("Choix du Statut");
			ItemListener itemListener = new ItemListener() {
			    public void itemStateChanged(ItemEvent itemEvent) {
			        int state = itemEvent.getStateChange();
			        if (state == ItemEvent.SELECTED) {
			            toggleButton.setText("Activé");
			            toggleButton.setBackground(Color.GREEN);
			        } else {
			        	toggleButton.setText("Desactivé");
			        	toggleButton.setBackground(Color.ORANGE);
			        }
			    }
			};
			toggleButton.setLocation(450,i*50+5);
			toggleButton.setSize(100,20);
			toggleButton.addItemListener(itemListener);
			add(toggleButton);
						
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
				if (activationVue() == true){
					changementVue();
					validation = false;
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
	
	private ArrayList<String> chargementAffichage() {
		ArrayList<String> tab = new ArrayList<>();
		tab.add("un");
		tab.add("deux");
		tab.add("un");
		tab.add("deux");
		tab.add("un");
		tab.add("deux");
		tab.add("un");
		tab.add("deux");
		//Nous ferrons appel ici à la methode permettant de recuperer les affichage. ils seront tous place dans une arrayList.
			return tab;
	}
	
	private boolean activationVue() {
		boolean ok=false;
		//methode d'acces à la base de donnée afin d'inscrirte un booleen 1(affichage activé) ou 0(affichage desactivé) un affichage
		//si l'acces a la base de donée a reussit alors le boolen tenvoir true sinon en ca d'eerer le boolen renvoit false
		return ok;
	}
		
	}


