package com.person.api.entity;

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
public class Phone {
	
	private Long id;
	
	private PhoneType type;
	
	private String number;
	
}
