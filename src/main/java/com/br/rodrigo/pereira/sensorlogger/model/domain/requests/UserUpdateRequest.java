package com.br.rodrigo.pereira.sensorlogger.model.domain.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateRequest {
    @NotNull
    private String name;
    @NotNull
    private String course;
    @NotNull
    private LocalDate birthday;
    @NotNull
    private String password;
}
