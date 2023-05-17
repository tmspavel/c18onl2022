package by.teachmeskills.springbootexample.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    @Min(value = 1, message = "Min values is 1")
    private int id;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private int rating;
    private List<ProductDto> products;
}
