package util;

import java.awt.BorderLayout;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Util {
    private static final SimpleDateFormat _yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");

    public static java.sql.Date convertidortoSql(Date uDate) {
        Date sDate = new Date(uDate.getTime());
        return sDate;
    }

    public static Date getDateFromYYYYMMDD(String dateAsString) {
        try {
            Date date = (Date) _yyyyMMdd.parse(dateAsString);
            return date;
        } catch (ParseException ex) {
            return null;
        }
    }

    public static String getStringFromDate(Date date) {
        return _yyyyMMdd.format(date);
    }

    public static String generateRandomNoTicket() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        Random random = new Random();

        String randomLetters = IntStream.range(0, 5)
                .mapToObj(i -> letters.charAt(random.nextInt(letters.length())))
                .map(c -> Character.toString(c))
                .collect(Collectors.joining());

        String randomNumbers = IntStream.range(0, 3)
                .mapToObj(i -> numbers.charAt(random.nextInt(numbers.length())))
                .map(c -> Character.toString(c))
                .collect(Collectors.joining());

        return (randomLetters + randomNumbers).toUpperCase();
    }

    public static Time convertStringToTime(String time) {
        return Time.valueOf(time);
    }

    public static Date convertStringToDate(String date) {
        return Date.valueOf(date);
    }
    
    public static boolean isValidEmail(String email){
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public static String removeSpaces(String text) {
        return text.replaceAll("\\s", "");
    }
    
    public static void changePanel(JPanel panelName, JPanel content) {
        panelName.setSize(920, 470);
        panelName.setLocation(60, 0);

        content.removeAll();
        content.add(panelName, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
        public static  void cleanTable(JTable tabla) {
        try {
            DefaultTableModel tbl = (DefaultTableModel) tabla.getModel();
            int a = tabla.getRowCount() - 1;
            for (int i = a; i >= 0; i++) {
                tbl.removeRow(tabla.getRowCount() - 1);
            }
        } catch (Exception e) {
        }
    }

}
