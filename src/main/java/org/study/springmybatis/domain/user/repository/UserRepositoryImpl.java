package org.study.springmybatis.domain.user.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.study.springmybatis.domain.user.entity.User;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserMapper userMapper;

    @Override
    public User save(User user) {
        userMapper.save(user);
        return user;
    }
}
