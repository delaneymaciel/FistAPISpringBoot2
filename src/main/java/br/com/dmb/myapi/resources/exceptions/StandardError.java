package br.com.dmb.myapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StandardError {
	private Integer status;
	private Long timestamp;
	private String message;

}
