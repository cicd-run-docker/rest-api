package com.syphan.practice.boardinghouserestfullapi.controller;

import com.syphan.practice.commonservice.util.EntityValidationUtils;
import com.syphan.practice.commonservice.util.response.OpenApiWithDataResponse;
import com.syphan.practice.dto.registration.UserCreateDto;
import com.syphan.practice.registrationservice.model.User;
import com.syphan.practice.registrationservice.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/api/v1/users")
public class UserJoinController {

    @Reference
    private UserService userService;

    @PostMapping("mail-captcha")
    public ResponseEntity<OpenApiWithDataResponse<String>> mailCaptcha(@NotBlank @Email @RequestParam String email) {
        return ResponseEntity.ok(new OpenApiWithDataResponse<>(userService.sendUserSignUpMailCaptcha(email)));
    }

    @PostMapping
    public ResponseEntity<OpenApiWithDataResponse<User>> signUp(@Valid @RequestBody UserCreateDto reqPram,
                                                                BindingResult bindingResult) {
        EntityValidationUtils.processBindingResults(bindingResult);
        return ResponseEntity.ok(new OpenApiWithDataResponse<User>(userService.signUp(reqPram)));
    }
}
