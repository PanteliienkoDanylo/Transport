package stu.cn.ua.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @NotNull
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;

    @JoinColumn(name = "transport_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Transport transport;

    @NotNull
    @Column(name = "text")
    private String text;

    public Comment() {
    }

    public Comment(User user, Transport transport, String text) {
        this.user = user;
        this.transport = transport;
        this.text = text;
    }

    public Comment(Long id, User user, Transport transport, String text) {
        this.id = id;
        this.user = user;
        this.transport = transport;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
