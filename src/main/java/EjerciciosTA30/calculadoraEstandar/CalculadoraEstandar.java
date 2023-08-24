package EjerciciosTA30.calculadoraEstandar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;

public class CalculadoraEstandar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double num1 = 0.0;
	private double num2 = 0.0;
	private double resultado = 0.0;
	private String op;
	List<String> listaResults = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEstandar frame = new CalculadoraEstandar();
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
	public CalculadoraEstandar() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 39, 356, 117);
		contentPane.add(textField);
		textField.setColumns(10);

		final JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(376, 38, 169, 486);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 199, 356, 325);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(6, 4, 0, 0));
		
		JButton btnModulo = new JButton("%");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "%";
				textField.setText("");
			}
		});
		panel.add(btnModulo);
		
		JButton btnBorrarTodo = new JButton("CE");
		btnBorrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				for(int i= 0; i < listaResults.size(); i++) {
					listaResults.set(i,"");
				}
				
			}
		});
		panel.add(btnBorrarTodo);
		
		JButton btnBorrarResult = new JButton("C");
		btnBorrarResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				textField.setText("");
			}
		});
		panel.add(btnBorrarResult);
		
		JButton btnBorrarUltNum = new JButton("Borrar");
		btnBorrarUltNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numeroActual = textField.getText();
				if(!numeroActual.isEmpty()) {
					textField.setText(numeroActual.substring(0, numeroActual.length() - 1));
				}
			}
		});
		panel.add(btnBorrarUltNum);
		
		JButton btnUnoEntreNum = new JButton("1/X");
		btnUnoEntreNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "1/";
				
				listaResults.add("1/" + String.valueOf(num1 + " \n"));
				textArea.setText(listaResults.toString());
			}
		});
		panel.add(btnUnoEntreNum);
		
		JButton btnPowDos = new JButton("x^2");
		btnPowDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "^";
				
				listaResults.add(String.valueOf(num1 + "^2 \n"));
				textArea.setText(listaResults.toString());
			}
		});
		panel.add(btnPowDos);
		
		JButton btnRaiz = new JButton("√x");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "√";

				listaResults.add(String.valueOf("√" + num1 + "\n"));
				textArea.setText(listaResults.toString());
			}
		});
		panel.add(btnRaiz);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "/";
				textField.setText("");
				
				listaResults.add(String.valueOf(num1 + " / " + "\n"));
				textArea.setText(listaResults.toString());
			}
		});
		panel.add(btnDiv);
		
		JButton btnNumSiete = new JButton("7");
		btnNumSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		panel.add(btnNumSiete);
		
		JButton btnNumOcho = new JButton("8");
		btnNumOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		panel.add(btnNumOcho);
		
		JButton btnNumNueve = new JButton("9");
		btnNumNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		panel.add(btnNumNueve);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "*";
				textField.setText("");

				listaResults.add(String.valueOf(num1 + " x " + "\n"));
				textArea.setText(listaResults.toString());
			}
		});
		panel.add(btnMulti);
		
		JButton btnNumCuatro = new JButton("4");
		btnNumCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		panel.add(btnNumCuatro);
		
		JButton btnNumCinco = new JButton("5");
		btnNumCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		panel.add(btnNumCinco);
		
		JButton btnNumSeis = new JButton("6");
		btnNumSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		panel.add(btnNumSeis);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "-";
				textField.setText("");
				
				listaResults.add(String.valueOf(num1 + " - " + "\n"));
				textArea.setText(listaResults.toString());
			}
		});
		panel.add(btnResta);
		
		JButton btnNumUno = new JButton("1");
		btnNumUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		panel.add(btnNumUno);
		
		JButton btnNumDos = new JButton("2");
		btnNumDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		panel.add(btnNumDos);
		
		JButton btnNumTres = new JButton("3");
		btnNumTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		panel.add(btnNumTres);
		
		JButton btnSumar = new JButton("+");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				op = "+";
				textField.setText("");
				
				listaResults.add(String.valueOf(num1 + " + " + "\n"));
				textArea.setText(listaResults.toString());
			}
		});
		panel.add(btnSumar);
		
		JButton btnCambioSigno = new JButton("+/-");
		btnCambioSigno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valorActual = Double.parseDouble(textField.getText());
				double valorCambiado = -valorActual;
				textField.setText(String.valueOf(valorCambiado));
			}
		});
		panel.add(btnCambioSigno);
		
		JButton btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		panel.add(btnCero);
		
		JButton btnDecimal = new JButton(",");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains(".")) {
					textField.setText(textField.getText() + ".");
				}
			}
		});
		panel.add(btnDecimal);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				
				switch(op) {
				case "+":
						 resultado = num1 + num2;
						 textField.setText(String.valueOf(resultado));
						 listaResults.add(String.valueOf(num1) + " + " + String.valueOf(num2) + " = " + String.valueOf(resultado) + "\n");
						 textArea.setText(listaResults.toString());
						 break;
				case "-":
						 resultado = num1 - num2;
						 textField.setText(String.valueOf(resultado));
						 listaResults.add(String.valueOf(num1) + " - " + String.valueOf(num2) + " = " + String.valueOf(resultado) + "\n");
						 textArea.setText(listaResults.toString());
						 break;
				case "*":
					 	 resultado = num1 * num2;
					 	 textField.setText(String.valueOf(resultado));
					 	 listaResults.add(String.valueOf(num1) + " * " + String.valueOf(num2) + " = " + String.valueOf(resultado) + "\n");
					 	 textArea.setText(listaResults.toString());
					 	 break;
				case "/":
					 	 resultado = num1 / num2;
					 	 textField.setText(String.valueOf(resultado));
					 	 listaResults.add(String.valueOf(num1) + " / " + String.valueOf(num2) + " = " + String.valueOf(resultado) + "\n");
					 	 textArea.setText(listaResults.toString());
					 	 break;
				case "%":
					 	 resultado = num1 % num2;
					 	 textField.setText(String.valueOf(resultado));
					 	 listaResults.add(String.valueOf(num1) + " % " + String.valueOf(num2) + " = " + String.valueOf(resultado) + "\n");
					 	 textArea.setText(listaResults.toString());
					 	 break;
				case "√":
						 resultado = Math.sqrt(num1);
						 textField.setText(String.valueOf(resultado));
						 listaResults.add("√" + String.valueOf(num1) + " = " + String.valueOf(resultado) + "\n");
						 textArea.setText(listaResults.toString());
						 break;
				case "^":
					 resultado = Math.pow(num1, 2);
					 textField.setText(String.valueOf(resultado));
					 listaResults.add(String.valueOf(num1) + "^2 = " + String.valueOf(resultado) + "\n");
					 textArea.setText(listaResults.toString());
					 break;
				case "1/":
					 resultado = 1 / num1;
					 textField.setText(String.valueOf(resultado));
					 listaResults.add("1 / " + String.valueOf(num1) + " = " + String.valueOf(resultado) + "\n");
					 textArea.setText(listaResults.toString());
					 break;
				}
			}
		});
		panel.add(btnResultado);
		
		JLabel lblNewLabel = new JLabel("Historial");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(466, 11, 79, 23);
		contentPane.add(lblNewLabel);
		
		
		
	}
	
}
