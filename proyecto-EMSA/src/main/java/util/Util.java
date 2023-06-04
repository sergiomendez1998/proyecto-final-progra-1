package util;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

}
