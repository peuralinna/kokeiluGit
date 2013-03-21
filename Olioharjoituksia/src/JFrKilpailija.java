import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.border.*;

class JFrKilpailija extends JFrame
{
	
	Kilpailija kilpailijaolio;
	KilpailijaOsallistujat listaOlio = new KilpailijaOsallistujat("Helsinki maraton");
 //Paneeli
 private JPanel paNapit = new JPanel(new FlowLayout(FlowLayout.RIGHT));
 private JPanel paTiedot = new JPanel(new GridLayout(2,2,2,2));
 private JPanel paTausta = new JPanel(new GridLayout(2,1,20,20));
 

 
  //KÄYTTÖLIITTYMÄKOMPONENTIT
 private JLabel lbEtunimi = new JLabel("Etunimi");
 private JLabel lbSukunimi = new JLabel("Sukunimi");
  
 private JTextField tfEtunimi =new JTextField(15);
 private JTextField tfSukunimi =new JTextField(15);


 private JButton btTallenna = new JButton("Tallenna");
 private JButton btSijoitus = new JButton("Sijoitus");
 private JButton btTulostus = new JButton("Tulostus");


 public JFrKilpailija()
 {
  setTitle("Kilpailija");
  //setSize(450, 150);
  setLocation(100, 100);
  asetteleKomponentit();
  this.pack();
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
 private void asetteleKomponentit()
 {
  paTiedot.add(lbEtunimi);
  paTiedot.add(tfEtunimi);
  paTiedot.add(lbSukunimi);
  paTiedot.add(tfSukunimi);
   
     
  paNapit.add(btTallenna);
  paNapit.add(btSijoitus); 
  paNapit.add(btTulostus);
   
  
  paTausta.add(paTiedot);
  paTausta.add(paNapit);
  
  paTausta.setBorder(BorderFactory.createEmptyBorder(20,20,0,20));
 
  this.add(paTausta);
   
  btTallenna.addActionListener(new AlsTallenna());
  btSijoitus.addActionListener(new AlsSijoitus());
  btTulostus.addActionListener(new AlsTulostus());

 }
 
  class AlsTallenna implements ActionListener
  {
   public void actionPerformed(ActionEvent tapahtuma)
   {
     kilpailijaolio = new Kilpailija(tfEtunimi.getText(),tfSukunimi.getText());
     
     
   }
  }

 class AlsSijoitus implements ActionListener
 {
  public void actionPerformed(ActionEvent tapahtuma)
  {
    String sijoitus = JOptionPane.showInputDialog("Anna kilpailijan "+kilpailijaolio.getEtunimi()+" sijoitus.");
    int sija = Integer.parseInt(sijoitus);
    kilpailijaolio.setSijoitus(sija);
    listaOlio.lisaaKilpailija(kilpailijaolio);
  }
 }

 class AlsTulostus implements ActionListener
 {
  public void actionPerformed(ActionEvent tapahtuma)
  {
	  JOptionPane.showMessageDialog(null, kilpailijaolio, "Kilpailijan tiedot", JOptionPane.PLAIN_MESSAGE);
	  JOptionPane.showMessageDialog(null, listaOlio, "Kilpailun tiedot", JOptionPane.PLAIN_MESSAGE);
  }
 }
 
 public static void main(String[] args)
 {
	 SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrKilpailija Ikkuna1= new JFrKilpailija();
				Ikkuna1.setVisible(true);
			}
		});
 }
}
