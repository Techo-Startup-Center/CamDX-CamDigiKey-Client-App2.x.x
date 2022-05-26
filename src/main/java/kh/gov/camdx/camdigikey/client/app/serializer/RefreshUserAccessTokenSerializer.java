package kh.gov.camdx.camdigikey.client.app.serializer;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RefreshUserAccessTokenSerializer {
    @NotNull(message = "Access token is mandatory")
    private String accessToken;
}
