package com.mycompany.myapp.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.RoleAuthority} entity.
 */
public class RoleAuthorityDTO implements Serializable {

    @NotNull
    private String authority;

    @NotNull
    private String roleName;

    public String getAuthority(){
        return this.authority;
    }

    public void setAuthority(String authority){
        this.authority = authority;
    }

    public String getRoleName(){
        return this.roleName;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RoleAuthorityDTO roleAuthorityDTO = (RoleAuthorityDTO) o;
        if (roleAuthorityDTO.getAuthority() == null && getAuthority() == null &&
            roleAuthorityDTO.getRoleName() == null && getRoleName() == null){
            return false;
        }
        return Objects.equals(getAuthority(), roleAuthorityDTO.getAuthority()) &&
            Objects.equals(getRoleName(), roleAuthorityDTO.getRoleName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(authority, roleName);
    }

    @Override
    public String toString() {
        return "RoleAuthorityDTO{" +
            ", authority='" + getAuthority() + "'" +
            ", roleName='" + getRoleName() + "'" +
            "}";
    }
}
