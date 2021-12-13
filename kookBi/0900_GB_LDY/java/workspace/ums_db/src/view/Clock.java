package view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock extends JFrame implements Runnable{
	JLabel label;
	public Clock() {
//		시간 정보를 가지고 있는 타입
		Date date = new Date();
		String time = new SimpleDateFormat("HH:mm:ss").format(date);
		label = new JLabel(time);
		label.setBounds(100,130,200,20);
		setLayout(null);
		add(label);
		setBounds(300,300,300,300);
		setVisible(true);
		setResizable(false);
	}
	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			String time = new SimpleDateFormat("HH:mm:ss").format(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			label.setText(time);
		}
	}
}







