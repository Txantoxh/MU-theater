import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class MUTheater1 extends JFrame{
  private JLabel fullNameLabel,gasLabel,carLabel,numberOfTicketsLabel,gasLabel2,gasLabel3 ;
  private JTextField fullNameTextField;
  private JPanel centerPanel,eastPanel,southPanel,westPanel, westPanel2,centerPanel2,northPanel;
  private ImageIcon carIcon , gasIcon;
  private JCheckBox price; 
  private JButton pay,  clear;
  private JRadioButton maleButton, femaleButton;
  private JComboBox stateBox;
  
   public MUTheater1 (){
  
   //west Panel  
   gasIcon = new ImageIcon("poster1.jpg"); // if we want the image first the code of image should be written at first.
   gasLabel = new JLabel(gasIcon);
   gasLabel2= new  JLabel(" ");
   gasLabel3 = new JLabel(" ");
   centerPanel =new JPanel();
   centerPanel.add(gasLabel);
   maleButton = new JRadioButton("");
   centerPanel2 = new JPanel();
   centerPanel2.add(maleButton);
   add(centerPanel, BorderLayout.CENTER);
   //add(centerPanel2, BorderLayout.CENTER);

  carIcon = new ImageIcon("poster2.jpg"); // if we want the image first the code of image should be written at first.
  carLabel = new JLabel(carIcon);
  eastPanel =new JPanel();
  eastPanel.add(carLabel);
  add(eastPanel, BorderLayout.EAST);
  
 numberOfTicketsLabel = new JLabel ("Number of Ticket(s): $10/Ticket");
  String ticketList[]= { " ", "1", "2" , "3", "4" , "5"};
  stateBox = new JComboBox(ticketList);
  northPanel= new JPanel();
  northPanel.add(numberOfTicketsLabel);
  northPanel.add(stateBox);
  add(northPanel, BorderLayout.NORTH);
  
 
  

  
pay= new JButton("Reserve");
clear= new JButton("cancel");
southPanel = new JPanel();
southPanel.add(pay);
southPanel.add(clear);
add(southPanel, BorderLayout.SOUTH);
setVisible(true);
setSize(500, 500); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
   
public static void main (String[]args)// creating the method
{
MUTheater1 app = new MUTheater1();// execute DeliveryService1Example
}// end of main method.
} //end of the class GuiExample.

  