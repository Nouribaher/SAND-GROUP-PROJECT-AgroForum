package se.kth.sda.skeleton.posts;
import se.kth.sda.skeleton.comments.Comment;

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


    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE,mappedBy = "commentedPost")
    private List<Comment> postCommentList;


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

    public List<Comment> getPostCommentList() {
        return postCommentList;
    }

    public void setPostCommentList(List<Comment> postCommentList) {
        this.postCommentList = postCommentList;
    }


    public void updatePost(Post updatedPost){
        this.body=updatedPost.body;
    }

}
