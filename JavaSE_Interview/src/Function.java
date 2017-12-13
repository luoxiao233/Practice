import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Function {
	/**
	 * 这个方法主要用于键盘输入路径，判断出是否是一个文件
	 * @param String dir
	 * @return File
	 */
	public static File getDir(String dir){
		while(true){
			File file = new File(dir);
			if(!file.exists()){
				System.out.println("文件不存在的");
			}else if(file.isDirectory()){
				System.out.println("这不是个文件，只是个文件夹路径");
			}else
				return file;
		}
	}
	
	/**
	 * 冒泡排序
	 * @param int[] arr
	 * @return int[]
	 */
	public static int[] bubbleSort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	/**
	 * 选择排序
	 * @param int[] arr
	 * @return int[]
	 */
	public static int[] selectionSort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	/**
	 * 二分法,从有序数组中找出数组序列号
	 * @param int[],int
	 * @return int
	 */
	public static int binarySearch(int[] arr,int value){
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;
		while(true){
			if (arr[mid] > value) {
				max = mid - 1;
			}else if(arr[mid] < value){
				min = mid + 1;
			}
			mid = (max + min) / 2;
			if (min > max) {
				return  -1;
			}
			return mid;
		}
	}
	
	/**
	 * 字符流标准格式,dir1文件必须存在
	 * @param String dir1,String dir2
	 * @return 
	 * @throws IOException 
	 */
	public static void IO_CharStream(String dir1,String dir2) throws IOException{
		Function.getDir(dir1);
		BufferedReader br = new BufferedReader(new FileReader(dir1));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dir2));
		String line;
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
	
	/**
	 * 字节流标准格式,dir1文件必须存在
	 * @param String dir1,String dir2
	 * @throws IOException 
	 */
	public static void IO_ByteStream(String dir1,String dir2) throws IOException{
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(Function.getDir(dir1)));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(Function.getDir(dir2)));
		int b;
		while((b = bis.read()) != -1){
			bos.write(b);
		}
		bis.close();
		bos.close();
	}
	
	/**
	 * 存入TreeSet使用，并且比较器排序(用对象的toString()方法做出比较)
	 * @param Object object
	 */
	public static void treeSet(Object object){
		TreeSet<Object> ts = new TreeSet<>(new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				int num = o1.toString().compareTo(o2.toString());
				return num == 0 ? 1 : num;
			}
		});
	}
	
	/**
	 * 字符串去重
	 * @param String line
	 * @return String
	 */
	public static String distinct(String line){
		HashSet<Character> hs = new HashSet<>();
		char[] arr= line.toCharArray();
		for (char c : arr) {
			hs.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : hs) {
			sb.append(ch);
		}
		return sb.toString();
	}
	
	/**
	 * 获取出生到现在的天数
	 * @throws ParseException 
	 */
	public static int getDayNums(String birthday,String today) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		return (int)(time / 1000 / 60 / 60 / 24);
	}
	
	/**
	 * 查询字符串中各个字符个数
	 * 
	 */
	public static void getCharNums(String line){
		TreeMap<Character, Integer> tm = new TreeMap<>();
		char[] arr = line.toCharArray();
		for (char c : arr) {
			if (!tm.containsKey(c)) {
				tm.put(c, 1);
			}else
				tm.put(c, tm.get(c) + 1);
		}
		for (Character key : tm.keySet()) {
			System.out.println(key + "=" + tm.get(key));
		}
	}

}
