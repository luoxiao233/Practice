import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOcurrent {
/*
 * ��׼���ַ����÷�
 */
	public static void main(String[] args) throws IOException {
		//����������ļ��������
		BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
		//����������ļ������������ô�ͻ��Զ�����
		BufferedWriter bw = new BufferedWriter(new FileWriter("xxx1.txt"));
		String line;
		while((line = br.readLine()) != null){
			//��ȡһ��
			bw.write(line);
			//����һ�����еķ���
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
