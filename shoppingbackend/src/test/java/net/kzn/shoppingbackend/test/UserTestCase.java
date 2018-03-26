package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.UserDao;
import net.kzn.shoppingbackend.dto.Address;
import net.kzn.shoppingbackend.dto.Cart;
import net.kzn.shoppingbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDao userDao;
	private User user = null;
	private Cart cart = null;
	private Address address = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();

		userDao = (UserDao) context.getBean("userDao");
	}

	/*
	 * @Test public void testAdd(){
	 * 
	 * user = new User(); user.setFirstName("Mahela");
	 * user.setLastName("Jayawardhana"); user.setEmail("mahela@gmail.com");
	 * user.setContactNumber("1231231234"); user.setRole("USER");
	 * user.setPassword("123456");
	 * 
	 * //add the user assertEquals("Failed add the user",
	 * true,userDao.addUser(user));
	 * 
	 * address = new Address();
	 * address.setAddressLineOne("101/8 colombo Nugegoda,Krish Nago");
	 * address.setAddresssLineTwo("Near Orange Color bulding");
	 * address.setCity("Nawala"); address.setState("Colombo");
	 * address.setCountry("Srilanka"); address.setPostalCode("60650");
	 * address.setBilling(true);
	 * 
	 * //link the user with the address using user id
	 * address.setUserId(user.getId()); //add the address
	 * assertEquals("Failed add the address", true,userDao.addAddress(address));
	 * 
	 * if(user.getRole().equals("USER")){
	 * 
	 * //create a cart for this user cart = new Cart(); cart.setUser(user);
	 * 
	 * //add the cart assertEquals("Failed add the cart",
	 * true,userDao.addCart(cart));
	 * 
	 * 
	 * 
	 * // add a shipping addresss for this user address = new Address();
	 * address.setAddressLineOne("201/B Nuwara Road , Kiribathgoda");
	 * address.setAddresssLineTwo("202/B Nuwara Road , Kelaniya");
	 * address.setCity("Mahara"); address.setState("Yakala");
	 * address.setCountry("Srilanka"); address.setPostalCode("66955"); // set
	 * shipping to true address.setShipping(true);
	 * 
	 * //link it with the user address.setUserId(user.getId()); // add the
	 * shipping address assertEquals("Failed add the shippingaddress",
	 * true,userDao.addAddress(address));
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void testAdd(){
	 * 
	 * user = new User(); user.setFirstName("Mahela");
	 * user.setLastName("Jayawardhana"); user.setEmail("mahela@gmail.com");
	 * user.setContactNumber("1231231234"); user.setRole("USER");
	 * user.setPassword("123456");
	 * 
	 * if(user.getRole().equals("USER")){
	 * 
	 * //create a cart for this user cart = new Cart(); cart.setUser(user);
	 * 
	 * //attach cart with the user user.setCart(cart);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * //add the user assertEquals("Failed add the user",
	 * true,userDao.addUser(user)); }
	 */

	/*
	 * @Test public void testUpdateCart(){ //fetch the user by email
	 * 
	 * user = userDao.getByEmail("mahela@gmail.com");
	 * 
	 * 
	 * //get the cart of the user cart= user.getCart();
	 * 
	 * cart.setGrandTotal(5555); cart.setCartLines(2);
	 * assertEquals("Failed toupdate cart", true,userDao.updateCart(cart)); }
	 */

/*	@Test
	public void testAddAddress() {
		// we need to add an user

		user = new User();
		user.setFirstName("Mahela");
		user.setLastName("Jayawardhana");
		user.setEmail("mahela@gmail.com");
		user.setContactNumber("1231231234");
		user.setRole("USER");
		user.setPassword("123456");

		// add the user
		assertEquals("Failed add the user", true, userDao.addUser(user));

		address = new Address();
		address.setAddressLineOne("101/8 colombo Nugegoda,Krish Nago");
		address.setAddresssLineTwo("Near Orange Color bulding");
		address.setCity("Nawala");
		address.setState("Colombo");
		address.setCountry("Srilanka");
		address.setPostalCode("60650");
		address.setBilling(true);

		// attached the user to the address
		address.setUser(user);

		assertEquals("Failed add the address", true, userDao.addAddress(address));

		// we are going to addd the shipping address
		address = new Address();
		address.setAddressLineOne("101/8 colombo Nugegoda,Krish Nago");
		address.setAddresssLineTwo("Near Orange Color bulding");
		address.setCity("Nawala");
		address.setState("Colombo");
		address.setCountry("Srilanka");
		address.setPostalCode("60650");
		address.setShipping(true);

		// attached the user to the address
		address.setUser(user);
		
		assertEquals("Failed add the shipping address", true, userDao.addAddress(address));

	}
	*/
	/*@Test
	public  void testAddAddress(){
		
		user  = userDao.getByEmail("mahela@gmail.com");
		
		address = new Address();
		address.setAddressLineOne("101/8 Kandy,Krish Nago");
		address.setAddresssLineTwo("Near Orange Color bulding");
		address.setCity("Peradeniya");
		address.setState("Kandy");
		address.setCountry("Srilanka");
		address.setPostalCode("80650");
		address.setBilling(true);

		// attached the user to the address
		address.setUser(user);

		assertEquals("Failed add the address", true, userDao.addAddress(address));

	}*/
	@Test
	public void testGetAddress(){
		
		user = userDao.getByEmail("mahela@gmail.com");

		assertEquals("Failed add the address",2, userDao.listShippingAddress(user).size());

		assertEquals("Failed add the address","Nawala" , userDao.getBillingAddress(user).getCity());

	}
}
