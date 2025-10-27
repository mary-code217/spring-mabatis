package org.study.springmybatis.domain.user.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {

    @NotEmpty(message = "username은 필수 값 입니다.")
    @Size(min = 2, max = 12)
    private String username;

    @NotEmpty(message = "password는 필수 값 입니다.")
    @Size(min = 6, max = 20)
    private String password;
}
