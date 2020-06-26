import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Conversion extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String str = req.getParameter("op");
		int result=0;
		
		if (str.equals("Decimal to Binary"))
				{
					int n1 = Integer.parseInt(req.getParameter("txt1"));
					int[] bin1 = new int[1000];
					int i1 = 0;
					while(n1>0)
					{
						 bin1[i1] = n1 % 2;
						 n1 = n1/2;
						 i1++;
					}				
					for(int j1 = i1-1;j1>=0;j1--)
						out.println(bin1[j1]);
					
				}
			
			else if(str.equals("Decimal to Octal"))
				{		
					int n2 = Integer.parseInt(req.getParameter("txt1"));
					int[] bin12 = new int[1000];
					int i2 = 0;
					while(n2>0)
					{
						 bin12[i2] = n2 % 8;
						 n2 = n2/8;
						 i2++;
					}		
					for(int j2 = i2-1;j2>=0;j2--)
					out.println(bin12[j2]);
				}
			
			
			else if(str.equals("Decimal to Hexadecimal"))
				{
					int n3 = Integer.parseInt(req.getParameter("txt1"));;
					char[] bin13 = new char[1000];
					int i3 = 0;
					int temp13 = 0;
					while(n3>0)
					{
						temp13 = n3 % 16;
						if(temp13<10)
						{
							bin13[i3] = (char)(temp13 + 48);
							i3++;
						}				
						else
						{
							bin13[i3] = (char)(temp13 + 55);
							i3++;
						}
						 n3 = n3/16;
					}
					
					for(int j3 = i3-1;j3>=0;j3--)
					out.println(bin13[j3]);
				}
			
			else if(str.equals("Binary to Decimal"))
			{
				int m1 = Integer.parseInt(req.getParameter("txt1"));
				int num21 = m1; 
				int dec_value21 = 0; 
				int base21 = 1; 
				int temp21 = num21; 
				while (temp21 > 0)
				{
					int last_digit21 = temp21 % 10; 
					temp21 = temp21 / 10; 
					dec_value21 += last_digit21 * base21; 
					base21 = base21 * 2; 
				}
					out.println(dec_value21);	
			}
			
			else if (str.equals("Binary to Octal"))
			{	
				int m2 = Integer.parseInt(req.getParameter("txt1"));
				int num22 = m2; 
				int dec_value22 = 0; 
				int base22 = 1; 
				int temp22 = num22; 
				while (temp22 > 0)
				{
					int last_digit22 = temp22 % 10; 
					temp22 = temp22 / 10; 
					dec_value22 += last_digit22 * base22; 
					base22 = base22 * 2; 
				}		
				int[] bin22 = new int[1000];
				int i22 = 0;
				while(dec_value22>0)
				{
					 bin22[i22] = dec_value22 % 8;
					 dec_value22 = dec_value22/8;
					 i22++;
				}
				
				for(int j22 = i22-1;j22>=0;j22--)
				out.println(bin22[j22]);
			}
			
			else if(str.equals("Binary to Hexadecimal"))
			{
				int m3 = Integer.parseInt(req.getParameter("txt1"));
				int num23 = m3; 
				int dec_value23 = 0; 
				int base23 = 1; 
				int temp23 = num23; 
				while (temp23 > 0)
				{
					int last_digit23 = temp23 % 10; 
					temp23 = temp23 / 10; 
					dec_value23 += last_digit23 * base23; 
					base23 = base23 * 2; 
				}
				char[] bin23 = new char[1000];
				int i23 = 0;
				int temp213 = 0;
				while(dec_value23>0)
				{
					temp213 = dec_value23 % 16;
					if(temp213<10)
					{
						bin23[i23] = (char)(temp213 + 48);
						i23++;
					}				
					else
					{
						bin23[i23] = (char)(temp213 + 55);
						i23++;
					}
					 dec_value23 = dec_value23/16;
				}				
				for(int j23 = i23-1;j23>=0;j23--)
				out.println(bin23[j23]);
			}

			else if(str.equals("Octal to Decimal"))
			{
				int o1 = Integer.parseInt(req.getParameter("txt1"));
				int num31 = o1; 
				int dec_value31 = 0; 
				int base31 = 1; 
				int temp31 = num31; 
				while (temp31 > 0) { 
					int last_digit31 = temp31 % 10; 
					temp31 = temp31 / 10; 
					dec_value31 += last_digit31 * base31; 
					base31 = base31 * 8; 
				} 
				out.println(dec_value31);
			}
			
			else if(str.equals("Octal to Binary"))
			{
				int o2 = Integer.parseInt(req.getParameter("txt1"));
				int num32 = o2; 
				int dec_value32 = 0; 
				int base32 = 1; 
				int temp32 = num32; 
				while (temp32 > 0) { 
					int last_digit32 = temp32 % 10; 
					temp32 = temp32 / 10; 
					dec_value32 += last_digit32 * base32; 
					base32 = base32 * 8; 
				} 
				int[] bin32 = new int[1000];
				int i31 = 0;
				while(dec_value32>0)
				{
					 bin32[i31] = dec_value32 % 2;
					 dec_value32 = dec_value32/2;
					 i31++;
				}				
				for(int j31 = i31-1;j31>=0;j31--)
				out.println(bin32[j31]);	
			}
			
			else if(str.equals("Octal to Hexadecimal"))
			{
				int o3 = Integer.parseInt(req.getParameter("txt1"));
				int num32 = o3; 
				int dec_value32 = 0; 
				int base32 = 1; 
				int temp32 = num32; 
				while (temp32 > 0) { 
					int last_digit32 = temp32 % 10; 
					temp32 = temp32 / 10; 
					dec_value32 += last_digit32 * base32; 
					base32 = base32 * 8; 
				} 
				char[] bin33 = new char[1000];
				int i33 = 0;
				int temp33 = 0;
				while(dec_value32>0)
				{
					temp33 = dec_value32 % 16;
					if(temp33<10)
					{
						bin33[i33] = (char)(temp33 + 48);
						i33++;
					}				
					else
					{
						bin33[i33] = (char)(temp33 + 55);
						i33++;
					}
					 dec_value32 = dec_value32/16;
				}
				for(int j33 = i33-1;j33>=0;j33--)
				out.println(bin33[j33]);
			}
			else if(str.equals("Hexadecimal to Decimal"))
			{
				String hexVal41 = req.getParameter("txt1");	
				int len41 = hexVal41.length(); 
				int base41 = 1; 
				int dec_val41 = 0;  
				for (int i41=len41-1; i41>=0; i41--) 
				{    
					if (hexVal41.charAt(i41) >= '0' && hexVal41.charAt(i41) <= '9') 
					{ 
						dec_val41 += (hexVal41.charAt(i41) - 48)*base41; 
						base41 = base41 * 16; 
					} 
					else if (hexVal41.charAt(i41) >= 'A' && hexVal41.charAt(i41) <= 'F') 
					{ 
						dec_val41 += (hexVal41.charAt(i41) - 55)*base41;  
						base41 = base41*16; 
					} 
				} 
				out.println(dec_val41);
			}
			else if(str.equals("Hexadecimal to Octal"))
			{
				String hexVal43 = req.getParameter("txt1");
				int len43 = hexVal43.length(); 
				int base43 = 1; 
				int dec_val43 = 0;  
				for (int i43=len43-1; i43>=0; i43--) 
				{    
					if (hexVal43.charAt(i43) >= '0' && hexVal43.charAt(i43) <= '9') 
					{ 
						dec_val43 += (hexVal43.charAt(i43) - 48)*base43; 
						base43 = base43 * 16; 
					} 
					else if (hexVal43.charAt(i43) >= 'A' && hexVal43.charAt(i43) <= 'F') 
					{ 
						dec_val43 += (hexVal43.charAt(i43) - 55)*base43;  
						base43 = base43*16; 
					} 
				} 
				int[] bin43 = new int[1000];
				int i431 = 0;
				while(dec_val43>0)
				{
					 bin43[i431] = dec_val43 % 8;
					 dec_val43 = dec_val43/8;
					 i431++;
				}
				
				for(int j431 = i431-1;j431>=0;j431--)
				out.println(bin43[j431]);
			}
			else 
			{
				String hexVal42 = req.getParameter("txt1");
				int len42 = hexVal42.length(); 
				int base42 = 1; 
				int dec_val42 = 0;  
				for (int i42=len42-1; i42>=0; i42--) 
				{    
					if (hexVal42.charAt(i42) >= '0' && hexVal42.charAt(i42) <= '9') 
					{ 
						dec_val42 += (hexVal42.charAt(i42) - 48)*base42; 
						base42 = base42 * 16; 
					} 
					else if (hexVal42.charAt(i42) >= 'A' && hexVal42.charAt(i42) <= 'F') 
					{ 
						dec_val42 += (hexVal42.charAt(i42) - 55)*base42;  
						base42 = base42*16; 
					} 
				} 
				int[] bin421 = new int[1000];
				int i421 = 0;
				while(dec_val42>0)
				{
					 bin421[i421] = dec_val42 % 2;
					 dec_val42 = dec_val42/2;
					 i421++;
				}
				
				for(int j421 = i421-1;j421>=0;j421--)
				out.println(bin421[j421]);
			}
			//out.println(result); 		 
	}
}