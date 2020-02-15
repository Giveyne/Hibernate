package HibernateManyToMany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
public class UserMany implements Serializable {

    private Long id;

    private int age;
    private String firstname;
    private String lastname;
    private Set <RoleMany> roles;
    public UserMany(){

    }
    public UserMany(Long id){
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

    public Set<RoleMany> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleMany> roles) {
        this.roles = roles;
    }

}
