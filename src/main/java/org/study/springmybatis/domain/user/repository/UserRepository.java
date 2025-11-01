package org.study.springmybatis.domain.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.study.springmybatis.domain.user.entity.User;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final UserMapper userMapper;

    public User save(User user) {
        userMapper.save(user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return userMapper.findById(id);
    }

    public Optional<User> findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
