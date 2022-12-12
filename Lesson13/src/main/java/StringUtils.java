import lombok.experimental.UtilityClass;

@UtilityClass
public class StringUtils {

    public static boolean isBlank(CharSequence cs) {
        int strLen = length(cs);
        if (strLen == 0) {
            return true;
        } else {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }

    private static int length(CharSequence cs) {
        return cs == null ? 0 : cs.length();
    }
}
