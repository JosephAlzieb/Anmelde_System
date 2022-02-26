package de.infrastructure.infrastructure.db.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("termin")
public record TerminDto (
        @Id
        Long id,
        @Column("anmeldefrist")
        String anmeldeFrist,
        String von,
        String bis,
        String titel
){
}
