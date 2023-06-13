package com.stocktrading.platform.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class faltu {
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String r = encoder.encode("admin");
        System.out.println(r);

    }
}

//    @PostMapping("/users/{id}")
//    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
//        Optional<User> optionalUser = userRepository.findById(id);
//        if (optionalUser.isPresent()) {
//            User user = optionalUser.get();
//            if (updatedUser.getName() != null) {
//                user.setName(updatedUser.getName());
//            }
//            if (updatedUser.getEmail() != null) {
//                user.setEmail(updatedUser.getEmail());
//            }
//            userRepository.save(user);
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
