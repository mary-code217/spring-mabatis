package org.study.springmybatis.domain.user.repository;

import org.study.springmybatis.domain.user.entity.User;

public interface UserRepository {
    User save(User user);
}
