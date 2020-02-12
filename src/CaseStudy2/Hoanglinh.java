package CaseStudy2;

import javax.swing.*;

public class Hoanglinh extends JFrame{
    private JButton hoangLinhDictionaryButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel root;
    private JTextArea textArea3;
    private JButton translateButton;
    private JButton repairWordButton;
    private JButton addNewWordButton;
    private JButton deleteWordButton;

    public Hoanglinh(){
        add(root);
        setTitle("Hoang linh Dictionary");
        setSize(400,500);
        setLocationRelativeTo(null);
    }
}
