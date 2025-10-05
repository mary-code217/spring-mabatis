package org.study.springmybatis.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserDetailResponse {
    private Long id;
    private String username;

    public static UserDetailResponse of(Long id, String username){
        return UserDetailResponse.builder()
                .id(id)
                .username(username)
                .build();
    }
}
