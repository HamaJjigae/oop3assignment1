package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
	public static String[][] readShapes(String filepath)
	{
		String[][] shapeArray = null;
		
		try (BufferedReader buff = new BufferedReader(new FileReader(filepath)))
		{
			String numLine = buff.readLine();
			if (numLine == null)
			{
				System.err.println("Empty file");
				return null;
			}
			
			int shapeNum = Integer.parseInt(numLine.trim());
			shapeArray = new String[shapeNum][];
			
			for (int i = 0; i < shapeNum; i++)
			{
				String line = buff.readLine();
				if (line == null)
				{
					System.err.println("Insufficient Lines");
					return null;
				}
				
				String[] values = line.split(" ");
				shapeArray[i] = values;
			}
			
			return shapeArray;
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (NumberFormatException e)
		{
			System.err.println("Error with number of shapes");
		}
		
		return null;
	}
}
