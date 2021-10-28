import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Window extends JFrame implements ActionListener {
    public Window(String Title,int x,int y)
    {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPanel = this.getContentPane() ;

        /*          Création de la barre menu              */
        JMenuBar m = new JMenuBar();
        // File
        JMenu menu1 = new JMenu("File");
        JMenuItem New = new JMenuItem("New");
        menu1.add(New);
        New.addActionListener(this);
        JMenuItem Open = new JMenuItem("Open") ;
        menu1.addSeparator();
        menu1.add(Open);
        Open.addActionListener(this);
        JMenuItem Save = new JMenuItem("Save");
        menu1.add(Save);
        Save.addActionListener(this);
        JMenuItem Quit = new JMenuItem("Quit");
        menu1.addSeparator();
        menu1.add(Quit);
        Quit.addActionListener(this);
        m.add(menu1);
        // A Propos
        JMenu menu2 = new JMenu("A propos");
        m.add(menu2);
        contentPanel.add(m, "North");

        /*          Création du Panel inférieur             */
        JPanel southPanel = new JPanel();
        southPanel.setLayout (new GridLayout(1,2));

        /*          Création du Panel couleurs              */
        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new GridLayout(2,4));
        // Noir
        JButton Black = new JButton("Black");
        Black.setBackground(Color.BLACK);
        colorPanel.add(Black);
        Black.addActionListener(this);
        // Jaune
        JButton Yellow = new JButton("Yellow");
        Yellow.setBackground(Color.YELLOW);
        colorPanel.add(Yellow);
        Yellow.addActionListener(this);
        // Rouge
        JButton Red = new JButton("Red");
        Red.setBackground(Color.RED);
        colorPanel.add(Red);
        Red.addActionListener(this);
        // Rose
        JButton Pink = new JButton("Pink");
        Pink.setBackground(Color.PINK);
        colorPanel.add(Pink);
        Pink.addActionListener(this);
        // Vert
        JButton Green = new JButton("Green");
        Green.setBackground(Color.GREEN);
        colorPanel.add(Green);
        Green.addActionListener(this);
        // Magenta
        JButton Magenta = new JButton("Magenta");
        Magenta.setBackground(Color.MAGENTA);
        colorPanel.add(Magenta);
        Magenta.addActionListener(this);
        // Bleu
        JButton Blue = new JButton("Blue");
        Blue.setBackground(Color.BLUE);
        colorPanel.add(Blue);
        Blue.addActionListener(this);
        // Orange
        JButton Orange = new JButton("Orange");
        Orange.setBackground(Color.ORANGE);
        colorPanel.add(Orange);
        Orange.addActionListener(this);


        /*          Création du Panneau outils         */
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
        JButton Carre = new JButton("Carré");
        toolPanel.add(Carre);
        Carre.addActionListener(this);

        /*    Ajout de toolPanel et colorPanel à southPanel     */
        contentPanel.add(southPanel, "South");
        southPanel.add(colorPanel);
        southPanel.add(toolPanel);
        setVisible(true);

    }
    public static void main (String args[]){
        Window win = new Window("Paint", 800, 600) {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }
}
