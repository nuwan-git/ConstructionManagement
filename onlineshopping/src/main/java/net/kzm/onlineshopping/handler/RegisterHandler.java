package net.kzm.onlineshopping.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import net.kzm.onlineshopping.model.RegisterModel;
import net.kzn.shoppingbackend.dao.UserDao;
import net.kzn.shoppingbackend.dto.Address;
import net.kzn.shoppingbackend.dto.Cart;
import net.kzn.shoppingbackend.dto.User;

@Component
public class RegisterHandler {

	@Autowired
	private UserDao userDao;
	
	public RegisterModel init(){
		return new RegisterModel();
	}
	
	public void adduser(RegisterModel registerModel, User user){
		registerModel.setUser(user);
	}
	public void addbilling(RegisterModel registerModel, Address address){
		registerModel.setBilling(address);
	}
	
	public String validateUser(User user,MessageContext error){
		String transitionValue = "success";
		
		//checking if passsword maches passowrd
		
		if(!(user.getPassword().equals(user.getConfirmPassword()))){
			error.addMessage(new MessageBuilder()
					.error().source("confirmPassword")
					.defaultText("Password does not match")
					.build());
			
			transitionValue= "failure";
		}
		
		//check the unicknessof email id
		if(userDao.getByEmail(user.getEmail())!=null){
			
			error.addMessage(new MessageBuilder()
					.error().source("email")
					.defaultText("Email Addresss is already used")
					.build());
			transitionValue= "failure";
		}
		return transitionValue;
		
		
	}
	
	
	
	public String saveAll(RegisterModel model){
		String transitionValue = "success";
		
		//fetch the user
		User user = model.getUser();
		
		if(user.getRole().equals("USER")){
			
			Cart cart = new Cart();
			cart.setUser(user);
			user.setCart(cart);
		}
		//save the user
		userDao.addUser(user);
		
		//get the address
		Address billing =  model.getBilling();
		billing.setUser(user);
		billing.setBilling(true);
		
		//save the address
		userDao.addAddress(billing);
		
		return transitionValue;
	}
}
