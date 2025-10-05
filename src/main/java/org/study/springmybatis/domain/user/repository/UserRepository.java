package org.study.springmybatis.domain.user.repository;

import org.study.springmybatis.domain.user.entity.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(Long id);
}
