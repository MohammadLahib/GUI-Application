import java.awt.*;
import java.awt.event.*;
import javax.swing.*;





public class MyFrame extends JFrame {  // JFrame is part of swing library 
	
    public MyFrame(){
        setBounds(100, 200, 240, 450);
        JPanel panel = new JPanel();
        JButton bt;
        panel.setLayout(null);
        setContentPane(panel);


        JLabel  side_1 = new JLabel();  // add control to the windows everything is text is label
        
        side_1.setText("Side 1 ");
        side_1.setBounds(12, 12, 230, 14);
        panel.add(side_1);
        // setContentPane(lblFirstName); // label added
       
        JLabel  side_2 = new JLabel();  // add control to the windows everything is text is label
        
        side_2.setText("Side 2");
        side_2.setBounds(12, 60, 230, 14);
        panel.add(side_2);
        
        JLabel  side_3 = new JLabel();  // add control to the windows everything is text is label
        
        side_3.setText("Side 3");
        side_3.setBounds(12, 110, 230, 14);
        panel.add(side_3);

        JTextField side1 = new JTextField();
        side1.setBounds(12, 30, 190, 20);
        panel.add(side1);
        
        JTextField side2 = new JTextField();
        side2.setBounds(12, 80, 190, 20);
        panel.add(side2);
        
        JTextField side3 = new JTextField();
        side3.setBounds(12, 130, 190, 20);
        panel.add(side3);
              

         bt =  new JButton();

        bt.setText("check");
		 JLabel label =  new JLabel("The result is ");
        bt.setBounds(80, 170, 130, 15);
        bt.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e){
        		try {
        		String s1 = side1.getText();
        		String s2 =  side2.getText();
        		String s3 =  side3.getText();
        		System.out.println(s1 + "," + s2 + "," + s3);
                Triangle result = new Triangle();
                label.setText("The result is " + result.computeType(s1, s2, s3));
        		}catch(Exception e1){
        			label.setText("The result is Uncorrect_Error");
        		}

            }

        });
        
//        bt.addActionListener((e) -> JOptionPane.showConfirmDialog(null, "lambda"));

        bt.setBounds(18, 200, 190 , 35);
        panel.add(bt);
        

        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        label.setBounds(10, 280, 200, 29);

        panel.add(label);
        
        
        

        // panel has a default layout
    }
}
