package ra.academy.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Configuration
public class StorageConfig {
    private final String uploadFirebaseConfigPath = "C:\\Desktop\\demo1\\src\\main\\resources\\uploadmd4-87bf7-firebase-adminsdk-nzr1q-65e8e01a39.json";

    @Bean
    public Storage storage() throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get(uploadFirebaseConfigPath));
        return StorageOptions.newBuilder()
                .setCredentials(GoogleCredentials.fromStream(inputStream))
                .build()
                .getService();
    }
}
