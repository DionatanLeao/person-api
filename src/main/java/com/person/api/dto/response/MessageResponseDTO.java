package com.person.api.dto.response;

import lombok.Builder;
import lombok.Data;

/***
 * 
 * @author dionatan
 *
 */

@Data
@Builder
public class MessageResponseDTO {
	
	private String message;
}
