package kh.gov.camdx.camdigikey.client.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import kh.gov.camdx.camdigikey.client.CamDigiKeyClient;
import kh.gov.camdx.camdigikey.client.app.serializer.*;
import kh.gov.camdx.camdigikey.client.exception.InvalidTokenSignatureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

@RestController
@RequestMapping
public class AuthenticationController {

    private final CamDigiKeyClient camDigiKeyClient;

    public AuthenticationController(CamDigiKeyClient camDigiKeyClient) {
        this.camDigiKeyClient = camDigiKeyClient;
    }

    @PostMapping("/")
    public ResponseEntity<HashMap<String, Object>> validateJwtToken(HttpServletRequest httpServletRequest, @Valid @RequestBody JwtValidationSerializer jwtValidationSerializer) {
        return new ResponseEntity<>(camDigiKeyClient.validateJwt(jwtValidationSerializer.getToken()), HttpStatus.OK);
    }

    @GetMapping("/login-token")
    public Object getLoginToken() throws InvalidTokenSignatureException {
        return new ResponseEntity<>(camDigiKeyClient.getLoginToken(), HttpStatus.OK);
    }

    @GetMapping("/organization-access-token")
    public Object getOrganizationAccessToken() throws InvalidTokenSignatureException {
        return new ResponseEntity<>(camDigiKeyClient.getOrganizationAccessToken(), HttpStatus.OK);
    }

    @PostMapping("/access-token")
    public Object getUserAccessToken(@Valid @RequestBody AccessTokenSerializer accessTokenSerializer) throws InvalidTokenSignatureException, UnsupportedEncodingException {
        return new ResponseEntity<>(camDigiKeyClient.getUserAccessToken(accessTokenSerializer.getAuthToken()), HttpStatus.OK);
    }

    @PostMapping("/refresh-user-access-token")
    public Object refreshUserAccessToken(@Valid @RequestBody RefreshUserAccessTokenSerializer refreshUserAccessTokenSerializer) throws InvalidTokenSignatureException {
        return new ResponseEntity<>(camDigiKeyClient.refreshUserAccessToken(refreshUserAccessTokenSerializer.getAccessToken()), HttpStatus.OK);
    }

    @PostMapping("/logout-access-token")
    public Object logoutAccessToken(@Valid @RequestBody LogoutAccessTokenSerializer logoutAccessTokenSerializer) {
        try {
            return new ResponseEntity<>(camDigiKeyClient.logoutAccessToken(logoutAccessTokenSerializer.getAccessToken()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/lookup-user-profile")
    public Object lookupUserProfile(@Valid @RequestBody LookupUserProfileSerializer lookupUserProfileSerializer) throws InvalidTokenSignatureException {
        return new ResponseEntity<>(camDigiKeyClient.lookupUserProfile(lookupUserProfileSerializer.getToken(), lookupUserProfileSerializer.getPersonalCode()), HttpStatus.OK);
    }

    @PostMapping("/verify-user-profile")
    public Object verifyUserProfile(@Valid @RequestBody AccountTokenSerializer accountTokenSerializer) throws InvalidTokenSignatureException {
        return new ResponseEntity<>(camDigiKeyClient.verifyAccountToken(accountTokenSerializer.getAccountToken()), HttpStatus.OK);
    }
}
