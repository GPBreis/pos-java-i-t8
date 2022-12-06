import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanCadCarga extends JFrame implements ActionListener{
    private static JanCadCarga JanCadCargaUnica;

    private Carga carga = new Carga();

    static JFrame janPrincipalCadCarga = new JFrame();

    static JLabel lbCabecalhoCadCarga = new JLabel();
    static JLabel lbPlacaCadCarga = new JLabel();
    static JLabel lbMarcaCadCarga = new JLabel();
    static JLabel lbModeloCadCarga = new JLabel();
    static JLabel lbCorCadCarga = new JLabel();
    static JLabel lbVelMaxCadCarga = new JLabel();
    static JLabel lbQtRodasCadCarga = new JLabel();
    static JLabel lbQtPistaoCadCarga = new JLabel();
    static JLabel lbPotenciaCadCarga = new JLabel();
    static JLabel lbCargaMaxCadCarga = new JLabel();
    static JLabel lbTaraCadCarga = new JLabel();

    static JTextField tfPlacaCadCarga = new JTextField();
    static JTextField tfMarcaCadCarga = new JTextField();
    static JTextField tfModeloCadCarga = new JTextField();
    static JTextField tfCorCadCarga = new JTextField();
    static JTextField tfVelMaxCadCarga = new JTextField();
    static JTextField tfQtRodasCadCarga = new JTextField();
    static JTextField tfQtPistaoCadCarga = new JTextField();
    static JTextField tfPotenciaCadCarga = new JTextField();
    static JTextField tfCargaMaxCadCarga = new JTextField();
    static JTextField tfTaraCadCarga = new JTextField();

    static JButton btCadastrar = new JButton();
    static JButton btLimpar = new JButton();
    static JButton btSair = new JButton();

    static JanCadCarga janCarga = new JanCadCarga();

   // public static void main(String[] args) {
        
   // }

    public static JanCadCarga getJanCadCarga(){
        if (JanCadCargaUnica == null) {
            JanCadCargaUnica = new JanCadCarga();
        }
        return JanCadCargaUnica;
    }

    private JanCadCarga() {
        //criaJanCadCarga();
    }

    public static void criaJanCadCarga() {
        janPrincipalCadCarga.setDefaultCloseOperation(janPrincipalCadCarga.DISPOSE_ON_CLOSE);
        janPrincipalCadCarga.setSize(650, 650);
        janPrincipalCadCarga.setLocationRelativeTo(null);
        janPrincipalCadCarga.setResizable(false);
        janPrincipalCadCarga.setLayout(null);
        janPrincipalCadCarga.setTitle("Cadastro de veículos carga");
        
        lbCabecalhoCadCarga.setText("Cadastrar veículo de carga");
        lbCabecalhoCadCarga.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalhoCadCarga.setBounds(0, 0, 400, 25);;

        lbPlacaCadCarga.setText("Placa   . . . . . . . . . . . :");
        lbPlacaCadCarga.setBounds(10, 30, 150, 25);
        lbMarcaCadCarga.setText("Marca  . . . . . . . . . :");
        lbMarcaCadCarga.setBounds(10, 55, 150, 25);
        lbModeloCadCarga.setText("Modelo  . . . . . . . . :");
        lbModeloCadCarga.setBounds(10, 80, 150, 25);
        lbCorCadCarga.setText("Cor . . . . . . . . . . . . :");
        lbCorCadCarga.setBounds(10, 105, 150, 25);
        lbVelMaxCadCarga.setText("Velocidade Máx. :");
        lbVelMaxCadCarga.setBounds(10, 130, 150, 25);
        lbQtRodasCadCarga.setText("Qtd. Rodas . . . . . :");
        lbQtRodasCadCarga.setBounds(10, 155, 150, 25);
        lbQtPistaoCadCarga.setText("Qtd. Pistões . . . . :");
        lbQtPistaoCadCarga.setBounds(10, 180, 150, 25);
        lbPotenciaCadCarga.setText("Potência . . . . . . . :");
        lbPotenciaCadCarga.setBounds(10, 205, 150, 25);
        lbCargaMaxCadCarga.setText("Qtd. Carga Máx . :");
        lbCargaMaxCadCarga.setBounds(10, 230, 150, 25);
        lbTaraCadCarga.setText("Tara . . . . . . . . :");
        lbTaraCadCarga.setBounds(10, 255, 150, 25);

        tfPlacaCadCarga.setBounds(130, 30, 150, 25);
        tfMarcaCadCarga.setBounds(130, 55, 150, 25);
        tfModeloCadCarga.setBounds(130, 80, 150, 25);
        tfCorCadCarga.setBounds(130, 105, 150, 25);
        tfVelMaxCadCarga.setBounds(130, 130, 150, 25);
        tfQtRodasCadCarga.setBounds(130, 155, 150, 25);
        tfQtPistaoCadCarga.setBounds(130, 180, 150, 25);
        tfPotenciaCadCarga.setBounds(130, 205, 150, 25);
        tfCargaMaxCadCarga.setBounds(130, 230, 150, 25);
        tfTaraCadCarga.setBounds(130, 255, 150, 25);

        btCadastrar.setText("Cadastrar");
        btCadastrar.setBounds(20, 570, 100, 30);
        btCadastrar.setFocusable(false);
        btCadastrar.addActionListener(janCarga);
        btLimpar.setText("Limpar");
        btLimpar.setBounds(140, 570, 100, 30);
        btLimpar.setFocusable(false);
        btLimpar.addActionListener(janCarga);
        btSair.setText("Sair");
        btSair.setBounds(260, 570, 100, 30);
        btSair.setFocusable(false);
        btSair.addActionListener(janCarga);


        janPrincipalCadCarga.add(lbCabecalhoCadCarga);
        janPrincipalCadCarga.add(lbPlacaCadCarga);
        janPrincipalCadCarga.add(lbMarcaCadCarga);
        janPrincipalCadCarga.add(lbModeloCadCarga);
        janPrincipalCadCarga.add(lbCorCadCarga);
        janPrincipalCadCarga.add(lbVelMaxCadCarga);
        janPrincipalCadCarga.add(lbQtRodasCadCarga);
        janPrincipalCadCarga.add(lbQtPistaoCadCarga);
        janPrincipalCadCarga.add(lbPotenciaCadCarga);
        janPrincipalCadCarga.add(lbCargaMaxCadCarga);
        janPrincipalCadCarga.add(lbTaraCadCarga);

        janPrincipalCadCarga.add(tfPlacaCadCarga);
        janPrincipalCadCarga.add(tfMarcaCadCarga);
        janPrincipalCadCarga.add(tfModeloCadCarga);
        janPrincipalCadCarga.add(tfCorCadCarga);
        janPrincipalCadCarga.add(tfVelMaxCadCarga);
        janPrincipalCadCarga.add(tfQtRodasCadCarga);
        janPrincipalCadCarga.add(tfQtPistaoCadCarga);
        janPrincipalCadCarga.add(tfPotenciaCadCarga);
        janPrincipalCadCarga.add(tfCargaMaxCadCarga);
        janPrincipalCadCarga.add(tfTaraCadCarga);

        janPrincipalCadCarga.add(btCadastrar);
        janPrincipalCadCarga.add(btLimpar);
        janPrincipalCadCarga.add(btSair);

        janPrincipalCadCarga.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(btCadastrar)){
            cadCarga();
            //limpar();
        } else if (evt.getSource().equals(btLimpar)){
            limpar();
        }else if (evt.getSource().equals(btSair)){
            sair();
        }
    }

    public void cadCarga(){
        carga = new Carga();
        try{
            carga.setPlaca(tfPlacaCadCarga.getText());
            carga.setMarca(tfMarcaCadCarga.getText());
            carga.setModelo(tfModeloCadCarga.getText());
            carga.setCor(tfCorCadCarga.getText());
            try{
                carga.setVelocMax(Float.parseFloat(tfVelMaxCadCarga.getText()));
            } catch (VelocException e) {
                JOptionPane.showMessageDialog(null, e.getStackTrace(), "Velocidade incorreta", JOptionPane.INFORMATION_MESSAGE);
            }
            carga.setQtdRodas(Integer.parseInt(tfQtRodasCadCarga.getText()));
            carga.getMotor().setQtdPist(Integer.parseInt(tfQtPistaoCadCarga.getText()));
            carga.getMotor().setPotencia(Integer.parseInt(tfPotenciaCadCarga.getText()));
            carga.setCargaMax(Integer.parseInt(tfCargaMaxCadCarga.getText()));
            carga.setTara(Integer.parseInt(tfTaraCadCarga.getText()));
        } catch (VeicExistException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Veiculo duplicado", JOptionPane.INFORMATION_MESSAGE);
        }

        carga = BDVeiculos.getBdVeiculos().cadCarga(carga);

        if(carga != null) {
            JOptionPane.showMessageDialog(null, "Veículo de carga cadastrado com sucesso!", "Veículo cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Veículo de carga com placa duplicada", "Veículo duplicado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void limpar() {
        tfPlacaCadCarga.setText("");
        tfMarcaCadCarga.setText("");
        tfModeloCadCarga.setText("");
        tfCorCadCarga.setText("");
        tfVelMaxCadCarga.setText("");
        tfQtRodasCadCarga.setText("");
        tfQtPistaoCadCarga.setText("");
        tfPotenciaCadCarga.setText("");
        tfCargaMaxCadCarga.setText("");
        tfTaraCadCarga.setText("");
    }

    public void sair(){
        janPrincipalCadCarga.dispose();
    }
}
