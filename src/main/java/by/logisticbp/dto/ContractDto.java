package by.logisticbp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
public class ContractDto {

    private String customerName;

    private String loadingInfo;

    private String deliveryInfo;

    private String cargoType;

    private String cargoWeight;

    private Double price;

    private String status;
}
