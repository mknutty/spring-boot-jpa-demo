package mkn.pizza;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class PizzaUpdateRequest {
  @NotNull
  private Long id;
  
  @NotBlank
  private String type;
}
