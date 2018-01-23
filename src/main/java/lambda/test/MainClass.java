package lambda.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import lambda.test.pojo.OrderDto;

/**
 * @author Luca Arcangeli (luca.arcangeli@gmail.com)
 */
public class MainClass {

	/**
	 * @author Luca Arcangeli (luca.arcangeli@gmail.com) - 19 gen 2018
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			List<OrderDto> orderList = Arrays.asList(mapper.readValue(MainClass.class.getResourceAsStream("orders.json"), OrderDto[].class));

			orderList.forEach(new Consumer<OrderDto>() {
				@Override
				public void accept(OrderDto t) {
					System.out.println(t.getTransactionId());
				}
			});

			// STEP 2..
			orderList.forEach((OrderDto o) -> System.out.println(o.getTransactionId()));

			// STEP 3..
			orderList.forEach(o -> System.out.println(o.getTransactionId()));

			// TRANSFORMATION in another object...
			List<String> txList = new ArrayList<>();
			orderList.forEach(o -> txList.add(o.getTransactionId()));
			txList.forEach(System.out::println);

			orderList.stream().map(o -> o.getTransactionId()).forEach(System.out::println);

			List<OrderDto> collect = orderList.stream().filter(o -> o.getTransactionId().startsWith("TX")).collect(Collectors.toList());

			Predicate<OrderDto> filter = o -> o.getTransactionId().startsWith("TX");
			List<OrderDto> collect1 = orderList.stream().filter(filter).collect(Collectors.toList());

			List<OrderDto> collect2 = orderList.stream().filter(getPredicate("OR")).collect(Collectors.toList());

			System.out.println("DONE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * @author Luca Arcangeli (luca.arcangeli@gmail.com)
	 * @param value
	 * @return New reusable predicate
	 */
	public static Predicate<OrderDto> getPredicate(String value) {
		return o -> o.getTransactionId().startsWith(value);
	}
}