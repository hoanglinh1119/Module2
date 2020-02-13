package CaseStudy2.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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

    public Hoanglinh() {
        final String src="anhviet109K.txt";
        HashMap<String,String>dictionary=new HashMap<>();
        SupportController hoangLinhController=new SupportController();
        IOFileSupport ioFileSupport=new IOFileSupport();
         ioFileSupport.readFile(src,dictionary);
        ArrayList<String>arrayList=new ArrayList<>();
        add(root);
        setTitle("Hoang linh Dictionary");
        setSize(400,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String string=getTextArea1().getText();
              if (!"".equals(getTextArea1().getText())){
                  textArea3.setText(ControllerDict.translateWordInDict(dictionary););

              }
            }
        });


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
