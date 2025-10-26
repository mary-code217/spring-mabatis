package org.study.springmybatis.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.springmybatis.domain.user.dto.UserDetailResponse;
import org.study.springmybatis.domain.user.dto.UserSaveRequest;
import org.study.springmybatis.domain.user.entity.User;
import org.study.springmybatis.domain.user.repository.UserRepositoryImpl;
import org.study.springmybatis.util.exception.NotFoundException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepositoryImpl userRepository;

    public void saveUser(UserSaveRequest request) {
        userRepository.save(User.create(request.getUsername(), request.getPassword()));
    }

    public UserDetailResponse findById(Long id) {
        User findUser = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User Not Found"));

        return UserDetailResponse.of(findUser.getId(), findUser.getUsername());
    }

}
