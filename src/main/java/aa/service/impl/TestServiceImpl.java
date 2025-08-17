package aa.service.impl;

import aa.dto.TestDTO;
import aa.service.FileWriterGateway;
import aa.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    private final FileWriterGateway fileWriterGateway;

    @Override
    public void sendMessage(final TestDTO testDTO) {
        log.info("TestServiceImpl sendMessage----------->: {}", testDTO);
        fileWriterGateway.writeToFile("tst1.txt", testDTO.toString());
    }
}
