package org.example.controller;

import org.example.container.Container;
import org.example.dto.Member;
import org.example.dto.NonMember;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Seoul.SeoulTown;
import org.example.service.MemberService;
import org.example.service.NonmemberService;
import org.example.service.Seoul.SeoulService;

import java.util.List;
import java.util.Scanner;

public class NonmemberController extends Controller {
    private Scanner sc;
    private NonmemberService nonmemberService;
    private Session session;
    public SeoulService seoulService;


    public NonmemberController() {
        sc = Container.getScanner();
        session = Container.getSession();
        nonmemberService = Container.nonmemberService;
        seoulService = Container.seoulService;
    }

    public void doAction(String cmd, String actionMethodName) {

        switch ( actionMethodName ) {
            case "로그인":
                doLogin();
                break;
            default:
                System.out.println("존재하지 않는 명령어 입니다.");
                break;
        }

    }

    public void doLogin() {
        System.out.println("                                                   == 메뉴목록 ==\n"
                +"                                                   ==   한식   ==\n"
                +"                                                   ==   양식   ==\n"
                +"                                                   ==   중식   ==\n"
                +"                                                   ==   일식   ==\n"
                +"                                                   ==  동남아  ==\n");
        System.out.printf("                                             메뉴를 선택해 주세요 : ");
        String foodtype = sc.nextLine();

//        Seoul seoul = seoulService.getSeoulByFood(food);


        List<NonMember> printrandommenu = nonmemberService.getrandommenu(foodtype);
        if (printrandommenu == null) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return;
        }

        System.out.println("                                             종류   |  추천 메뉴  ");
        for ( int i = printrandommenu.size() - 1; i >= 0 ; i-- ) {
            NonMember nonMember = printrandommenu.get(i);

            System.out.printf("                                            %4s  | %4s \n", nonMember.foodtype, nonMember.randommenu);
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
            System.out.println("");
            System.out.println("                                            접속 방식을 입력해 주세요");
            System.out.println("                                            1. 회원 로그인 : 회원 로그인");
            System.out.println("                                            2. 비회원 로그인: 비회원 로그인");
            System.out.println("                                            3. 회원가입 : 회원 가입");
        }


//        String recommendedMenu = nonmember.randommenu[nonmember.nextInt(nonmember.length)];

//        System.out.printf("%s 메뉴에서 %s (을)를 추천드립니다.\n", foodtype, nonmember.randommenu);


    }
}