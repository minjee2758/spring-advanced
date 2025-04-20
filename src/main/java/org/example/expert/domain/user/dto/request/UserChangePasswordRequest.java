package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    /*
    @Pattern식으로 새로운 비밀번호로 바꿀 때 제약조건 설정
     */

    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d).{8,}$", message = "새 비밀번호는 8자 이상이며 숫자와 대문자를 포함해야 합니다.")
    private String newPassword;
}
