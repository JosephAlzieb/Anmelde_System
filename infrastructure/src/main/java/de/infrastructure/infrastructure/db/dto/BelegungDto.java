package de.infrastructure.infrastructure.db.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("belegung")
public record BelegungDto (
        @Id
        Long Id,
        Long terminId,
        Long gruppeId
){
}
