package com.blogspot.devnip.lombok.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Pet {

    private final String id;
    private final String name;
    private final PetType type;

    public enum PetType {
        DOG,
        CAT
    }

    /**
     * Customized builder. Rest of the builder code will be generated by Lombok.
     */
    public static class PetBuilder {

        private PetType type;

        public PetBuilder type(String typeStr) {
            this.type = PetType.valueOf(typeStr);
            return this;
        }
    }
}