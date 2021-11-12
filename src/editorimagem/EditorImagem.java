package editorimagem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class EditorImagem {

	public static void main(String[] args) {
        try {
        	String key = "CERTO!!!";
            BufferedImage bufferedImage = ImageIO.read(new File("Captura.png"));
            Graphics graphics = bufferedImage.getGraphics();
            graphics.setColor(Color.BLACK);
            graphics.setFont(new Font("Arial Black", Font.PLAIN, 100));
            graphics.drawString(key, 420, 560);
            ImageIO.write(bufferedImage, "png", new File("Captura.png"));
            System.out.println("Image Created");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

	}

}
