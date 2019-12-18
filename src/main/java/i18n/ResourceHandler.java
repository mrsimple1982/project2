package i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceHandler {

	private static ResourceBundle resourceBundle;
	private static MessageFormat formatter;

	private ResourceHandler() {}

	private static void initialize() {
		Locale locale = Locale.getDefault();

		resourceBundle = ResourceBundle.getBundle("i18n/MessageBundle", locale);
		formatter = new MessageFormat("");
		formatter.setLocale(locale);
	}

	public static String getMessage(final String key, final Object... args) {
		if (resourceBundle == null || formatter == null) {
			initialize();
		}

		formatter.applyPattern(resourceBundle.getString(key));
		return formatter.format(args);
	}

}
