package com.example.a2dproject_powerairhockey;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Breakout extends JFrame {

	public Breakout() {
		initUI();
	}

	public void initUI() {
		add(new Board());
		setTitle("POWER_AirHockey");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		pack();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var game = new Breakout();
			game.setVisible(true);

		});
	}

}
