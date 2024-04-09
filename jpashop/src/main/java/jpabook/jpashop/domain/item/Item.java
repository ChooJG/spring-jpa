package jpabook.jpashop.domain.item;

import jakarta.persistence.*;
import jpabook.jpashop.domain.Category;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //하나의 테이블에 때려박는 전략
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    //ManyToMany의 경우 중간 테이블 필요
    //실무에서 사용은 자제하도록 하자
    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();


}










