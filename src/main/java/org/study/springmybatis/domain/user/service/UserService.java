package org.study.springmybatis.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.study.springmybatis.common.exception.config.DuplicateException;
import org.study.springmybatis.domain.user.dto.UserDetailResponse;
import org.study.springmybatis.domain.user.dto.UserCreateRequest;
import org.study.springmybatis.domain.user.entity.User;
import org.study.springmybatis.domain.user.repository.UserRepositoryImpl;
import org.study.springmybatis.common.exception.NotFoundException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepositoryImpl userRepository;

    public void saveUser(UserCreateRequest request) {
        if(userRepository.findByUsername(request.getUsername()).isPresent()) {
            throw new DuplicateException("Duplicate username : " + request.getUsername());
        }

        userRepository.save(User.create(request.getUsername(), request.getPassword()));
    }

    public UserDetailResponse findById(Long id) {
        User findUser = userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User Not Found"));

        return UserDetailResponse.of(findUser.getId(), findUser.getUsername());
    }

}
