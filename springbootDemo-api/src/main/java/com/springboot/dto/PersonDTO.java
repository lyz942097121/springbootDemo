package com.springboot.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**   
 * @Title:  
 * @Description: (类的作用) 
 * @author  liyz 
 * @date  
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonDTO implements Serializable{
	private Integer id;
	private String name;
	private String datasource;
}
