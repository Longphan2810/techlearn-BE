package com.techzen.techlearn.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDTO {
    @NotBlank(message = "FULL_NAME_INVALID")
    String userName;
    @NotNull(message = "AGE_NOT_NULL")
    Integer age;
}
