import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanCargaGeral implements ActionListener{
    
    private static JanCargaGeral janCargaUnica;
    static JFrame janPrincipalPasseio = new JFrame();
    static JLabel lbCabecalhoPasseio = new JLabel();
    static JButton btCadastrar = new JButton();
    static JButton btConsultarExcluirPlaca = new JButton();
    static JButton btConsultarExcluirTodos = new JButton();
    static JanCargaGeral janPasseio = new JanCargaGeral();

    public static JanCargaGeral getJanCargaGeral(){
        if (janCargaUnica == null) {
            janCargaUnica = new JanCargaGeral();
        }
        return janCargaUnica;
    }

    private JanCargaGeral() {
        criaJanCarga();
    }

    public static void criaJanCarga() {
        janPrincipalPasseio.setDefaultCloseOperation(janPrincipalPasseio.DISPOSE_ON_CLOSE);
        janPrincipalPasseio.setSize(400, 250);
        janPrincipalPasseio.setLocationRelativeTo(null);
        janPrincipalPasseio.setResizable(false);
        janPrincipalPasseio.setLayout(null);
        janPrincipalPasseio.setTitle("Cadastro de veículos carga");
        
        lbCabecalhoPasseio.setText("Manipular veículos de carga");
        lbCabecalhoPasseio.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalhoPasseio.setBounds(0, 0, 400, 35);;

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

    }
}
