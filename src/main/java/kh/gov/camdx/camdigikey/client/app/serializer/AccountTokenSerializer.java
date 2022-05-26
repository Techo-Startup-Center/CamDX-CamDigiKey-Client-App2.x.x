package kh.gov.camdx.camdigikey.client.app.serializer;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AccountTokenSerializer {
    @NotNull(message = "User account lookup token is mandatory")
    private String accountToken;
}
