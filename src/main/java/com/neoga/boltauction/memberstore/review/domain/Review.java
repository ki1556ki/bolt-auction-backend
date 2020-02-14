package com.neoga.boltauction.memberstore.review.domain;

import com.neoga.boltauction.memberstore.member.domain.Members;
import com.neoga.boltauction.memberstore.store.domain.Store;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "register_id")
    private Members register;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDt;
}
