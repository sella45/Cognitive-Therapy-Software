package com.LYS.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.LYS.memories_back.common.dto.request.auth.IdCheckRequestDto;
import com.LYS.memories_back.common.dto.request.auth.SignInRequestDto;
import com.LYS.memories_back.common.dto.request.auth.SignUpRequestDto;
import com.LYS.memories_back.common.dto.response.ResponseDto;
import com.LYS.memories_back.common.dto.response.auth.SignInResponseDto;

public interface AuthService {
  ResponseEntity<ResponseDto> idCheck(IdCheckRequestDto dto);
  ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);
  ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}
