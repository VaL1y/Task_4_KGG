import javax.swing.*;
import java.awt.*;

public class Main {

    private final JFrame mainFrame = new JFrame();

    public Main() {
        mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainFrame.setSize(new Dimension(800, 800));
        PanelImage panelImage = new PanelImage();
        PanelImage panelImageCompressed = new PanelImage();
        PanelMenu panelMenu = new PanelMenu(panelImage, panelImageCompressed);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(BorderLayout.SOUTH, panelMenu);
        JPanel panelOfImages = new JPanel();
        panelOfImages.setLayout(new GridLayout(1, 2));
        panelOfImages.add(panelImage);
        panelOfImages.add(panelImageCompressed);
        mainFrame.add(BorderLayout.CENTER, panelOfImages);
    }

    public void start() {
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        Main graphicApp = new Main();
        graphicApp.start();
    }
}