package by.logisticbp.controller;

import by.logisticbp.dto.CreateContractDto;
import by.logisticbp.service.ContractCamundaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logistic/contract")
@Tag(name = "Контроллер для старта процесса")
@RequiredArgsConstructor
public class ContractController {

    private final ContractCamundaService contractCamundaService;

    @PostMapping
    @Operation(summary = "Стартануть процесс")
    public void createContract(@RequestBody CreateContractDto createContractDto) {

        contractCamundaService.createContract(createContractDto);
    }
}
