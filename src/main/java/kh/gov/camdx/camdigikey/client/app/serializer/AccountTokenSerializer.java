package kh.gov.camdx.camdigikey.client.app.serializer;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class AccountTokenSerializer {
    @NotNull(message = "User account lookup token is mandatory")
    private String accountToken;
}
