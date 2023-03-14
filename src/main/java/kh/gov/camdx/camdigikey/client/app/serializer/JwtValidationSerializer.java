package kh.gov.camdx.camdigikey.client.app.serializer;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class JwtValidationSerializer {
    @NotNull(message = "JWT Token is mandatory")
    private String token;
}
