package cn.edu.tsinghua;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Demo {
	private JFrame mainFrame;
	
	public Demo () {}
	
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
		JTextField latitudeinput = new JTextField(100);
		JTextField longitudeinput = new JTextField(100);
		JTextField altitudeinput = new JTextField(100);
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
		JTextField latitudeinput2 = new JTextField(100);
		JTextField longitudeinput2 = new JTextField(100);
		JTextField altitudeinput2 = new JTextField(100);
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
		JTextField latitudeinput3 = new JTextField(100);
		JTextField longitudeinput3 = new JTextField(100);
		JTextField altitudeinput3 = new JTextField(100);
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
		JButton cal = new JButton("弹道计算");
		calculator.add(cal);
		mainFrame.getContentPane().add(calculator);
		
		JPanel flydemo = new JPanel();
		JButton fly = new JButton("飞行演示");
		flydemo.add(fly);
		mainFrame.getContentPane().add(flydemo);
				
	}
	
	public void run() {
		mainFrame.setVisible(true);
	}
	
}