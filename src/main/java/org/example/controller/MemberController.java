package org.example.controller;

import org.example.container.Container;
import org.example.dto.Member;

import org.example.service.MemberService;
import org.example.util.Util;

import java.util.Scanner;

public class MemberController extends Controller {
    private Scanner sc;
    private MemberService memberService;
    private Session session;


    public MemberController() {
        sc = Container.getScanner();
        session = Container.getSession();
        memberService = Container.memberService;
    }

    public void doAction(String cmd, String actionMethodName) {

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

    public void doJoin() {

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