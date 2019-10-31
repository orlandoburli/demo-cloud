package br.com.orlandoburli.api.orders.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	private Integer id;

	private LocalDateTime date;

	private Integer customerId;

	private String customerName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Item> itens;
}