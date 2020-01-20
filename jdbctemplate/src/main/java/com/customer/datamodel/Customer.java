package com.customer.datamodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
private String firstname;
private String lastname;
private String email;
@Override
public String toString() {
	return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
}

}
