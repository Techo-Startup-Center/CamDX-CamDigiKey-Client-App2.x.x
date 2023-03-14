package kh.gov.camdx.camdigikey.client.app.serializer;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class AccessTokenSerializer {
    @NotNull(message = "authToken is mandatory")
    private String authToken;
}
