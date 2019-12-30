package com.firstinfo.siardfile;

import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.Hashtable;

/*
 * 국가 기록원 교육훈련시스템
 * 파일 저장 방식이다. 
 * 원 파일명을 m5 방식으로 암호화 해서 
 * 저장한다.
 */
public class FileDownloadArchive
{	
	
	private String md5(String str)
	{
	    StringBuffer buf = new StringBuffer();
	    
	    try
	    {
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        byte[] data = new byte[32];
	        md.update(str.getBytes(), 0, str.length());
	        data = md.digest();
	        
	        for(int i = 0; i < data.length; i++)
	        {
	            int halfbyte = (data[i] >>> 4) & 0x0F;
	            int two_halfs = 0;
	            do
	            {
	                if((0 <= halfbyte) && (halfbyte <= 9))
	                {
	                    buf.append((char)('0' + halfbyte));
	                }
	                else
	                {
	                    buf.append((char)('a' + (halfbyte - 10)));
	                }
	                
	                halfbyte = data[i] & 0x0F;                
	            }
	            while(two_halfs++ < 1);
	        }
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    
	    return buf.toString();
	}

	private String getFileExt(String filename)
	{
	    int i = filename.lastIndexOf(".");
	    if(i == -1) return "";
	    else return filename.substring(i + 1);
	}

	public  String getFilePath(String filename)
	{
		String webUrl  ="";
		
	    if("".equals(filename)) return "";
	    
	    String ext = getFileExt(filename);
	    
	    if("jsp".equals(ext.toLowerCase())) ext = "xxx";
	    
	    String md5name = md5(filename + "sdhflsdhflsdxxx") + "." + ext;
	    
	    return webUrl + "/data/file/" + md5name.substring(0, 2) + "/" + md5name;
	}

	private String getUploadPath(String filename)
	{
		String dataDir = "";
		
	    String ext = getFileExt(filename);
	    if("jsp".equals(ext.toLowerCase())) ext = "xxx";
	    String md5name = md5(filename + "sdhflsdhflsdxxx") + "." + ext;
	    return dataDir = "/file/" + md5name.substring(0, 2) + "/" + md5name;
	    
	}
}
