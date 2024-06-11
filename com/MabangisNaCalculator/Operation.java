package com.MabangisNaCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Operation extends JFrame implements KeyListener {
	
	private JPanel contentPane;
    private JPanel Container;
    private JPanel ResultContainer;
    private JLabel ResultLabel;
    private JButton AC;
    private JButton C;
    private JButton Percent;
    private JButton Divide;
    private JButton Seven;
    private JButton Eight;
    private JButton Nine;
    private JButton Multiply;
    private JButton Four;
    private JButton Five;
    private JButton Six;
    private JButton Minus;
    private JButton One;
    private JButton Two;
    private JButton Three;
    private JButton Plus;
    private JButton Dot;
    private JButton Zero;
    private JButton Equals;
    private JButton Divide2;
    private String currentOperation = "";
    private double currentResult = 0;
    private boolean isNewOperation = true;
    
    @Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyChar = e.getKeyChar();

        switch (keyChar) {
        	case KeyEvent.VK_ENTER:
        		Equals.doClick();
        		break;
            case '0':
                Zero.doClick();
                break;
            case '1':
                One.doClick();
                break;
            case '2':
                Two.doClick();
                break;
            case '3':
                Three.doClick();
                break;
            case '4':
                Four.doClick();
                break;
            case '5':
                Five.doClick();
                break;
            case '6':
                Six.doClick();
                break;
            case '7':
                Seven.doClick();
                break;
            case '8':
                Eight.doClick();
                break;
            case '9':
                Nine.doClick();
                break;
            case '.':
                Dot.doClick();
                break;
            case '+':
                Plus.doClick();
                break;
            case '-':
                Minus.doClick();
                break;
            case '*':
                Multiply.doClick();
                break;
            case '/':
                Divide.doClick();
                break;
            case '=':
                Equals.doClick();
                break;
            case '%':
                Percent.doClick();
                break;
            case 'c':
            case 'C':
                C.doClick();
                break;
            case KeyEvent.VK_BACK_SPACE:
                C.doClick(); // pang backspace
                break;
            default:
                break;
        }
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
    
    public Operation() {
    	this.setVisible(true);
    	this.setResizable(false);
    	this.setLocationRelativeTo(null);
    	this.setTitle("Putanginang Calculator to");
    	this.addKeyListener(this);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    	
    	// Calculator
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 507, 712);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        Container = new JPanel();
        Container.setBackground(new Color(255, 255, 255));
        Container.setBounds(0, 0, 491, 673);
        contentPane.add(Container);
        Container.setLayout(null);

        ResultContainer = new JPanel();
        ResultContainer.setBounds(0, 0, 491, 125);
        Container.add(ResultContainer);
        ResultContainer.setLayout(null);

        ResultLabel = new JLabel("0");
        ResultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        ResultLabel.setFont(new Font("Segoe UI", Font.PLAIN, 44));
        ResultLabel.setBounds(10, 11, 471, 103);
        ResultContainer.add(ResultLabel);

        AC = new JButton("AC");
        AC.addActionListener(e -> {
            currentResult = 0;
            currentOperation = "";
            isNewOperation = true;
            ResultLabel.setText("0");
        });
        AC.setBackground(new Color(255, 255, 255));
        AC.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        AC.setBounds(10, 151, 89, 68);
        Container.add(AC);

        C = new JButton("C");
        C.addActionListener(e -> {
            ResultLabel.setText("0");
            isNewOperation = true;
        });
        C.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        C.setBackground(Color.WHITE);
        C.setBounds(137, 151, 89, 68);
        Container.add(C);

        Percent = new JButton("%");
        Percent.addActionListener(e -> {
            double value = Double.parseDouble(ResultLabel.getText());
            value = value / 100;
            ResultLabel.setText(String.valueOf(value));
            isNewOperation = true;
        });
        Percent.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Percent.setBackground(Color.WHITE);
        Percent.setBounds(270, 151, 89, 68);
        Container.add(Percent);

        Divide = new JButton("/");
        Divide.addActionListener(e -> {
            performOperation();
            currentOperation = "/";
        });
        Divide.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Divide.setBackground(Color.WHITE);
        Divide.setBounds(392, 151, 89, 68);
        Container.add(Divide);

        Seven = new JButton("7");
        Seven.addActionListener(e -> appendDigit("7"));
        Seven.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Seven.setBackground(Color.WHITE);
        Seven.setBounds(10, 259, 89, 68);
        Container.add(Seven);

        Eight = new JButton("8");
        Eight.addActionListener(e -> appendDigit("8"));
        Eight.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Eight.setBackground(Color.WHITE);
        Eight.setBounds(137, 259, 89, 68);
        Container.add(Eight);

        Nine = new JButton("9");
        Nine.addActionListener(e -> appendDigit("9"));
        Nine.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Nine.setBackground(Color.WHITE);
        Nine.setBounds(270, 259, 89, 68);
        Container.add(Nine);

        Multiply = new JButton("X");
        Multiply.addActionListener(e -> {
            performOperation();
            currentOperation = "*";
        });
        Multiply.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Multiply.setBackground(Color.WHITE);
        Multiply.setBounds(392, 259, 89, 68);
        Container.add(Multiply);

        Four = new JButton("4");
        Four.addActionListener(e -> appendDigit("4"));
        Four.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Four.setBackground(Color.WHITE);
        Four.setBounds(10, 366, 89, 68);
        Container.add(Four);

        Five = new JButton("5");
        Five.addActionListener(e -> appendDigit("5"));
        Five.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Five.setBackground(Color.WHITE);
        Five.setBounds(137, 366, 89, 68);
        Container.add(Five);

        Six = new JButton("6");
        Six.addActionListener(e -> appendDigit("6"));
        Six.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Six.setBackground(Color.WHITE);
        Six.setBounds(270, 366, 89, 68);
        Container.add(Six);

        Minus = new JButton("-");
        Minus.addActionListener(e -> {
            performOperation();
            currentOperation = "-";
        });
        Minus.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Minus.setBackground(Color.WHITE);
        Minus.setBounds(392, 366, 89, 68);
        Container.add(Minus);

        One = new JButton("1");
        One.addActionListener(e -> appendDigit("1"));
        One.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        One.setBackground(Color.WHITE);
        One.setBounds(10, 472, 89, 68);
        Container.add(One);

        Two = new JButton("2");
        Two.addActionListener(e -> appendDigit("2"));
        Two.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Two.setBackground(Color.WHITE);
        Two.setBounds(137, 472, 89, 68);
        Container.add(Two);

        Three = new JButton("3");
        Three.addActionListener(e -> appendDigit("3"));
        Three.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Three.setBackground(Color.WHITE);
        Three.setBounds(270, 472, 89, 68);
        Container.add(Three);

        Plus = new JButton("+");
        Plus.addActionListener(e -> {
            performOperation();
            currentOperation = "+";
        });
        Plus.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Plus.setBackground(Color.WHITE);
        Plus.setBounds(392, 472, 89, 68);
        Container.add(Plus);

        Dot = new JButton(".");
        Dot.addActionListener(e -> appendDigit("."));
        Dot.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Dot.setBackground(Color.WHITE);
        Dot.setBounds(10, 581, 89, 68);
        Container.add(Dot);

        Zero = new JButton("0");
        Zero.addActionListener(e -> appendDigit("0"));
        Zero.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Zero.setBackground(Color.WHITE);
        Zero.setBounds(137, 581, 89, 68);
        Container.add(Zero);

        Equals = new JButton("=");
        Equals.addActionListener(e -> {
            performOperation();
            currentOperation = "";
        });
        Equals.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Equals.setBackground(Color.WHITE);
        Equals.setBounds(270, 581, 89, 68);
        Container.add(Equals);

        Divide2 = new JButton("/");
        Divide2.addActionListener(e -> {
            performOperation();
            currentOperation = "/";
        });
        Divide2.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        Divide2.setBackground(Color.WHITE);
        Divide2.setBounds(392, 581, 89, 68);
        Container.add(Divide2);
    }

    public void appendDigit(String digit) {
        if (isNewOperation) {
            ResultLabel.setText(digit);
            isNewOperation = false;
        } else {
            ResultLabel.setText(ResultLabel.getText() + digit);
        }
    }

    public void performOperation() {
        double inputValue = Double.parseDouble(ResultLabel.getText());
        switch (currentOperation) {
            case "+":
                currentResult += inputValue;
                break;
            case "-":
                currentResult -= inputValue;
                break;
            case "*":
                currentResult *= inputValue;
                break;
            case "/":
                if (inputValue != 0) {
                    currentResult /= inputValue;
                } else {
                    ResultLabel.setText("Undefined");
                    return;
                }
                break;
            default:
                currentResult = inputValue;
                break;
        }
        ResultLabel.setText(String.valueOf(currentResult));
        isNewOperation = true;
    }
	
}
