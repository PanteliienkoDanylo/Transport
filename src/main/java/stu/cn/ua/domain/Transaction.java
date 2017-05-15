package stu.cn.ua.domain;


import java.util.Date;

public class Transaction {

    private Long id;
    private User user;
    private Transport transport;
    private Date dateTime;

    public Transaction() {
    }

    public Transaction(User user, Transport transport, Date dateTime) {
        this.user = user;
        this.transport = transport;
        this.dateTime = dateTime;
    }

    public Transaction(Long id, User user, Transport transport, Date dateTime) {
        this.id = id;
        this.user = user;
        this.transport = transport;
        this.dateTime = dateTime;
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

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
