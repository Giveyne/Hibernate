package HibernateAnatation;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "role")
public class RoleAnatation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 11)
    private Long id;

    @Column(name = "title", length = 50)
    private String title;

    @ManyToMany(mappedBy = "roles")
    private Set<UserAnatation> users = new HashSet<UserAnatation>();
    public RoleAnatation(){ }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<UserAnatation> getUsers() {
        return users;
    }

    public void setUsers(Set<UserAnatation> users) {
        this.users = users;
    }
}
