package org.example.commandes.order.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
