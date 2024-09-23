package kh.gov.camdx.camdigikey.client.app.serializer;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LogoutAccessTokenSerializer {
    @NotNull(message = "Access token is mandatory")
    private String accessToken;
}
