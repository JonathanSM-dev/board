package com.oliveiratrade.board.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @GetMapping
    @ApiResponses(value = {
            @ApiResponse(code = 545, message = "erro diferente")
    })
    @ApiOperation(value = "get")
    public String ok(){
        return "ok";
    }

    @GetMapping("/parametro/{x}")
    public String ok(@RequestParam("x") String x){
        return "x";
    }

    @PostMapping
    public String post(){
        return "ok";
    }

    @PutMapping
    public String put(){
        return "ok";
    }

    @DeleteMapping
    public String delete(){
        return "ok";
    }

}
