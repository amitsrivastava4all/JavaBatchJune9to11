import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AnyDownloader extends JFrame {
	JLabel preview = new JLabel("");
	private JPanel contentPane;
	private JTextField textField;
	JLabel showPath = new JLabel("");
	JButton btnDownload = new JButton("Download");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnyDownloader frame = new AnyDownloader();
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
	public AnyDownloader() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnChooseSaveLocation = new JButton("Choose Save Location");
		btnChooseSaveLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showLocation();
			}
		});
		btnChooseSaveLocation.setBounds(6, 87, 233, 29);
		contentPane.add(btnChooseSaveLocation);
		
		textField = new JTextField();
		textField.setToolTipText("Enter the URL");
		textField.setBounds(24, 28, 392, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		btnDownload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			doDownloading();
			}
		});
		
		
		btnDownload.setEnabled(false);
		btnDownload.setBounds(266, 87, 117, 29);
		contentPane.add(btnDownload);
		
		
		showPath.setBounds(102, 116, 338, 16);
		contentPane.add(showPath);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 164, 452, 375);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(preview);
		
		JLabel lblPreview = new JLabel("Preview");
		lblPreview.setBounds(24, 140, 61, 16);
		contentPane.add(lblPreview);
	}
	
	private void doDownloading(){
		String url = textField.getText();
		try {
			String result = Downloader.doDownload(url, path);
			JOptionPane.showMessageDialog(this, result);
			File file = new File(Downloader.fullPath);
			ImageIcon img = new ImageIcon(file.toURL());
			preview.setIcon(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Some Problem During Download...");
			
		}
	}
	String path ="";
	private void showLocation(){
		JFileChooser file = new JFileChooser("/Users/amit/Documents");
		file.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		file.showOpenDialog(this);
		
		
		if(file.getSelectedFile().getPath()!=null ){
			path = file.getSelectedFile().getPath();
			showPath.setText(path);
			btnDownload.setEnabled(true);
			
		}
	}
}
