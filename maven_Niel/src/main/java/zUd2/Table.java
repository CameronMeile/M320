package zUd2;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

class Table {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        String[] columnNames = {"Name", "Age", "Student"};
        Object[][] data = {
                {"Ken", new Integer(5), new Boolean(false)},
                {"Tom", new Integer(3), new Boolean(true)},
                {"Susam", new Integer(2), new Boolean(false)},
                {"Mark",new Integer(20), new Boolean(true)},
                {"Joe", new Integer(10), new Boolean(false)}
        };
        JTable table = new JTable(data, columnNames);
        frame.add(table);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}