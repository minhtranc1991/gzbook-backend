package com.gzbook.model.payload.request;

import com.gzbook.email.ValidEmail;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class SignupRequest {
    @NotBlank
    @Size(min = 2, max = 20)
    private String username;

    @NotBlank
    @Size(max = 20)
    private String gender;

    @NotBlank
    @Size(max = 50)
    @ValidEmail
    private String email;

    private Set<String> role;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    public SignupRequest() {
    }

    public SignupRequest(@NotBlank @Size(min = 2, max = 20) String username, @NotBlank @Size(max = 20) String gender, @NotBlank @Size(max = 50) String email, Set<String> role, @NotBlank @Size(min = 6, max = 20) String password) {
        this.username = username;
        this.gender = gender;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
