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

        switch (actionMethodName) {
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
        String[] menus = {"한식", "일식", "중식", "양식"};
        String[] art = {
                            " __  __     ______      _   _    _   _ ",
                            "|  \\/  |   |  ____|    | \\ | |  | | | |",
                            "| \\  / |   | |__       |  \\| |  | | | |",
                            "| |\\/| |   |  __|      | . ` |  | | | |",
                            "| |  | |   | |____     | |\\  |  | |_| |",
                            "|_|  |_|   |______|    |_| \\_|   \\___/ "
        };

        String loginId = null;

        while (true) {
            System.out.println("\u001B[34m                            ****************************************************");
            System.out.println("                            *               Welcome to Sign Up!                *");
            System.out.println("                            ****************************************************");
            System.out.println("                                         ________________________             ");
            System.out.println("                                        |                        |            ");
            System.out.println("                                        |    ----------------    |            ");
            System.out.println("                                        |   |                  |   |           ");
            System.out.println("                                        |   |                  |   |           ");
            System.out.println("                                        |   |                  |   |           ");
            System.out.println("                                        |   |                  |   |           ");
            System.out.println("                                        |   |__________________|   |           ");
            System.out.println("                                        |________________________|           ");
            System.out.println("                                                                        ");
            System.out.print("                                   사용할 로그인 아이디를 입력하세요 : ");
            loginId = sc.nextLine();
//            String id = sc.nextLine();
            if ( isJoinableLoginId(loginId) == false ) {
                System.out.printf("%s(은)는 이미 사용중인 아이디 입니다.\n", loginId);
                continue;
            }
            break;
        }

            String loginPassword = null;
            String loginPasswordConfirm = null;

            while (true) {
                System.out.printf("                                   사용할 비밀번호를 입력하세요 : ");
                loginPassword = sc.nextLine();
                System.out.print("                                   사용할 비밀번호를 한번 더 입력하세요: ");
                loginPasswordConfirm = sc.nextLine();

                if (loginPassword.equals(loginPasswordConfirm) == false) {
                    System.out.println("                             비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    continue;
                }

                break;
            }

            System.out.print("                                   이름을 입력하세요 : ");
            String name = sc.nextLine();

            System.out.println("                    ___________________________________________________________________________");
            System.out.println("                   |                   |                   |                 |                 |");
            System.out.println("                   |      \u001B[31m" + menus[0] + "         \u001B[34m|       \u001B[31m" + menus[1] + "        \u001B[34m|       \u001B[31m" + menus[2] + "      \u001B[34m|       \u001B[31m" + menus[3] + "      \u001B[34m|");
            System.out.println("\u001B[34m                   |___________________|___________________|_________________|_________________|");
            System.out.println("                   |                   |                   |                 |                 |");
            System.out.println("                   |  ┌─────────────┐  |  ┌─────────────┐  |  ┌───────────┐  |   ┌──────────┐  |");
            System.out.println("                   |  │             │  |  │             │  |  │           │  |   │          │  |");
            System.out.println("                   |  │             │  |  │             │  |  │           │  |   │          │  |");
            System.out.println("                          __  __               ______             _   _              _   _    ");
            System.out.println("                         |  \\/  |             |  ____|           | \\ | |            | | | |  ");
            System.out.println("                         | \\  / |             | |__              |  \\| |            | | | |  ");
            System.out.println("                         | |\\/| |             |  __|             | . ` |            | | | |  ");
            System.out.println("                         | |  | |             | |____            | |\\  |            | |_| |  ");
            System.out.println("                         |_|  |_|             |______|           |_| \\_|             \\___/   ");
//            System.out.println("  |  │             │  |  │             │  |  │           │  |   │          │  |");
            System.out.println("                   |  │             │  |  │             │  |  │           │  |   │          │  |");
            System.out.println("                   |  └─────────────┘  |  └─────────────┘  |  └───────────┘  |   └──────────┘  |");
            System.out.println("                   |___________________|___________________|_________________|_________________|");

            System.out.println("                                        ______________________________________");
            System.out.println("                                       /                                      \\");
            System.out.printf("                                       |  선호하는 음식 종류를 입력해주세요 :  ");
            String favoriteFood = sc.nextLine();
            System.out.println("                                       \\______________________________________/");
//            System.out.print("선호하는 음식 종류를 입력하세요 : ");
//            String favoriteFood = sc.nextLine();

            System.out.println("\n\n                            ****************************************************");
            System.out.println("                            *               Thank you for signing up!          *");
            System.out.println("                            ****************************************************");
            System.out.println("                            아이디 : " + loginId);
            System.out.println("                            비밀번호 : " + loginPassword);
            System.out.println("                            이름 : " + name);
            System.out.println("                            선호하는 음식종류 : " + favoriteFood);

            memberService.join(loginId, loginPassword, name, favoriteFood);

            System.out.printf("                             %s 회원이 생성되었습니다. 환영합니다!\n", name);

            System.out.println("\u001B[32m                  _________________________________________________________________________________");
            System.out.println("                 /                                                                                 \\");
            System.out.println("                |                        Welcome to Nearby Restaurant Recommender                  |");
            System.out.println("                |                                                                                  |");
            System.out.println("                |      ________________________________________________________________________    |");
            System.out.println("                |     /                                                                        \\   |");
            System.out.println("                |    |         [ 회원 로그인 ]       [ 비회원 로그인 ]         [ 회원 가입 ]    |  |");
            System.out.println("                |     \\________________________________________________________________________/   |");
            System.out.println("                |                                                                                  |");
            System.out.println("                |                      Today's Recommended Menu: 짬뽕 + 탕수육                     |");
            System.out.println("                 \\________________________________________________________________________________/");

            System.out.println("                                            접속 방식을 입력해 주세요");
            System.out.println("                                            1. 회원 로그인 : 회원 로그인");
            System.out.println("                                            2. 비회원 로그인: 비회원 로그인");
            System.out.println("                                            3. 회원가입 : 회원 가입");
        }


    public void doLogin () {
        String[] menus = {"한식", "일식", "중식", "양식"};
        System.out.println("\u001B[33m                    ╔════════════════════════════════════════════════════════════╗");
        System.out.println("                    ║                                                            ║");
        System.out.println("                    ║                       WELCOME TO                           ║");
        System.out.println("                    ║                        F O O D                             ║");
        System.out.println("                    ║                                                            ║");
        System.out.println("                    ║ ╔════════════════════════════════════════════════════════╗ ║");
        System.out.println("                    ║ ║                                                        ║ ║");
        System.out.println("                    ║ ║              [   ]   [   ]   [   ]   [   ]             ║ ║");
        System.out.println("                    ║ ║             (¯`v´¯) (¯`v´¯) (¯`v´¯) (¯`v´¯)            ║ ║");
        System.out.println("                    ║ ║             `•.¸.•´ `•.¸.•´ `•.¸.•´ `•.¸.•´            ║ ║");
        System.out.println("                    ║ ║                                                        ║ ║");
        System.out.println("                    ║ ║      [  한식  ]  [  일식  ]  [  중식  ]  [  양식  ]    ║ ║");
        System.out.println("                    ║ ║                                                        ║ ║");
        System.out.println("                    ║ ║                    ID   : [____________]               ║ ║");
        System.out.println("                    ║ ║                 Password: [____________]               ║ ║");
        System.out.println("                    ║ ║                                                        ║ ║");
//            System.out.println("                    ║ ║       [   로그인   ] [ 비회원로그인 ] [   가입   ]     ║ ║");
        System.out.println("                    ║ ║                                                        ║ ║");
        System.out.println("                    ║ ╚════════════════════════════════════════════════════════╝ ║");
        System.out.println("                    ║                                                            ║");
        System.out.println("                    ╚════════════════════════════════════════════════════════════╝");

        System.out.println("                              ___________________________________________");
        System.out.println("                             /                                           \\");
        System.out.print("                             |   Enter your id:");
        String loginId = sc.nextLine();
//        System.out.println("                            |                           |             |   |");

        // 비밀번호 입력 창 표시
        System.out.print("                             |   Enter your password:");
        String loginPassword = sc.nextLine();
//        System.out.println("                            |                           |_____________|   |");
        System.out.println("                             \\___________________________________________/");

//            System.out.printf("로그인 아이디 : ");
//            String loginId = sc.nextLine();
//            System.out.printf("로그인 비번 : ");
//            String loginPassword = sc.nextLine();

        Member member = memberService.getMemberByLoginId(loginId);

        if (member == null) {
            System.out.println("해당회원은 존재하지 않습니다.");
            return;
        }

        if (member.loginPassword.equals(loginPassword) == false) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return;
        }

        session.setLoginedMember(member);
        Member loginedMember = session.getLoginedMember();

        System.out.printf("                     *         📢 로그인 성공! %s님 환영합니다! 📢      *\n", loginedMember.name);
//        System.out.printf("                            로그인 성공! %s님 환영합니다!\n", loginedMember.name);
        System.out.printf("                           📌 보기에서 원하는 메뉴를 고르고 입력해주세요\n", loginedMember.name);
        System.out.println("                     ********************************************************");
        System.out.println("                     *                                                       *");
        System.out.println("                     *                    📢 공 지 사 항 📢                 *");
        System.out.println("                     *                                                       *");
        System.out.println("                     *                📌 입력 방법 - 지역 명칭               *");
        System.out.println("                     *                📌 EX) 지역 서울                       *");
        System.out.println("                     *                                                       *");
        System.out.println("                     *    - 서울     - 경기     - 인천     - 대전     - 대구 *");
        System.out.println("                     *    - 광주     - 울산     - 부산     - 제주            *");
        System.out.println("                     *                                                       *");
        System.out.println("                     ********************************************************");
//        System.out.print("                             |   Enter your username:");


    }

    private void doLogout () {
        session.setLoginedMember(null);
        System.out.println("로그아웃 되었습니다.");

        System.out.println("\u001B[32m                  _________________________________________________________________________________");
        System.out.println("                 /                                                                                 \\");
        System.out.println("                |                        Welcome to Nearby Restaurant Recommender                  |");
        System.out.println("                |                                                                                  |");
        System.out.println("                |      ________________________________________________________________________    |");
        System.out.println("                |     /                                                                        \\   |");
        System.out.println("                |    |         [ 회원 로그인 ]       [ 비회원 로그인 ]         [ 회원 가입 ]    |  |");
        System.out.println("                |     \\________________________________________________________________________/   |");
        System.out.println("                |                                                                                  |");
        System.out.println("                |                      Today's Recommended Menu: 짬뽕 + 탕수육                     |");
        System.out.println("                 \\________________________________________________________________________________/");

        System.out.println("                                                접속 방식을 입력해 주세요");
        System.out.println("                                                1. 회원 로그인 : 회원 로그인");
        System.out.println("                                                2. 비회원 로그인: 비회원 로그인");
        System.out.println("                                                3. 회원가입 : 회원 가입");
    }

    private boolean isJoinableLoginId (String loginId){
//        int index = memberService.getMemberIndexByLoginId(loginId);
        Member member = memberService.getMemberByLoginId(loginId);

//        if ( index == -1 ) {
        if (member == null) {
            return true;
        }

        return false;
    }
    }