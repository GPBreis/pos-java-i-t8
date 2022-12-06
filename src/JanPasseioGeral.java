import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanPasseioGeral extends JFrame implements ActionListener{

    private static JanPasseioGeral janPasseioUnica;
    static JFrame janPrincipalPasseio = new JFrame();
    static JLabel lbCabecalhoPasseio = new JLabel();
    static JButton btCadastrar = new JButton();
    static JButton btConsultarExcluirPlaca = new JButton();
    static JButton btConsultarExcluirTodos = new JButton();
    static JanPasseioGeral janPasseio = new JanPasseioGeral();

    //public static void main(String[] args) {
        
    //}
    
    public static JanPasseioGeral getJanPasseioGeral(){
        if (janPasseioUnica == null) {
            janPasseioUnica = new JanPasseioGeral();
        }
        return janPasseioUnica;
    }

    private JanPasseioGeral() {
        //criaJanPasseio();
    }

    public static void criaJanPasseio() {
        janPrincipalPasseio.setDefaultCloseOperation(janPrincipalPasseio.DISPOSE_ON_CLOSE);
        janPrincipalPasseio.setSize(400, 250);
        janPrincipalPasseio.setLocationRelativeTo(null);
        janPrincipalPasseio.setResizable(false);
        janPrincipalPasseio.setLayout(null);
        janPrincipalPasseio.setTitle("Cadastro de veículos passeio");
        
        lbCabecalhoPasseio.setText("Manipular veículos de passeio");
        lbCabecalhoPasseio.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalhoPasseio.setBounds(0, 0, 400, 25);;

        btCadastrar.setText("Cadastrar");
        btCadastrar.setBounds(100, 85, 200, 30);
        btCadastrar.setFocusable(false);
        btCadastrar.addActionListener(janPasseio);

        btConsultarExcluirPlaca.setText("Consultar / Excluir pela placa");
        btConsultarExcluirPlaca.setBounds(100, 125, 200, 30);
        btConsultarExcluirPlaca.setFocusable(false);
        btConsultarExcluirPlaca.addActionListener(janPasseio);

        btConsultarExcluirTodos.setText("Consultar / Excluir todos");
        btConsultarExcluirTodos.setBounds(100, 165, 200, 30);
        btConsultarExcluirTodos.setFocusable(false);
        btConsultarExcluirTodos.addActionListener(janPasseio);


        janPrincipalPasseio.add(lbCabecalhoPasseio);
        janPrincipalPasseio.add(btCadastrar);
        janPrincipalPasseio.add(btConsultarExcluirPlaca);
        janPrincipalPasseio.add(btConsultarExcluirTodos);

        janPrincipalPasseio.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(btCadastrar)){
            abreJanCadPasseio();
        } else if (evt.getSource().equals(btConsultarExcluirPlaca)){
            abreJanConExcPasseio();
        }
    }

    public void abreJanCadPasseio(){
        JanCadPass.getJanCadPass().criaJanCadPasseio();
    }

    public void abreJanConExcPasseio(){
        JanConExcPass.getJanConExcPass().criaJanConExcPasseio();
    }
}