package cn.edu.tsinghua;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Demo {
	private JFrame mainFrame;
	
	//Category 1
	private JLabel senderLongitudeLabel;
	private JTextField senderLongitudeText;
	private JLabel targetLongitudeLabel;
	private JTextField targetLongitudeText;
	private JButton trajectoryComputeBtn;
	
	//Category 2
	private JLabel senderLatitudeLabel;
	private JTextField senderLatitudeText;
	private JLabel targetLatitudetudeLabel;
	private JTextField targetLatitudeText;
	private JButton onlineComputeBtn;
	
	//Category 3
	private JLabel senderDegreeLabel;
	private JTextField senderDegreeText;
	private JLabel senderLongitudeLabel2;
	private JTextField senderLongitudeText2;
	private JButton sendingCompute;
	
	public Demo () {}
	
	public void init () {
		mainFrame = new JFrame("Demo");
		mainFrame.setSize(750, 500);
		mainFrame.setLayout(null);
		
		Container container = mainFrame.getContentPane();
		
		//Category 1
		senderLongitudeLabel = new JLabel("发射点经度", JLabel.CENTER);
		senderLongitudeLabel.setFont(new Font("Dialog", 0, 18));
		senderLongitudeLabel.setLocation(60, 30);
		senderLongitudeLabel.setOpaque(true);
		senderLongitudeLabel.setBackground(new Color(255, 128, 64));
		senderLongitudeLabel.setBounds(60, 30, 120, 50);
		container.add(senderLongitudeLabel);
		senderLongitudeText = new JTextField(100); //Max chars 100
		senderLongitudeText.setLocation(60,  100);
		senderLongitudeText.setBounds(60, 100, 120, 50);
		container.add(senderLongitudeText);
		targetLongitudeLabel = new JLabel("目标点经度", JLabel.CENTER);
		targetLongitudeLabel.setFont(new Font("Dialog", 0, 18));
		targetLongitudeLabel.setLocation(60, 170);
		targetLongitudeLabel.setOpaque(true);
		targetLongitudeLabel.setBackground(new Color(255, 128, 64));
		targetLongitudeLabel.setBounds(60, 170, 120, 50);
		container.add(targetLongitudeLabel);
		targetLongitudeText = new JTextField(100); //Max chars 100
		targetLongitudeText.setLocation(60,  240);
		targetLongitudeText.setBounds(60, 240, 120, 50);
		container.add(targetLongitudeText);
		trajectoryComputeBtn = new JButton("弹道计算");
		trajectoryComputeBtn.setFont(new Font("Dialog", 0, 18));
		//trajectoryComputeBtn.setOpaque(true);
		//trajectoryComputeBtn.setBackground(Color.blue);
		//Border b = new LineBorder(Color.blue, 1);
		//trajectoryComputeBtn.setBorder(b);
		trajectoryComputeBtn.setLocation(60, 360);
		trajectoryComputeBtn.setBounds(60, 360, 120, 50);
		container.add(trajectoryComputeBtn);

		//Category 2
		senderLatitudeLabel = new JLabel("发射点纬度", JLabel.CENTER);
		senderLatitudeLabel.setFont(new Font("Dialog", 0, 18));
		senderLatitudeLabel.setLocation(300, 30);
		senderLatitudeLabel.setOpaque(true);
		senderLatitudeLabel.setBackground(new Color(255, 128, 64));
		senderLatitudeLabel.setBounds(300, 30, 120, 50);
		container.add(senderLatitudeLabel);
		senderLatitudeText = new JTextField(100); //Max chars 100
		senderLatitudeText.setLocation(300,  100);
		senderLatitudeText.setBounds(300, 100, 120, 50);
		container.add(senderLatitudeText);
		targetLatitudetudeLabel = new JLabel("目标点纬度", JLabel.CENTER);
		targetLatitudetudeLabel.setFont(new Font("Dialog", 0, 18));
		targetLatitudetudeLabel.setLocation(300, 170);
		targetLatitudetudeLabel.setOpaque(true);
		targetLatitudetudeLabel.setBackground(new Color(255, 128, 64));
		targetLatitudetudeLabel.setBounds(300, 170, 120, 50);
		container.add(targetLatitudetudeLabel);
		targetLatitudeText = new JTextField(100); //Max chars 100
		targetLatitudeText.setLocation(300,  240);
		targetLatitudeText.setBounds(300, 240, 120, 50);
		container.add(targetLatitudeText);
		onlineComputeBtn = new JButton("在线计算");
		onlineComputeBtn.setFont(new Font("Dialog", 0, 18));
		//onlineComputeBtn.setOpaque(true);
		//onlineComputeBtn.setBackground(Color.blue);
		onlineComputeBtn.setLocation(300, 360);
		onlineComputeBtn.setBounds(300, 360, 120, 50);
		container.add(onlineComputeBtn);
		
		//Category 3
		senderDegreeLabel = new JLabel("发射方位角", JLabel.CENTER);
		senderDegreeLabel.setFont(new Font("Dialog", 0, 18));
		senderDegreeLabel.setLocation(540, 30);
		senderDegreeLabel.setOpaque(true);
		senderDegreeLabel.setBackground(new Color(255, 128, 64));
		senderDegreeLabel.setBounds(540, 30, 120, 50);
		container.add(senderDegreeLabel);
		senderDegreeText = new JTextField(100); //Max chars 100
		senderDegreeText.setLocation(540,  100);
		senderDegreeText.setBounds(540, 100, 120, 50);
		container.add(senderDegreeText);
		senderLongitudeLabel2 = new JLabel("发射点经度", JLabel.CENTER);
		senderLongitudeLabel2.setFont(new Font("Dialog", 0, 18));
		senderLongitudeLabel2.setLocation(540, 170);
		senderLongitudeLabel2.setOpaque(true);
		senderLongitudeLabel2.setBackground(new Color(255, 128, 64));
		senderLongitudeLabel2.setBounds(540, 170, 120, 50);
		container.add(senderLongitudeLabel2);
		senderLongitudeText2 = new JTextField(100); //Max chars 100
		senderLongitudeText2.setLocation(540,  240);
		senderLongitudeText2.setBounds(540, 240, 120, 50);
		container.add(senderLongitudeText2);
		sendingCompute = new JButton("数据发送");
		sendingCompute.setFont(new Font("Dialog", 0, 18));
		//sendingCompute.setOpaque(true);
		//sendingCompute.setBackground(Color.blue);
		sendingCompute.setLocation(540, 360);
		sendingCompute.setBounds(540, 360, 120, 50);
		container.add(sendingCompute);
		
	}
	
	public void run() {
		mainFrame.setVisible(true);
	}
	
}