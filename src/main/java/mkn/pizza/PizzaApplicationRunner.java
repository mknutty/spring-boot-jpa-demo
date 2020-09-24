package mkn.pizza;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PizzaApplicationRunner implements ApplicationRunner {
  private PizzaRepository repository;
  
  @Override
  public void run(ApplicationArguments args) throws Exception {
    repository.save(new Pizza().setId(1L).setType("pepperoni").setName("Marks-Pepperoni"));
    repository.save(new Pizza().setType("supreme").setName("Mark's Supreme"));
    repository.save(new Pizza().setType("pepperoni").setName("Bob's Pepperoni"));
    repository.findAll().forEach(System.out::println);
  }

}
