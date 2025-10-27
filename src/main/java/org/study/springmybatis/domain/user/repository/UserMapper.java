package org.study.springmybatis.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.study.springmybatis.domain.user.entity.User;

import java.util.Optional;

@Mapper
public interface UserMapper {
    void save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
}
