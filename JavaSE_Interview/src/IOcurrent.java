import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOcurrent {
/*
 * 标准的字符流用法
 */
	public static void main(String[] args) throws IOException {
		//这个关联的文件必须存在
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		//这个关联的文件如果不存在那么就会自动创建
		BufferedWriter bw = new BufferedWriter(new FileWriter("xxx1.txt"));
		String line;
		while((line = br.readLine()) != null){
			//读取一行
			bw.write(line);
			//这是一个换行的方法
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
