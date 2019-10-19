package com.syphan.practice.boardinghouserestfullapi.controller;

import com.syphan.practice.commonservice.security.CurrentUser;
import com.syphan.practice.commonservice.security.UserPrincipal;
import com.syphan.practice.commonservice.util.response.OpenApiWithDataResponse;
import com.syphan.practice.dto.registration.PermissionCreateDto;
import com.syphan.practice.registrationservice.model.Permission;
import com.syphan.practice.registrationservice.service.PermissionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/permissions")
public class PermissionController {

    @Reference
    private PermissionService service;

    @PreAuthorize("hasAnyAuthority('UPMS_PERMISSION_EDIT')")
    @PostMapping
    public ResponseEntity<OpenApiWithDataResponse<Permission>> create(@ApiIgnore @CurrentUser UserPrincipal userPrincipal,
                                                                      @Valid @RequestBody PermissionCreateDto reqPram) {
        return ResponseEntity.ok(new OpenApiWithDataResponse<Permission>(service.create(reqPram)));
    }

}
