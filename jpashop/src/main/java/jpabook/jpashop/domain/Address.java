package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

//Member의 내장타입?
@Embeddable
@Getter //값 타입은 값 변경 x, setter 열지 말자
public class Address {

    private String city;
    private String street;
    private String zipcode;

}
