package org.example.controller;

import org.example.container.Container;
import org.example.dto.Member;
import org.example.dto.NonMember;
import org.example.dto.Seoul.Seoul;
import org.example.service.MemberService;
import org.example.service.NonmemberService;
import org.example.service.Seoul.SeoulService;

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
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

//        Seoul seoul = seoulService.getSeoulByFood(food);

        NonMember nonmember = nonmemberService.getrandommenu(food);
        if ( nonmember == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }


//        String recommendedMenu = nonmember.randommenu[nonmember.nextInt(nonmember.length)];

        System.out.printf("%s 메뉴에서 %s (을)를 추천드립니다.\n", food, nonmember.randommenu);


    }
}