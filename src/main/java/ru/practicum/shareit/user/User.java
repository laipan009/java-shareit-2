package ru.practicum.shareit.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * TODO Sprint add-controllers.
 */

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {
    private Integer id;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
