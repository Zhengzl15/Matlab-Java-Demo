package cn.edu.tsinghua;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Demo{
	private JFrame mainFrame;
	JButton calbutton;
	JButton flybutton;
	JTextField latitudeinput;
	JTextField longitudeinput;
	JTextField altitudeinput;
	JTextField latitudeinput2;
	JTextField longitudeinput2;
	JTextField altitudeinput2;
	JTextField latitudeinput3;
	JTextField longitudeinput3;
	JTextField altitudeinput3;
	
	public Demo () {}
	/*
	public class MyRegExp extends PlainDocument {
	    private Pattern pattern;
	    private Matcher m;
	    public MyRegExp(String pat) {
	        super();
	        this.pattern=Pattern.compile(pat);
	    }
	    @Override
	    public void insertString
	    (int offset, String str, AttributeSet attr)
	            throws BadLocationException {   
	        if (str == null){
	            return;
	        }
	        String tmp=getText(0, offset).concat(str);
	        m=pattern.matcher(tmp);
	        if(m.matches())
	            super.insertString(offset, str, attr);
	    }
	}*/
	
	public void init () {
		mainFrame = new JFrame("AirCraft");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setSize(810, 460);
		mainFrame.setLayout(new GridLayout(3,2,25,25));
		
		
		JPanel sender = new JPanel();
		sender.setLayout(new GridLayout(3,3,10,10));
		sender.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		JLabel sendername = new JLabel("发射点", JLabel.CENTER);
		JLabel nul1 = new JLabel("",JLabel.CENTER);
		JLabel nul2 = new JLabel("",JLabel.CENTER);
		sender.add(sendername);
		sender.add(nul1);
		sender.add(nul2);
		JLabel latitude = new JLabel("纬度", JLabel.CENTER);
		JLabel longitude = new JLabel("经度", JLabel.CENTER);
		JLabel altitude = new JLabel("高度", JLabel.CENTER);
		sender.add(latitude);
		sender.add(longitude);
		sender.add(altitude);
		latitudeinput = new JTextField(100);
		//latitudeinput.setDocument(new MyRegExp("^[-+]?[0-9]+(\\.[0-9]+)?$"));
		longitudeinput = new JTextField(100);
		altitudeinput = new JTextField(100);
		sender.add(latitudeinput);
		sender.add(longitudeinput);
		sender.add(altitudeinput);
		mainFrame.getContentPane().add(sender);
		
		
		JPanel noflyzone = new JPanel();
		noflyzone.setLayout(new GridLayout(3,3,10,10));
		noflyzone.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		JLabel noflyzonename = new JLabel("禁飞区", JLabel.CENTER);
		JLabel nul21 = new JLabel("",JLabel.CENTER);
		JLabel nul22 = new JLabel("",JLabel.CENTER);
		noflyzone.add(noflyzonename);
		noflyzone.add(nul21);
		noflyzone.add(nul22);
		JLabel latitude2 = new JLabel("纬度", JLabel.CENTER);
		JLabel longitude2 = new JLabel("经度", JLabel.CENTER);
		JLabel altitude2 = new JLabel("高度", JLabel.CENTER);
		noflyzone.add(latitude2);
		noflyzone.add(longitude2);
		noflyzone.add(altitude2);
		latitudeinput2 = new JTextField(100);
		longitudeinput2 = new JTextField(100);
		altitudeinput2 = new JTextField(100);
		noflyzone.add(latitudeinput2);
		noflyzone.add(longitudeinput2);
		noflyzone.add(altitudeinput2);
		mainFrame.getContentPane().add(noflyzone);
		
		
		JPanel receiver = new JPanel();
		receiver.setLayout(new GridLayout(3,3,10,10));
		receiver.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		JLabel receivername = new JLabel("目标点", JLabel.CENTER);
		JLabel nul31 = new JLabel("",JLabel.CENTER);
		JLabel nul32 = new JLabel("",JLabel.CENTER);
		receiver.add(receivername);
		receiver.add(nul31);
		receiver.add(nul32);
		JLabel latitude3 = new JLabel("纬度", JLabel.CENTER);
		JLabel longitude3 = new JLabel("经度", JLabel.CENTER);
		JLabel altitude3 = new JLabel("高度", JLabel.CENTER);
		receiver.add(latitude3);
		receiver.add(longitude3);
		receiver.add(altitude3);
		latitudeinput3 = new JTextField(100);
		longitudeinput3 = new JTextField(100);
		altitudeinput3 = new JTextField(100);
		receiver.add(latitudeinput3);
		receiver.add(longitudeinput3);
		receiver.add(altitudeinput3);
		mainFrame.getContentPane().add(receiver);
		
		
		JPanel flystyle = new JPanel();
		flystyle.setLayout(new GridLayout(2,3,10,10));
		flystyle.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
		JLabel flystylename = new JLabel("飞行构型", JLabel.CENTER);
		JLabel nul41 = new JLabel("",JLabel.CENTER);
		JLabel nul42 = new JLabel("",JLabel.CENTER);
		flystyle.add(flystylename);
		flystyle.add(nul41);
		flystyle.add(nul42);
		JRadioButton first=new JRadioButton("first");
		JRadioButton second=new JRadioButton("second");
		JRadioButton third=new JRadioButton("third");
		flystyle.add(first);
		flystyle.add(second);
		flystyle.add(third);
		mainFrame.getContentPane().add(flystyle);
		
		
		JPanel calculator = new JPanel();
		calbutton = new JButton("弹道计算");
		calculator.add(calbutton);
		calbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String r = checkValidation();
				if (!r.equals("")) {
				JOptionPane.showMessageDialog(mainFrame, r, "提示", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		mainFrame.getContentPane().add(calculator);
		
		JPanel flydemo = new JPanel();
		flybutton = new JButton("飞行演示");
		flydemo.add(flybutton);
		flybutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					String r = checkValidation();
					if (!r.equals("")) {
					JOptionPane.showMessageDialog(mainFrame, r, "提示", JOptionPane.WARNING_MESSAGE);
					}
			}
		});
		mainFrame.getContentPane().add(flydemo);
				
	}
	
	public void run() {
		mainFrame.setVisible(true);
	}
	
	public class CalListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("cal");		
		}		
	}
	
	//这个会调用两次。。
	/*
	public void actionPerformed(ActionEvent e){
		Object temp = e.getSource();
		if (e.getSource() == calbutton){
			String r = checkValidation();
			System.out.println("f");
			if (!r.equals("")) {
				//弹出警示框
				JOptionPane.showMessageDialog(mainFrame, r, "提示", JOptionPane.WARNING_MESSAGE);
			}
		}
		if (e.getSource() == flybutton){
			System.out.println("fly");
		}
	}*/
	
	private String checkValidation() {
		String result = "";
		int count = 0;
		
		double la1Value = -999.0;
		double lo1Value = -999.0;
		double al1Value = -999.0;
		double la3Value = -999.0;
		double lo3Value = -999.0;
		double al3Value = -999.0;
		
		//发射点
		try {
			la1Value = Double.parseDouble(latitudeinput.getText());
		} catch (Exception e) {   //为空或者有字符时会发生异常
			count++;
			result = result + count + " : 发射点经度值应在-180~+180度间\n";
		}
		try {
			lo1Value = Double.parseDouble(longitudeinput.getText());
		} catch (Exception e) {
			count++;
			result = result + count + " : 发射点纬度值应在-180~+180度间\n";
		}
		try {
			al1Value = Double.parseDouble(altitudeinput.getText());
		} catch (Exception e) {
			count++;
			result = result + count + " : 发射点高程值应大于0\n";
		}
		
		//目标点
		try {
			la3Value = Double.parseDouble(latitudeinput3.getText());
		} catch (Exception e) {
			count++;
			result = result + count + " : 目标点经度值应在-180~+180度间\n";
		}
		try {
			lo3Value = Double.parseDouble(longitudeinput3.getText());
		} catch (Exception e) {
			count++;
			result = result + count + " : 目标点纬度值应在-180~+180度间\n";
		}
		try {
			al3Value = Double.parseDouble(altitudeinput3.getText());
		} catch (Exception e) {
			count++;
			result = result + count + " : 目标点高程值应大于0\n";
		}
		
		if ((la1Value + 999.0 > 0.0001) && Math.abs(la1Value) > 180) {
			count++;
			result = result + count + " : 发射点经度值应在-180~+180度间\n";
		}
		if ((lo1Value + 999.0 > 0.0001) && Math.abs(lo1Value) > 180) {
			count++;
			result = result + count + " : 发射点纬度值应在-180~+180度间\n";
		}
		if ((al1Value + 999.0 > 0.0001) && al1Value <= 0) {
			count++;
			result = result + count + " : 发射点高程值应大于0\n";
		}
		if ((la3Value + 999.0 > 0.0001) && Math.abs(la3Value) > 180) {
			count++;
			result = result + count + " : 目标点经度值应在-180~+180度间\n";
		}
		if ((lo3Value + 999.0 > 0.0001) && Math.abs(lo3Value) > 180) {
			count++;
			result = result + count + " : 目标点纬度值应在-180~+180度间\n";
		}
		if ((al3Value + 999.0 > 0.0001) && al3Value <= 0) {
			count++;
			result = result + count + " : 目标点高程值应大于0\n";
		}
		
		return result;
	}
}