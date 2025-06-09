package by.logisticbp.service;


import by.logisticbp.dto.CreateContractDto;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractCamundaService {

    private static final String PROCESS_DEFINITION_KEY = "logistic";

    private final ProcessEngine camunda;

    public void createContract(CreateContractDto createContractDto) {
        camunda.getRuntimeService().startProcessInstanceByKey(
                PROCESS_DEFINITION_KEY,
                Variables
                        .putValue("contractId", createContractDto.getId())
                        .putValue("status", createContractDto.getStatus()));
    }
}
