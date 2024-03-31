package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

//Member의 내장타입?
@Embeddable
@Getter
@Setter
public class Address {

    private String city;
    private String street;
    private String zipcode;

}
