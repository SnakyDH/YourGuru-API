package com.yourGuru.infrastructure.persistence.mapper;

import com.yourGuru.domain.model.Rol;
import com.yourGuru.infrastructure.persistence.entities.RolEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RolMapper {
    @Mappings({
            @Mapping(source = "rol", target = "text"),
            @Mapping(source = "id", target = "id")
    })
    Rol toRol(RolEntity rolEntity);
    @InheritInverseConfiguration
    @Mapping(target = "users", ignore = true)
    RolEntity toRolEntity(Rol rol);
}
