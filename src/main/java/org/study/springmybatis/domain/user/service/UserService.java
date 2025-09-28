package org.study.springmybatis.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.springmybatis.domain.user.dto.UserSaveRequest;
import org.study.springmybatis.domain.user.entity.User;
import org.study.springmybatis.domain.user.repository.UserRepositoryImpl;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepositoryImpl userRepository;

    public void saveUser(UserSaveRequest request) {
        userRepository.save(User.create(request.getUsername(), request.getPassword()));
    }

}
