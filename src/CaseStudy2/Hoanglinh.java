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


        add(hoangLinhDictionaryButton);
        add(textArea1);
        add(textArea2);
        add(textArea3);
        add(translateButton);
        add(repairWordButton);
        add(addNewWordButton);
        add(deleteWordButton);
        add(root);
        setTitle("Hoang linh Dictionary");
        setSize(400,500);
        setLocationRelativeTo(null);
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JTextArea getTextArea2() {
        return textArea2;
    }

    public void setTextArea2(JTextArea textArea2) {
        this.textArea2 = textArea2;
    }

    public JTextArea getTextArea3() {
        return textArea3;
    }

    public void setTextArea3(JTextArea textArea3) {
        this.textArea3 = textArea3;
    }
}
