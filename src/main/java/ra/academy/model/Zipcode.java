package ra.academy.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "zipcode")
public class Zipcode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "zipcode")
    private List<Author> authorList;
    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Zipcode() {
    }

    public Zipcode(Long id, String name, List<Author> authorList, City city) {
        this.id = id;
        this.name = name;
        this.authorList = authorList;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
