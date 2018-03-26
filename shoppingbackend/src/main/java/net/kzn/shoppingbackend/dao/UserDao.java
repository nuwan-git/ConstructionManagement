package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Address;
import net.kzn.shoppingbackend.dto.Cart;
import net.kzn.shoppingbackend.dto.User;

public interface UserDao {

	boolean addUser(User user);
	User getByEmail(String email);

	boolean addAddress(Address address);
	Address getBillingAddress(User user);
	List<Address> listShippingAddress(User user);
	

	boolean updateCart(Cart cart);
}
