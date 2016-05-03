package gameplay;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class BinaryHelp extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BinaryHelp(){
		setTitle("Binary Helper");
		setSize(700,625);
		add(new BinPic());
	}
	
	class BinPic extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private BufferedImage image;

		public BinPic(){
			try{
				image = ImageIO.read(new File("binhelp.png"));
			}
			catch(IOException e){
				System.out.println("Whoops, no picture help file");
			}

		}

		protected void paintComponent(Graphics g){
			super.paintComponents(g);
			g.drawImage(image, 0, 0, null);
		}
	}
}
