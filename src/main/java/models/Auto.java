package models;


import javax.persistence.*;


@Entity
@Table(name = "autos")
public class Auto {
    private static int count;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autos_id")
    private Integer autosId;

    @Column(name = "model")
    private String model;

    @Column (name = "color")
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private User user;

    public Auto() {

    }

    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public int getAutosId() {
        return autosId;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setAutosId(int autosId) {
        this.autosId = autosId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return color + " " + model;
    }
}
