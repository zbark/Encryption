package Encryption;
import java.util.Random;

public class keyCrypt
{
	Random rand = new Random();
	keyCrypt()
	{		
		
	}
	void randKey()
	{
		char alph[] = new char[27];
		alph[1] = 'a';
		alph[2] = 'b';
		alph[3] = 'c';
		alph[4] = 'd';
		alph[5] = 'e';
		alph[6] = 'f';
		alph[7] = 'g';
		alph[8] = 'h';
		alph[9] = 'i';
		alph[10] = 'j';
		alph[11] = 'k';
		alph[12] = 'l';
		alph[13] = 'm';
		alph[14] = 'n';
		alph[15] = 'o';
		alph[16] = 'p';
		alph[17] = 'q';
		alph[18] = 'r';
		alph[19] = 's';
		alph[20] = 't';
		alph[21] = 'u';
		alph[22] = 'v';
		alph[23] = 'w';
		alph[24] = 'x';
		alph[25] = 'y';
		alph[26] = 'z';
		
		int num[] = new int[27];
		int shufNum[] = new int[27];
		char key[] = new char[27];
		int x =rand.nextInt(26)+1;
		//fills shuf num 1-26
		for(int i = 1;i<27;i++)
		{
			shufNum[i] = i;
		}
		//fills num with zeroes
		for(int i = 1;i<27;i++)
		{
			num[i] = 0;
		}
		
		//shifts shuffNum to random num
		for(int i = 1;i<27;i++)
		{
			while(shufNum[x]==0)
			{
			x =rand.nextInt(26)+1;
			}
			num[i] = shufNum[x];
			shufNum[x] = 0;
		}
		
		//fills key with number corresponding alph letters
		for(int i = 1;i<27;i++)
		{
			key[i] = alph[num[i]];
		}
		
		//just a test print
		for(int i = 1;i<27;i++)
		{
			System.out.println(key[i]);
		}
		
	}
	

}
