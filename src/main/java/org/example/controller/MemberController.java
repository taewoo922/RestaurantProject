package org.example.controller;

import org.example.container.Container;
import org.example.dto.Member;

import org.example.service.MemberService;
import org.example.util.Util;

import java.util.Scanner;

public class MemberController extends Controller {
    private Scanner sc;
    private String cmd;
    private String actionMethodName;
    private MemberService memberService;
    private Session session;

    public MemberController(Scanner sc) {
        this.sc = sc;

        memberService = Container.memberService;
        session = Container.getSession();
    }

    public void doAction(String cmd, String actionMethodName) {
        this.cmd = cmd;
        this.actionMethodName = actionMethodName;

        switch ( actionMethodName ) {
            case "가입":
                doJoin();
                break;
            case "로그인":
                doLogin();
                break;
            case "로그아웃":
                doLogout();
                break;
            default:
                System.out.println("존재하지 않는 명령어 입니다.");
                break;
        }

    }

//    public void makeTestData() {
//        System.out.println("테스트를 위한 회원 데이터를 생성합니다.");
////        memberService.join(new Member(Container.memberDao.getNewId(), Util.getNowDateStr(), "admin", "admin", "관리자"));
////        memberService.join(new Member(Container.memberDao.getNewId(), Util.getNowDateStr(), "user1", "user1", "홍길동"));
////        memberService.join(new Member(Container.memberDao.getNewId(), Util.getNowDateStr(), "user2", "user2", "홍길순"));
//    }

    public void doJoin() {
//        int id = Container.memberDao.getNewId();
//        String regDate = Util.getNowDateStr();

        String loginId = null;

        while ( true ) {
            System.out.printf("로그인 아이디 : ");
            loginId = sc.nextLine();

            if ( isJoinableLoginId(loginId) == false ) {
                System.out.printf("%s(은)는 이미 사용중인 아이디 입니다.\n", loginId);
                continue;
            }

            break;
        }

        String loginPassword = null;
        String loginPasswordConfirm = null;

        while ( true ) {
            System.out.printf("로그인 비번 : ");
            loginPassword = sc.nextLine();
            System.out.printf("로그인 비번확인 : ");
            loginPasswordConfirm = sc.nextLine();

            if ( loginPassword.equals(loginPasswordConfirm) == false ) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            break;
        }

        System.out.printf("이름 : ");
        String name = sc.nextLine();

//        Member member = new Member(id, regDate, loginId, loginPw, name);
//        memberService.join(member);
        memberService.join(loginId, loginPassword, name);

        System.out.printf("%s 회원이 생성되었습니다. 환영합니다!\n", name);
    }

    public void doLogin() {
        System.out.printf("로그인 아이디 : ");
        String loginId = sc.nextLine();
        System.out.printf("로그인 비번 : ");
        String loginPassword = sc.nextLine();

        Member member = memberService.getMemberByLoginId(loginId);

        if ( member == null ) {
            System.out.println("해당회원은 존재하지 않습니다.");
            return;
        }

        if ( member.loginPassword.equals(loginPassword) == false ) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }

        session.setLoginedMember(member);
        Member loginedMember = session.getLoginedMember();

        System.out.printf("로그인 성공! %s님 환영합니다!\n", loginedMember.name);

    }

    private void doLogout() {
        session.setLoginedMember(null);
        System.out.println("로그아웃 되었습니다.");
    }

    private boolean isJoinableLoginId(String loginId) {
//        int index = memberService.getMemberIndexByLoginId(loginId);
        Member member = memberService.getMemberByLoginId(loginId);

//        if ( index == -1 ) {
        if ( member == null ) {
            return true;
        }

        return false;
    }
}