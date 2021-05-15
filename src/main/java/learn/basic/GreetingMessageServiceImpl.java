package learn.basic;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {

    public String greetUser() {
        return "Welcome this is my first Spring application";
    }
}
