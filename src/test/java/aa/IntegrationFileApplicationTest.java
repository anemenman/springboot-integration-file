package aa;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@AutoConfigureMockMvc
@SpringBootTest(classes = {IntegrationFileApplication.class})
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class IntegrationFileApplicationTest {

    @Test
    void contextLoads() {
    }
}
