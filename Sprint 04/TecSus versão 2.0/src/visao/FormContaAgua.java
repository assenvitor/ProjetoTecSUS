package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class FormContaAgua extends JFrame {

	private JPanel contentPane;
	private JTextField JTextFieldNumConta;
	private JTextField JTextFieldGrupo;
	private JTextField JTextFieldRgi;
	private JTextField JTextFieldMesReferencia;
	private JTextField JTextFieldTipoLigacao;
	private JTextField JTextFieldTpoFaturamento;
	private JTextField JTextFieldConsumoMetro;
	private JTextField JTextFieldLeituraAtualData;
	private JTextField JTextFieldLeituraAnteriorData;
	private JTextField JTextFieldLeituraAnterior;
	private JTextField JTextFieldLeituraAtual;
	private JTextField JTextFieldObservacao;
	private JTextField JTextFieldValorAgua;
	private JTextField JTextFieldValorEsgoto;
	private JTextField JTextFieldValorTotal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormContaAgua frame = new FormContaAgua();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormContaAgua() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 53, 758, 569);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextFieldNumConta = new JTextField();
		JTextFieldNumConta.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldNumConta.setColumns(10);
		JTextFieldNumConta.setBounds(271, 143, 155, 20);
		panel.add(JTextFieldNumConta);
		
		JLabel lblNDaConta = new JLabel("N\u00BA da Conta:");
		lblNDaConta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNDaConta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNDaConta.setBounds(293, 115, 97, 28);
		panel.add(lblNDaConta);
		
		JLabel lblGrupo = new JLabel("Grupo:");
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGrupo.setBounds(436, 115, 97, 28);
		panel.add(lblGrupo);
		
		JTextFieldGrupo = new JTextField();
		JTextFieldGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldGrupo.setColumns(10);
		JTextFieldGrupo.setBounds(462, 143, 45, 20);
		panel.add(JTextFieldGrupo);
		
		JLabel lblCodIdentificador_3 = new JLabel("RGI:");
		lblCodIdentificador_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_3.setBounds(130, 115, 97, 28);
		panel.add(lblCodIdentificador_3);
		
		JTextFieldRgi = new JTextField();
		JTextFieldRgi.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldRgi.setColumns(10);
		JTextFieldRgi.setBounds(108, 143, 155, 20);
		panel.add(JTextFieldRgi);
		
		JLabel lblMesRef = new JLabel("M\u00EAs Refer\u00EAncia:");
		lblMesRef.setHorizontalAlignment(SwingConstants.CENTER);
		lblMesRef.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMesRef.setBounds(147, 186, 97, 28);
		panel.add(lblMesRef);
		
		JTextFieldMesReferencia = new JTextField();
		JTextFieldMesReferencia.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldMesReferencia.setColumns(10);
		JTextFieldMesReferencia.setBounds(118, 214, 155, 20);
		panel.add(JTextFieldMesReferencia);
		
		JLabel lblCodIdentificador_1 = new JLabel("Tipo de Liga\u00E7\u00E3o:");
		lblCodIdentificador_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCodIdentificador_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodIdentificador_1.setBounds(557, 115, 97, 28);
		panel.add(lblCodIdentificador_1);
		
		JTextFieldTipoLigacao = new JTextField();
		JTextFieldTipoLigacao.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldTipoLigacao.setColumns(10);
		JTextFieldTipoLigacao.setBounds(535, 143, 155, 20);
		panel.add(JTextFieldTipoLigacao);
		
		JLabel lblTipFat = new JLabel("Tipo de Faturamento:");
		lblTipFat.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipFat.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipFat.setBounds(330, 186, 120, 28);
		panel.add(lblTipFat);
		
		JTextFieldTpoFaturamento = new JTextField();
		JTextFieldTpoFaturamento.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldTpoFaturamento.setColumns(10);
		JTextFieldTpoFaturamento.setBounds(313, 214, 155, 20);
		panel.add(JTextFieldTpoFaturamento);
		
		JTextFieldConsumoMetro = new JTextField();
		JTextFieldConsumoMetro.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldConsumoMetro.setColumns(10);
		JTextFieldConsumoMetro.setBounds(521, 214, 155, 20);
		panel.add(JTextFieldConsumoMetro);
		
		JLabel lblConsumoM = new JLabel("Consumo m\u00B3:");
		lblConsumoM.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsumoM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConsumoM.setBounds(538, 186, 120, 28);
		panel.add(lblConsumoM);
		
		JLabel lblLeitAtual = new JLabel("Leitura Atual:");
		lblLeitAtual.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeitAtual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLeitAtual.setBounds(211, 297, 120, 28);
		panel.add(lblLeitAtual);
		
		JTextFieldLeituraAtualData = new JTextField();
		JTextFieldLeituraAtualData.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldLeituraAtualData.setColumns(10);
		JTextFieldLeituraAtualData.setBounds(318, 301, 120, 20);
		panel.add(JTextFieldLeituraAtualData);
		
		JLabel lblData = new JLabel("Data");
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblData.setBounds(320, 259, 120, 28);
		panel.add(lblData);
		
		JLabel lblApresentao = new JLabel("Apresenta\u00E7\u00E3o");
		lblApresentao.setHorizontalAlignment(SwingConstants.CENTER);
		lblApresentao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApresentao.setBounds(211, 259, 120, 28);
		panel.add(lblApresentao);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(238, 288, 355, 2);
		panel.add(separator_1);
		
		JLabel lblLeitura = new JLabel("Leitura");
		lblLeitura.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeitura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLeitura.setBounds(467, 259, 120, 28);
		panel.add(lblLeitura);
		
		JLabel lblLeituraAnterior = new JLabel("Leitura Anterior:");
		lblLeituraAnterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeituraAnterior.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLeituraAnterior.setBounds(209, 324, 120, 28);
		panel.add(lblLeituraAnterior);
		
		JTextFieldLeituraAnteriorData = new JTextField();
		JTextFieldLeituraAnteriorData.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldLeituraAnteriorData.setColumns(10);
		JTextFieldLeituraAnteriorData.setBounds(318, 328, 120, 20);
		panel.add(JTextFieldLeituraAnteriorData);
		
		JTextFieldLeituraAnterior = new JTextField();
		JTextFieldLeituraAnterior.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldLeituraAnterior.setColumns(10);
		JTextFieldLeituraAnterior.setBounds(467, 328, 120, 20);
		panel.add(JTextFieldLeituraAnterior);
		
		JTextFieldLeituraAtual = new JTextField();
		JTextFieldLeituraAtual.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldLeituraAtual.setColumns(10);
		JTextFieldLeituraAtual.setBounds(467, 301, 120, 20);
		panel.add(JTextFieldLeituraAtual);
		
		JLabel lblObservacao = new JLabel("Observa\u00E7\u00E3o:");
		lblObservacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblObservacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObservacao.setBounds(12, 426, 120, 28);
		panel.add(lblObservacao);
		
		JTextFieldObservacao = new JTextField();
		JTextFieldObservacao.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldObservacao.setColumns(10);
		JTextFieldObservacao.setBounds(116, 426, 630, 57);
		panel.add(JTextFieldObservacao);
		
		JLabel lblValorAgua = new JLabel("Valor \u00C1gua");
		lblValorAgua.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorAgua.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorAgua.setBounds(184, 365, 149, 28);
		panel.add(lblValorAgua);
		
		JLabel lblValorEsgoto = new JLabel("Valor Esgoto");
		lblValorEsgoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorEsgoto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorEsgoto.setBounds(344, 365, 149, 28);
		panel.add(lblValorEsgoto);
		
		JTextFieldValorAgua = new JTextField();
		JTextFieldValorAgua.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldValorAgua.setColumns(10);
		JTextFieldValorAgua.setBounds(208, 393, 106, 20);
		panel.add(JTextFieldValorAgua);
		
		JTextFieldValorEsgoto = new JTextField();
		JTextFieldValorEsgoto.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldValorEsgoto.setColumns(10);
		JTextFieldValorEsgoto.setBounds(365, 393, 106, 20);
		panel.add(JTextFieldValorEsgoto);
		
		JLabel lblValorTotal = new JLabel("Valor Total");
		lblValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValorTotal.setBounds(505, 365, 149, 28);
		panel.add(lblValorTotal);
		
		JTextFieldValorTotal = new JTextField();
		JTextFieldValorTotal.setHorizontalAlignment(SwingConstants.CENTER);
		JTextFieldValorTotal.setColumns(10);
		JTextFieldValorTotal.setBounds(524, 393, 106, 20);
		panel.add(JTextFieldValorTotal);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(313, 521, 97, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(420, 521, 97, 25);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(12, 13, 734, 89);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(0, 13, 65, 28);
		panel_1.add(lblNome);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(54, 18, 242, 20);
		panel_1.add(textField);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereco.setBounds(325, 13, 65, 28);
		panel_1.add(lblEndereco);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(400, 18, 322, 20);
		panel_1.add(textField_1);
		
		JLabel lblhidrometro = new JLabel("Hidr\u00F4metro:");
		lblhidrometro.setHorizontalAlignment(SwingConstants.CENTER);
		lblhidrometro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblhidrometro.setBounds(10, 49, 75, 28);
		panel_1.add(lblhidrometro);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(95, 54, 112, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE CONTA DE \u00C1GUA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(257, 13, 267, 16);
		contentPane.add(lblNewLabel);
	}

}
