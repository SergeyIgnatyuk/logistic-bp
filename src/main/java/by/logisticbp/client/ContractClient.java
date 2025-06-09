package by.logisticbp.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@FeignClient(name = "cargo-contract-service", url = "http://localhost:8072/cargo-contract-service/contracts")
public interface ContractClient {

    @PostMapping("/{id}")
    void updateContractStatus(@PathVariable("id") UUID id, @RequestParam(value = "status") String status);
}
