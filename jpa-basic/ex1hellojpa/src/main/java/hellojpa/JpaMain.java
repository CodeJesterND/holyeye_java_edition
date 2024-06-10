package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            // 회원 등록;
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");
//
//            em.persist(member);

//            // 회원 조회
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());

//            // 회원 수정
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("HelloJPA");

//            // 회원 삭제
//            Member findMember = em.find(Member.class, 1L);
//            em.remove(findMember);

//            // 특정 회원 조회
//            List<Member> result = em.createQuery("SELECT M FROM Member as M", Member.class)
//                    .setFirstResult(5)
//                    .setMaxResults(8)
//                    .getResultList();
//
//            for (Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }

//            // 객체를 생성한 상태(비영속)
//            Member member = new Member();
//            member.setId(3L);
//            member.setName("HelloJPA_Good");
//
//            // 영속
//            System.out.println("=== BEFORE ===");
//            em.persist(member);
//            System.out.println("=== AFTER ===");
//
//            Member findMember = em.find(Member.class, 3L);
//            // 1차 캐시에서 조회
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());

//            // 동일성 보장
//            Member findMember1 = em.find(Member.class, 3L);
//            Member findMember2 = em.find(Member.class, 3L);
//
//            System.out.println("result = " + (findMember1 == findMember2));

//            // 쓰기 지연
//            Member member1 = new Member(4L, "A");
//            Member member2 = new Member(5L, "B");
//
//            em.persist(member1);
//            em.persist(member2);

//            // 변경 감지
//            Member member1 = em.find(Member.class, "3");
//            member1.setName("ZZZZZ");
//
//            System.out.println("========================");

//            // Flush()
//            Member member = new Member(6L, "member6");
//            em.persist(member);
//
//            em.flush();

//            Member member = em.find(Member.class, 5);
//            member.setName("AAAAA");
//
////            // 준영속
////            em.detach(member);
//
//            em.clear();
//
//            Member member1 = em.find(Member.class, 5L);
//
//            System.out.println("========================");

//            // SEQUENCE 전략
//            Member member1 = new Member();
//            member1.setUsername("A");
//
//            Member member2 = new Member();
//            member2.setUsername("B");
//
//            Member member3 = new Member();
//            member3.setUsername("C");
//
//            System.out.println("==============");
//
//            em.persist(member1);
//            em.persist(member2);
//            em.persist(member3);
//
//            System.out.println("member1 = " + member1.getId());
//            System.out.println("member2 = " + member2.getId());
//            System.out.println("member3 = " + member3.getId());
//            System.out.println("==============");

            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member2 member = new Member2();
            member.setUsername("member1");
//            member.changeTeam(team);
            em.persist(member);

            team.addMember(member);

//            team.getMembers().add(member);

            em.flush();
            em.clear();

            // 조회
            Member2 findMember = em.find(Member2.class, member.getId());

//            Team findTeam = findMember.getTeam();
//            System.out.println("findTeam = " + findTeam.getName());
//
//            // 변경
//            Team newTeam = em.find(Team.class, 100L);
//            findMember.setTeam(newTeam);

            List<Member2> members = findMember.getTeam().getMembers();

            for (Member2 m : members) {
                System.out.println("m = " + m.getUsername());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}