package com.LYS.memories_back.common.dto.response.test;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.LYS.memories_back.common.dto.response.ResponseDto;
import com.LYS.memories_back.common.entity.MemoryTestEntity;
import com.LYS.memories_back.common.vo.MemoryTestVO;

import lombok.Getter;

@Getter
public class GetRecentlyMemoryResponseDto extends ResponseDto  {
    private List<MemoryTestVO> memoryTests;

    private GetRecentlyMemoryResponseDto(List<MemoryTestEntity>memoryTestEntities) {
        this.memoryTests = MemoryTestVO.getList(memoryTestEntities);
    }

    public static ResponseEntity<GetRecentlyMemoryResponseDto> success(List<MemoryTestEntity> memoryTestEntities) {
        GetRecentlyMemoryResponseDto body = new GetRecentlyMemoryResponseDto(memoryTestEntities);
        return ResponseEntity.ok(body);
    }
}
