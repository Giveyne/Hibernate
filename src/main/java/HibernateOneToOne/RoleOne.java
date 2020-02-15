package HibernateOneToOne;

public class RoleOne {
    private Long id;
    private String title;
    private UserOne userone;
    public RoleOne(){

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

    public UserOne getUserone() {
        return userone;
    }

    public void setUserone(UserOne userone) {
        this.userone = userone;
    }
}
