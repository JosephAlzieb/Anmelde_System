package de.infrastructure.infrastructure.db.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("gruppe")
public record GruppeDto(
        @Id
        Long id
) {
}
