package br.com.orlandoburli.api.orders.model.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_item")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	@Id
	private Integer id;

	private Integer productId;

	private String productName;

	private BigDecimal quantity;

	private BigDecimal price;

	private BigDecimal total;
}
