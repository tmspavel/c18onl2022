package by.teachmeskills.springbootexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchParamsDto {
    private String searchKey;
    private int priceTo;
    private int priceFrom;
    private String categoryName;
}
