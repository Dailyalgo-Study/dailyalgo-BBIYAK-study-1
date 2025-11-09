// 문제 분석
// 알파벳으로 구성된 문자열을 사전순 역순으로 반환하자.

import java.util.*;

public class Solution {
	public String[] solution(String[] words) {

		Arrays.sort(words, (a, b) -> b.compareTo(a));

		return words;
	}
}
