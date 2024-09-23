package kh.gov.camdx.camdigikey.client.app.serializer;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LookupUserProfileSerializer {
    @NotNull(message = "JWT Token is mandatory")
    private String token;
    @NotNull(message = "Owner personal code is mandatory")
    private String personalCode;
}
