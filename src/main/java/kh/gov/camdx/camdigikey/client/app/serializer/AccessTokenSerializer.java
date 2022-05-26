package kh.gov.camdx.camdigikey.client.app.serializer;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccessTokenSerializer {
    @NotNull(message = "authToken is mandatory")
    private String authToken;
}
