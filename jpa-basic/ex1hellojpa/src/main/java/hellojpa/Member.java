//package hellojpa;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Date;
//
//@Entity
//@SequenceGenerator(
//        name = "MEMBER_SEQ_GENERATOR",
//        sequenceName = "MEMBER_SEQ",
//        initialValue = 1, //매핑할 데이터베이스 시퀀스 이름
//        allocationSize = 1)
////@Table(uniqueConstraints = {@UniqueConstraint( name = "NAME_AGE_UNIQUE", columnNames = {"NAME", "AGE"} )}) 어노테이션으로 유니크 제약조건 추가 가능!
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,
//            generator = "MEMBER_SEQ_GENERATOR")
//    private Long id;
//
//    @Column(name = "name", nullable = false)
//    //@Column(nullable = false, unique = true, length = 10)
//    private String username;
//
//    public Member() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    //    private Integer age;
////
////    @Enumerated(EnumType.STRING)
////    private RoleType roleType;
////
////    @Temporal(TemporalType.TIMESTAMP)
////    private Date createdDate;
////
////    @Temporal(TemporalType.TIMESTAMP)
////    private Date lastModifiedDate;
////
////    // 최신 하이버네이트 지원
////    private LocalDate testLoaclDate;
////    private LocalDateTime testLocalDateTime;
////
////    @Lob
////    private String description;
////
////    @Transient
////    private int temp;
//}