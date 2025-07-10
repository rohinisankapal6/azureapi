package com.example.testazure.service;

import com.example.testazure.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return Arrays.asList(
            new User("Alice Smith", "123 Main St, Mumbai", "9876543210", "pass123"),
            new User("Bob Johnson", "456 Park Ave, Delhi", "8765432109", "hello@123"),
            new User("Carol Taylor", "789 Hill Rd, Bangalore", "7654321098", "test@456"),
            new User("David Brown", "321 Ocean Dr, Chennai", "6543210987", "abc@987"),
            new User("Eva Wilson", "159 River Rd, Kolkata", "5432109876", "eva#123"),
            new User("Frank Thomas", "753 Lake St, Pune", "4321098765", "frank!456"),
            new User("Grace Hall", "852 Forest Ln, Hyderabad", "3210987654", "grace@789"),
            new User("Harry Adams", "951 Valley Rd, Jaipur", "2109876543", "harry$321"),
            new User("Ivy Lee", "147 Sunset Blvd, Kochi", "1098765432", "ivy%111"),
            new User("Jack King", "258 Palm St, Ahmedabad", "1987654321", "jack&222"),
            new User("Kelly Scott", "369 Spring Rd, Surat", "9871234560", "kelly*333"),
            new User("Leo Green", "789 Autumn St, Lucknow", "8762345671", "leo@444"),
            new User("Mona White", "963 Blossom St, Indore", "7653456782", "mona@555"),
            new User("Nick Young", "654 Maple Rd, Patna", "6544567893", "nick@666"),
            new User("Olive Reed", "321 Pine St, Bhopal", "5435678904", "olive@777")
        );
    }
}