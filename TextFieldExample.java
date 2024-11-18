import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


class TextFieldExample    
{    
    public static void main(String args[])    
    {    
        // Creating a JFrame object with title "TextField Example."  
        JFrame f= new JFrame("TextField Example");   
        
        JButton b=new JButton("Click Here");  
       
        
        // Creating two JTextField objects  
        JTextField t1, t2,t3,t4,t5;    
        // Initializing the first JTextField with default text "Welcome to Javatpoint."  
        t1 = new JTextField("Welcome to Javatpoint.");    
        // Setting the position and size of the first JTextField  
        t1.setBounds(50,100, 200,30);    
        // Initializing the second JTextField with default text "AWT Tutorial"  
        t2 = new JTextField("AWT Tutorial");    
        // Setting the position and size of the second JTextField  
        t2.setBounds(50,150, 200,30);    

        t3 = new JTextField("Get ready to learn");
        t3.setBounds(50,200, 200,30);

        t4 = new JTextField("Awt is Nice to handle");
        t4.setBounds(50,250, 200,30);

        t5 = new JTextField("JFrame is nice");
        t5.setBounds(50,300, 200,30);

        

        b.setBounds(100,400,100,30);  
        f.add(b);  

        // Adding JTextFields to the JFrame  
        f.add(t1);  
        f.add(t2);  
        f.add(t3);
        f.add(t4);
        f.add(t5);
        
        // Setting the size of the JFrame  
        f.setSize(500,500);    
        // Setting layout to null to use absolute positioning  
        f.setLayout(null);    
       
        // Making the JFrame visible  
        f.setVisible(true);    
    }    
}    
