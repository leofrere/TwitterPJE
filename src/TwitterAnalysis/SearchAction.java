package TwitterAnalysis;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import TwitterAnalysis_UI.AnalysisUI;
import twitter4j.TwitterException;

public class SearchAction extends AbstractAction {
	private AnalysisUI fenetre;
	private String search;
 
	public SearchAction(AnalysisUI fenetre, String texte){
		super(texte);
		this.fenetre = fenetre;
	}
 
	public void actionPerformed(ActionEvent e) { 
		String texteUtilisateur = this.fenetre.textField().getText();
		try {
			search = new TwitterAnalysis().request(texteUtilisateur);
		} catch (TwitterException e1) {
			e1.printStackTrace();
		}
		fenetre.label().setText(search);
		
	} 
}
