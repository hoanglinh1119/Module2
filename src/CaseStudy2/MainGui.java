package CaseStudy2;

import javax.swing.*;

public class MainGui {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Hoanglinh hoanglinh=new Hoanglinh();
        hoanglinh.setVisible(true);
    }
}
