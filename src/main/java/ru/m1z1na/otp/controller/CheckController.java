package ru.m1z1na.otp.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.m1z1na.otp.dto.CheckDto;
import ru.m1z1na.otp.dto.GenerateDto;
import ru.m1z1na.otp.dto.common.CommonRequest;
import ru.m1z1na.otp.dto.common.CommonResponse;
import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/otp/api/v1/otp/")
public class CheckController {

    @PostMapping("/check")
    public
    ResponseEntity<String> check(@RequestBody @Valid CommonRequest<CheckDto> request) {
        log.info("Request: %s".formatted(request.body()));
        return ResponseEntity.status(HttpStatus.OK)
                .build();
    }

    @PostMapping("/generateAndSend")
    public ResponseEntity<String> generateAndSend(@RequestBody @Valid
                                                 CommonRequest<GenerateDto> request) {
        log.info("Request: %s".formatted(request.body()));
        return ResponseEntity.status(HttpStatus.OK)
                .build();
    }

}
