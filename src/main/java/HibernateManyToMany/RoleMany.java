package HibernateManyToMany;

import java.util.HashSet;
import java.util.Set;

public class RoleMany {
    private Long id;
    private String title;
    private Set <UserMany> users = new HashSet<UserMany>();
    public RoleMany(){

    }
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

    public Set<UserMany> getUsers() {
        return users;
    }

    public void setUsers(Set<UserMany> users) {
        this.users = users;
    }

}
