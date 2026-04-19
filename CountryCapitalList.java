package A5;
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalList {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        JList<String> list = new JList<>(countries);
        JScrollPane sp = new JScrollPane(list);

        // Capital mapping
        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington D.C.");
        map.put("India", "New Delhi");
        map.put("Vietnam", "Hanoi");
        map.put("Canada", "Ottawa");
        map.put("Denmark", "Copenhagen");
        map.put("France", "Paris");
        map.put("Great Britain", "London");
        map.put("Japan", "Tokyo");
        map.put("Africa", "Addis Ababa"); // as per your expected output
        map.put("Greenland", "Nuuk");
        map.put("Singapore", "Singapore");

        // Listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String country = list.getSelectedValue();
                    String capital = map.get(country);

                    System.out.println("Capital of " + country + " is: " + capital);
                }
            }
        });

        frame.add(sp);
        frame.setVisible(true);
    }
}