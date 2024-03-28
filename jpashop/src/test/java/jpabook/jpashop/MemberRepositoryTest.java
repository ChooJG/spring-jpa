package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired private MemberRepository memberRepository;

    @Test
    @Transactional
    //@Rollback(value = false)
    public void save(){
        Member member = new Member();
        member.setUsername("memberA");

        Long newId = memberRepository.save(member);
        Member member1 = memberRepository.find(newId);

        assertThat(member.getId()).isEqualTo(member1.getId());
        assertThat(member.getUsername()).isEqualTo(member1.getUsername());
        assertThat(member).isEqualTo(member1);
    }

}