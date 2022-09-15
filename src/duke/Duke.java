package duke;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Duke {

    public static void main(String[] args) throws IOException, InterruptedException {
        JFrame jFrame = new JFrame("Duke");
        jFrame.setVisible(false);
        int imageCount = 17;
        for(int i = 1; i < imageCount; i++){
            String imagePath = "./images/jpegs/T" + i +  ".jpg";
            BufferedImage myPicture = ImageIO.read(new File(imagePath));
            JPanel jPanel = new JPanel();
            jPanel.setPreferredSize(new Dimension(myPicture.getWidth(), myPicture.getHeight()));
            jFrame.getContentPane().add(jPanel);
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            jPanel.add(picLabel);
            jFrame.pack();
            jFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            Thread.sleep(150);
        }
    }
}
