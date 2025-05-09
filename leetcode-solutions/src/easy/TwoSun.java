package easy;

import java.util.Arrays;
import java.util.Scanner;


public class TwoSun {

	public static void main(String[] args) {

		int[] case01 = { 2, 7, 11, 15 };
		int target01 = 9;

		int[] result01 = twoSum(case01, target01);
		System.out.println(Arrays.toString(result01));

		// Case02
		int case02[] = { 3, 2, 4 };
		int target02 = 6;
		int result02[] = twoSum(case02, target02);
		System.out.println(Arrays.toString(result02));

		// Case03
		int case03[] = { 3, 3 };
		int target03 = 6;
		int result03[] = twoSum(case03, target03);
		System.out.println(Arrays.toString(result03));

	}

	
	public static int[] twoSum(int[] nums, int target) {

		int n = nums.length;

		boolean tg = false;
		int aux = 0;
		int x = 0;
		while (!tg) {
			if (nums[aux] + nums[x + 1] == target) {
				tg = true;

			} else {
				x++;
				if (x == n - 1) {
					aux++;
					x = 0;
				}
			}

		}

		return new int[] { aux, x + 1 };

	}
}


//NOTAS--------------------------------------------------------------------------
//Solução criada em 27/04/2025 
//Nível: iniciante, primeira vez resolvendo este problema
//A medida em que eu melhorar meu conhecimento em otimização e uso de algoritmos melhores, voltarei com outra implementação

//NOTES--------------------------------------------------------------------------
//Solution created on 04/27/2025
//Level: beginner, first time solving this problem
//As I improve my knowledge in optimization and use of better algorithms, I will come back with another implementation

