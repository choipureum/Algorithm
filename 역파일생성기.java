import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/*
 * Auth : 최푸름
 * Date : 2021/01/22 
 * Describe : 역파일 생성기 
 */
public class Invertedfile {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\User\\Desktop\\Test", "input.small");
		File resultfile = new File("C:\\Users\\User\\Desktop\\Test", "result.txt");

		LinkedHashMap<String, Object> originalMap = new LinkedHashMap<String, Object>();
		FileInputStream fis = null;
		BufferedReader br = null;
		String id = "";
		String content = "";
		String result = "";
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";

		try {
			fis = new FileInputStream(file);
			String reader = ""; // 한
			br = new BufferedReader(new InputStreamReader(fis));

			// 일단 파일을 읽어서 map id, content로 나누고
			while ((reader = br.readLine()) != null) {

				int index = reader.indexOf(' ');
				id = reader.substring(0, index);
				if (!id.isEmpty()) {// 1024MB 초과 처리 필요
					// 특수문자제거(replaceAll(match)
					content = reader.substring(index + 1).replaceAll(match, " ");
					originalMap.put(id, content);
				}

			}
			// 역파일 Map 객체 생성 invertFileMap
			HashMap<String, Object> invertFileMap = new HashMap<String, Object>();
			Iterator iter = originalMap.entrySet().iterator();
			// 첫번째 단계 실행 맵 바꿔주고 넣어주고 split("")
			while (iter.hasNext()) {
				Map.Entry entry = (Map.Entry) iter.next();

				id = (String) entry.getKey();
				content = (String) entry.getValue();
				// wordArr생성
				String[] wordArr = content.split(" ");
				HashMap<String, Object> freqMap = new HashMap<String, Object>();
				// System.out.println(Arrays.toString(wordArr));
				// 여기까지는 값 ok

				for (int i = 0; i < wordArr.length; i++) {
					// content 소문자
					String word = wordArr[i].toLowerCase();
					if (word.isEmpty()) {
						continue;
					}
					// invertFileMap에 word key 없다면
					else if (!invertFileMap.containsKey(word)) {
						freqMap.put(id, 1);
						invertFileMap.put(word, freqMap);
					}
					// invertFileMap에 있다면
					else {
						HashMap<String, Object> map = (HashMap<String, Object>) (invertFileMap.get(word));
						// map에 id값 존재 == >0
						if (map.containsKey(id)) {
							int cnt = (int) map.get(id);
							map.replace(id, cnt + 1);
							freqMap = map;
						}
						// map에 id값 미존재 ==0
						else {
							freqMap = map;
							freqMap.put(id, 1);

						}
						invertFileMap.put(word, freqMap);
					}
					freqMap = new HashMap<String, Object>();
				}
			}
			// 결과값 출력

			// 정렬(메소드 자체생성)
			invertFileMap = sortMapByKey(invertFileMap);
			// System.out.println(invertFileMap); //확인

			// 맵에 저장된 결과값 출력
			Iterator iter_result = invertFileMap.entrySet().iterator();
			while (iter_result.hasNext()) {
				Map.Entry entry = (Map.Entry) iter_result.next();
				String strWord = (String) entry.getKey();

				HashMap strFreqMap = (HashMap<String, Object>) entry.getValue();
				// Value 정렬
				strFreqMap = sortMapByValue(strFreqMap);

				result += strWord + " ";
				Iterator iterFreq = strFreqMap.entrySet().iterator();
				while (iterFreq.hasNext()) {
					Map.Entry entry_f = (Map.Entry) iterFreq.next();
					id = (String) entry_f.getKey();
					int freq = (int) entry_f.getValue();
					result += id + " " + freq + " ";
				}
				result += "\n";

			}
			
			System.out.println(result);

			// 파일저장
			outSaveFile(resultfile,result);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 키값 정렬메소드
	public static HashMap<String, Object> sortMapByKey(HashMap<String, Object> map) {
		List<Map.Entry<String, Object>> entries = new LinkedList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		LinkedHashMap<String, Object> result = new LinkedHashMap<>();
		for (Map.Entry<String, Object> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	// 밸류값 정렬메소드
	public static HashMap<String, Object> sortMapByValue(HashMap<String, Object> map) {
		List<Map.Entry<String, Object>> entries = new LinkedList<>(map.entrySet());

		Collections.sort(entries, new Comparator<Entry<String, Object>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Object> obj1, Entry<String, Object> obj2) {
				// 값이 똑같을때
				if ((int) obj1.getValue() == (int) obj2.getValue()) {
					return Integer.parseInt(obj1.getKey()) - Integer.parseInt(obj2.getKey());
				}
				return (int) obj2.getValue() - (int) obj1.getValue();
			}

		});
		LinkedHashMap<String, Object> result = new LinkedHashMap<>();
		for (Map.Entry<String, Object> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	//파일저장
	public static void outSaveFile(File resultfile,String result) throws IOException {
		FileOutputStream fos = new FileOutputStream(resultfile);
        byte[] strBytes = result.getBytes();
        fos.write(strBytes);
        fos.close();
	}
	
	
	
	
	

}
