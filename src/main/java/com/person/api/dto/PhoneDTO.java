package com.person.api.dto;

import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.person.api.enums.PhoneType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * @author dionatan
 *
 */

@Data 
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
	
	private Long id;
	
	@Enumerated
	private PhoneType type;
	
	@NotEmpty
	@Size(min = 13, max = 14)
	private String number;
	
}
