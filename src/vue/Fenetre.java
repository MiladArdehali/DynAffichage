package vue;
import java.awt.Color;
import javax.swing.JFrame;

public class Fenetre extends JFrame {
	public Fenetre() {
		
	this.setTitle("DynAffichage");
	this.setSize(800, 600);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	this.setResizable(false);
	
	Identification id = new Identification();
	this.getContentPane().add(id);
	id.setLocation(0,0);
	id.setSize(800,600);
		
	}	
}
