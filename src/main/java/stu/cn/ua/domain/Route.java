package stu.cn.ua.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @NotNull
    @Getter
    @Setter
    private Long id;

    @NotNull
    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date startTime;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date endTime;


    @ManyToMany(mappedBy = "routes", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Station> stations;

    @OneToMany(mappedBy = "route", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<Transport> transports;

}
