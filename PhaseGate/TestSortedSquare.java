import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSortedSquare{
	@Test
	public void testThatSortedSquareExists(){
		int[] array = {9,2,7,0,5};
		SortedSquareFunction.sortSquaresOfArray(array);
	}
	@Test
	public void testThatSortedSquareWorks(){		
		int[] input = {9,2,7,0,-5};
		int[] expected = {0, 4, 25, 49, 81};
		assertArrayEquals(expected, SortedSquareFunction.sortSquaresOfArray(input));
	}














}