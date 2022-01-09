package kappa.spring4.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    //새글쓰기
    @GetMapping("/board/write")
    public String write() {

        return "board/write.tiles";
    }

    // 목록보기
    @GetMapping("/board/list")
    public String list() {

        return "board/list.tiles";
    }

    // 본문보기
    @GetMapping("/board/view")
    public String view() {

        return "board/view.tiles";
    }
}
