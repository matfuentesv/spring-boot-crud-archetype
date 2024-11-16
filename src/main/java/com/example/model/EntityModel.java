package com.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "EntityModel")
@AllArgsConstructor
@NoArgsConstructor
public class EntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    @NotBlank(message = "No puede value un title vacio")
    @NotNull(message = "No puede value un title nulo")
    private String value;

    private EntityModel(Builder builder) {
        this.id = builder.id;
        this.value = builder.value;

    }

    public static class Builder {
        private Long id;
        private String value;


        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }



        public EntityModel build() {
            return new EntityModel(this);
        }
    }

}
