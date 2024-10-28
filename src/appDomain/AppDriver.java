package appDomain;

import java.util.Arrays;
import java.nio.file.Paths;
import sorting.SortDriver;
import utilities.TextReader;
import shapes.*;

public class AppDriver
{
	private static String fileName;
	private static String sortType;
	private static String sortingAlgo;
	private static Shapes[] shapeArray;

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparable(s) to sort using either the
		// natural order (comparable) or other orders (comparators)

		// refer to demo03 OfficeManager.java on how to create specific
		// objects using reflection from a String
		
		if (args.length < 3)
		{
			System.out.println("Format should be: java -jar Sort.jar -ffile_name -tv -sb");
			return;
		}
		
		for (String arg : args)
		{
			if (arg.startsWith("-f") || arg.startsWith("-F"))
			{
				fileName = Paths.get("res", arg.substring(2)).toString();
			} else if (arg.startsWith("-t") || arg.startsWith("-T"))
			{
				sortType = arg.substring(2).toLowerCase();
				if (!sortType.equals("v")&&!sortType.equals("h")&&!sortType.equals("a"))
				{
					System.out.println("Invalid type parameter. Please use 'v' for volume, 'h' for height or 'a' for area.");
					return;
				}
			} else if (arg.startsWith("-s") || arg.startsWith("-S"))
			{
				sortingAlgo = arg.substring(2).toLowerCase();
				if (!Arrays.asList("b","s","i","m","q","z").contains(sortingAlgo))
				{
					System.out.println("Invalid algorithm parameter. Please use 'b' for bubble, 's' for selection, 'i' for insertion, 'm' for merge, 'q' for quick or 'z' for heap.");
					return;
				}
			}
		}
		System.out.println(fileName);
		String[][] initArray = TextReader.readShapes(fileName);
		if (initArray == null)
		{
			System.err.println("Failed to load file");
		} else 
		{
			shapeArray = new Shapes[initArray.length];
			int index = 0;
			for (String[] row : initArray)
			{
				switch (row[0])
				{
				case "Cone":
				{
					shapeArray[index++] = new Cone(Double.parseDouble(row[1]), Double.parseDouble(row[2]));
					break;
				}
				case "Cylinder":
				{
					shapeArray[index++] = new Cylinder(Double.parseDouble(row[1]), Double.parseDouble(row[2]));
					break;
				}
				case "OctagonalPrism":
				{
					shapeArray[index++] = new OctagonalPrism(Double.parseDouble(row[1]), Double.parseDouble(row[2]));
					break;
				}
				case "PentagonalPrism":
				{
					shapeArray[index++] = new PentagonalPrism(Double.parseDouble(row[1]), Double.parseDouble(row[2]));
					break;
				}
				case "Pyramid":
				{
					shapeArray[index++] = new Pyramid(Double.parseDouble(row[1]), Double.parseDouble(row[2]));
					break;
				}
				case "SquarePrism":
				{
					shapeArray[index++] = new SquarePrism(Double.parseDouble(row[1]), Double.parseDouble(row[2]));
					break;
				}
				case "TriangularPrism":
				{
					shapeArray[index++] = new TriangularPrism(Double.parseDouble(row[1]), Double.parseDouble(row[2]));
					break;
				}
				}
			}
		}
		long startTime = System.nanoTime();
		SortDriver.executeSort(sortType,sortingAlgo,shapeArray);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		switch (sortType)
		{
		case "v":
		{
			for (int i = 0; i < shapeArray.length; i++)
			{
				if (i == 0)
				{
					System.out.println("The first element is: " + shapeArray[i].getClass() + " and has a volume of: " + ((Shapes) shapeArray[i]).calcVolume());
				}
				else if (i % 1000 == 0)
				{
					System.out.println("The " + i + "-th element is: " + shapeArray[i].getClass() + " and has a volume of: " + ((Shapes) shapeArray[i]).calcVolume());
				}
				else if (i == (shapeArray.length - 1))
				{
					System.out.println("The last element is: " + shapeArray[i].getClass() + " and has a volume of: " + ((Shapes) shapeArray[i]).calcVolume());
				}
			}
			break;
		}
		case "h":
		{
			for (int i = 0; i < shapeArray.length; i++)
			{
				if (i == 0)
				{
					System.out.println("The first element is: " + shapeArray[i].getClass() + " and has a height of: " + ((Shapes) shapeArray[i]).getHeight());
				}
				else if (i % 1000 == 0)
				{
					System.out.println("The " + i + "-th element is: " + shapeArray[i].getClass() + " and has a height of: " + ((Shapes) shapeArray[i]).getHeight());
				}
				else if (i == (shapeArray.length - 1))
				{
					System.out.println("The last element is: " + shapeArray[i].getClass() + " and has a height of: " + ((Shapes) shapeArray[i]).getHeight());
				}
			}
			break;
		}
		case "a":
		{
			for (int i = 0; i < shapeArray.length; i++)
			{
				if (i == 0)
				{
					System.out.println("The first element is: " + shapeArray[i].getClass() + " and has an area of: " + ((Shapes) shapeArray[i]).calcArea());
				}
				else if (i % 1000 == 0)
				{
					System.out.println("The " + i + "-th element is: " + shapeArray[i].getClass() + " and has an area of: " + ((Shapes) shapeArray[i]).calcArea());
				}
				else if (i == (shapeArray.length - 1))
				{
					System.out.println("The last element is: " + shapeArray[i].getClass() + " and has an area of: " + ((Shapes) shapeArray[i]).calcArea());
				}
			}
			break;
		}
		}
		System.out.println(sortingAlgo + " run time was: " + duration + "ms");
	}
}
