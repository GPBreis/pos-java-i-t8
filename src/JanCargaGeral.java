import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanCargaGeral implements ActionListener{
    
    private static JanCargaGeral janCargaUnica;
    static JFrame janPrincipalCarga = new JFrame();
    static JLabel lbCabecalhoCarga = new JLabel();
    static JButton btCadastrar = new JButton();
    static JButton btConsultarExcluirPlaca = new JButton();
    static JButton btConsultarExcluirTodos = new JButton();
    static JanCargaGeral janCarga = new JanCargaGeral();

    public static JanCargaGeral getJanCargaGeral(){
        if (janCargaUnica == null) {
            janCargaUnica = new JanCargaGeral();
        }
        return janCargaUnica;
    }

    private JanCargaGeral() {
        //criaJanCarga();
    }

    public static void criaJanCarga() {
        janPrincipalCarga.setDefaultCloseOperation(janPrincipalCarga.DISPOSE_ON_CLOSE);
        janPrincipalCarga.setSize(400, 250);
        janPrincipalCarga.setLocationRelativeTo(null);
        janPrincipalCarga.setResizable(false);
        janPrincipalCarga.setLayout(null);
        janPrincipalCarga.setTitle("Cadastro de veículos carga");
        
        lbCabecalhoCarga.setText("Manipular veículos de carga");
        lbCabecalhoCarga.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalhoCarga.setBounds(0, 0, 400, 35);;

        btCadastrar.setText("Cadastrar");
        btCadastrar.setBounds(100, 85, 200, 30);
        btCadastrar.setFocusable(false);
        btCadastrar.addActionListener(janCarga);

        btConsultarExcluirPlaca.setText("Consultar / Excluir pela placa");
        btConsultarExcluirPlaca.setBounds(100, 125, 200, 30);
        btConsultarExcluirPlaca.setFocusable(false);
        btConsultarExcluirPlaca.addActionListener(janCarga);

        btConsultarExcluirTodos.setText("Consultar / Excluir todos");
        btConsultarExcluirTodos.setBounds(100, 165, 200, 30);
        btConsultarExcluirTodos.setFocusable(false);
        btConsultarExcluirTodos.addActionListener(janCarga);


        janPrincipalCarga.add(lbCabecalhoCarga);
        janPrincipalCarga.add(btCadastrar);
        janPrincipalCarga.add(btConsultarExcluirPlaca);
        janPrincipalCarga.add(btConsultarExcluirTodos);

        janPrincipalCarga.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(btCadastrar)){
            abreJanCadCarga();
        } else if (evt.getSource().equals(btConsultarExcluirPlaca)){
            abreJanConExcCarga();
        }
    }

    public void abreJanCadCarga(){
        JanCadCarga.getJanCadCarga().criaJanCadCarga();
    }

    public void abreJanConExcCarga(){
        JanConExcCarga.getJanConExcCarga().criaJanConExcCarga();
    }
}
