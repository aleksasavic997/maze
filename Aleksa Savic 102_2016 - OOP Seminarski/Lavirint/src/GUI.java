import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements KeyEventDispatcher{

	Container container;
	
	JPanel header;	/*gornji panel*/
	JPanel footer;	/*donji panel*/
	JPanel center;	/*centralni panel*/
	JPanel p1; //da bi centrirao
	JPanel p2;
	JPanel p;	/*p je panel u kome se nalaze labele za broj pokusaja i godinu*/
	JPanel t;
	
	JLabel tekst=new JLabel("");	/*tekst koji ispisuje ako se udari u ivicu ili polozi ispit */
	JLabel godina = new JLabel("Godina:1                 ");	/*labela koja ispisuje godinu tj. nivo */
	JLabel brojPokusaja = new JLabel("Broj koraka:0                 "); /*labela koja ispisuje broj koraka tj. rezultat */
	JButton novaIgra = new JButton("Zapocni igru ponovo");	/*dugme za pocetak nove igre */
	JButton noviNivo = new JButton("Zapocni nivo ponovo");	/*dugme za pokretanje trenutnog nivoa iz pocetka */
	
	MyLabel[][] polja = new MyLabel[25][25];	/*matrica labela koje imaju i i j */
	Engine game = new Engine();
	int indikator;
	
	ImageIcon svetloPlava = new ImageIcon("src\\images\\svetlo_plava.png");
	ImageIcon tamnoPlava = new ImageIcon("src\\images\\tamno_plava.png");
	ImageIcon svetloZelena = new ImageIcon("src\\images\\svetlo_zelena.png");
	ImageIcon aleksa = new ImageIcon("src\\images\\aleksa.jpg");
	
	int k=5;	/*k je broj koji sluzi da se stavi slika tamo gde je ispit - slike ispita su oznacene brojevima 6-43*/
	int brPokusaja=0;	/*broj koraka */
	int br2;	/*tu se pamti koliko ima koraka posle nivoa 1*/
	int br3;	/*tu se pamti koliko ima koraka posle nivoa 2*/
	int br4;	/*tu se pamti koliko ima koraka posle nivoa 3*/
	boolean z = true;
	public GUI(String naslov)
	{
		super(naslov);
		setBounds(0,0,1030,1040);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		container = getContentPane();
		container.setBackground(Color.WHITE);
		
		setHeader();
		setFooter();
		setCenter();
		
		
		
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(this);
		
		refreshGUI();
	}
	
	
	private void setHeader()
	{
		/*severni panel */
		header = new JPanel(new GridLayout(1,2));
		
		Font f = new Font(null,Font.BOLD,16);
		
		/*godina je labela u kojoj pise na kom smo nivou-godini*/
		godina.setFont(f);
		godina.setForeground(Color.BLUE);
		
		
		/*broj pokusaja je labela u kojoj se nalazi broj koraka igraca */
		brojPokusaja.setFont(f);		
		brojPokusaja.setForeground(Color.BLUE);		
		
		/*p je panel u kome se nalaze labele za broj pokusaja i godinu*/
		p=new JPanel(new FlowLayout());
		p.add(godina);
		p.add(brojPokusaja);
		p.setBackground(Color.ORANGE);
		
		/*tekst je labela u koju se ispisuje tekst za polozen ispit ili udarac u ivicu*/
		tekst.setFont(f);
		
		/*t je panel u kome se nalazi tekst koji treba ispisati ako se polozi ispit ili udari u ivicu*/
		t=new JPanel(new FlowLayout());
		t.add(tekst);
		/*na pocetku se u headeru nalazi godina i broj pokusaja */
		header.add(p);
		/*dodavanje headera u glavni container */
		container.add(header,BorderLayout.NORTH);
		
	}
	private void setFooter()
	{
		/*juzni panel */
		footer = new JPanel(new FlowLayout());
		footer.setBackground(Color.ORANGE);
		
		Font f = new Font(null,Font.BOLD,16);
		
		/*dugme za pocetak nove igre */
		novaIgra.setFont(f);
		novaIgra.setBackground(Color.BLUE);
		novaIgra.setForeground(Color.WHITE);
		novaIgra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				game.nivo1();
				k=5;
				brPokusaja=0;
				setHeader();
				setFooter();
				refreshGUI();
			}
			
		});
		
		/*dugme za pocetak trenutnog nivoa iz pocetka */
		noviNivo.setFont(f);
		noviNivo.setBackground(Color.BLUE);
		noviNivo.setForeground(Color.WHITE);
		noviNivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int nivo=game.getNivo();
				if(nivo==1)
				{
					game.nivo1();
					k=5;
					brPokusaja=0;
				}
				if(nivo==2)
				{
					game.nivo2();
					k=15;
					brPokusaja=br2;
				}
				if(nivo==3)
				{
					game.nivo3();
					k=25;
					brPokusaja=br3;
				}
				if(nivo==4)
				{
					game.nivo4();
					k=33;
					brPokusaja=br4;
				}
				setHeader();
				setFooter();
				refreshGUI();
			}
			
		});
		/*dodavanje dugmica u juzni panel */
		footer.add(novaIgra);
		footer.add(noviNivo);
		
		
		/*dodavanje juznog panela u glavni container */
		container.add(footer,BorderLayout.SOUTH);
	}
	
	private void setCenter()
	{
		/* centralni panel */
		center = new JPanel(new GridLayout(25,25));
		center.setBackground(Color.WHITE);
		
		/*postavlja matricu labela u centralni panel */
		for(int i=0;i<25;i++)
		{
			for(int j=0;j<25;j++)
			{
				polja[i][j]=new MyLabel(i,j);
				
				center.add(polja[i][j]);
			}
		}
		
		/*centralni panel dodaje glavnom container-u*/
		container.add(center);
		
		
	}
	private void refreshGUI()
	{
		brojPokusaja.setText("Broj koraka: " + brPokusaja + "                 ");	/*setuje se tekst za broj pokusaja*/
		godina.setText("Godina:" + game.getNivo() + "                 ");	/*setuje se tekst za godinu */
		
		for(int i=0;i<25;i++)
		{
			for(int j=0;j<25;j++)
			{
				/*ako je prazno polje, polje za kraj nivoa ili ispit stavlja se svetlo plava*/
				if(game.dajVrednost(i,j)==0 || game.dajVrednost(i, j)==4 || game.dajVrednost(i, j)==5)
				{
					polja[i][j].setIcon(svetloPlava);
				}/*tamno plavo polje stavlja se tamo gde igrac ne moze da ide*/
				else if(game.dajVrednost(i,j)==1)
				{
					polja[i][j].setIcon(tamnoPlava);
				}/*gde je 2 ide aleksina slika iz indeksa*/
				else if(game.dajVrednost(i, j)==2)
				{
					polja[i][j].setIcon(aleksa);
				}/*svetlo zelena boja tamo gde je igrac prosao*/
				else if(game.dajVrednost(i, j)==3)
				{
					polja[i][j].setIcon(svetloZelena);
				}/*do 5 su brojevi rezervisani za prethodno navedeno, a od 6 su brojevi rezervisani za sliku ispita */
				else if(game.dajVrednost(i, j)>k)
				{
					k++;
					polja[i][j].setIcon(new ImageIcon("src\\images\\" + k + ".png"));
				}
			}
		}
	}
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		
		
		if(e.getID()==KeyEvent.KEY_RELEASED)
		{	
			brPokusaja++;
			brojPokusaja.setText("Broj koraka: " + brPokusaja + "                 ");
			if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				indikator=game.odigrajPotez("R");
			}
			else if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				indikator=game.odigrajPotez("L");
			}
			else if(e.getKeyCode()==KeyEvent.VK_UP)
			{
				indikator=game.odigrajPotez("U");
			}
			else if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				indikator=game.odigrajPotez("D");
			}
			/*obican korak*/
			if(indikator==0 )
			{
				
				godina.setText("Godina:" + game.getNivo() + "                 ");
				p.setBackground(Color.ORANGE);
				godina.setForeground(Color.BLUE);
				brojPokusaja.setForeground(Color.BLUE);
				header.setBackground(Color.ORANGE);
					header.remove(t);
					header.add(p);
				z=true;
				footer.setBackground(Color.ORANGE);
				
				
			}
			
			/*ako se udari u ivicu*/
			else if(indikator==1)
			{
				brPokusaja+=4;
				brojPokusaja.setText("Broj koraka: " + brPokusaja + "                 ");
				tekst.setText("Ne udaraj u ivicu");			
				tekst.setForeground(Color.WHITE);
				t.setBackground(Color.RED);
				header.setBackground(Color.RED);
					header.remove(p);
					header.add(t);
				footer.setBackground(Color.RED);
			}
			/*ako se udari u vec polozen ispit*/
				
			
			
			
			
			
			/*ako je ispit*/
			else if(indikator==5)
			{
				/*pojavljuje se tekst */
				tekst.setText("Aleksa je polozio " + game.dajNazivIspita());
				tekst.setForeground(Color.BLACK);
				t.setBackground(Color.GREEN);
				header.setBackground(Color.GREEN);
					header.remove(p);
					header.add(t);
				footer.setBackground(Color.GREEN);
			}
			else if(indikator==6)
			{
				tekst.setText("Ne mozete ponovo polagati polozen ispit");
				tekst.setForeground(Color.WHITE);
				t.setBackground(Color.RED);
				header.setBackground(Color.RED);
				header.remove(p);
					header.add(t);
				footer.setBackground(Color.RED);
				
			}
			/* ako je stigao na kraj nivoa*/
			else if(indikator==4)
			{
				indikator=0;
				int nivo = game.getNivo();
				/* u zavisnosti od nivoa, prelazi na sledeci */
				if(nivo<4)
				{
					if(nivo==1)
					{
						game.nivo2();
						br2=brPokusaja;
					}	
					if(nivo==2)
					{
						game.nivo3();
						br3=brPokusaja;
					}	
					if(nivo==3)
					{
						game.nivo4();
						br4=brPokusaja;
					}
					refreshGUI();
				}
				/*ako je poslednji bio posledjni nivo otvara se dialog za pocetak nove igre ili gasenje*/
				else
				{
					int odgovor = JOptionPane.showConfirmDialog(this, "Presli ste igricu!\nNova igra?","Kraj igre",JOptionPane.YES_NO_OPTION);
					if(odgovor==JOptionPane.YES_OPTION)
					{
						game.nivo1();
						k=5;
						brPokusaja=0;
						
						refreshGUI();
						brojPokusaja.setText("Broj koraka: " + brPokusaja + "                 ");
					}	
					else
					{
						System.exit(0);
					}
				}
			}
			refreshGUI();
		}
		return false;
	}

}
