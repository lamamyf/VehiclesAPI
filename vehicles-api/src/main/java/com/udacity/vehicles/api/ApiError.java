package com.udacity.vehicles.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Declares methods to return errors and other messages from the API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
record ApiError(String message, List<String> errors) {

    public String getMessage() {
        return message;
    }

    public List<String> getErrors() {
        return errors;
    }
}
