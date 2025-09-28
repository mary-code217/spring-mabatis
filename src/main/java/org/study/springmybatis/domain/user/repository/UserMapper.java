package org.study.springmybatis.domain.user.repository;

import org.apache.ibatis.annotations.Mapper;
import org.study.springmybatis.domain.user.entity.User;

@Mapper
public interface UserMapper {

    void save(User user);
}
