package com.LYS.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.LYS.memories_back.common.dto.request.user.PatchUserRequestDto;
import com.LYS.memories_back.common.dto.response.ResponseDto;
import com.LYS.memories_back.common.dto.response.user.GetSignInUserResponseDto;

public interface UserService {
  ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String userId);
  ResponseEntity<ResponseDto> patchUser(PatchUserRequestDto dto, String userId);
}