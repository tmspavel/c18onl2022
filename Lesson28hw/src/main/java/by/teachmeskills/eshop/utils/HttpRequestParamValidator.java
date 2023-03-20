package by.teachmeskills.eshop.utils;

import static org.apache.commons.lang3.StringUtils.isBlank;

import by.teachmeskills.eshop.exceptions.ValidationException;

public class HttpRequestParamValidator {

    private static final String REQUEST_PARAMETER_IS_NULL_ERROR = "Request parameter is not initialized!";

    public static void validateParam(String param) throws ValidationException {
        if (isBlank(param)) {
            throw new ValidationException(REQUEST_PARAMETER_IS_NULL_ERROR);
        }
    }
}
