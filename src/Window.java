import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Window is the main Class
 * Window Class manage the user interface
 * Window Class use JFrame to create buttons and toolbars
 * Window Class use ActionListener to be able to interact interface elements
 *
 * @author clement
 */

public abstract class Window extends JFrame implements ActionListener {

    // Variables
    static protected Drawing myDrawring = new Drawing();

    // Constructor
    public Window(String Title,int x,int y)
    {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = this.getContentPane() ;

        // Création de la barre menu
        JMenuBar m = new JMenuBar();
        // File
        JMenu menu1 = new JMenu("File");
        // File -> New
        JMenuItem New = new JMenuItem("New");
        menu1.add(New);
        New.addActionListener(this);
        // File -> Open
        JMenuItem Open = new JMenuItem("Open") ;
        menu1.addSeparator();
        menu1.add(Open);
        Open.addActionListener(this);
        // File -> Save
        JMenuItem Save = new JMenuItem("Save");
        menu1.add(Save);
        Save.addActionListener(this);
        // File -> Quit
        JMenuItem Quit = new JMenuItem("Quit");
        menu1.addSeparator();
        menu1.add(Quit);
        Quit.addActionListener(this);
        m.add(menu1);
        // About
        JMenu menu2 = new JMenu("About");
        JMenuItem Info = new JMenuItem("Info");
        Info.addActionListener(this);
        JOptionPane info = new JOptionPane();
        info.showInternalMessageDialog( info, "Pour commencer à dessiner, cliquez sur Ok",
                "Pop-Up",JOptionPane.INFORMATION_MESSAGE);
        menu2.add(Info);
        m.add(menu2);
        contentPanel.add(m, "North");

        // Création du Panel inférieur
        JPanel southPanel = new JPanel();
        southPanel.setLayout (new GridLayout(1,2));

        // Création du Panel couleurs
        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new GridLayout(2,4));
        // Noir
        JButton Black = new JButton("Black");
        Black.setBackground(Color.BLACK);
        Black.setForeground(Color.WHITE);// Pour que l'on puisse lire la couleur
        colorPanel.add(Black);
        /*
         * Les deux lignes qui suivent permettent un
         * affichage correct de la couleur sur macOS
         */
        Black.setOpaque(true);
        Black.setBorderPainted(false);
        Black.addActionListener(this);
        // Jaune
        JButton Yellow = new JButton("Yellow");
        Yellow.setBackground(Color.YELLOW);
        colorPanel.add(Yellow);
        Yellow.setOpaque(true);
        Yellow.setBorderPainted(false);
        Yellow.addActionListener(this);
        // Rouge
        JButton Red = new JButton("Red");
        Red.setBackground(Color.RED);
        Red.setOpaque(true);
        Red.setBorderPainted(false);
        colorPanel.add(Red);
        Red.addActionListener(this);
        // Rose
        JButton Pink = new JButton("Pink");
        Pink.setBackground(Color.PINK);
        colorPanel.add(Pink);
        Pink.setOpaque(true);
        Pink.setBorderPainted(false);
        Pink.addActionListener(this);
        // Vert
        JButton Green = new JButton("Green");
        Green.setBackground(Color.GREEN);
        colorPanel.add(Green);
        Green.setOpaque(true);
        Green.setBorderPainted(false);
        Green.addActionListener(this);
        // Magenta
        JButton Magenta = new JButton("Magenta");
        Magenta.setBackground(Color.MAGENTA);
        colorPanel.add(Magenta);
        Magenta.setOpaque(true);
        Magenta.setBorderPainted(false);
        Magenta.addActionListener(this);
        // Bleu
        JButton Blue = new JButton("Blue");
        Blue.setBackground(Color.BLUE);
        colorPanel.add(Blue);
        Blue.setOpaque(true);
        Blue.setBorderPainted(false);
        Blue.addActionListener(this);
        // Orange
        JButton Orange = new JButton("Orange");
        Orange.setBackground(Color.ORANGE);
        colorPanel.add(Orange);
        Orange.setOpaque(true);
        Orange.setBorderPainted(false);
        Orange.addActionListener(this);


        // Création du Panneau outils
        JPanel toolPanel = new JPanel();
        toolPanel.setLayout(new GridLayout(2,2));
        // Ellipse
        JButton Ellipse = new JButton("Ellipse");
        toolPanel.add(Ellipse);
        Ellipse.addActionListener(this);
        // Rectangle
        JButton Rectangle = new JButton("Rectangle");
        toolPanel.add(Rectangle);
        Rectangle.addActionListener(this);
        // Cercle
        JButton Cercle = new JButton("Cercle");
        toolPanel.add(Cercle);
        Cercle.addActionListener(this);
        // Carré
        JButton Carre = new JButton("Carre");
        toolPanel.add(Carre);
        Carre.addActionListener(this);

        // Ajout de toolPanel et colorPanel à southPanel
        contentPanel.add(southPanel, "South");
        southPanel.add(colorPanel);
        southPanel.add(toolPanel);

        // Ajout de ma feuille de dessin
        contentPanel.add(myDrawring,"Center");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd = e.getActionCommand();
        switch (cmd){
            // Info
            case "Info" :
                JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog(info,
                        "Author : MALIGE Clément",
                        "information",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Quit" :
                System.exit(0);
                break;
            case "Save" :
                myDrawring.save();
                break;
            case "New" :
                myDrawring.nouveau();
                break;
            case "Open" :
                myDrawring.open();
                break;
            // Couleurs
            case "Green" :
                System.out.println("Green");
                myDrawring.setCurrentColor(Color.GREEN);
                break;
            case "Black" :
                System.out.println("Black");
                myDrawring.setCurrentColor(Color.BLACK);
                break;
            case "Pink" :
                System.out.println("Pink");
                myDrawring.setCurrentColor(Color.PINK);
                break;
            case "Red" :
                System.out.println("Red");
                myDrawring.setCurrentColor(Color.RED);
                break;
            case "Yellow" :
                System.out.println("Yellow");
                myDrawring.setCurrentColor(Color.YELLOW);
                break;
            case "Magenta" :
                System.out.println("Magenta");
                myDrawring.setCurrentColor(Color.MAGENTA);
                break;
            case "Blue" :
                System.out.println("Blue");
                myDrawring.setCurrentColor(Color.BLUE);
                break;
            case "Orange" :
                System.out.println("Orange");
                myDrawring.setCurrentColor(Color.ORANGE);
                break;
            // Type de figure
            case "Carre" :
                System.out.println("Carre");
                myDrawring.setCurrentFigure("Carre");
                break;
            case "Ellipse" :
                System.out.println("Ellipse");
                myDrawring.setCurrentFigure("Ellipse");
                break;
            case "Cercle" :
                System.out.println("Cercle");
                myDrawring.setCurrentFigure("Cercle");
                break;
            case "Rectangle" :
                System.out.println("Rectangle");
                myDrawring.setCurrentFigure("Rectangle");
                break;

        }
    }
    public static void main (String[] args){
        Window win = new Window("Paint", 800, 600) {

        };
    }
}