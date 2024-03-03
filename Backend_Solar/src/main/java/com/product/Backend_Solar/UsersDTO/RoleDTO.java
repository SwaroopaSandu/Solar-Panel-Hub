package com.product.Backend_Solar.UsersDTO;

public class RoleDTO {

    private String roleName;
    private String roleDescription;



    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }


    public RoleDTO(String role, String roleName, String roleDescription) {

        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }


    public RoleDTO() {
    }


    @Override
    public String toString() {
        return "RoleDTO{" +

                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }

}
