package se.kth.sda.skeleton.posts;
import javax.persistence.*;
import java.util.List;

// @TODO add Hibernate annotations
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //the field:

    private Long id;
    private String body;

    public Post() {
    }

    public Post(String body) {
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
