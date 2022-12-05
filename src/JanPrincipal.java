import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanPrincipal implements ActionListener{

    static JFrame janPrincipal = new JFrame();
    static JLabel lbCabecalho = new JLabel();
    static JButton btPasseio = new JButton();
    static JButton btCarga = new JButton();
    static JanPrincipal jan = new JanPrincipal();

    public static void main(String[] args) {
        criaJan();
    }

    public static void criaJan() {

        janPrincipal.setDefaultCloseOperation(janPrincipal.EXIT_ON_CLOSE);
        janPrincipal.setSize(400, 250);
        janPrincipal.setLocationRelativeTo(null);
        janPrincipal.setResizable(false);
        janPrincipal.setLayout(null);
        janPrincipal.setTitle("Sistema de cadastro de veículos");
        
        lbCabecalho.setText("Sistema de cadastro  de veículos");
        lbCabecalho.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalho.setBounds(0, 0, 400, 25);;

        btPasseio.setText("Veículos de Passeio");
        btPasseio.setBounds(100, 85, 200, 30);
        btPasseio.setFocusable(false);
        btPasseio.addActionListener(jan);

        btCarga.setText("Veículos de Carga");
        btCarga.setBounds(100, 125, 200, 30);;
        btCarga.setFocusable(false);
        btCarga.addActionListener(jan);

        janPrincipal.add(lbCabecalho);
        janPrincipal.add(btPasseio);
        janPrincipal.add(btCarga);

        janPrincipal.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(btPasseio)){
            abreJanPasseioGeral();
        } else if (evt.getSource().equals(btCarga)){
            abreJanCargaGeral();
        }
    }

    public void abreJanPasseioGeral(){
        JanPasseioGeral.getJanPasseioGeral().criaJanPasseio();
    }

    public void abreJanCargaGeral(){
        JanCargaGeral.getJanCargaGeral().criaJanCarga();
    }
}
