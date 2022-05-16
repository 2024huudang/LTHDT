import java.io.*;
public class bai1_tuan4{
	public static void main(String[] args){
		// a
		double[] arr = new double[]{1,2,3,4,5,6,7,8,9};
		try{
			PrintWriter ghi_file = new PrintWriter("C:\\Users\\SV\\Desktop\\dayso.txt");
			for(int i = 0;i < arr.length;i++){
				ghi_file.print(arr[i] + " ");
			}
			ghi_file.close();
		}catch(Exception e){
			System.out.println(e);
		}

		// b
		double[] arr1 = new double[1000];
		int i = 0;
		try{
			FileReader doc_file = new FileReader("C:\\Users\\SV\\Desktop\\input_file.txt");
			BufferedReader br = new BufferedReader(doc_file);
			String line = null;
			while(true){
				line = br.readLine();
				if(line == null){
					break;
				}else{
					int size_line = line.length();
					int j = 0;
					// 
					while(j < size_line){
						String tmp = "0";
						while(line.charAt(j) != ' '){
							if(line.charAt(j) == '.'){
								tmp = tmp + line.charAt(j);
								if(j + 1 == size_line) break;
							}else{
								tmp = tmp + line.charAt(j);
								if(j + 1 == size_line) break;
							}
							j++;
						}
						arr1[i] = Double.parseDouble(tmp);
						i++;
						j++;
					}
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}

		// in ra day so ban dau
		System.out.println("Day so ban dau :");
		for(int k = 0;k < i;k++){
			System.out.print(arr1[k] + " ");
		}
		System.out.println();

		// sap xep
		for(int k = 0;k < i - 1;k++){
			for(int h = k + 1;h < i;h++){
				if(arr1[k] > arr1[h]){
					double tmp = arr1[k];
					arr1[k] = arr1[h];
					arr1[h] = tmp;
				}
			}
		}

		// in ra day so sau khi da sap xep
		System.out.println("Day so sau khi da sap xep :");
		for(int k = 0;k < i;k++){
			System.out.print(arr1[k] + " ");
		}

		// ghi file sapxep.txt
		try{
			PrintWriter ghi_file_sap_xep = new PrintWriter("C:sapxep.txt");
			ghi_file_sap_xep.println("Day so da sap xep :");
			for(int k = 0;k < i;k++){
				ghi_file_sap_xep.print(arr1[k] + " ");
			}
			ghi_file_sap_xep.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
