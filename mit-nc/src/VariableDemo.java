import java.io.*;
public class VariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring a variable with value
				//NUMBER TYPES
				byte amoeba=10;//b bit
				amoeba=-128;//highest negative range
				amoeba=127;//highest positive range
				System.out.println("Byte="+amoeba);
				short dwarf=20;// 16 bit
				
				dwarf=32767;//highest positive range
				dwarf=-32768;//highest negative range
				System.out.println("Short="+dwarf);
				
				int lottery=1010292;//32 bit
				System.out.println("Integer"+lottery);
				lottery=-2147483648;
				lottery=2147483647;
				System.out.println("");
				long distance=3545435435354353L;//64 bit
				distance=-9223372036854775808L;
				distance=9223372036854775807L;
				System.out.println("Long="+distance);

	}

}
