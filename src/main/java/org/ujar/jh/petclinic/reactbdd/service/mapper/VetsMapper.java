package org.ujar.jh.petclinic.reactbdd.service.mapper;

import org.mapstruct.*;
import org.ujar.jh.petclinic.reactbdd.domain.Vets;
import org.ujar.jh.petclinic.reactbdd.service.dto.VetsDTO;

/**
 * Mapper for the entity {@link Vets} and its DTO {@link VetsDTO}.
 */
@Mapper(componentModel = "spring")
public interface VetsMapper extends EntityMapper<VetsDTO, Vets> {}
