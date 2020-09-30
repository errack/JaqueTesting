package foo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Prueba {

	public Integer[] question1(Integer[] array) {
		List<Integer> possibleList = new ArrayList<Integer>();
		List<List> lists = new ArrayList<List>();
		//Integer[] result = new ArrayList<Integer>();
		for(int i=0; i<array.length-1;i++) {
				if(array[i]<array[i+1]) {
					possibleList.add(array[i]);
				}else {
					possibleList.add(array[i]);
					lists.add(possibleList);
					possibleList = new ArrayList<Integer>();
				}
		}
		List<Integer> result = lists.stream().max(Comparator.comparing(List::size)).get();
		Integer[] tempList = new Integer[result.size()];
		tempList = result.toArray(tempList);
		return tempList;
	}

	public Integer question2(Integer n, Integer m) {
		Integer result = n;
		for(int i=n+1;i<=m;i++) {
			result = result + i;
		}
		return result;
	}

	public Integer question3(Integer[] array, Integer k) {
		List<Integer> list = Arrays.asList(array);
		Collections.sort(list,Collections.reverseOrder());
		Integer result = list.get(k-1);
		return result;
	}

	public Integer[] question4(Integer[] array) {
		Set<Integer> uniques = new HashSet<Integer>();
		for (Integer val : array) {
			uniques.add(val);
		}
		Integer[] result = new Integer[uniques.size()];
		result = uniques.toArray(result);
		return result;
	}

	public boolean question5(String word) {
		boolean isBalanced = false;
		Integer brakets= Arrays.asList(word.split("")).stream().map(element ->{
			if ( element.compareTo("{")==0 ){
				return 1;
			}else if ( element.compareTo("}")==0 ){
				return -1;
			}else {
				return 0;
			}
		}).collect(Collectors.toList()).stream().reduce(0, Integer::sum);
		Integer parenthesis= Arrays.asList(word.split("")).stream().map(element ->{
			if ( element.compareTo("(")==0 ){
				return 1;
			}else if ( element.compareTo(")")==0 ){
				return -1;
			}else {
				return 0;
			}
		}).collect(Collectors.toList()).stream().reduce(0, Integer::sum);
		Integer corchete= Arrays.asList(word.split("")).stream().map(element ->{
			if ( element.compareTo("[")==0 ){
				return 1;
			}else if ( element.compareTo("]")==0 ){
				return -1;
			}else {
				return 0;
			}
		}).collect(Collectors.toList()).stream().reduce(0, Integer::sum);
		
		if (brakets==0&&parenthesis==0&&corchete==0) {
			isBalanced = true;
		}
		
		return isBalanced;
	}

	public void question6(Classs[] array6) {
		// TODO Auto-generated method stub
		
	}


}
