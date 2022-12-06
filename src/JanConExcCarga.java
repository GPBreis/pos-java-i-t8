import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanConExcCarga extends JFrame implements ActionListener{
    private static JanConExcCarga JanConExcCargaUnica;

    private Carga carga;

    static JFrame janPrincipalConExcCarga = new JFrame();

    static JLabel lbCabecalhoConExcCarga = new JLabel();
    static JLabel lbPlacaConExcCarga = new JLabel();
    static JLabel lbMarcaConExcCarga = new JLabel();
    static JLabel lbModeloConExcCarga = new JLabel();
    static JLabel lbCorConExcCarga = new JLabel();
    static JLabel lbVelMaxConExcCarga = new JLabel();
    static JLabel lbQtRodasConExcCarga = new JLabel();
    static JLabel lbQtPistaoConExcCarga = new JLabel();
    static JLabel lbPotenciaConExcCarga = new JLabel();
    static JLabel lbCargaMaxCadCarga = new JLabel();
    static JLabel lbTaraCadCarga = new JLabel();
    static JLabel lbPlacaCarga = new JLabel();

    static JTextField tfPlacaConExcCarga = new JTextField();
    static JTextField tfMarcaConExcCarga = new JTextField();
    static JTextField tfModeloConExcCarga = new JTextField();
    static JTextField tfCorConExcCarga = new JTextField();
    static JTextField tfVelMaxConExcCarga = new JTextField();
    static JTextField tfQtRodasConExcCarga = new JTextField();
    static JTextField tfQtPistaoConExcCarga = new JTextField();
    static JTextField tfPotenciaConExcCarga = new JTextField();
    static JTextField tfCargaMaxCadCarga = new JTextField();
    static JTextField tfTaraCadCarga = new JTextField();
    static JTextField tfPlacaCarga = new JTextField();


    static JButton btConsultar = new JButton();
    static JButton btExcluir = new JButton();
    static JButton btSair = new JButton();

    static JanConExcCarga janCarga = new JanConExcCarga();


    public static JanConExcCarga getJanConExcCarga(){
        if (JanConExcCargaUnica == null) {
            JanConExcCargaUnica = new JanConExcCarga();
        }
        return JanConExcCargaUnica;
    }

    private JanConExcCarga() {
        //criaJanConExcCarga();
    }

    public static void criaJanConExcCarga() {
        janPrincipalConExcCarga.setDefaultCloseOperation(janPrincipalConExcCarga.DISPOSE_ON_CLOSE);
        janPrincipalConExcCarga.setSize(650, 650);
        janPrincipalConExcCarga.setLocationRelativeTo(null);
        janPrincipalConExcCarga.setResizable(false);
        janPrincipalConExcCarga.setLayout(null);
        janPrincipalConExcCarga.setTitle("Consulta / Exclui veículos carga");
        
        lbCabecalhoConExcCarga.setText("Consultar / Excluir veículo de carga");
        lbCabecalhoConExcCarga.setFont(new Font(null, Font.PLAIN, 25));
        lbCabecalhoConExcCarga.setBounds(0, 0, 500, 25);;

        lbPlacaConExcCarga.setText("Placa   . . . . . . . . . . . :");
        lbPlacaConExcCarga.setBounds(10, 30, 150, 25);
        lbMarcaConExcCarga.setText("Marca  . . . . . . . . . :");
        lbMarcaConExcCarga.setBounds(10, 55, 150, 25);
        lbModeloConExcCarga.setText("Modelo  . . . . . . . . :");
        lbModeloConExcCarga.setBounds(10, 80, 150, 25);
        lbCorConExcCarga.setText("Cor . . . . . . . . . . . . :");
        lbCorConExcCarga.setBounds(10, 105, 150, 25);
        lbVelMaxConExcCarga.setText("Velocidade Máx. :");
        lbVelMaxConExcCarga.setBounds(10, 130, 150, 25);
        lbQtRodasConExcCarga.setText("Qtd. Rodas . . . . . :");
        lbQtRodasConExcCarga.setBounds(10, 155, 150, 25);
        lbQtPistaoConExcCarga.setText("Qtd. Pistões . . . . :");
        lbQtPistaoConExcCarga.setBounds(10, 180, 150, 25);
        lbPotenciaConExcCarga.setText("Potência . . . . . . . :");
        lbPotenciaConExcCarga.setBounds(10, 205, 150, 25);
        lbCargaMaxCadCarga.setText("Qtd. Carga Máx . :");
        lbCargaMaxCadCarga.setBounds(10, 230, 150, 25);
        lbTaraCadCarga.setText("Tara . . . . . . . . :");
        lbTaraCadCarga.setBounds(10, 255, 150, 25);
        lbPlacaCarga.setText("Informe a placa:");
        lbPlacaCarga.setBounds(10, 540, 150, 25);

        tfPlacaConExcCarga.setBounds(130, 30, 150, 25);
        tfPlacaConExcCarga.setEditable(false);
        tfMarcaConExcCarga.setBounds(130, 55, 150, 25);
        tfMarcaConExcCarga.setEditable(false);
        tfModeloConExcCarga.setBounds(130, 80, 150, 25);
        tfModeloConExcCarga.setEditable(false);
        tfCorConExcCarga.setBounds(130, 105, 150, 25);
        tfCorConExcCarga.setEditable(false);
        tfVelMaxConExcCarga.setBounds(130, 130, 150, 25);
        tfVelMaxConExcCarga.setEditable(false);
        tfQtRodasConExcCarga.setBounds(130, 155, 150, 25);
        tfQtRodasConExcCarga.setEditable(false);
        tfQtPistaoConExcCarga.setBounds(130, 180, 150, 25);
        tfQtPistaoConExcCarga.setEditable(false);
        tfPotenciaConExcCarga.setBounds(130, 205, 150, 25);
        tfPotenciaConExcCarga.setEditable(false);
        tfCargaMaxCadCarga.setBounds(130, 230, 150, 25);
        tfCargaMaxCadCarga.setEditable(false);
        tfTaraCadCarga.setBounds(130, 255, 150, 25);
        tfTaraCadCarga.setEditable(false);
        tfPlacaCarga.setBounds(130, 540, 150, 25);

        btConsultar.setText("Consultar");
        btConsultar.setBounds(20, 570, 100, 30);
        btConsultar.setFocusable(false);
        btConsultar.addActionListener(janCarga);
        btExcluir.setText("Excluir");
        btExcluir.setBounds(140, 570, 100, 30);
        btExcluir.setFocusable(false);
        btExcluir.addActionListener(janCarga);
        btSair.setText("Sair");
        btSair.setBounds(260, 570, 100, 30);
        btSair.setFocusable(false);
        btSair.addActionListener(janCarga);


        janPrincipalConExcCarga.add(lbCabecalhoConExcCarga);
        janPrincipalConExcCarga.add(lbPlacaConExcCarga);
        janPrincipalConExcCarga.add(lbMarcaConExcCarga);
        janPrincipalConExcCarga.add(lbModeloConExcCarga);
        janPrincipalConExcCarga.add(lbCorConExcCarga);
        janPrincipalConExcCarga.add(lbVelMaxConExcCarga);
        janPrincipalConExcCarga.add(lbQtRodasConExcCarga);
        janPrincipalConExcCarga.add(lbQtPistaoConExcCarga);
        janPrincipalConExcCarga.add(lbPotenciaConExcCarga);
        janPrincipalConExcCarga.add(lbCargaMaxCadCarga);
        janPrincipalConExcCarga.add(lbPlacaCarga);

        janPrincipalConExcCarga.add(tfPlacaConExcCarga);
        janPrincipalConExcCarga.add(tfMarcaConExcCarga);
        janPrincipalConExcCarga.add(tfModeloConExcCarga);
        janPrincipalConExcCarga.add(tfCorConExcCarga);
        janPrincipalConExcCarga.add(tfVelMaxConExcCarga);
        janPrincipalConExcCarga.add(tfQtRodasConExcCarga);
        janPrincipalConExcCarga.add(tfQtPistaoConExcCarga);
        janPrincipalConExcCarga.add(tfPotenciaConExcCarga);
        janPrincipalConExcCarga.add(tfCargaMaxCadCarga);
        janPrincipalConExcCarga.add(tfPlacaCarga);

        janPrincipalConExcCarga.add(btConsultar);
        janPrincipalConExcCarga.add(btExcluir);
        janPrincipalConExcCarga.add(btSair);

        janPrincipalConExcCarga.setVisible(true);
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
        carga = new Carga();
    
        try{
            carga.setPlaca(tfPlacaCarga.getText());
            carga = BDVeiculos.getBdVeiculos().consPlacaCarga(carga);
            if(carga != null) {
                tfPlacaConExcCarga.setText(carga.getPlaca());
                tfMarcaConExcCarga.setText(carga.getMarca());
                tfModeloConExcCarga.setText(carga.getModelo());
                tfCorConExcCarga.setText(carga.getCor());
                tfVelMaxConExcCarga.setText(Float.toString(carga.calcVel(carga.getVelocMax())));
                tfQtRodasConExcCarga.setText(Integer.toString(carga.getQtdRodas()));
                tfQtPistaoConExcCarga.setText(Integer.toString(carga.getMotor().getQtdPist()));
                tfPotenciaConExcCarga.setText(Integer.toString(carga.getMotor().getPotencia()));
                tfCargaMaxCadCarga.setText(Integer.toString(carga.getCargaMax()));
                tfTaraCadCarga.setText(Integer.toString(carga.getTara()));
                
            } else {
                JOptionPane.showMessageDialog(null, "Veículo de carga não encontrado", "ERRO AO CONSULTAR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (VeicExistException e) {

        }
    }
    
    public void excPlaca(){
        carga = new Carga();

        try {
            carga.setPlaca(tfPlacaCarga.getText());
            carga = BDVeiculos.getBdVeiculos().excCarga(carga);
            if(carga == null){
                JOptionPane.showMessageDialog(null, "Veículo de carga excluído", "Veículo Excluído", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Veículo de carga não encontrado", "ERRO AO EXCLUIR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void sair() {
        janPrincipalConExcCarga.dispose();
    }
}
