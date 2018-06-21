package test;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImageGraphics extends JPanel {
	
	public BufferedImage images1;
	
	public void paint(Graphics g){
		 Image image = Toolkit.getDefaultToolkit().getImage("grafica.png");
		    g.drawImage(image, 10, 10, this);
	}
	
	
	public ImageGraphics() {
		try {
			images1 = ImageIO.read(new File("C:\\Users\\henry.lorenzo\\eclipse-workspace\\test\\grafica.png"));
		} catch (IOException ex) {
			// handle exception
		}
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(images1, 0, 0, this); // see javadoc for more info on the parameters            
    }

}
