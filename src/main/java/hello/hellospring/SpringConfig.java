package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

// 자바 Bean으로 Service, Repository 설정하기
@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    private EntityManager em;
    @Autowired
    public SpringConfig(MemberRepository memberRepository, EntityManager em){
        this.memberRepository = memberRepository;
        this.em = em;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }


//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }
//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JDBCTemplateMemberRepository(dataSource);
//        return  new JpaMemberRepository(em);

    }

