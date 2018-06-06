package stu.cn.ua.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "transport")
public class Transport {

    @Id
    @NotNull
    @Getter
    @Setter
    private Long id;

    @NotNull
    @Column(name = "number")
    @Getter
    @Setter
    private String number;

    @NotNull
    @Column(name = "type")
    @Getter
    @Setter
    private Integer type;

    @Column(name = "longitude")
    @Getter
    @Setter
    private Double longitude;

    @Column(name = "latitude")
    @Getter
    @Setter
    private Double latitude;

    @JsonIgnore
    @JoinColumn(name = "route_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private Route route;

}
