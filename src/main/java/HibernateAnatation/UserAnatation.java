package HibernateAnatation;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "user")
public class UserAnatation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private Long id;
    @Column(name = "first_name", length = 55)
    private String firstname;
    @Column(name = "last__name", length = 55)
    private String lastname;
    @Column(name = "age", length = 5)
    private int age;
/*
    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn (name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})*/
//@PrimaryKeyJoinColumn - для OneToOne
    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleAnatation role;

    public UserAnatation(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RoleAnatation getRole() {
        return role;
    }

    public void setRole(RoleAnatation role) {
        this.role = role;
    }
}
