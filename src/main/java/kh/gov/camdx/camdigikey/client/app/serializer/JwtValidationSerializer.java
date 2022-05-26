package kh.gov.camdx.camdigikey.client.app.serializer;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class JwtValidationSerializer {
    @NotNull(message = "JWT Token is mandatory")
    private String token;
}
