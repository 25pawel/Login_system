import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {
    JFrame frame;
    JTextField loginTextField, passwordTextField;
    JButton loginButton;

    Font myFont = new Font("ink Free", Font.BOLD, 30);

    App(){
        frame = new JFrame("Sign in System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,350);
        frame.setLayout(null);

        loginTextField = new JTextField();
        loginTextField.setBounds(50,50,300,50);
        loginTextField.setFont(myFont);
        loginTextField.setEditable(true);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(50,150,300,50);
        passwordTextField.setFont(myFont);
        passwordTextField.setEditable(true);

        loginButton = new JButton("LogIn");
        loginButton.addActionListener(this);
        loginButton.setBounds(100,250,200,35);
        loginButton.setFont(myFont);
        loginButton.setFocusable(false);

        frame.add(loginButton);
        frame.add(loginTextField);
        frame.add(passwordTextField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        App loginSystem = new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == loginButton){
            if(loginTextField.getText().equals("Pawel") && passwordTextField.getText().equals("Wojcik")){
                System.out.println("Zalogowano pomyslnie\n");
            }
            else{
                System.out.println("Podano bledny login/haslo\n");
            }
        }
    }
}
