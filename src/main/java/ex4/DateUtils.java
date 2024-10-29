package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	/**
	 * @param date : date à formater
	 * @return date formatée par défaut
	 */
	public static String format(Date date) {
		return format("dd/MM/yyyy HH:mm:ss", date);
	}

	/**
	 * @param pattern : pattern de formatage de la date
	 * @param date : date à formater
	 * @return date formatée selon le pattern
	 */
	public static String format(String pattern, Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
}
