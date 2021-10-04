import javax.swing.*;

public class App extends JFrame{
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
        @Override
            public void run() {
            new Ventana().setVisible(true);
        }
        });


    }}