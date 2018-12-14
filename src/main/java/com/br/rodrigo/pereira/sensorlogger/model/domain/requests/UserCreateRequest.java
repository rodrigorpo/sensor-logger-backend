package com.br.rodrigo.pereira.sensorlogger.model.domain.requests;

import com.br.rodrigo.pereira.sensorlogger.model.domain.enums.Privileges;
import com.br.rodrigo.pereira.sensorlogger.model.domain.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {

    private String name;

    private String course;

    private LocalDate birthday;

    private UserStatus status;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Privileges privileges;
}
