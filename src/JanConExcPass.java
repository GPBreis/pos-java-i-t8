import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanConExcPass extends JFrame implements ActionListener{
    private static JanConExcPass janConExcPasseioUnica;

    private Passeio pass;

    static JFrame janPrincipalConExcPasseio = new JFrame();

    static JLabel lbCabecalhoConExcPasseio = new JLabel();
    static JLabel lbPlacaConExcPasseio = new JLabel();
    static JLabel lbMarcaConExcPasseio = new JLabel();
    static JLabel lbModeloConExcPasseio = new JLabel();
    static JLabel lbCorConExcPasseio = new JLabel();
    static JLabel lbVelMaxConExcPasseio = new JLabel();
    static JLabel lbQtRodasConExcPasseio = new JLabel();
    static JLabel lbQtPistaoConExcPasseio = new JLabel();
    static JLabel lbPotenciaConExcPasseio = new JLabel();
    static JLabel lbQtdPassageirosConExcPasseio = new JLabel();
    static JLabel lbPlacaPasseio = new JLabel();

    static JTextField tfPlacaConExcPasseio = new JTextField();
    static JTextField tfMarcaConExcPasseio = new JTextField();
    static JTextField tfModeloConExcPasseio = new JTextField();
    static JTextField tfCorConExcPasseio = new JTextField();
    static JTextField tfVelMaxConExcPasseio = new JTextField();
    static JTextField tfQtRodasConExcPasseio = new JTextField();
    static JTextField tfQtPistaoConExcPasseio = new JTextField();
    static JTextField tfPotenciaConExcPasseio = new JTextField();
    static JTextField tfQtdPassageirosConExcPasseio = new JTextField();
    static JTextField tfPlacaPasseio = new JTextField();


    static JButton btConsultar = new JButton();
    static JButton btExcluir = new JButton();
    static JButton btSair = new JButton();

    static JanConExcPass janPasseio = new JanConExcPass();


    public static JanConExcPass getJanConExcPass(){
        if (janConExcPasseioUnica == null) {
            janConExcPasseioUnica = new JanConExcPass();
        }
        return janConExcPasseioUnica;
    }

    private JanConExcPass() {
        //criaJanConExcPasseio();
    }

    public static void criaJanConExcPasseio() {
        janPrincipalConExcPasseio.setDefaultCloseOperation(janPrincipalConExcPasseio.DISPOSE_ON_CLOSE);
        janPrincipalConExcPasseio.setSize(650, 650);
        janPrincipalConExcPasseio.setLocationRelativeTo(null);
        janPrincipalConExcPasseio.setResizable(false);
        janPrincipalConExcPasseio.setLayout(null);
        janPrincipalConExcPasseio.setTitle("Consulta / Exclui veículos passeio");
        
        lbCabecalhoConExcPasseio.setText("Consultar / Excluir veículo de passeio");
        lbCabecalhoConExcPasseio.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalhoConExcPasseio.setBounds(0, 0, 500, 25);;

        lbPlacaConExcPasseio.setText("Placa   . . . . . . . . . . . :");
        lbPlacaConExcPasseio.setBounds(10, 30, 150, 25);
        lbMarcaConExcPasseio.setText("Marca  . . . . . . . . . :");
        lbMarcaConExcPasseio.setBounds(10, 55, 150, 25);
        lbModeloConExcPasseio.setText("Modelo  . . . . . . . . :");
        lbModeloConExcPasseio.setBounds(10, 80, 150, 25);
        lbCorConExcPasseio.setText("Cor . . . . . . . . . . . . :");
        lbCorConExcPasseio.setBounds(10, 105, 150, 25);
        lbVelMaxConExcPasseio.setText("Velocidade Máx. :");
        lbVelMaxConExcPasseio.setBounds(10, 130, 150, 25);
        lbQtRodasConExcPasseio.setText("Qtd. Rodas . . . . . :");
        lbQtRodasConExcPasseio.setBounds(10, 155, 150, 25);
        lbQtPistaoConExcPasseio.setText("Qtd. Pistões . . . . :");
        lbQtPistaoConExcPasseio.setBounds(10, 180, 150, 25);
        lbPotenciaConExcPasseio.setText("Potência . . . . . . . :");
        lbPotenciaConExcPasseio.setBounds(10, 205, 150, 25);
        lbQtdPassageirosConExcPasseio.setText("Qtd. Passageiros . :");
        lbQtdPassageirosConExcPasseio.setBounds(10, 230, 150, 25);
        lbPlacaPasseio.setText("Informe a placa:");
        lbPlacaPasseio.setBounds(10, 540, 150, 25);

        tfPlacaConExcPasseio.setBounds(130, 30, 150, 25);
        tfPlacaConExcPasseio.setEditable(false);
        tfMarcaConExcPasseio.setBounds(130, 55, 150, 25);
        tfMarcaConExcPasseio.setEditable(false);
        tfModeloConExcPasseio.setBounds(130, 80, 150, 25);
        tfModeloConExcPasseio.setEditable(false);
        tfCorConExcPasseio.setBounds(130, 105, 150, 25);
        tfCorConExcPasseio.setEditable(false);
        tfVelMaxConExcPasseio.setBounds(130, 130, 150, 25);
        tfVelMaxConExcPasseio.setEditable(false);
        tfQtRodasConExcPasseio.setBounds(130, 155, 150, 25);
        tfQtRodasConExcPasseio.setEditable(false);
        tfQtPistaoConExcPasseio.setBounds(130, 180, 150, 25);
        tfQtPistaoConExcPasseio.setEditable(false);
        tfPotenciaConExcPasseio.setBounds(130, 205, 150, 25);
        tfPotenciaConExcPasseio.setEditable(false);
        tfQtdPassageirosConExcPasseio.setBounds(130, 230, 150, 25);
        tfQtdPassageirosConExcPasseio.setEditable(false);
        tfPlacaPasseio.setBounds(130, 540, 150, 25);

        btConsultar.setText("Consultar");
        btConsultar.setBounds(20, 570, 100, 30);
        btConsultar.setFocusable(false);
        btConsultar.addActionListener(janPasseio);
        btExcluir.setText("Excluir");
        btExcluir.setBounds(140, 570, 100, 30);
        btExcluir.setFocusable(false);
        btExcluir.addActionListener(janPasseio);
        btSair.setText("Sair");
        btSair.setBounds(260, 570, 100, 30);
        btSair.setFocusable(false);
        btSair.addActionListener(janPasseio);


        janPrincipalConExcPasseio.add(lbCabecalhoConExcPasseio);
        janPrincipalConExcPasseio.add(lbPlacaConExcPasseio);
        janPrincipalConExcPasseio.add(lbMarcaConExcPasseio);
        janPrincipalConExcPasseio.add(lbModeloConExcPasseio);
        janPrincipalConExcPasseio.add(lbCorConExcPasseio);
        janPrincipalConExcPasseio.add(lbVelMaxConExcPasseio);
        janPrincipalConExcPasseio.add(lbQtRodasConExcPasseio);
        janPrincipalConExcPasseio.add(lbQtPistaoConExcPasseio);
        janPrincipalConExcPasseio.add(lbPotenciaConExcPasseio);
        janPrincipalConExcPasseio.add(lbQtdPassageirosConExcPasseio);
        janPrincipalConExcPasseio.add(lbPlacaPasseio);

        janPrincipalConExcPasseio.add(tfPlacaConExcPasseio);
        janPrincipalConExcPasseio.add(tfMarcaConExcPasseio);
        janPrincipalConExcPasseio.add(tfModeloConExcPasseio);
        janPrincipalConExcPasseio.add(tfCorConExcPasseio);
        janPrincipalConExcPasseio.add(tfVelMaxConExcPasseio);
        janPrincipalConExcPasseio.add(tfQtRodasConExcPasseio);
        janPrincipalConExcPasseio.add(tfQtPistaoConExcPasseio);
        janPrincipalConExcPasseio.add(tfPotenciaConExcPasseio);
        janPrincipalConExcPasseio.add(tfQtdPassageirosConExcPasseio);
        janPrincipalConExcPasseio.add(tfPlacaPasseio);

        janPrincipalConExcPasseio.add(btConsultar);
        janPrincipalConExcPasseio.add(btExcluir);
        janPrincipalConExcPasseio.add(btSair);

        janPrincipalConExcPasseio.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btConsultar){
            consPlaca();
        }
        if (evt.getSource() == btExcluir){
            excPlaca();
        }
        if (evt.getSource() == btSair){
           sair();
        }
    }

    public void consPlaca() {
        pass = new Passeio();
    
        try{
            pass.setPlaca(tfPlacaPasseio.getText());
            pass = BDVeiculos.getBdVeiculos().consPlacaPasseio(pass);
            if(pass != null) {
                tfPlacaConExcPasseio.setText(pass.getPlaca());
                tfMarcaConExcPasseio.setText(pass.getMarca());
                tfModeloConExcPasseio.setText(pass.getModelo());
                tfCorConExcPasseio.setText(pass.getCor());
                tfVelMaxConExcPasseio.setText(Float.toString(pass.calcVel(pass.getVelocMax())));
                tfQtRodasConExcPasseio.setText(Integer.toString(pass.getQtdRodas()));
                tfQtPistaoConExcPasseio.setText(Integer.toString(pass.getMotor().getQtdPist()));
                tfPotenciaConExcPasseio.setText(Integer.toString(pass.getMotor().getPotencia()));
                tfQtdPassageirosConExcPasseio.setText(Integer.toString(pass.getQtdPassageiros()));
                
            } else {
                JOptionPane.showMessageDialog(null, "Veículo de passeio não encontrado", "ERRO AO CONSULTAR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (VeicExistException e) {

        }
    }
    
    public void excPlaca(){
        pass = new Passeio();

        try {
            pass.setPlaca(tfPlacaPasseio.getText());
            pass = BDVeiculos.getBdVeiculos().excPasseio(pass);
            if(pass == null){
                JOptionPane.showMessageDialog(null, "Veículo de passeio excluído", "Veículo Excluído", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Veículo de passeio não encontrado", "ERRO AO EXCLUIR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void sair() {
        janPrincipalConExcPasseio.dispose();
    }
}
