package stu.cn.ua.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "station")
public class Station {

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
    @Column(name = "longitude")
    @Getter
    @Setter
    private Double longitude;

    @NotNull
    @Column(name = "latitude")
    @Getter
    @Setter
    private Double latitude;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "route_station",
            joinColumns = @JoinColumn(name = "station_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "route_id", referencedColumnName = "id")
    )
    @Getter
    @Setter
    private List<Route> routes;

}
