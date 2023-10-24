package core.user.entity;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.Month;

import com.example.execerciciosSpringBoot.core.domain.user.entity.User;
import org.junit.jupiter.api.Test;

class UserTest {

	

	@Test
	void test() {
		User userTest = new User("Rafael", "rafael@email.com", "123456", LocalDate.of(1992, Month.MAY, 5), 31);
		
		assertThat(userTest.getName()).isEqualTo("Rafael");
		assertThat(userTest.getEmail()).isEqualTo("rafael@email.com");
		assertThat(userTest.getDob()).isEqualTo(LocalDate.of(1992, Month.MAY, 5));
		assertThat(userTest.getAge()).isEqualTo(31);
	}

}
