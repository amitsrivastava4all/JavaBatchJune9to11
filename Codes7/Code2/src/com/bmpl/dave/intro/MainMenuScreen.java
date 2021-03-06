package com.bmpl.dave.intro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bmpl.dave.users.LoginScreen;
import com.bmpl.dave.users.RegisterScreen;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuScreen extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public MainMenuScreen() {
		setTitle("Gaming Console");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadLoginScreen();
			}
		});
		mntmLogin.setIcon(new ImageIcon(MainMenuScreen.class.getResource("/com/bmpl/dave/intro/login.png")));
		mnFile.add(mntmLogin);
		mnFile.addSeparator();
		
		JMenuItem mntmRegister = new JMenuItem("Register");
		mntmRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadRegisterScreen();
			}
		});
		mntmRegister.setIcon(new ImageIcon(MainMenuScreen.class.getResource("/com/bmpl/dave/intro/register.png")));
		mnFile.add(mntmRegister);
		mnFile.addSeparator();
		
		JMenu mnGames = new JMenu("Games");
		mnGames.setEnabled(false);
		mnGames.setIcon(new ImageIcon(MainMenuScreen.class.getResource("/com/bmpl/dave/intro/game.png")));
		mnFile.add(mnGames);
		mnFile.addSeparator();
		JMenuItem mntmMario = new JMenuItem("Mario");
		mnGames.add(mntmMario);
		mnGames.addSeparator();
		JMenuItem mntmDave = new JMenuItem("Dave ");
		mnGames.add(mntmDave);
		mnGames.addSeparator();
		mnFile.addSeparator();
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(MainMenuScreen.class.getResource("/com/bmpl/dave/intro/exit.png")));
		mnFile.add(mntmExit);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	private void loadLoginScreen(){
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.setVisible(true);
	}
	private void loadRegisterScreen(){
		RegisterScreen registerScreen = new RegisterScreen();
		registerScreen.setVisible(true);
	}
}
