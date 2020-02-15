package HibernateOneToOne;

import java.io.Serializable;

public class UserOne implements Serializable {

    private Long id;

    private int age;
    private String firstname;
    private String lastname;
    private RoleOne roleone;
    public UserOne(){

    }
    public UserOne(Long id){
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public RoleOne getRoleone() {
        return roleone;
    }

    public void setRoleone(RoleOne roleone) {
        this.roleone = roleone;
    }
}
