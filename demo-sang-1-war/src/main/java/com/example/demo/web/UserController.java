package com.example.demo.web;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
    private UserRepository userRepository;

    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // CREATE
    // 사용자 이름을 입력받아 새로운 User를 생성하고 그 결과를 반환
    @PostMapping(value = "/id")
    public User put(@RequestParam String id, @RequestParam String password ) {
    	User user = new User();
    	user.setId(id);
    	user.setPassword(password);
         userRepository.save(user);
         return user;
    }
    // READ
    // 모든 사용자 리스트를 반환
    @GetMapping
    public Iterable<User> list() {
        return userRepository.findAll();
    }
    // READ
    // 해당 ID의 사용자를 반환
    @GetMapping(value = "/id")
    public Map<String, Object> findOne(@RequestParam String id,@RequestParam String password) {
        
    	Map<String, Object> result = new HashMap<String, Object>();
        try {
	    	User user =  userRepository.getOne(id);
	    	
	        if(user != null && password.equals(user.getPassword()))
	        {	
	        	result.put("result", "OK");        
	        }else
	        {
	        	result.put("result", "NG");         	
	        }    
        }catch(Exception ex)
        {
        	result.put("result", "NG");  
        }
        
        return result;
    }
    // UPDATE
    // 해당 ID의 사용자 이름을 갱신한 뒤 그 결과를 반환
    @PutMapping(value = "/id")
    public User update(@RequestParam String id, @RequestParam String password) {
        User user = userRepository.getOne(id);
        user.setPassword(password);
        return userRepository.save(user);
    }
    // DELETE
    // 해당 ID의 사용자를 삭제  
   
    @DeleteMapping(value = "/id")
    public void delete(@RequestParam String id, @RequestParam String password) {
    	try {    		
    		System.out.println(id);
    		System.out.println(password);
    		userRepository.deleteById(id);
    	}catch(Exception ex)
    	{
    		System.out.println(ex.toString());
        	
    	}
    	
    }
}