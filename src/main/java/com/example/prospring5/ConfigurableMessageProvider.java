package com.example.prospring5;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider {

    private String message;

    @Autowired
    public ConfigurableMessageProvider(
            @Value("Configurable message") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}
