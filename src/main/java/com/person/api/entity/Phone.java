package com.person.api.entity;

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
	
	private String number;
	
}
