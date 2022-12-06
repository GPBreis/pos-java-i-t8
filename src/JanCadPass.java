import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanCadPass implements ActionListener{
    private static JanCadPass janCadPasseioUnica;

    private Passeio pass = new Passeio();

    static JFrame janPrincipalCadPasseio = new JFrame();

    static JLabel lbCabecalhoCadPasseio = new JLabel();
    static JLabel lbPlacaCadPasseio = new JLabel();
    static JLabel lbMarcaCadPasseio = new JLabel();
    static JLabel lbModeloCadPasseio = new JLabel();
    static JLabel lbCorCadPasseio = new JLabel();
    static JLabel lbVelMaxCadPasseio = new JLabel();
    static JLabel lbQtRodasCadPasseio = new JLabel();
    static JLabel lbQtPistaoCadPasseio = new JLabel();
    static JLabel lbPotenciaCadPasseio = new JLabel();
    static JLabel lbQtdPassageirosCadPasseio = new JLabel();

    static JTextField tfPlacaCadPasseio = new JTextField();
    static JTextField tfMarcaCadPasseio = new JTextField();
    static JTextField tfModeloCadPasseio = new JTextField();
    static JTextField tfCorCadPasseio = new JTextField();
    static JTextField tfVelMaxCadPasseio = new JTextField();
    static JTextField tfQtRodasCadPasseio = new JTextField();
    static JTextField tfQtPistaoCadPasseio = new JTextField();
    static JTextField tfPotenciaCadPasseio = new JTextField();
    static JTextField tfQtdPassageirosCadPasseio = new JTextField();

    static JButton btCadastrar = new JButton();
    static JButton btLimpar = new JButton();
    static JButton btSair = new JButton();

    static JanCadPass janPasseio = new JanCadPass();

   // public static void main(String[] args) {
        
   // }

    public static JanCadPass getJanCadPass(){
        if (janCadPasseioUnica == null) {
            janCadPasseioUnica = new JanCadPass();
        }
        return janCadPasseioUnica;
    }

    private JanCadPass() {
        //criaJanCadPasseio();
    }

    public static void criaJanCadPasseio() {
        janPrincipalCadPasseio.setDefaultCloseOperation(janPrincipalCadPasseio.DISPOSE_ON_CLOSE);
        janPrincipalCadPasseio.setSize(650, 650);
        janPrincipalCadPasseio.setLocationRelativeTo(null);
        janPrincipalCadPasseio.setResizable(false);
        janPrincipalCadPasseio.setLayout(null);
        janPrincipalCadPasseio.setTitle("Cadastro de veículos passeio");
        
        lbCabecalhoCadPasseio.setText("Cadastrar veículo de passeio");
        lbCabecalhoCadPasseio.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalhoCadPasseio.setBounds(0, 0, 400, 25);;

        lbPlacaCadPasseio.setText("Placa   . . . . . . . . . . . :");
        lbPlacaCadPasseio.setBounds(10, 30, 150, 25);
        lbMarcaCadPasseio.setText("Marca  . . . . . . . . . :");
        lbMarcaCadPasseio.setBounds(10, 55, 150, 25);
        lbModeloCadPasseio.setText("Modelo  . . . . . . . . :");
        lbModeloCadPasseio.setBounds(10, 80, 150, 25);
        lbCorCadPasseio.setText("Cor . . . . . . . . . . . . :");
        lbCorCadPasseio.setBounds(10, 105, 150, 25);
        lbVelMaxCadPasseio.setText("Velocidade Máx. :");
        lbVelMaxCadPasseio.setBounds(10, 130, 150, 25);
        lbQtRodasCadPasseio.setText("Qtd. Rodas . . . . . :");
        lbQtRodasCadPasseio.setBounds(10, 155, 150, 25);
        lbQtPistaoCadPasseio.setText("Qtd. Pistões . . . . :");
        lbQtPistaoCadPasseio.setBounds(10, 180, 150, 25);
        lbPotenciaCadPasseio.setText("Potência . . . . . . . :");
        lbPotenciaCadPasseio.setBounds(10, 205, 150, 25);
        lbQtdPassageirosCadPasseio.setText("Qtd. Passageiros . :");
        lbQtdPassageirosCadPasseio.setBounds(10, 230, 150, 25);

        tfPlacaCadPasseio.setBounds(130, 30, 150, 25);
        tfMarcaCadPasseio.setBounds(130, 55, 150, 25);
        tfModeloCadPasseio.setBounds(130, 80, 150, 25);
        tfCorCadPasseio.setBounds(130, 105, 150, 25);
        tfVelMaxCadPasseio.setBounds(130, 130, 150, 25);
        tfQtRodasCadPasseio.setBounds(130, 155, 150, 25);
        tfQtPistaoCadPasseio.setBounds(130, 180, 150, 25);
        tfPotenciaCadPasseio.setBounds(130, 205, 150, 25);
        tfQtdPassageirosCadPasseio.setBounds(130, 230, 150, 25);

        btCadastrar.setText("Cadastrar");
        btCadastrar.setBounds(20, 570, 100, 30);
        btCadastrar.setFocusable(false);
        btCadastrar.addActionListener(janPasseio);
        btLimpar.setText("Limpar");
        btLimpar.setBounds(140, 570, 100, 30);
        btLimpar.setFocusable(false);
        btLimpar.addActionListener(janPasseio);
        btSair.setText("Sair");
        btSair.setBounds(260, 570, 100, 30);
        btSair.setFocusable(false);
        btSair.addActionListener(janPasseio);


        janPrincipalCadPasseio.add(lbCabecalhoCadPasseio);
        janPrincipalCadPasseio.add(lbPlacaCadPasseio);
        janPrincipalCadPasseio.add(lbMarcaCadPasseio);
        janPrincipalCadPasseio.add(lbModeloCadPasseio);
        janPrincipalCadPasseio.add(lbCorCadPasseio);
        janPrincipalCadPasseio.add(lbVelMaxCadPasseio);
        janPrincipalCadPasseio.add(lbQtRodasCadPasseio);
        janPrincipalCadPasseio.add(lbQtPistaoCadPasseio);
        janPrincipalCadPasseio.add(lbPotenciaCadPasseio);
        janPrincipalCadPasseio.add(lbQtdPassageirosCadPasseio);

        janPrincipalCadPasseio.add(tfPlacaCadPasseio);
        janPrincipalCadPasseio.add(tfMarcaCadPasseio);
        janPrincipalCadPasseio.add(tfModeloCadPasseio);
        janPrincipalCadPasseio.add(tfCorCadPasseio);
        janPrincipalCadPasseio.add(tfVelMaxCadPasseio);
        janPrincipalCadPasseio.add(tfQtRodasCadPasseio);
        janPrincipalCadPasseio.add(tfQtPistaoCadPasseio);
        janPrincipalCadPasseio.add(tfPotenciaCadPasseio);
        janPrincipalCadPasseio.add(tfQtdPassageirosCadPasseio);

        janPrincipalCadPasseio.add(btCadastrar);
        janPrincipalCadPasseio.add(btLimpar);
        janPrincipalCadPasseio.add(btSair);

        janPrincipalCadPasseio.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource().equals(btCadastrar)){
            cadPasseio();
            limpar();
        } else if (evt.getSource().equals(btLimpar)){
            limpar();
        }else if (evt.getSource().equals(btSair)){
            sair();
        }
    }


    public void cadPasseio(){
        pass = new Passeio();
        try{
            pass.setPlaca(tfPlacaCadPasseio.getText());
            pass.setMarca(tfMarcaCadPasseio.getText());
            pass.setModelo(tfModeloCadPasseio.getText());
            pass.setCor(tfCorCadPasseio.getText());
            try{
                pass.setVelocMax(Float.parseFloat(tfVelMaxCadPasseio.getText()));
            } catch (VelocException e) {
                JOptionPane.showMessageDialog(null, e.getStackTrace(), "Velocidade incorreta", JOptionPane.INFORMATION_MESSAGE);
            }
            pass.setQtdRodas(Integer.parseInt(tfQtRodasCadPasseio.getText()));
            pass.getMotor().setQtdPist(Integer.parseInt(tfQtPistaoCadPasseio.getText()));
            pass.getMotor().setPotencia(Integer.parseInt(tfPotenciaCadPasseio.getText()));
            pass.setQtdPassageiros(Integer.parseInt(tfQtdPassageirosCadPasseio.getText()));
        } catch (VeicExistException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Veiculo duplicado", JOptionPane.INFORMATION_MESSAGE);
        }

        pass = BDVeiculos.getBdVeiculos().cadPasseio(pass);

        if(pass != null) {
            JOptionPane.showMessageDialog(null, "Veículo de passeio cadastrado com sucesso!", "Veículo cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Veículo de passeio com placa duplicada", "Veículo duplicado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void limpar() {
        tfPlacaCadPasseio.setText("");
        tfMarcaCadPasseio.setText("");
        tfModeloCadPasseio.setText("");
        tfCorCadPasseio.setText("");
        tfVelMaxCadPasseio.setText("");
        tfQtRodasCadPasseio.setText("");
        tfQtPistaoCadPasseio.setText("");
        tfPotenciaCadPasseio.setText("");
        tfQtdPassageirosCadPasseio.setText("");
    }

    public void sair(){
        janPrincipalCadPasseio.dispose();
    }
}

