package by.logisticbp.delegate;

import by.logisticbp.client.ContractClient;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class SetStatusDelegate implements JavaDelegate {

    private final ContractClient contractClient;

    @Override
    public void execute(DelegateExecution delegateExecution) {
        UUID id = (UUID) delegateExecution.getVariable("contractId");
        String status = (String) delegateExecution.getVariable("status");
        contractClient.updateContractStatus(id, status);
        System.out.println("Status has benn changed to "+ status);
    }
}
