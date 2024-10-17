package calculadora;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculadora {
	private static Text txt_Resultat;
	
	//Constants
	final int MAX_DIGITS = 5;
	
	//Definició de variables
	int valor1;
	int valor2;
	String operacio;
	boolean inicialitza_resultat;
	
	public Calculadora() {
		//Inicialització de les variables
		inicialitza();
		dibuixaCalculadora();
	}
	
	void inicialitza() {
		operacio = "null";
		valor1 = 0;
		valor2 = 0;
		inicialitza_resultat=true; 
	}
	
	String getResultatString() {
		return txt_Resultat.getText();
	}
	
	void setResultatString(String s) {
		txt_Resultat.setText(s);
	}
	
	int getResultatInt() {
		String resultat = txt_Resultat.getText();
		return Integer.parseInt(resultat);
	}
	
	private void dibuixaCalculadora() {
			
		Display display = Display.getDefault();
		Shell shlCalculadora = new Shell();
		shlCalculadora.setSize(306, 405);
		shlCalculadora.setText("Calculadora");

		
		//-----------------------------------------------------------
		//Números
		//-----------------------------------------------------------
		
		// Botó Número 1
		Button btn_1 = new Button(shlCalculadora, SWT.NONE);
		btn_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(1);
			}
		});
		btn_1.setBounds(10, 228, 47, 35);
		btn_1.setText("1");

		// Botó Número 2		
		Button btn_2 = new Button(shlCalculadora, SWT.NONE);
		btn_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(2);
			}
		});
		btn_2.setText("2");
		btn_2.setBounds(73, 228, 47, 35);

		// Botó Número 3
		Button btn_3 = new Button(shlCalculadora, SWT.NONE);
		btn_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(3);
			}
		});
		btn_3.setText("3");
		btn_3.setBounds(135, 228, 47, 35);
		
		// Botó Número 4		
		Button btn_4 = new Button(shlCalculadora, SWT.NONE);
		btn_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(4);
			}
		});
		btn_4.setText("4");
		btn_4.setBounds(10, 167, 47, 35);

		// Botó Número 5
		Button btn_5 = new Button(shlCalculadora, SWT.NONE);
		btn_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(5);
			}
		});
		btn_5.setText("5");
		btn_5.setBounds(73, 167, 47, 35);

		// Botó Número 6
		Button btn_6 = new Button(shlCalculadora, SWT.NONE);
		btn_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(6);
			}
		});
		btn_6.setText("6");
		btn_6.setBounds(135, 167, 47, 35);

		// Botó Número 7
		Button btn_7 = new Button(shlCalculadora, SWT.NONE);
		btn_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(7);
			}
		});
		btn_7.setText("7");
		btn_7.setBounds(10, 110, 47, 35);

		// Botó Número 8		
		Button btn_8 = new Button(shlCalculadora, SWT.NONE);
		btn_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(8);
			}
		});
		btn_8.setText("8");
		btn_8.setBounds(73, 110, 47, 35);

		// Botó Número 9
		Button btn_9 = new Button(shlCalculadora, SWT.NONE);
		btn_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(9);
			}
		});
		btn_9.setText("9");
		btn_9.setBounds(135, 110, 47, 35);

		// Botó Número 0
		Button btn_0 = new Button(shlCalculadora, SWT.NONE);
		btn_0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenirValor(0);
			}
		});
		btn_0.setText("0");
		btn_0.setBounds(10, 281, 47, 35);

		//-----------------------------------------------------------
		//Operacions
		//-----------------------------------------------------------
		
		// Botó igual
		Button btn_Igual = new Button(shlCalculadora, SWT.NONE);
		btn_Igual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executarIgual();
			}
		});
		btn_Igual.setText("=");
		btn_Igual.setBounds(73, 281, 109, 35);
		
		// Botó Dividir
		Button btn_Divisio = new Button(shlCalculadora, SWT.NONE);
		btn_Divisio.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executarOperador("/");
			}
		});
		btn_Divisio.setText("/");
		btn_Divisio.setBounds(204, 110, 47, 35);
		
		// Botó Multiplicar
		Button btn_Multiplicacio = new Button(shlCalculadora, SWT.NONE);
		btn_Multiplicacio.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executarOperador("*");
			}
		});
		btn_Multiplicacio.setText("*");
		btn_Multiplicacio.setBounds(204, 167, 47, 35);
		
		// Botó Sumar
		Button btn_Suma = new Button(shlCalculadora, SWT.NONE);
		btn_Suma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executarOperador("+");
			}
		});
		btn_Suma.setText("+");
		btn_Suma.setBounds(204, 228, 47, 35);
		
		// Botó Restar
		Button btn_Resta = new Button(shlCalculadora, SWT.NONE);
		btn_Resta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executarOperador("-");
			}
		});
		btn_Resta.setText("-");
		btn_Resta.setBounds(204, 281, 47, 35);
		
		// Botó Resultat
		txt_Resultat = new Text(shlCalculadora, SWT.BORDER);
		txt_Resultat.setBounds(10, 48, 241, 31);
		//FI INTERFICIE CALCULADORA
		
		shlCalculadora.open();
		shlCalculadora.layout();
		while (!shlCalculadora.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	void obtenirValor(int valor) {
		if(inicialitza_resultat)
			setResultatString("");
		
		String inputString = getResultatString();
		
		if(inputString.indexOf("0")==0) {
			inputString = inputString.substring(1);
		}
		if( (!inputString.equals("0")||valor>0) && inputString.length() < MAX_DIGITS) {
			setResultatString(inputString+valor);
		}
		
		inicialitza_resultat=false;
	}
	
	void executarOperador(String operador) {
		//int resultat;
		
		/*if(operador.equals("null")){
			resultat = getResultatInt();
			valor2 = resultat;
		}
		else {
			valor1 = getResultatInt();
			resultat= executarOperacio();
			mostrarResultat(resultat);
			
		}*/
		
		operacio = operador;
		
		valor1 = getResultatInt();
		inicialitza_resultat=true;
	}
	
	void executarIgual() {
		int resultat=0;
		
		valor2 = getResultatInt();
		resultat = executarOperacio();
		mostrarResultat(resultat);
		operacio = "null";
	}
	
	int executarOperacio() {
		int resultat = 0;
				
		//Operació: divisió
		if (operacio.equals("/"))
			resultat = valor1 / valor2;
		
		//Operació: multiplicació
		if (operacio.equals("*"))
			resultat = valor1 * valor2;
		
		//Operació: resta
		if (operacio.equals("-"))
			resultat = valor1 - valor2;
		
		//Operació: suma
		if (operacio.equals("+"))
			resultat = valor1 + valor2;
		
		return resultat;
		}

	void mostrarResultat(int resultat) {
		setResultatString(Integer.toString(resultat));
		valor1 = resultat;
		inicialitza_resultat = true;
	}

	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
	}

}
