package stu.cn.ua.domain;


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
    private Long id;

    @NotNull
    @Column(name = "login")
    private String login;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "balance")
    private Double balance;

    @NotNull
    @Column(name = "role")
    private Role role;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;


    @OneToMany(mappedBy = "user", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Comment> comments;

    public User() {
    }

    public User(String login, String password, String email, Double balance, String firstName, String secondName, Date birthday, Role role) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.balance = balance;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.role = role;
    }

    public User(Long id, String login, String password, String email, Double balance, String firstName, String secondName, Date birthday, Role role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.balance = balance;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.role = role;
    }

    public User(Long id, String login, String password, String email, Double balance, String firstName, String secondName, Date birthday, Role role, List<Transaction> transactions, List<Comment> comments) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.balance = balance;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.role = role;
        this.transactions = transactions;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
