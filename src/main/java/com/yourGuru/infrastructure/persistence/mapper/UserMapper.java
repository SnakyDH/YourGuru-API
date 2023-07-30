package com.yourGuru.infrastructure.persistence.mapper;


import com.yourGuru.domain.model.User;
import com.yourGuru.infrastructure.persistence.entities.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {RolMapper.class})
public interface UserMapper {
    @Mapping(source = "userName", target = "name")
    User toUser(UserEntity userEntity);
    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);
}
