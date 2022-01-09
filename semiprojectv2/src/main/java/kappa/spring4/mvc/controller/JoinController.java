package kappa.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JoinController {

    // 이용약관
    @GetMapping("join/agree")
    public String agree() {

        return "join/agree.tiles";
    }

    // 실명확인
    @GetMapping("/join/checkme")
    public String checkme() {

        return "join/checkme.tiles";
    }

    // 회원정보 입력
    @GetMapping("/join/joinme")
    public String joinme() {

        return "join/joinme.tiles";
    }

    // 가입완료
    @GetMapping("/join/joinok")
    public String joinok() {

        return "join/joinok.tiles";
    }
}
