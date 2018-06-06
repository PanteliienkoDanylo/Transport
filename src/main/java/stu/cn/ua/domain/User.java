package stu.cn.ua.domain;


import lombok.Getter;
import lombok.Setter;
import stu.cn.ua.domain.enumeration.Role;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @NotNull
    @Column(name = "id")
    @Getter
    @Setter
    private Long id;

    @NotNull
    @Column(name = "login")
    @Getter
    @Setter
    private String login;

    @NotNull
    @Column(name = "password")
    @Getter
    @Setter
    private String password;

    @NotNull
    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @NotNull
    @Column(name = "balance")
    @Getter
    @Setter
    private Double balance;

    @NotNull
    @Column(name = "role")
    @Getter
    @Setter
    private Role role;

    @Column(name = "firstname")
    @Getter
    @Setter
    private String firstName;

    @Column(name = "secondname")
    @Getter
    @Setter
    private String secondName;

    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    @Getter
    @Setter
    private Date birthday;

    @OneToMany(mappedBy = "user", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Comment> comments;

}
