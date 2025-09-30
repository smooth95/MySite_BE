package com.nmgh.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReturnDTO<T> {
	private String status;
	private T data;
	private String message;
}
