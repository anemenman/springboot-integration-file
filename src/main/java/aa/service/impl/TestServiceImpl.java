package aa.service.impl;

import aa.dto.TestDTO;
import aa.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    @Override
    public void sendMessage(final TestDTO testDTO) {
    }
}
