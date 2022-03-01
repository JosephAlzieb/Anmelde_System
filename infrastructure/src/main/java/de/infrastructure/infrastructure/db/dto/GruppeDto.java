package de.infrastructure.infrastructure.db.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Table("gruppe")
public class GruppeDto {
        @Id
        Long id;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        @MappedCollection(idColumn = "gruppeId")
        private Set<UserDto> users;


        public GruppeDto() {
        }

        public Set<UserDto> getUsers() {
                return users;
        }

        public void setUsers(Set<UserDto> users) {
                this.users = users;
        }
}
