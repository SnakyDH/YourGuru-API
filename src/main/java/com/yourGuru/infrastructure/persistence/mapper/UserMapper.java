package com.yourGuru.infrastructure.persistence.mapper;

import com.yourGuru.infrastructure.persistence.repository.UserRepository;
import com.yourGuru.domain.model.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring") // uses Other mapper that are used -> uses={ThingMapper.class}
public interface UserMapper {
    @Mappings({
            @Mapping(source = "atributoRepository", target = "AtributoDomain"),
            @Mapping(source = "atributoRepository", target = "AtributoDomain"),
            @Mapping(source = "atributoRepository", target = "AtributoDomain"),

    })
    User toUser(UserRepository userRepository);
    @InheritInverseConfiguration
    @Mapping(target = "cosaRepository", ignore = true)
    UserRepository toUserRepository(User user);
}
