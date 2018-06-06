package stu.cn.ua.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @NotNull
    @Getter
    @Setter
    private Long id;

    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private User user;

    @JoinColumn(name = "transport_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Transport transport;

    @Column(name = "date_time")
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date dateTime;

}
