package br.com.orlandoburli.api.customers.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	private Integer id;

	private String name;

	private String address;

	private String city;

	private String state;

	private String country;

	private String phone;
}
