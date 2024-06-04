package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
//@Table(uniqueConstraints = {@UniqueConstraint( name = "NAME_AGE_UNIQUE", columnNames = {"NAME", "AGE"} )}) 어노테이션으로 유니크 제약조건 추가 가능!
public class Member {

    @Id
    private Long id;

    @Column(name = "name")
    //@Column(nullable = false, unique = true, length = 10)
    private String name;
    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date lastModifiedDate;

    // 최신 하이버네이트 지원
    private LocalDate testLoaclDate;
    private LocalDateTime testLocalDateTime;

    @Lob
    private String description;

    @Transient
    private int temp;

    public Member() {

    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}