package de.infrastructure.infrastructure.db.dto;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("user")
public record UserDto(
        @Column("gihub")
        String gihubHandle,

        String name,

        @Column("matrikelnummer")
        String matrikelNummer
) {
}
