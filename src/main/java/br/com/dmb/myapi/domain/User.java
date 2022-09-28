package br.com.dmb.myapi.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Usuario")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@NotEmpty(message = "O campo nome é obrigatório.")
	@Length(min = 2, max = 255, message = "O nome deve ter entre 2 e 100 caracteres")
	@Column
	private String name;
	
	@NotEmpty(message = "O campo login é obrigatório.")
	@Column
	private String login;
	
	@NotEmpty(message = "A senha não pode ser vazia.")
	@Column
	private String password;

}
