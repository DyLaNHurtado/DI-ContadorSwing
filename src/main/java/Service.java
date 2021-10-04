import javax.swing.*;

public class Service {

    public void incrementValue(JLabel pantalla){

        //Accede al texto lo paso a int lo sumo 1 y lo paso a String
        //Cambio el texto del JLabel + 1
        pantalla.setText(String.valueOf(Integer.parseInt(pantalla.getText())+1));
    }


    public void decrementValue(JLabel pantalla){
        //Cambio el texto del JLabel - 1
        pantalla.setText(String.valueOf(Integer.parseInt(pantalla.getText())-1));
    }

    public void setSystemLookAndFeel(){
        System.setProperty("apple.awt.application.appearance", "system");
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}
