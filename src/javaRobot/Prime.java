package javaRobot;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.print.attribute.standard.Finishings;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prime extends JFrame {

	private JPanel contentPane;
	private JTextField segundo;
	private JTextField minuto;
	private JTextField hora;
	private JTextField update;
	JButton btnStop;
	JButton btnStart;
	Cronometro cr =  new Cronometro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Cronometro crono = new Cronometro();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prime frame = new Prime();
					frame.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public Prime() throws InterruptedException, AWTException {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try {
					cr.crono();
				} catch (InterruptedException | AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		btnStart.setBounds(62, 208, 89, 23);
		contentPane.add(btnStart);
		
		btnStop = new JButton("STOP");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnStop.setBounds(262, 208, 89, 23);
		contentPane.add(btnStop);
		
		
		
		hora = new JTextField();
		hora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		
		
		hora.getText();
		hora.setColumns(10);
		hora.setBounds(36, 85, 47, 47);
		contentPane.add(hora);
		
		
		minuto = new JTextField();
		minuto.setColumns(10);
		minuto.setBounds(82, 85, 47, 47);
		contentPane.add(minuto);
				
		
		segundo = new JTextField();
		segundo.setBounds(128, 85, 47, 47);
		contentPane.add(segundo);
		segundo.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("TEMPO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 51, 139, 23);
		contentPane.add(lblNewLabel);
		
		update = new JTextField();
		update.setBounds(265, 85, 86, 47);
		contentPane.add(update);
		update.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ATUALIZA\u00C7\u00D5ES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(255, 57, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
