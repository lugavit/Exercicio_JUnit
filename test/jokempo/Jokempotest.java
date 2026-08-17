package Jokempo

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Jokempotest {
	
	private Jokempo jogar();
	
	@test
	public void testEmpate() {
		int test = jogar(1,1);
		Assertions.assertEquals(0, test);
	}
	
	@test
	public void testEmpate() {
		int test = jogar(2,2);
		Assertions.assertEquals(0, test);
	}
	
	@test
	public void testEmpate() {
		int test = jogar(3,3);
		Assertions.assertEquals(0, test);
	}
	
	
	@test
	public void testjogador1() {
		int test = jogar(1,2);
		Assertions.assertEquals(1,test);
	}
	
	@test
	public void testjogador1() {
		int test = jogar(2,3);
		Assertions.assertEquals(1,test);
	}
	
	@test
	public void testjogador1() {
		int test = jogar(3,1);
		Assertions.assertEquals(1,test);
	}
	
	@test
	public void testjogador2() {
		int test = jogar(2,1);
		Assertions.assertEquals(2,test);
	}
	
	@test
	public void testjogador2() {
		int test = jogar(3,2);
		Assertions.assertEquals(2,test);
	}
	
	@test
	public void testjogador2() {
		int test = jogar(1,3);
		Assertions.assertEquals(2,test);
	}
	
	
	@test
	public void testinvalido() {
		int test = jogar(4,4);
		Assertions.assertEquals(-1,test);
	}
	
	@test
	public void joge0() {
		int test = jogar(0,0);
		Assertions.assertEquals(-1,test);
	}
	
}