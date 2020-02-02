package com.neoga.autionnara.image.domain;

import com.neoga.autionnara.memberstore.member.domain.Members;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class MemberImage {
    @Column(name="member_image_id")
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToOne()
    @JoinColumn(name = "image_id")
    private Image image;
    @OneToOne()
    @JoinColumn(name = "member_id")
    private Members members;
}