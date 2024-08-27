import javax.swing.*;
public class Label{
public static void main(String[] args){
JFrame f = new JFrame("BUTTON");
JLabel b = new JLabel("JAVA");
b.setBounds(100,150,100,50);
f.add(b);
f.setSize(600,400);
f.setLayout(null);
f.setVisible(true);

}
}