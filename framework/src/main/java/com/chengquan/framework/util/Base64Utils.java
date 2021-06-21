package com.chengquan.framework.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Base64辅助类，将图片转换为Base64字符串完成上�?
 * 
 * @author NapoleonBai
 *
 */
public class Base64Utils {
	/**
	 * 将图片转换为Base64字符�?
	 */
	public static String changeImage(String filePath) {
		Bitmap bitmap = null;
		try {
			BitmapFactory.Options opts = new BitmapFactory.Options();
			opts.inJustDecodeBounds = true;
			bitmap = BitmapFactory.decodeFile(filePath,opts);
			int height = opts.outHeight * 100 /opts.outWidth;
			
			opts.outWidth = 100;
			opts.outHeight = height; 
			opts.inJustDecodeBounds = false;
			bitmap = BitmapFactory.decodeFile(filePath,opts);
			
			ByteArrayOutputStream out = null;
			out = new ByteArrayOutputStream();
			
			// 转换图片格式，不压缩
			bitmap.compress(Bitmap.CompressFormat.JPEG, 80, out);
			out.flush();
			out.close();
			byte[] imgBytes = out.toByteArray();
			// 得到Base64编码过的字节数组字符�?
			return Base64.encodeToString(imgBytes, Base64.DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bitmap != null){
				bitmap.recycle();
				bitmap = null;
			}
		}
		return "";
	}
	
	public static String encodeBase64File(String path) throws Exception {
		StringBuffer sb = new StringBuffer();
		File file = new File(path);
		FileInputStream inputFile = new FileInputStream(file);
//		byte[] temp = new byte[512];
//		while (inputFile.read(temp) != -1) {
//			sb.append(Base64.encodeToString(temp,Base64.DEFAULT));
//		}
//		inputFile.close();
		byte[] buffer = new byte[(int)file.length()];
		inputFile.read(buffer);
		        inputFile.close();
		        return Base64.encodeToString(buffer, Base64.DEFAULT);
		}
}
