package test;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Image extends JPanel {
	
	private BufferedImage images;
	
	public Image() {
		try {
			images = ImageIO.read(new File("C:\\Users\\henry.lorenzo\\eclipse-workspace\\test\\grafica.png"));
		} catch (IOException ex) {
			// handle exception
		}
	}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(images, 0, 0, this); // see javadoc for more info on the parameters            
    }

}
