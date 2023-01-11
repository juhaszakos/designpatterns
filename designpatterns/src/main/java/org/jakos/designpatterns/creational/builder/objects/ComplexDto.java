package org.jakos.designpatterns.creational.builder.objects;

import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@ToString
public class ComplexDto {
    private String name;
    private String address;
    private List<Integer> points;
    private Boolean active;
    private LocalDateTime lastLogin;
    private LocalDateTime activeSince;

    private ComplexDto() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String address;
        private List<Integer> points;
        private Boolean active;
        private LocalDateTime lastLogin;
        private LocalDateTime activeSince;

        private Builder() {}

        public ComplexDto build() {
            ComplexDto dto = new ComplexDto();
            dto.name = this.name;
            dto.address = this.address;
            dto.points = this.points;
            dto.active = this.active;
            dto.lastLogin = this.lastLogin;
            dto.activeSince = this.activeSince;
            return dto;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder point(List<Integer> points) {
            this.points = points;
            return this;
        }

        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Builder lastLogin(LocalDateTime lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public Builder activeSince(LocalDateTime activeSince) {
            this.activeSince = activeSince;
            return this;
        }
    }
}
