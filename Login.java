//Loginpage
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Login{
    JFrame fob;
    JTextField t1,t2;
    JLabel l1,l2;
    JButton b1,b2;
    Login()
    {
        fob=new Frame("Login");
        fob.setLocation(200,200);
        fob.setSize(400,400);
        fob.setLayout(null);

        //intialize Label
        l1=new JLabel("User Email");
        l2=new JLabel("Password");

        //intialize TextField
        t1=new JTextField(20);
        t2=new JTextField(20);

        //intialize Jbutton
        b1=new Jbutton("Ok");
        b2=new JButton("Cancel");

        fob.add(l1);
        fob.add(t1);
        fob.add(l2);
        fob.add(t2);
        fob.add(b1);
        fob.add(b2);
        l1.setBounds(80,150,10,10);
        fob.setVisible(true);

    }
    public static void main(String args[])
    {
        new Login();
    }
}