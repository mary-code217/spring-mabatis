package org.study.springmybatis.domain.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.study.springmybatis.common.exception.config.DuplicateException;
import org.study.springmybatis.domain.user.entity.User;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserMapper userMapper;

    @Override
    public User save(User user) {
        userMapper.save(user);
        return user;
    }

    @Override
    public Optional<User> findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
