package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;
    
    @OneToMany(mappedBy = "member") //Order 테이블에 있는 member에 의해 mapped 됨
    private List<Order> orders = new ArrayList<>(); //이와 같은 컬렉션은 바꾸지 말고 이대로 사용

}
