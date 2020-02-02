package com.neoga.autionnara.memberstore.store.domain;

import com.neoga.autionnara.memberstore.member.domain.Members;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Store {
    @Column(name="store_id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy="store", fetch = FetchType.LAZY)
    private Members members;
}