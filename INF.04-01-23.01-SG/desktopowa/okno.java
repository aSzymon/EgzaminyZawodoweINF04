package INF04.inf04012301sg.desktopowa;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class okno {

    Random random = new Random();

    public JPanel createContentPane(){
        JPanel okno = new JPanel();

        JPanel p1 = new JPanel(null);
        p1.setBorder(BorderFactory.createTitledBorder(new TitledBorder(new LineBorder(Color.white,4))," Dane pracownika ",TitledBorder.LEFT,TitledBorder.TOP,new Font("Arial",Font.ROMAN_BASELINE,14)));
        p1.setBounds(40,40,280,200);
        p1.setBackground(new Color(176, 196, 222));
        p1.setVisible(true);
        okno.add(p1);

        JLabel imie = new JLabel("Imię");
        imie.setBounds(30,30,50,25);
        imie.setVisible(true);
        imie.setFont(new Font("Arial",Font.BOLD,11));
        imie.setLayout(null);
        p1.add(imie);

        JTextArea imiePole = new JTextArea();
        imiePole.setBounds(120,30,140,25);
        imiePole.setVisible(true);
        imiePole.setLayout(null);
        p1.add(imiePole);

        JLabel nazwisko = new JLabel("Nazwisko");
        nazwisko.setBounds(30,75,80,25);
        nazwisko.setVisible(true);
        nazwisko.setFont(new Font("Arial",Font.BOLD,11));
        nazwisko.setLayout(null);
        p1.add(nazwisko);

        JTextArea nazwiskoPole = new JTextArea();
        nazwiskoPole.setBounds(120,75,140,25);
        nazwiskoPole.setVisible(true);
        nazwiskoPole.setLayout(null);
        p1.add(nazwiskoPole);

        JLabel stanowisko = new JLabel("Stanowisko");
        stanowisko.setBounds(30,120,80,25);
        stanowisko.setVisible(true);
        stanowisko.setFont(new Font("Arial",Font.BOLD,11));
        stanowisko.setLayout(null);
        p1.add(stanowisko);

        JComboBox stanowiskoLista = new JComboBox();
        stanowiskoLista.setBounds(120,120,140,25);
        stanowiskoLista.setVisible(true);

        stanowiskoLista.addItem("");
        stanowiskoLista.addItem("Kierownik");
        stanowiskoLista.addItem("Starszy programista");
        stanowiskoLista.addItem("Młodszy programista");
        stanowiskoLista.addItem("Tester");

        p1.add(stanowiskoLista);

        JPanel p2 = new JPanel(null);
        p2.setBorder(BorderFactory.createTitledBorder(new TitledBorder(new LineBorder(Color.white,4))," Generowanie hasła ",TitledBorder.LEFT,TitledBorder.TOP,new Font("Arial",Font.ROMAN_BASELINE,14)));
        p2.setBackground(new Color(176, 196, 222));
        p2.setBounds(420,40,280,200);
        p2.setVisible(true);
        okno.add(p2);

        JLabel ileZnakow = new JLabel("Ile znaków?");
        ileZnakow.setBounds(30,30,100,25);
        ileZnakow.setVisible(true);
        ileZnakow.setFont(new Font("Arial",Font.BOLD,11));
        ileZnakow.setLayout(null);
        p2.add(ileZnakow);

        JTextArea ileZnakowPole = new JTextArea();
        ileZnakowPole.setBounds(120,30,135,25);
        ileZnakowPole.setVisible(true);
        ileZnakowPole.setLayout(null);
        p2.add(ileZnakowPole);

        JCheckBox check1 = new JCheckBox("Małe i wielkie litery");
        check1.setBackground(new Color(176, 196, 222));
        check1.setBounds(25,65,150,25);
        check1.setVisible(true);
        p2.add(check1);

        JCheckBox check2 = new JCheckBox("Cyfry");
        check2.setBackground(new Color(176, 196, 222));
        check2.setBounds(25,95,150,25);
        check2.setVisible(true);
        p2.add(check2);

        JCheckBox check3 = new JCheckBox("Znaki specjalne");
        check3.setBackground(new Color(176, 196, 222));
        check3.setBounds(25,125,150,25);
        check3.setVisible(true);
        p2.add(check3);

        JButton przyciskGenHaslo = new JButton("Generuj hasło");
        przyciskGenHaslo.setForeground(Color.white);
        przyciskGenHaslo.setBackground(new Color(70, 130, 180));
        przyciskGenHaslo.setBounds(90,160,112,25);
        przyciskGenHaslo.setVisible(true);
        p2.add(przyciskGenHaslo);

        JButton przyciskZatwierdz = new JButton("Zatwierdź");
        przyciskZatwierdz.setForeground(Color.white);
        przyciskZatwierdz.setBackground(new Color(70, 130, 180));
        przyciskZatwierdz.setBounds(240,270,260,25);
        przyciskZatwierdz.setVisible(true);
        okno.add(przyciskZatwierdz);

        /* DZIALANIE */

        String[] maleLitery = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","u","p","r","s","t","w","x","y","z"};

        String[] wielkieLitery = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","U","P","R","S","T","W","X","Y","Z"};

        String[] liczby = {"0","1","2","3","4","5","6","7","8","9"};

        String[] znakiSpecjalne = {"!","@","#","$","%","^","&","*","(",")","_","=","+","-"};

        int maleLiteryDlugosc = maleLitery.length;
        int wielkieLiteryDlugosc = wielkieLitery.length;
        int liczbyDlugosc = liczby.length;
        int znakiSpecjalneDlugosc = znakiSpecjalne.length;

        przyciskGenHaslo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int ileLiterWartosc = Integer.parseInt(ileZnakowPole.getText());
                System.out.println(ileLiterWartosc);

                for (int i = 0; i < ileLiterWartosc; i++) {

                    int wylosowaneMale = random.nextInt(maleLiteryDlugosc);
                    System.out.print(maleLitery[wylosowaneMale]);


                    ActionListener CheckboxListner = new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            if (check1.isSelected()) {

                                int wylosowaneWielkie = random.nextInt(wielkieLiteryDlugosc);



                            }

                            if (check2.isSelected()) {

                            }

                            if (check3.isSelected()) {

                            }
                        }
                    };
                    check1.addActionListener(CheckboxListner);
                    check2.addActionListener(CheckboxListner);
                    check3.addActionListener(CheckboxListner);
                }
            }
        });


        return okno;
    }

    public okno(){

        JFrame frame = new JFrame("00000000000");
        frame.setContentPane(createContentPane());
        frame.setSize(750,345);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(176, 196, 222));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
